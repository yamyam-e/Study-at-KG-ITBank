<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>전송 페이지 : 인사정보 여러개 보내기</h2>
	
	<form action="/curr01/j23_requestValues02.jsp" method="post">
	<table border="1" style="text-align: center">
		<tr>
			<td>나 이</td>
			<td>이 름</td>
		</tr>
		
		<%
			for(int i=0; i<5; i++){
		%>
			<tr>
				<td>
				<input type="text", name="name"/>
				</td>
				<td>
				<input type="text", name="age"/>
				</td>
			</tr>
		<%
			}
		%>
		<tr>
			<td colspan="2">
			<input type="submit" value="전송하기">
			</td>
		</tr>
	</table>
	</form>

</body>
</html>