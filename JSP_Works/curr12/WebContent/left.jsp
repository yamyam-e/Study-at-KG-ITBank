<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>목 록</h2>
	
	<c:choose>
		<c:when test="${ !empty nowLogin }">
			<a href="/curr12/peo/selectList">인사정보목록</a><br>
			<a href="">인사정보입력</a><br>
		</c:when>
		<c:otherwise>
			로그인 필요
		</c:otherwise>
	</c:choose>

</body>
</html>