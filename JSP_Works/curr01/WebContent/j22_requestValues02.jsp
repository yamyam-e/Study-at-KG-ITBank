<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>j22_requestValues02 페이지</h2>
	
	<%
		request.setCharacterEncoding("UTF-8");
		
		String[] name = new String[5];
		String[] age = new String[5];
		
		for(int i=0; i<5; i++){
			name[i] = request.getParameter("name" + i);
			age[i] = request.getParameter("age" + i);
		}
	%>
	
	<table border="1" style="text-align: center">
		<tr>
			<td>나 이</td>
			<td>이 름</td>
		</tr>
		<% 
		for(int i=0; i<name.length; i++){
		%>
			<tr>
				<td><%=name[i] %></td>
				<td><%=age[i] %></td>
			</tr>
		<%
		}
		%>
	
	</table>
</body>
</html>