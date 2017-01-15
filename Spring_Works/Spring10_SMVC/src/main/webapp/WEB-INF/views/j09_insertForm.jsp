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

	<h2>j09_insertForm : 리스트 입력</h2>
	
	<form method="post">
	<table border="1">
		<tr align="center">
			<td>이름</td>
			<td>나이</td>
		</tr>
		<c:forEach var="i" begin="0" end="2" step="1">
			<tr>
				<td><input type="text" name="listc[${ i }].name"/>
				</td>
				<td><input type="text" name="listc[${ i }].age"/>
				</td>
			</tr>
		</c:forEach>
		<tr align="center">
			<td colspan="2">
				<input type="submit" value="전송하기"/>
			</td>
		</tr>
	</table>
		
	</form>



</body>
</html>