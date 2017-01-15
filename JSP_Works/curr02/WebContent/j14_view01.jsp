<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>view01 페이지</h2>
	
	<a href="/curr02/j14v01?next=j14_view02">redirect로 view02 가기</a>
	<a href="/curr02/j14v01?next=j14_view03">redirect로 view03 가기</a>
	<hr>
	
	
	<a href="/curr02/j14v02?next=j14_view02">forward로 view02 가기</a>
	<a href="/curr02/j14v02?next=j14_view03">forward로 view03 가기</a>

</body>
</html>