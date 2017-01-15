<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>

	<script type="text/javascript">
	
		function go01() {
// 			alert("go01 함수 호출됨")
			location.href = "/curr01/j30_funcAtag02.jsp?data=데이터"; // 반드시 소문자로 시작하는 location 사용 할 것
		}
		function go02(abc) { // 스크립트 펑션은 자료형 없다.
			location.href = "/curr01/j30_funcAtag02.jsp?data=" + abc;
		}
	
	</script>



</head>
<body>

	<h2>function과 a태그의 이용</h2>
	
	<a href="/curr01/j30_funcAtag02.jsp">0. 이동</a> <hr>
	
	<a onclick="javascript:go01()">1. function을 이용한 페이지 이동</a> <hr>
	
	<a onclick="javascript:go02('둘리')">2. 이동 및 문자열 데이터 전송</a> <hr><%-- 반드시 외따옴표로 매개변수 값 넣기 --%>
	
	<%
		String dd = "도우너";
	%>
	
	<a onclick="javascriot:go02('<%=dd %>')">3. 이동 및 문자열 변수 전송</a> <hr>
	
	<a onclick="javascriot:go02('222')">3. 이동 및 숫자 변수 전송</a> <hr>
	
</body>
</html>















