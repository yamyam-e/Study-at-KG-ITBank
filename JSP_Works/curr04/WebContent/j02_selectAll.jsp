<%@page import="java.util.ArrayList"%>
<%@page import="dao.PeopleDao"%>
<%@page import="dto.PeopleDto" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		PeopleDao dao = new PeopleDao();
		ArrayList<PeopleDto> listc = dao.selectAll();
	%>
	
	<h2>인사 정보 목록</h2>
	<form method="post">
	<table border="1"  style="text-align: center;">
		
		<tr>
			<td>이 름</td>
			<td>나 이</td>
		</tr>
		<%
			if(listc != null){
				
				for(PeopleDto each : listc){
		%>
					<tr>
					<td>
						<a href="/curr04/j02_selectOne.jsp?num=<%=each.getNum()%>">
									<%=each.getName() %></a>
					</td>
					<td><%=each.getAge() %></td>
					</tr>
		<%		}
				
			} else {
		%>
				<tr>
				<td colspan="2">입력 정보가 없습니다.</td>
				</tr>
		<%
			}
		%>
		
	</table>
	</form>

</body>
</html>