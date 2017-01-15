<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>

	<script type="text/javascript">
		function discount(){
			var aaa=document.frm;
			aaa.action = "/curr01/j33_Quiz03.jsp";
			aaa.method = "post";
			aaa.submit();
		}
		function goback(){
			var bbb = document.frm;
			bbb.action = "/curr01/j33_Quiz01.jsp";
			bbb.submit();
		}
	</script>
</head>
<body>

	<h1>j33_Quiz02 페이지</h1>
	<%
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
	%>
	<form name="frm">
		<table border="1" style="text-align: center">
		<tr>
			<td>이 름</td>
			<td><%=request.getParameter("name")%></td>
		</tr>
		<tr>	
			<td>나 이</td>
			<td><%=request.getParameter("age")%></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="입력페이지" onclick="javascripte: goback()"/>
				<input type="button" value="할인정보" onclick="javascripte: discount()"/>			
			</td>
		</tr>
		</table>
		
		<input type="hidden" name="name" value="<%=name%>"/>
		<input type="hidden" name="age" value="<%=age%>"/>
		
	</form>

</body>
</html>