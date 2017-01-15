<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<c:forTokens items="1, 2, 3, 4, 5" delims="," var="each">
		${ each } ->
	</c:forTokens>
	<%--
		결과 each는 문자열 형태
	 --%>

</body>
</html>