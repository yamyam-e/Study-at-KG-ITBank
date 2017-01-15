<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>left</h2>

	<!-- /ROOT/index.jsp 
		/ 시만 써도 루트 페이지로 간다.
	-->
	<a href="/">mainHome 페이지</a><br>
	
	<!-- WebContent/mainPage/main01.jsp -->
	<a href="/ROOT/index.jsp?mainView=mainPage/main01">main01 페이지</a><br>
	<a href="?mainView=mainPage/main02">main02 페이지</a><br>
	
</body>
</html>