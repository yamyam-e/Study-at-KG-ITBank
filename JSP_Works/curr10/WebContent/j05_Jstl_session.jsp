<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	1. session setAttribute<br>
	<c:set var="nowLogin" value="idBBB" scope="session"></c:set>
	nowLogin2 : ${ nowLogin2 }
	
	2. session remove<br>
	<c:remove var="nowLogin2" scope="session"/>
		nowLogin2 : ${ nowLogin2 } <br>
		nowLogin2 == null ? ${ nowLogin2 == null }
	

</body>
</html>