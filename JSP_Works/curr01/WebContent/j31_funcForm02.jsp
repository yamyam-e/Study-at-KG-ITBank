<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>j31_funcForm02 페이지</h2>
	
	<%
		request.setCharacterEncoding("UTF-8");
	%>

	data : <%=request.getParameter("data") %> <br>
	
	param : <%=request.getParameter("param") %> <br>
	
	hData : <%=request.getParameter("hData") %> <br>
	
</body>
</html>