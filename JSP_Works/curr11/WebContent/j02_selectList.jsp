<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>인사 정보 목록</h2>
	<table border="1" style="text-align: center;">
		<tr>
		<td colspan="2">
			<a href="">인사 정보 입력</a>
		</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>나이</td>
		</tr>
		<c:choose>
			<c:when test="${ listc != null }">
				<c:forEach var="each" items="${ listc }">
					<tr>
						<td>${ each.num }</td>
						<td>${ each.name }</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="2">
						저장된 정보가 없습니다.
					</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>

</body>
</html>