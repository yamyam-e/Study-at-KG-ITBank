<%@page import="dto.PeopleDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%--
		JSTL : JSP Standard Tag Library
		- library : jakart.apache.org -> taglibs ->
					apache standard taglib -> 4개 jar 파일
		- 디렉티브 선언 필요
			<%@ taglib prefix="" uri=""%>
	
	 --%>
	 
	<h2>JSTL - request</h2>
	
	JSTL 변수 선언 <br>
	- var: 변수명(attribute 이름) / value:값 / scope: attribute 대상 객체
	<hr>
	
	1. request setAttribute - 정수형<br>
	<c:set var="num" value="3" scope="request"></c:set>
	num : ${ num }<br>
	num - 1 : ${ num - 1 }<br>
	<hr>
	
	num = num - 1; >>>>>
		<c:set var="num" value="${ num - 1 }" scope="request"></c:set>
		num : ${ num }
	<hr>
	
	2. request setAttribute - 객체형<br>
	<%
		PeopleDTO peo = new PeopleDTO("둘리" , 10);
	%>
	<c:set var="peo" value="<%=peo %>" scope="request"></c:set>
	peo : ${ peo.name }, ${ peo.age }<br>
	
	<c:set target="${ peo }" property="name" value="마이콜"></c:set>
	<c:set target ="${ peo }" property="age" value="33"></c:set>
	수정 후 peo : ${ peo.name }, ${ peo.age }
	<hr>
	
	
</body>
</html>