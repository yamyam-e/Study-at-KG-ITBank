<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>j17_formGet02 페이지</h2>
	
	<%
		String name = request.getParameter("name");
		String age = request.getParameter("age");
	%>
	
	이름 : <%=name %>, 나이 : <%=age %>

</body>
</html>