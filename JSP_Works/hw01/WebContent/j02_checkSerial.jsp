<%@page import="dao.CarDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Checked it</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String serial = request.getParameter("serial");
	CarDao dao = new CarDao();
	String msg = dao.checkDuplication(serial);
	%>
	
	<h2>Duplication Result : <%= msg %></h2>


</body>
</html>