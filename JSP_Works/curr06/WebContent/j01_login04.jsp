<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	<h2>로그인 회원만 이용 가능한 페이지</h2>
	<%
		Object rcv = session.getAttribute("nowLogin");
	
	%>
	<%
		if(rcv != null){
	%>
			<%=(String)rcv %>님 환영합니다. <br>
			
			<a href="/curr06/j01_login05.jsp">로그아웃하기</a>
	<%
		}else {
	%>
			로그인 회원만 이용 가능합니다.
	<%
		}
	%>

</body>
</html>