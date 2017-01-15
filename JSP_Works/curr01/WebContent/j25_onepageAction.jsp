<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>현재 페이지로 이동 및 파라미터 전송하기</h2>
	
	data = <%= request.getParameter("data") %> <hr>
	
	<a href="?data=a태그에서보내기">1. 현재 페이지로 이동 이동 && 정보 보내기</a> <hr>
	
	<form action="?">
	
		data 입력 : <input type="text" name="data"/> <br>
		<input type="submit" value="2. 현재 페이지 이동 && 정보 보내기"/>
	
	</form>
	

</body>
</html>