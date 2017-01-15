<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:choose>
		<c:when test="${ !empty msg }">
			<script type="text/javascript">
				alert("${ msg }");
			</script>
		</c:when>
		<c:otherwise>
			<h2>학생 정보 목록</h2>
			<table border="1" style="text-align: center">
				<tr>
					<td colspan="2"><a href="/spring13/insertOne">학생 정보 입력</a></td>
				</tr>
				<tr>
					<td>번호</td>
					<td>이름</td>
				</tr>
				<c:choose>
					<c:when test="${ !listc.isEmpty() }">
						<c:forEach var="each" items="${ listc }">
							<tr>
								<td><a href="/spring13/update?num=${ each.num }">${ each.num }</a></td>
								<td>${ each.name }</td>
							</tr>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<tr>
							<td colspan="2">저장된 정보 없음</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</table>
		</c:otherwise>
	</c:choose>



</body>
</html>