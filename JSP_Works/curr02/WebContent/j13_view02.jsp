<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
<!-- 리다이렉트 -->
	<h2>j13_view02 페이지</h2>
	<%
		response.sendRedirect("/curr02/j13");
	%>	

</body>
</html>