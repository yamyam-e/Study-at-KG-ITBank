<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<h2>세션 시간 설정</h2>
	<%
		session.setAttribute("time10", "10초 후 삭제될 세션정보");
		session.setMaxInactiveInterval(10);
	%>
	
	<a href = "/curr06/j03_ss02.jsp">세션 확인 페이지로 이동</a>

</body>
</html>