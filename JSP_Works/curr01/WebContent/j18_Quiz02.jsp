<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	
	<%
	
		String name = request.getParameter("name");
		String keyboard = request.getParameter("keyboard");
		String desktop = request.getParameter("desktop");
		String monitor = request.getParameter("monitor");
		int total = Integer.parseInt(keyboard)+Integer.parseInt(desktop)+Integer.parseInt(monitor);
	
	%>
	
	<form action="/curr01/j18_Quiz01">
		<table>
			<tr>
				<td><%=name %> </td>
			</tr>
			<tr>
				<td><%=keyboard %> </td>
			</tr>
			<tr>
				<td><%=desktop %> </td>
			</tr>
			<tr>
				<td><%=monitor %> </td>
			</tr>
			<tr>
				<td><%=total %> </td>
			</tr>
			<tr>
				<input type="submit" value="되돌아가기">
			</tr>
		</table>
	</form>

	

</body>
</html>