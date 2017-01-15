<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body style="font-size: 15">

	<!-- 프로젝트 이름에 커서 놓고 실행 -->
	
	<h2>1. RequestMapping 이용하기</h2>
	<a href="/spring10/j01_basic">1. 페이지 이동</a> <br>
	<a href="/spring10/works01">1. works02 페이지로 이동</a> <br>
	<a href="/spring10/j01_works03">1. works03 페이지로 이동</a> <hr>

	<h2>2. ModelAndView 이용하기</h2>
	<a href="/spring10/j02_mav01">2. 정보 가져오기(viewname && data 설정)</a> <br>
	<a href="/spring10/j02_mavView02">2. 정보 가져오기(viewname 설정 없음)</a> <br>
	<a href="/spring10/j03_mav03">2. 정보 가져오기(생성자 이용)</a> <hr>
	
	<h2>4. RequestMapping의 GET/POST 이용하기</h2>
	<a href="/spring10/j04_insertOne">4. 정보 입력 후 출력 </a> <hr>
	
	<h2>5. 커맨드객체의 이용</h2>
	<a href="/spring10/j05_insertOne">5. 정보 입력 후 출력</a><hr>
	
	<h2>6. ModelAttribute 이용</h2>
	<a href="/spring10/j06_view01">6-1. 정보 입력 후 출력</a><br>
	<a href="/spring10/j06_test01">6-2. test01로 이동</a><br>
	<a href="/spring10/j06_test02">6-2. test02로 이동</a><hr>
	
	<h2>7. Model 이용</h2>
	<a href="/spring10/j07_view">Model을 이용한 정보 받기</a>
	
	<h2>8. 클래스 필드에 파라미터 정보 저장하기</h2>
	<a href="/spring10/j08_insertOne">정보 입력하기</a><hr>
	
	<h2>9. 리스트 필드에 파라미터 정보 저장하기</h2>
	<a href="/spring10/j09_insertAll">정보 입력하기</a>
	
</body>
</html>






