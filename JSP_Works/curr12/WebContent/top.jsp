<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h3><a href="/curr12/">인사 정보 관리 프로그램</a></h3>
	
	<div align="right">
		
		<c:choose>
			<c:when test="${ !empty nowLogin }">
				<input type="button" value="로그아웃"/>
				<input type="button" value="내정보보기"/>
			</c:when>
			<c:otherwise>
				<form action="/curr12/log/logConn" method="post">
				<table>
					<tr>
						<td>아이디</td>
						<td>
							<input type="text" name="id"/>
						</td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td>
							<input type="text" name="pw"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="로그인"/>
						</td>
					</tr>
				</table>
				</form>
			</c:otherwise>
		</c:choose>
	</div>
	
</body>
</html>