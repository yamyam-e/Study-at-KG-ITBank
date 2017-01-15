<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<%
		HashMap<String, String> mapc = new HashMap<>();
		mapc.put("둘리", "kakao.png");
		mapc.put("도우너", "mocha frappuccino.jpeg");
		mapc.put("마이콜", "pencils.jpg");
		
		request.setCharacterEncoding("UTF-8");
		String peo = request.getParameter("peo");
		String img = mapc.get(peo);
		out.println(img);
	%>