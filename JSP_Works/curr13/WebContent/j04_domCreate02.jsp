<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		Enumeration<String> names = request.getParameterNames();
	
		String msg = "";
		while(names.hasMoreElements()){
			String paramName = names.nextElement();
			String paramValue = request.getParameter(paramName);
			msg += paramName + " >>>>> " + paramValue + "<br>";
		}
	
	%>
	<%= msg%>
	

</body>
</html>