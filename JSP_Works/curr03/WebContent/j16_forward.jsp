<%@page import="entity.Computer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
	
		String sel = request.getParameter("sel");
		String nextPage = request.getParameter("nextPage");
		String num = request.getParameter("num");
		
		String manufacturer = request.getParameter("manufacturer");
		String productName = request.getParameter("productName");
		int priceOfMon = Integer.parseInt(request.getParameter("priceOfMon"));
		int priceOfDesk = Integer.parseInt(request.getParameter("priceOfDesk"));
		int priceOfKey = Integer.parseInt(request.getParameter("priceOfKey"));
		
		System.out.println("sel="+sel+",nextPage="+nextPage);
		
		Computer com = new Computer();
		com.setManufacturer(manufacturer);
		com.setProductName(productName);
		com.setPriceOfMon(priceOfMon);
		com.setPriceOfDesk(priceOfDesk);
		com.setPriceOfKey(priceOfKey);
		
		request.setAttribute("com", com);
		System.out.println(com.toString());
		
	%>
	<jsp:forward page="/cont?sel=목록보기"></jsp:forward>

</body>
</html>