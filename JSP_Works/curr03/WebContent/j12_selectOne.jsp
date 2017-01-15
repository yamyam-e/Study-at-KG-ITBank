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

	<script type="text/javascript">
		function goPage(url, num) {
// 			alert("url : " + url + ", num : " + num);

			if(url == "j15_delete"){
				if(!confirm("삭제하시겠습니까?")){
					return;
				}
			}
			location.href = "/curr03/" + url + ".jsp?num=" + num;
		}
	</script>
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
			
			JdbcConnector.close(conn, pstmt, rs);
			
		} catch(Exception e){
			e.printStackTrace();
		}
	
	%>

	<h2>인사 상세 정보</h2>
	
	<table border="1" style="text-align: cetner;">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>나이</td>
		</tr>
		<tr>
			<td><%=peo.getNum() %></td>
			<td><%=peo.getName() %></td>
			<td><%=peo.getAge() %></td>
		</tr>
		<tr>
			<td colspan="3">
				<input type="button" value="목록보기" 
						onclick="javascript:location.href='/curr03/j11_selectAll.jsp'"/> &nbsp;
				<input type="button" value="수정하기" 
						onclick="javascript:goPage('j13_updateForm', <%=peo.getNum()%>)"/> &nbsp;
				<input type="button" value="삭제하기" 
						onclick="javascript:goPage('j15_delete', <%=peo.getNum()%>)"/>
			</td>
		</tr>
	</table>
	

</body>
</html>