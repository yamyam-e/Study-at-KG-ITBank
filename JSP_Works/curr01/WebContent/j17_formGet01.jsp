<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>전송 페이지 : form태그의 Get 방식</h2>
	
	<form action="/curr01/j17_formGet02.jsp">
	<table border="1" style="text-align: center;">
		<tr>
			<td>이 름</td>
			<td> 
				<input type="text" name="name"/>
			</td>
		</tr>
		<tr>
			<td>나 이</td>
			<td> 
				<input type="text" name="age"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="전송하기"/> &nbsp;
				<input type="reset" value="다시쓰기"/>
			</td>
		</tr>
	</table>
	</form>

</body>
</html>