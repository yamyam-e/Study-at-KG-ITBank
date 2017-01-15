<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

	
	<h2>햄버거 정보</h2><hr>
	
	<c:if test="${ msg != null }">
		<script type="text/javascript">
			alert("{ msg }");
		</script>
	</c:if>
	<c:redirect url="/selectList"/>
</body>
</html>
