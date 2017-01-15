<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>session의 이용</h2>
	<%
// 		세션 이용 방법 2가지
// 		session.
		HttpSession hsession = request.getSession();
	%>
	
	1. 세션 유지 시간 정보 확인(초) : 기본 30분 유지
		<%= session.getMaxInactiveInterval() %> <br>
	
	2. 세션 최초 생성 시간(단위 : ms)
		<%= session.getCreationTime() %>
		<%= new SimpleDateFormat("yyy MM dd hh:mm:ss").format(session.getCreationTime()) %> <br>
		
	3. sessionID : <%= session.getId() %> <br>
	
	4. 현재 브라우저에서 최초로 생성된 session인지 확인(새로고침 하면 false 바뀐다.):
		<%= session.isNew() %> <br>
	
	5. 세션 최초 생성 후 경과 시간(결과타입 : long) :
		<%
			long now = System.currentTimeMillis();
			long start = session.getCreationTime();
			long passed = (now - start) / 1000;
		%>
		경과 시간 : <%=passed %> <br>
	
	6. 세션 시간 설정(단위 : 초)
		<%
			session.setMaxInactiveInterval(10);
// 			=> 아무런 작업 없이 10초가 경과된 경우 세션 삭제
		%>
</body>
</html>













