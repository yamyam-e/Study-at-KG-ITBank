<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	<%	
		Cookie cks[] = request.getCookies();
	%>
	<c:choose>
		<c:when test="${ !empty cks }">
			<c:forEach var="each" items="${ cks }">
				<c:choose>
					<c:when test="${ each.name eq 'pop10' }">
						<script type="text/javascript">
							session.setAttribute("show", false);
							break;
						</script>
					</c:when>
				</c:choose>
			</c:forEach>
		</c:when>
	</c:choose>
	
	<c:choose>
		<c:when test="${ !empty nowLogin}">
			<script type="text/javascript">
				var url = "/school/popup.jsp";
				var popname = "pop";
				var siz = "with=350, height=350";
				window.open(url, popname, size);
			</script>
		</c:when>
	</c:choose>
	
	
	<div style="background-color: white; height: 380px; vertical-align: middle;" align="center">
	MainView
	</div>
				 					    			
</body>
</html>