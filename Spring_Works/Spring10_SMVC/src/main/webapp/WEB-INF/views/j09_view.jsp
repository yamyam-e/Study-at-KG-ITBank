<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>j09_view 페이지</h2>
	
	<c:forEach var="each" items="${ peopleList.listc }">
		each : ${ each.name }, ${ each.age } <br>
	</c:forEach>


</body>
</html>