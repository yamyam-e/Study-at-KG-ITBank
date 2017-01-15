<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="entity.People" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>j12_attribute02 페이지</h2>
	
	<%
	
		Object rcv = request.getAttribute("hname");
		String name = (String)rcv;
		int age = (Integer)request.getAttribute("hage");
		
		People peo = (People)request.getAttribute("peo");
		
		ArrayList<People>listc = (ArrayList)request.getAttribute("listc");
		Iterator<People> itr = (Iterator)request.getAttribute("itr");
		
		
	%>
	이름 : <%=name %>, 나이 : <%=age %> <br>
	이름 : <%=peo.getName() %>, 나이 : <%=peo.getAge() %> <br>

	<hr>
	ArrayList peo<br>
	<%
	for(People each : listc){
	%>
		이름 : <%=each.getName() %>, 나이 : <%=each.getAge() %> <br>
	<%
	}
	%>
	
	<hr>
	Iterator peo<br>
	<%
	while(itr.hasNext()){
		People temp = itr.next();
	%>
		이름 : <%=temp.getName() %>, 나이 : <%=temp.getAge() %> <br>
	<%	
	}
	%>
	
	
	
</body>
</html>