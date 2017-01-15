<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>j01_useBean</h2>
	
	<!-- 클래스를 import 하는 역할 -->
	<!-- 중의 사항
			useBean 사용 시 조건
			- 클래스에 반드시 기본 생성자가 존재하여야 한다.*********
			- 클래스에 반드시 setter&getter가 존재하여야 한다.*********
	 -->
	<jsp:useBean id="peo" class="dto.PeopleDTO"></jsp:useBean><!-- scope 옵션 사용시 request.setAttribute 와 동일한 명령 -->
	<jsp:setProperty property="name" name="peo" value="둘리"/>
	<jsp:setProperty property="age" name="peo" value="10"/>
	
	이름 : <jsp:getProperty property="name" name="peo"/><br>
	나이 : <jsp:getProperty property="age" name="peo"/>
	
	
	<hr>
	
	<h2>인사 정보 입력</h2>
	
	<form action="/curr10/j01_useBean02.jsp" method="post">
	
		이 름 : <input type="text" name="name"/> <br>

		나 이 : <input type="text" name="age"/>	<br>
		
		<input type="submit" value="저장하기"/>	
	</form>`
	

</body>
</html>