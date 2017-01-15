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

	<h2>인사 정보 목록</h2>
	
	<table border="1" style="text-align: center">
		<tr>
			<td colspan="4">
				<a href="/spring11/insertOne">정보 입력</a>
			</td>
		</tr>
		<tr>
			<td>이 름</td>
			<td>나 이</td>
			<td>파일보기</td>
			<td>&nbsp;</td>
		</tr>
		<c:forEach var="each" items="${ listc }">
			<tr>
			<td>${ each.name }</td>
			<td>${ each.age }</td>
			<td>
				<c:choose>
					<c:when test="${ each.sysName != null }">
						<img src="/spring11/resources/files/${ each.sysName }"
								style="width: 100px; height: 120px"/>
						<!-- 절대경로 : /spring11/resources/.. -->
						<!-- 상대경로 : resources/.. -->
					</c:when>
					<c:otherwise>
						사진 없음
					</c:otherwise>
				</c:choose>
			</td>
			<td>
				<a href="/spring11/download?org=${ each.orgName }&sys=${ each.sysName }">다운로드</a>
				<a href="/spring11/delete?num=${ each.num }&sys=${ each.sysName }">삭제하기</a>
				<a href="/spring11/update?num=${ each.num }&sys=${ each.sysName }" type="file" name="upfile">수정하기</a>
			</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>