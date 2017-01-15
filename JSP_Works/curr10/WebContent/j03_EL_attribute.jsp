<%@page import="dto.PeopleDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	1. EL 출력<br>
		숫자 : ${ 10 }, 문자 : ${ 'ABCD' }, ${ "둘리" }
	<hr>
	
	2. 변수 값 출력 <br> <!-- ** 변수 값은 사용 불가 ** -->
	<%
		int n = 5;
	%>
	n : ${ n }, ${ n == null }
	<hr>
	
	3. setAttribute 이용<br> <!-- EL 은 attribute 값을 출력해준다. -->
	<%
		int m = 20;
		request.setAttribute("mm", m);
	%>
	m : ${ mm }
	<hr>
	
	4. 객체와 EL <br>
	<%
		PeopleDTO pp = new PeopleDTO("둘리", 10);
		request.setAttribute("pp", pp);
	%>
	pp : ${ pp.name }, ${ pp.age }
	<hr>
	
	5. session과 EL<br>
	<%
		int p = 200;
		session.setAttribute("p", p);
	%>
	p : ${ p }
	<hr>
	
	6. 호출 우선순위 : request > session <br>
	<%
		request.setAttribute("kk", 20);
		session.setAttribute("kk", 300);
	%>
	kk : ${ kk }<br>
	request : ${ requestScope.kk }<br>
	session : ${ sessionScope.kk }<br>
	<hr>
	
	7. 이용 예 <br>
	<%
// 		로그인완료된 상태
		session.setAttribute("nowLogin", "idAAA");
	%>
	로그인 상태 ? : ${ nowLogin != null }, ${ nowLogin ne null },
						${ !empty nowLogin }<br>
	로그인 상태 && idAAA 확인 ? :
		${ nowLogin != null and nowLogin == "idAAA" },
		${ nowLogin ne null and nowLogin eq "idAAA" }
		
	
</body>
</html>









