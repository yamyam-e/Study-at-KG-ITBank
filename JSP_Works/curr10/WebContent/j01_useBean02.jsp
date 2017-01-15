<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<% request.setCharacterEncoding("UTF-8"); %>
	<jsp:useBean id="pp" class="dto.PeopleDTO"></jsp:useBean><!-- scope 옵션 사용시 request.setAttribute 와 동일한 명령 -->
	<jsp:setProperty property="name" name="pp" />
	<jsp:setProperty property="age" name="pp" />
	
	1.
	<jsp:setProperty property="name" name="pp"/>
	<jsp:setProperty property="age" name="pp"/>
	
	<hr>
	
	<jsp:useBean id="pp2" class="dto.PeopleDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="pp2"/>
	
	2.
	<jsp:setProperty property="name" name="pp2"/>
	<jsp:setProperty property="age" name="pp2"/>
	

</body>
</html>