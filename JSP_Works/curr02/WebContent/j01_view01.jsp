<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>j01_view 페이지</h2>
	
	<a href="/curr02/j01">j01 이동(a태그-get방식)</a> <hr>
	
	<form action="/curr02/j01" method="get">
		<input type="submit" value="j01이동(form-get)"/>
	</form>
	<hr>
	
	<form action="/curr02/j01" method="post">
		<input type="submit" value="j01이동(form-psot)"/>
	</form>

</body>
</html>