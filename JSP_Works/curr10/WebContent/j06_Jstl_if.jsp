<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<h2>if - test</h2>
	<c:set var="num" value="5"/>
	<c:if test="${ num < 10 }">
		${ num }는 10 보다 작다
	</c:if>
	<hr>
	
	<c:set var="id" value="aaa"/>
	<c:if test="${ id == 'aaa' }">
		${ id }님 로그인 완료
	</c:if>
	
	<h2>choose - when test - otherwise</h2>
	
	<c:set var="name" value="둘리"></c:set>
	<c:set var="age" value="120"/>
	
	<c:choose>
		<c:when test="${ age <= 8 }">
			${ name }는 유치원에 갑니다.
		</c:when>
		<c:when test="${ age <= 13 }">
			${ name }는 초등학교에 갑니다.
		</c:when>
		<c:when test="${ age <= 16 }">
			${ name }는 중학교에 갑니다.
		</c:when>
		<c:when test="${ age <= 19 }">
			${ name }는 고등학교에 갑니다.
		</c:when>
		<c:otherwise>
			${ name }은 대학교 또는 직장에 다닙니다.
		</c:otherwise>
	</c:choose>
	

</body>
</html>