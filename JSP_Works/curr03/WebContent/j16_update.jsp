<%@page import="entity.Computer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<%
		Computer com = (Computer)request.getAttribute("com");
	%>

	<h2>수정하기</h2><hr>
	<form method="post">
		<table>
			
		</table>
	</form>

	

</body>
</html>