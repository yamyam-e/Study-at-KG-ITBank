<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

	<c:if test="${ !empty msg }">
		<script>
			alert("${ msg }");
		</script>
	</c:if>

	<c:redirect url="/selectList"/>

</body>
</html>
