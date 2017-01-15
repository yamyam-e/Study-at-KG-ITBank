<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<form action="/mySchool/teach/logConn" method="post" name="frm">
	<br>
	<br>
	<br>
	<div style="background-color: white; height: 350px; vertical-align: middle;" align="center">
		<p style="font-family:굴림체;font-size:14px;font-style:normal;font-weight:normal;color:#006666;">
			아이디&nbsp;&nbsp;&nbsp;
			<input type="text" name="id" placeholder="아이디" style="font-size: 14px;"/><br>
			비밀번호&nbsp;
			<input type="password" name="pw" placeholder="비밀번호"S style="font-size: 14px;"/>
		</p>
		<p>
			<input type="button" class="bt" value="회원가입" style="font-family:굴림체;font-size:12px;" onclick="goRegisterForm()"/>
			<input type="submit" class="bt" value="로그인" style="font-family:굴림체;font-size:12px;"/>
		</p>
	</div>
	</form>
	
</body>

</html>