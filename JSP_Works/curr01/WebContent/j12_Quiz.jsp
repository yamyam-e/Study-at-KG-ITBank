<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ page import="p02_basic.People" %>
   <%@ page import="java.util.ArrayList" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>인사 정보 테이블</title>
<style>
	.b, .b td{
		border: 1px solid blue;
		width: 300px;
		height: 20px
	}
</style>
</head>
<body>

	<%
		
		People peo = new People("둘리", 10);
		ArrayList<People> listc = new ArrayList<>();
		listc.add(new People("도우너", 23));
		listc.add(new People("마이콜", 11));
		listc.add(new People("또치", 22));
		listc.add(new People("하니", 33));
	
	%>
	
	<table class="b">
			<tr>
				<td align="center">이름</td>
				<td align="center">나이</td>
	<%for(People each : listc) {%>
			<tr>
				<td align="center"><%=each.getName() %></td>
				<td align="center"><%=each.getAge() %></td>
			</tr>		
	<%} %>
	</table>

	

</body>
</html>