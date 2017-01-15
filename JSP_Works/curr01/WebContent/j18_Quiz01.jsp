<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%--
		문제 : 컴퓨터 가격 산출 프로그램
		
		1. 입력 항목 : 이름, 키보드-본체-모니터 가격
		2. 산출 결과 보기 버튼이 존재함
		3. 결과 화면에서는 입력받은 모든 항목의 정보 및
			총 구매가겨(각 부품 가격 합산가)가 출력됨
		4. 출력 결과 화면에는 "입력 화면 가기" 기능이 존재해야 함
		5. form(Get), table로 구현
	 --%>
	 
	 <h2>컴퓨터 가격 산출 프로그램</h2>
	 
	 <form action="/curr01/j18_Quiz02.jsp">
	 	<table border="1" style="text-align: center">
			<tr>
				<td>이름</td>
				<td><input type="text" name = "name"/></td>
			</tr>
			<tr>
				<td>키보드</td>
				<td><input type="text" name="keyboard"/></td>
			</tr>	 	
	 		<tr>
				<td>본체</td>
				<td><input type="text" name="desktop"/></td>
			</tr>
			<tr>
				<td>모니터</td>
				<td><input type="text" name="monitor"/></td>
			</tr>
			<tr colspan="2" align="center">
				<td>
				<input type="submit" value="전송하기"/> &nbsp;
				<input type="reset" value="다시쓰기"/>
				</td>
			</tr>	 	
	 	</table>
	 </form>

</body>
</html>