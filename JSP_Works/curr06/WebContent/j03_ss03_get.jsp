<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<%
		Object rcv1 = session.getAttribute("mmm");
		String msg = (String) rcv1;
		
		int n = (int)session.getAttribute("nnn");
		
		Object rcv3 = session.getAttribute("listc");
		ArrayList<String> listc = (ArrayList<String>) rcv3;
	
	%>
	
	msg : <%=msg %><br>
	n   : <%=n %><br>
	<%
	for(String each : listc) {
	%>
		listc : <%=each %><br>
	<%
	}
	%>

	

</body>
</html>