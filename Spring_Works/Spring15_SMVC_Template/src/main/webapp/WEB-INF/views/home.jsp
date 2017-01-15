<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style type="text/css">
		html, body {
			width: 100%;
			height: 100%;
		}
		#home {
			width: 100%;
			heigth: 100%;
		}
	
	</style>
	
</head>
<body>

	<table id="home" border="1" style="text-align: center;">
		<tr style="height: 25%">
			<td colspan="2">
				<jsp:include page="/WEB-INF/views/ext/top.jsp"/>
			</td>
		</tr>
		<tr>
			<td  style="width: 20%">
				<c:choose>
					<c:when test="${ left != null }">
						<jsp:include page="${ left }"/>
					</c:when>
					<c:otherwise>
						<jsp:include page="/WEB-INF/views/ext/left.jsp"/>
					</c:otherwise>
				</c:choose>
			</td>
			<td  align="center">
				<c:choose>
					<c:when test="${ main != null }">
						<jsp:include page="${ main }"/>
					</c:when>
					<c:otherwise>
						<jsp:include page="/WEB-INF/views/ext/mainHome.jsp"/>
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<tr style="height: 20%">
			<td colspan="2">
				<jsp:include page="/WEB-INF/views/ext/bottom.jsp"/>
			</td>
		</tr>
	</table>


</body>
</html>