<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%--  <br> 줄바꿈, 종료태그 없음 --%>
	첫번째 줄 <br>
	두번째 줄 <br>
	
	<%-- <h번호> : 머릿글, 번호는 1~6, 자동 줄바꿈 기능 --%>
	<h1>머릿글1</h1>
	<h2>머릿글2</h2>
	<h3>머릿글3</h3>
	
	<%-- <p> 문단 엘리먼트, 문단 구분, 일반적으로 종료태그 생략 --%>
	<p>ABCD</p>
	
	<%-- <pre> : 양식화된 텍스트 화면 영역, 자간 및 줄바꿈 등 출력 --%>
	ABCD			12345 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; AAAA <br>
<pre>가나다                              ABCDE

111111				333333
</pre>
	<%-- 목록(List) 엘리먼트 : <ul> <ol> <dl> 
			- <ul> : unOrder List Elements
			- <ol> : order List El.
			- <dl> : definition List El.
	--%>
	<ul>
		<li>1111</li>
		<li>2222</li>
		<li>3333</li>
	</ul>
	<ol>
		<li>AAAA</li>
		<li>BBBB</li>
		<li>CCCC</li>
	</ol>
	<dl>
		<dt>JSP</dt> <%-- definition Term El --%>	
		<dd>Java Server Page</dd> <%-- dd : definition description --%>
	</dl>
</body>
</html>
























