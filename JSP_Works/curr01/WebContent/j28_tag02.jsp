<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<h2>j28_tag02 페이지</h2>
	
	<%
	
		request.setCharacterEncoding("UTF-8");
	
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String[] hobbys = request.getParameterValues("hobby");
		String orgMemo = request.getParameter("memo");
		
		// textarea는 줄바꿈을 \n로 처리함 => <br> 변경해야 함
		String editMemo = orgMemo.replaceAll("\n", "<br>");
		
	%>
	
	<table border="1" style="text-align: center">
		<tr>
			<td>성 별</td>
			<td><%=gender %></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><%=email %></td>
		</tr>
		<tr>
			<td>취 미</td>
			<td>
			<%
			for(String each : hobbys){
			%>
			<%=gender %><br>
			<%
			}
			%>
			</td>
		</tr>
		<tr>
			<td>orgMemo</td>
			<td><%=orgMemo %></td>
		</tr>
		<tr>
			<td>editMemo</td>
			<td><%=editMemo %></td>
		</tr>
	
	</table>
	

</body>
</html>