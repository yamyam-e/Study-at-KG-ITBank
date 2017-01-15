<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>view02 페이지</h2>
	
	<%
		request.setAttribute("data", "JSP에서 전송하는 메시지");
		request.setAttribute("next", "j16_view03.jsp");
	%>
	
	<jsp:forward page="/j16"></jsp:forward>

</body>
</html>