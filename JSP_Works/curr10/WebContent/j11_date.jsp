<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Date" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
		
	<c:set var="now" value="<%= new Date() %>"></c:set>
	0: <fmt:formatDate value="${ now }"/>
	<hr>
	
	1: <fmt:formatDate value="${ now }" type="date" dateStyle="full"/>
	<hr>
	
	2: <fmt:formatDate value="${ now }" type="date" timeStyle="full"/>
	<hr>
	
	3: <fmt:formatDate value="${ now }" type="both" dateStyle="short" timeStyle="full"/>
	<hr>
	
	입력받은 날짜 정보를 실제 객체로 변환 : parseDAte<br>
	<fmt:parseDate pattern="yyyy-MM-dd" value="2016-10-20" var="myday"></fmt:parseDate>
	
	4: <fmt:formatDate value="${ myday }" type="date" dateStyle="full"/>

</body>
</html>