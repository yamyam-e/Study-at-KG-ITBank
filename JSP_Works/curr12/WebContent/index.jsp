<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<table border="1" style="width: 700px; height: 300; text-align: center;">
		<tr>
			<td colspan="2">
				<jsp:include page="/top.jsp"></jsp:include>
			</td>
		</tr>
		<tr>
			<td style="width: 150px;">
				<jsp:include page="/left.jsp"></jsp:include>
			</td>
			<td align="center">
				<c:choose>
					<c:when test="${ mainView != null }">
						<jsp:include page="${ mainView }"></jsp:include>
					</c:when>
					<c:otherwise>
						<jsp:include page="/mainHome.jsp"></jsp:include>
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<jsp:include page="/bottom.jsp"></jsp:include>
			</td>
		</tr>
	</table>

</body>
</html>