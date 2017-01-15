<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>컴퓨터 정보 관리 프로그램</h2><hr>
	<form action="/curr03/j16_forward.jsp" method="post">
		<input type="hidden" name="sel" value ="입력하기"/>
		<input type="hidden" name="nextPage" value ="j16_showAll"/>
		<table border="1" style="text-align: cetner;">
			<tr>
				<td>제조사</td>
				<td><input type="text" name="manufacturer"/>
				</td>
			</tr>
			<tr>
				<td>상품명</td>
				<td><input type="text" name="productName"/>
				</td>
			</tr>
			<tr>
				<td>모니터가격</td>
				<td><input type="text" name="priceOfMon"/>
				</td>
			</tr>
			<tr>
				<td>본체가격</td>
				<td><input type="text" name="priceOfDesk"/>
				</td>
			</tr>
			<tr>
				<td>키보드가격</td>
				<td><input type="text" name="priceOfKey"/>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="저장하기"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>