<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>include file 이용</h2>
	<!-- 
		- 절대경로 표현 기준 위치 : WebContent
		- 소스 코드 자체를 가져온다. file 자체에 소스 코드를 읽어 들인 후에 변수 사용 가능
		- 윗 쪽에 코딩 변수를 사용 하기 때문에....
		- 각 페이지 변수 이름 중복 불가
	 -->
	
	<table border="1" style="width: 300px; text-align: center;"> 
		<tr>
			<td><%@ include file="j01_AAA.jsp" %></td>
		</tr>
		<tr>
			<td><%@ include file="j01_BBB.jsp" %></td>
		</tr>
		<tr>
			<td>
				aaaMsg : <%= aaaMsg %>
			</td>
		</tr>
	</table>

</body>
</html>