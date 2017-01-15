<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%--
		컴퓨터 구매가겨 산출 프로그램
		1. 항목 : 이름, 키보두-모니터-본체 가격, 총 구매가격
		2. form(post) && table 이용
		3. 5개 정보 입력 후 결과 보기
		4. 결과 보기 화면에는 "입력 화면 가기" 기능이 있어야 함
 	--%>
	<form action="/curr01/j24_Quiz02.jsp" method="post">
	<table border="1" style="text-align: center">
		<tr>
			<td>컴퓨터이름</td><td>키보드</td><td>본체</td><td>모니터</td>
		</tr>
		<%
		for(int i=0; i<5; i++){
		%>
		<tr>
			<td>
				<input type="text", name="name"/>
			</td>
			<td>
				<input type="text", name="keyPrice"/>
			</td>
			<td>
				<input type="text", name="deskPrice"/>
			</td>
			<td>
				<input type="text", name="monPrice"/>
			</td>
		</tr>
		<%
		}
		%>
		<tr>
			<td colspan="4">
				<input type="submit" value="전송하기"/>
			</td>
		</tr>
	
	</table>
	</form>
	

</body>
</html>