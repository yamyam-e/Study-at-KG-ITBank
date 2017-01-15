<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>j24_Quiz02 페이지</h2>
	
	<%
		request.setCharacterEncoding("UTF-8");
	
		String[] name = request.getParameterValues("name");
		String[] keyPrice = request.getParameterValues("keyPrice");
		String[] deskPrice= request.getParameterValues("deskPrice");
		String[] monPrice = request.getParameterValues("monPrice");
	
	%>
		<table border="1"  style="text-align: center">
		<tr>
			<td>컴퓨터이름</td>
			<td>키보드가격</td>
			<td>본체가격</td>
			<td>모니터가격</td>
			<td>총구매가격</td>
		</tr>
	<%
		for(int i=0; i<name.length; i++){
	%>
			<tr>
			<td><%=name[i] %></td>
			<td><%=keyPrice[i] %></td>
			<td><%=deskPrice[i] %></td>
			<td><%=monPrice[i] %></td>
			<td><%=Integer.parseInt(keyPrice[i])+Integer.parseInt(deskPrice[i])+Integer.parseInt(monPrice[i])%></td>
			</tr>
	<%	
		}
	%>
		</table>

</body>
</html>