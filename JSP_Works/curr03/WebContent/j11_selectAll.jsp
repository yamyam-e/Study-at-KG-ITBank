<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="module.JdbcConnector"%>
<%@page import="java.sql.Connection"%>
<%@page import="entity.People"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		ArrayList<People> listc = null;
		
		try{
			
			Connection conn = JdbcConnector.getConnection();
			
			String sql = "select * from t_peo order by num desc";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				
				if(listc == null) listc = new ArrayList<>();
				
				People peo = new People();
				peo.setNum(rs.getInt("num"));
				peo.setName(rs.getString("name"));
				peo.setAge(rs.getInt("age"));
				listc.add(peo);
			}
			
			JdbcConnector.close(conn, pstmt, rs);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	%>
	
	<h2>인사 정보 목록</h2>
	
	<table border="1" style="text-align: center;">
		<tr>
			<td colspan="3">
			<a href = "/curr03/j09_insertForm.jsp">인사 정보 입력</a>
			</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>나이</td>
		</tr>
		
		<%
		if(listc != null){
	
			for(People each : listc) {
		%>
			<tr>
				<td>
					<a href="/curr03/j12_selectOne.jsp?num=<%=each.getNum()%>">
					<%=each.getName() %>
					</a>
				</td>
				<td><%=each.getAge() %></td>
			</tr>
		<%
			}
		} else {
		%>
			<tr>
				<td colspan="2" >저장된 정보 없음</td>
			</tr>
		<%
		}
		%>
		
	</table>

</body>
</html>