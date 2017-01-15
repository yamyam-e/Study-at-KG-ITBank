<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>인사 정보 입력</h2>
	
	<form action="/curr02/j04" method="get">
		이름 : <input type="text" name="name"/> <br>
		나이 : <input type="text" name="age"/> <br>
		<input type="submit" value="form-get 전송"/>
	</form>
	<hr>
	
	<form action="/curr02/j04" method="post">
		이름 : <input type="text" name="name"/> <br>
		나이 : <input type="text" name="age"/> <br>
		<input type="submit" value="form-post 전송"/>
	</form>
	<hr>

</body>
</html>