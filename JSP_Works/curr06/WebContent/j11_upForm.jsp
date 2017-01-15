<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>파일 업로드</h2>
	
	<!-- 
		파일 업로드 조건
		- form - post
		- enctype="multipart/form-data"
	 -->
	
	<form action="/curr06/j12_upConn.jsp" method="post" enctype="multipart/form-data">
	<table border="1" style="text-align: center;">
		<tr>
			<td>제목</td>
		</tr>
		<tr>
			<td>
				<input type="text" name="title"/>
			</td>
		</tr>
		<tr>
			<td>파일 선택</td>
		</tr>
		<tr>
			<td>
				<input type="file" name="upfile"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="업로드하기"/>
			</td>
		</tr>
	</table>
	
	</form>
</body>
</html>