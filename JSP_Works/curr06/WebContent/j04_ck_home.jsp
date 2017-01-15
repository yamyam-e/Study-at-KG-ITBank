<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<a href ="/curr06/j05_ck_set.jsp">
				1. 쿠키 생성 및 클라이언트에게 저장</a> <br>
	
	<a href ="/curr06/j06_ck_get.jsp">
				2. 쿠키 확인[기본경로]</a> <br>
	
	<a href ="/curr06/j07_ck_age.jsp">
				3. 쿠키 생존 시간 설정(10초)[기본경로]</a> <br>
	
	<a href ="/curr06/j08_ck_remove.jsp"><!-- 시간을 0 초로 세팅 하는 것 -1 로 세팅하면 무한대 -->
				4. 쿠키(MyCookie-BasePath) 삭제[기본경로]</a> <br>
				
	<a href ="/curr06/zSub/j05_ck_set.jsp">
				5. 쿠키 생성[하위경로 - 경로 설정 X]</a> <br>
				
	<a href ="/curr06/zSub/j06_ck_get.jsp"><!-- 하위에서는 상위 쿠키 확인 가능 그러나 상위에서는 하위 쿠키 확인 불가 -->
				6. 쿠키 확인[하위경로]</a> <br>
				
	<a href ="/curr06/zSub/j07_ck_set02.jsp">
				7. 쿠키 생성[하위경로 - 경로 설정 O]</a> <br>
</body>
</html>