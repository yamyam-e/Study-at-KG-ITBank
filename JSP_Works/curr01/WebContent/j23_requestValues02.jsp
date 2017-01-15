<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>j23_requestValues02 페이지</h2>
	
	<%
		request.setCharacterEncoding("UTF-8");
		// 배열 순서가 틀릴 때도 아주 간혹 있기도 하다.
		String[] name = request.getParameterValues("name");
		String[] age = request.getParameterValues("age");
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