<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
	<!-- 
		j03_ss03_set.jsp
		j03_ss04_get.jsp
		j03_ss05_inv.jsp
	
		세션의 이용(정보 저장/정보 호출/정보 삭제)
	 -->
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	<%
		String msg = "세션에 저장할 메시지";
		session.setAttribute("mmm", msg);
		
		int n = 9999;
		session.setAttribute("nnn", n);
		
		ArrayList<String> listc = new ArrayList<>();
		listc.add(new String("가나다"));
		listc.add(new String("12345"));
		listc.add(new String("ABCDE"));
		session.setAttribute("listc", listc);
		
		//세션 시간 설정 : 초단위, 기본 30분, -1 은 무한대
		session.setMaxInactiveInterval(-1);
	%>
	
	<h2>세션 저장 완료</h2>
	현재 페이지 session : <%=session %><br>
	현재 페이지 hSession : <%=request.getSession() %><br>
	

</body>
</html>