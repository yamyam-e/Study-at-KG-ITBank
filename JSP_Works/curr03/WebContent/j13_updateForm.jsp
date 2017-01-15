<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="module.JdbcConnector"%>
<%@page import="java.sql.Connection"%>
<%@page import="entity.People"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		int num = Integer.parseInt(request.getParameter("num"));
		People peo = null;
		
		try{
			Connection conn = JdbcConnector.getConnection();
			String sql = "select * from t_peo where num=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				peo = new People();
				peo.setNum(rs.getInt("num"));
				peo.setName(rs.getString("name"));
				peo.setAge(rs.getInt("age"));
			}
			
			JdbcConnector.close(conn, pstmt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
	
	<h2>인사 정보 수정</h2>
	
	<form action="/curr03/j12_selectOne.jsp" method="post">
		<input type="hidden" name="num" value="<%=peo.getNum() %>"/>
	<table border="1" style="text-align: center;">
		<tr>
			<td>이름</td>
			<td>
				<input type="text" name="name" value="<%=peo.getName() %>"/>
			</td>
		</tr>
		<tr>
			<td>나이</td>
			<td>
				<input type="text" name="age" value="<%=peo.getAge() %>"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="수정하기"/>
			</td>
		</tr>
	</table>
	</form>

</body>
</html>