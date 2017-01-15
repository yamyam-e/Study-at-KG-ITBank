<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<h2>j20_Quiz20 페이지</h2>
	
	<form action="/curr01/j20_Quiz01.jsp">
	<%
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		int total = kor+eng+math;
		double avg = total/3.0;
	%>
		<%=name %>
	<% 	if(avg>85.5) {
	%>	
			님은 합격 
	<%	} else {%>
			님은 불합격
	<% }
	%>
	<input type="submit" value="되돌아가기"/>
	</form>

</body>
</html>