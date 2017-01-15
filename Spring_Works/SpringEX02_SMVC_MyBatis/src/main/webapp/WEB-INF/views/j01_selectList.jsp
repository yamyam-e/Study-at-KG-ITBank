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

	<h2>햄버거 정보 리스트</h2><hr>
	
	<table border="1" style="text-align: center;">
		<tr>
			<td colspan="2">
			<a href="/spring02/insertOne">햄버거 정보 입력</a>
			</td>
		</tr>
		<tr>
			<td>번호</td>
			<td>이름</td>
		</tr>
		<c:choose>
			<c:when test="${ !listc.isEmpty() }">
				<c:forEach var="each" items="${ listc }">
					<tr>
						<td>
							<a href="/spring02/update?num=${ each.num }">${ each.num }</a>
						</td>
						<td>${ each.name }</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="2">저장된 정보가 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
	


</body>
</html>