<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
// 		String works = request.getParameter("works");
		String selNum = request.getParameter("selNum");
// 		String nex = request.getParameter("next")
		response.sendRedirect("/curr03/j06Cont?works=showOneStu&next=j06_showOneStu&selNum=" + selNum);
	%>
	
</body>
</html>