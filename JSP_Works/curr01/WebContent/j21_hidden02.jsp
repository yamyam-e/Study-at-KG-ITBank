<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

<h2>j21_hidden02 페이지</h2>

<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String data = request.getParameter("data");
%>

name : <%=name %>, age : <%=age %>, data : <%=data %>
	

</body>
</html>