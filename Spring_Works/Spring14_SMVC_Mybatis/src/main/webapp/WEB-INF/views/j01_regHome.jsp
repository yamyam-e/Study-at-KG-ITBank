<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>신규 회원 가입</h2>
	<form action="regLog" method="post">
		<table border="1" style="text-align: center;">
			<tr>
				<td>id</td>
				<td>
					<input type="text" name="id" />
				</td>
			</tr>
			<tr>
				<td>pw</td>
				<td>
					<input type="text" name="pw" />
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="가입하기"/>
				</td>
			</tr>
		</table>
	</form>



</body>
</html>