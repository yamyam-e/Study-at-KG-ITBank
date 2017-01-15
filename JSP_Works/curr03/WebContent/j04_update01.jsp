<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>인사 정보 수정</h2>
	
	<form action="/curr03/j04_update02.jsp">
		대상의 번호 입력: <input type="text" name="selNum"/> <br>
		이름 수정 : <input type="text" name="name"/><br>
		나이 수정 : <input type="text" name="age"/><br>
		
		<input type="submit" value="수정하기"/>
	
	</form>

</body>
</html>