<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script type="text/javascript">
		var msg = "${ msg }";
		if(msg != null) alert(msg);
	</script>
</head>
<body>

	<h2>Cookie Home</h2>
	
	<a href="/spring14/makeCK">1. 쿠키 생성</a><hr>
	<a href="/spring14/showCK">2. 쿠키 확인 : ${ myCookie }</a><hr>
	<a href="/spring14/delCK">3. 쿠키 삭제</a> <hr>
	<a href="/spring14/">홈 화면 가기</a>


</body>
</html>