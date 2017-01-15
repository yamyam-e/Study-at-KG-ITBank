<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="entity.People" %>
    <%@page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>전송 페이지 - request.setAttribute</h2>
	중요!!! : forward 방법만 이용 가능
	
	
	<%
		String name = "하니";
		int age = 10;
		
		request.setAttribute("hname", name);
		request.setAttribute("hage", 10);
		
		People peo = new People("둘리", 12);
		request.setAttribute("peo", peo);
		
		ArrayList<People> listc = new ArrayList<>();
		listc.add(new People("마이콜", 23));
		listc.add(new People("또우치", 15));
		listc.add(new People("도우너", 34));
		listc.add(new People("홍길동", 88));
		request.setAttribute("listc", listc);
		
		Iterator<People> itr = listc.iterator();
		request.setAttribute("itr", itr);
		
	%>
	
	<jsp:forward page="/j12_attribute02.jsp"></jsp:forward>
	

</body>
</html>