<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	이름 : <input type="text" maxlength="10"/> <br>
	
	성별 :
			<input type="radio" name="gender" checked="checked"/>남자
			<input type="radio" name="gender"/>여자
			<br>
			
	암호 : <input type="password" /> <br>
	
	이메일 : 
			<select>
				<option>클릭하세요</option>
				<option>구글</option>
				<option>다음</option>
				<option>네이버</option>
				<option>네이트</option>
			</select>
			<br>
			
	취미 : 
			<input type="checkbox" checked="checked"/>놀기
			<input type="checkbox"/>먹기
			<input type="checkbox"/>자기
			<br>
	메모 : <%-- 종료 태그를 축약형으로 쓰지 말아야 한다. --%>
			<textarea rows="10" cols="50"></textarea>
			<%-- <textarea rows="10" cols="50">           </textarea>띄어 쓰기 하면 빈공간 생김 --%>
</body>
</html>





















