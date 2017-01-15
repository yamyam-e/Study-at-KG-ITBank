<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<h2>인사 정보 입력</h2><hr>
	
	<form action="/curr05/j02_insertConn.jsp" method="post">
	<table border="1" style="text-align: center">
		<tr>
			<td>이름</td>
			<td>나이</td>
		</tr>
		<tr>
			<td>
				<input type="text" name="name" required="required"/>
			</td>
			<td>
				<input type="text" name="age" required="required"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="저장하기"/>
			</td>
		</tr>
	</table>
	
	</form>
	

</body>
</html>