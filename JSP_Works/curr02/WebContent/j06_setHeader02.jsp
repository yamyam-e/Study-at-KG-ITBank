<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>setHeader03 페이지</h2>
	
	<h3 align="center">2초 후 다음 페이지로 이동합니다.</h3>
	
	<%
		response.setHeader("Refresh", // Refresh 고정 값, 2는 2초
								"2; url=/curr02/j06_setHeader03.jsp");
	%>

</body>
</html>