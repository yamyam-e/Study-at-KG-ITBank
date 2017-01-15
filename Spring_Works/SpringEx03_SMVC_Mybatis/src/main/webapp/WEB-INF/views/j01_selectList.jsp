<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	@font-face{
	  font-family: 'myFont';
	  src: url('resources/font/A산들바람.TTF') format('truetype');
	}
	.myFontText div {font-family: myFont, A산들바람;}
	.myFontText p {font-family: myFont, A산들바람;} 
	.myFontText table {font-family: myFont, A산들바람;}
	.myFontText input {font-family: myFont, A산들바람;}  
</style>
</head>
<body>
<div class="myFontText">
	<p>산들바람 테스트</p>
	<form action="/spring03/insertOne" method="get">
		<table border="1" style="text-align: center;">
			<tr>
				<td colspan="4">
					<input type="button" value="자동차 정보 입력"/>
				</td>
			</tr>
			<tr>
				<td>번 호</td>
				<td>사 진</td>
				<td>이 름</td>
				<td>가 격</td>
			</tr>
			<c:choose>
				<c:when test="${ !listc.isEmpty() }">
					<c:forEach var="each" items="${ listc }">
						<tr>
							<td>
								<a href="/spring03/selectOne?num=${ each.num }">${ each.num }</a>
							</td>
							<td>사진
							</td>
							<td>${ each.name }
							</td>
							<td>${ each.price }
							</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td colspan="4">저장된 정보가 없습니다.</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</table>
	</form>
</div>



</body>
</html>