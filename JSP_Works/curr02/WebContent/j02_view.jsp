<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>j02_view 페이지</h2>
	
	<a href="/curr02/j02" >j02 이동(a태그-get방식)</a>
	
	<form action="/curr02/j02" method="get">
		<input type="submit" value="j02이동(form-get)"/>
	</form>
	
	<form action="/curr02/j02" method="post">
		<input type="submit" value="j02이동(form-post)"/>
	</form>

</body>
</html>