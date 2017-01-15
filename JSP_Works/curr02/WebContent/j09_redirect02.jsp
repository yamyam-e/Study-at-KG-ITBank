<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.net.URLEncoder" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>redirect02 페이지</h2>
	
	response.sendRedirect 방법
	- 입력된 주소로 자동으로 이동
	- 주소창에는 입력된 URL이 노출됨
	
	<%
		String name = URLEncoder.encode("마이콜", "UTF-8");
	
		response.sendRedirect(
				"/curr02/j09_redirect03.jsp?data=" + name);
	%>

</body>
</html>