<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	<h2>회원 가입</h2>
	
	<form action="/curr06/j01_login02.jsp" method="post">
		
		아이디 : <input type="text" name="id"/> <br>
		비밀번호 : <input type="text" name="pw"/> <br>
		
		<input type="submit" value="가입하기"/>
	</form>
	<hr>

	<h2>로그인하기</h2>
	
	<form action="/curr06/j01_login03.jsp" method="post">
		
		아이디 : <input type="text" name="id"/> <br>
		비밀번호 : <input type="text" name="pw"/> <br>
		
		<input type="submit" value="로그인"/>
	</form>
	<hr>

</body>
</html>