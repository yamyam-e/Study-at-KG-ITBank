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

	<h2>popUp 사용 : nopop : ${ nopop }</h2>
	<a href="/spring14/">홈 화면으로 가기</a>
	
	<c:if test="${ nopop == null }">
	<script type="text/javascript">
		var url = "showPopup"; // "/spring14/showPopup" 같음 메핑을 이용하여 만들어야 함.
		var popname = "pop";
		var size ="width=400, height=250";
		window.open(url, popname, size);
	</script>
	</c:if>

</body>
</html>