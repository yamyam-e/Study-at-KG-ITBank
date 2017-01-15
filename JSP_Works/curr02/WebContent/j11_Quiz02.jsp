<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	 <h2>j11_Quiz02 페이지</h2>
	 
	 <%
	 	request.setCharacterEncoding("UTF-8");
	 	
	 	String age = request.getParameter("age");
	 	int ageInt = Integer.parseInt(age);
	 	String url = null;
	 
	 	if(ageInt>19){
	 		url = "/j11_Quiz03.jsp";
	 	} else {
	 		url = "/j11_Quiz04.jsp";
	 	}
	 
	 %>
	 
	 <jsp:forward page="<%= url%>"></jsp:forward>

</body>
</html>