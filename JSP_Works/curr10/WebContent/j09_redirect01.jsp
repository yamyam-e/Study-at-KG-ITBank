<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>전송페이지 : response.sendRedirect</h2>
    <%--
      절대 경로 표현 기준 위치 : WebContent
    --%>
    
    <c:redirect url="/j09_redirect02.jsp">
       <c:param name="data" value="하나둘셋"/>
    </c:redirect>
	
</body>
</html>