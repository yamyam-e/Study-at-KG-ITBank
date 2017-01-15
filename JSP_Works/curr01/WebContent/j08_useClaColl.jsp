<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="p02_basic.People" %>
    <%@ page import="java.util.ArrayList" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>j08_useClaColl</title>
</head>
<body>

	<%
		
		People peo = new People("둘리", 10);
		ArrayList<People> listc = new ArrayList<>();
		listc.add(new People("도우너", 23));
		listc.add(new People("마이콜", 11));
		listc.add(new People("또치", 22));
		listc.add(new People("하니", 33));
	
	%>
	
	<h2>클래스와 컬렉션 사용하기</h2>
	
	peo : <%=peo.getName() %>, <%=peo.getAge() %> <br>
	
	<hr> <%-- hr : 선긋기 --%>
	
	<%
		for(People each : listc) {
	%>
			이름 : <%=each.getName()%>, 나이 : <%=each.getAge() %> <br>	
	<%
		}
	%>
	

</body>
</html>











