<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>전송펭지 : 테그 별 파라미터 값 보내기</h2>
	
	<form action="/curr01/j28_tag02.jsp" method="post">
	<table border="1" style="text-align: center">
		<tr>
			<td>성 별</td>
			<td>
				<input type="radio" name="gender" value="남자"/>남자
				<input type="radio" name="gender" value="여자"/>여자
			</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>
				<select name="email">
					<option>클릭하세요</option>
					<option>google.com</option>
					<option>naver.com</option>
					<option>nate.com</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>취 미</td>
			<td>
				<input type="checkbox" name="hobby" value="자기"/>자기
				<input type="checkbox" name="hobby" value="먹기"/>먹기
				<input type="checkbox" name="hobby" value="놀기"/>놀기
			</td>
		</tr>
		<tr>
			<td>메 모</td>
			<td>
				<textarea rows="5" cols="45" name="memo"></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="전송하기"/>
			</td>
		</tr>
		
	</table>
	</form>

</body>
</html>