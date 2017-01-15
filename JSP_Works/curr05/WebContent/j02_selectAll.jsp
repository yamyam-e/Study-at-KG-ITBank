<%@page import="dto.PeopleDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.PeopleDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	<%
		PeopleDAO dao = new PeopleDAO();
		ArrayList listc = dao.selectAll();
	%>
	
	<h2>인사 정보 목록</h2><hr>
	<form action="/curr05/j01_insertForm.jsp" method="post" name="frm">
	<table border="1" style="text-align: center;">
		<tr>
			<td colspan="2">
				<input type="submit" value="입력폼"/>
			</td>
		</tr>
		<tr>
			<td>번호</td>
			<td>이름</td>
		</tr>
		<%
		if(listc != null){
		%>
		<%
			for(Object each : listc){
				PeopleDTO temp = (PeopleDTO) each;
		%>
			<tr>
				<td><%=temp.getNum() %></td>
				<td>
					<a href = "/curr05/j02_selectOne.jsp?sel=selectOne&num=<%=temp.getNum()%>"><%=temp.getName() %>
					</a>
				</td>
			</tr>
		
		<%
			}
		} else {
		%>
			<tr>
			<td colspan="2">저장된 정보가 없습니다.</td>
			</tr>
		<%
		}
		%>
		
	</table>
	</form>
	
</body>
</html>