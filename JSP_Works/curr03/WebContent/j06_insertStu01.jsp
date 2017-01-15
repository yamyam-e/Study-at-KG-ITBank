<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<%@page import="java.util.ArrayList"%>
    <%@page import="entity.Student" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<!-- 
	1. 01페이지 : 학생 정보 입력 화면
				- 이름 및 과목 3개 입력
				- 입력 후 02 페이지로 자동 이동
	 -->
	 <%
		 response.sendRedirect("/curr03/j06Cont?works=showList&next=j06_showStu");
	 %>
	 
</body>
</html>