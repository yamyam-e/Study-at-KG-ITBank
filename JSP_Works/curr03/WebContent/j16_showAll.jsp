<%@page import="entity.Computer"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<Computer> listc = (ArrayList<Computer>)request.getAttribute("listc");
	%>
	<h2>전체 목록 보기</h2><hr>
	<form method="post">
	
		<table border="1" style="text-align: center;">
<!-- 		<input type="hidden" name="sel" value="상세보기"/> -->
<!-- 		<input type="hidden" name="nextPage" value="j16_showOne"/> -->
			<tr>
				<td>번호</td>
				<td>제조사</td>
				<td>상품명</td>
			<tr>
				<%
				if(listc != null){
					for(Computer each : listc){
					%>
						<tr>
						<td><%=each.getNum() %></td>
						<td><%=each.getManufacturer() %></td>
						<td><a href ="/curr03/cont?num=<%=each.getNum()%>&sel=상세보기&nextPage=j16_showOne"><%=each.getProductName() %></a>
						</td>
						<tr>
					<%
					}
				} else {
				%>
					<tr>
					<td colspan="3" >저장된 정보 없음</td>
					</tr>
				<%
				}
				%>
		</table>
	
	
	</form>
	

</body>
</html>