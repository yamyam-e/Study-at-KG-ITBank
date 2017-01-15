<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body style="text-align: center; font-size: 20px;">
	
	<a href="j01_logHome">1. session과 로그인</a> <hr>
	
	<a href="j02_cookieHome">2. 쿠키 이용</a> <hr>
	
	<a href="j03_popUpHome">3. 팝업화면과 쿠키</a> <hr>
	
	<a href="j04_exception">4. 예외 처리</a> <hr>
	
	<!-- 로그인이 필요한(로그인 해야 사용 가능한 servlet context 설정도 필요함) 기능이 있을 경우 사용 -->
	<a href="j05_interceptor">5. 인터셉터와 로그인</a> <hr>

	<a href="j06_ajax">6. ajax 이용하기</a> <hr>
	
	<a href="j07_json">7. Json 이용하기</a> <hr>
	
	<a href="path/peo/selectList/12">8. pathVariable 이용하기</a> <hr>
	
	<a href="j09_xml01">9-1. xml 이용하기 : 객체 정보를 XML 형식으로 출력</a> <hr>
	
	<a href="j09_xml02">9-2. xml 이용하기 : XML 정보를 클래스-객체 정보 형식으로 출력</a> <hr>
</body>
</html>
