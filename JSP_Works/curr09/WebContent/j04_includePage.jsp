<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>include page 이용</h2>
	<!-- 
		- 절대경로 표현 기준 위치 : WebContent
		- 화면만 들어 온다. 따라서 변수 사용이 불가
		- 화면만 합칠 때 사용.
	 -->
	<table border="1" style="width: 300px; text-align: center;">
		<tr>
			<td>
				<jsp:include page="/j01_AAA.jsp"></jsp:include>
			</td>
		</tr>
		<tr>
			<td>
				<jsp:include page="/j01_BBB.jsp"></jsp:include>
			</td>
		</tr>
		<tr>
			<td>
			<%-- 에러 : aaaMsg : <%= aaaMsg %> --%>
			</td>
		</tr>
	</table>

</body>
</html>