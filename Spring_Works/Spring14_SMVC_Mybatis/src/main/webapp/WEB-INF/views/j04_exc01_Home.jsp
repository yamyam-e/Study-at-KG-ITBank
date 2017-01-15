<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 예외처리 구동하려면 root-context 주석 제거 하고 돌릴 것 -->
	<h3><a href="/spring14/nullpointExc">
		1. 예외처리하기 : NullPointer 예외</a></h3>
	<hr>
	
	<h3><a href="/spring14/indexOutExc">
		2. 예외처리하기 : ArrayIndexOut 예외</a></h3>
		
	<h3>3. 예외처리하기 : 나눗셈 계산 프로그램</h3>
	<form method="post">
		첫번째 정수 : <input type="text" name="num1"/>
		두번째 정수 : <input type="text" name="num2"/>
		<input type="submit" value="결과보기"/>
	</form>
	<hr>
	
	<a href="/spring14/">홈 화면으로 가기</a>




</body>
</html>