<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>합격 결과 보기</title>
	<script type="text/javascript">
		function home() {
			var aaa = document.frm;
			aaa.action = "/curr01/j34_HW.jsp";
			aaa.method = "post";
			aaa.submit();
		}
		function input() {
			var bbb = document.frm;
			bbb.action = "/curr01/j34_HW01.jsp";
			bbb.method = "post";
			bbb.submit();
		}
		function showGrade() {
			var bbb = document.frm;
			bbb.action = "/curr01/j34_HW02.jsp";
			bbb.method = "post";
			bbb.submit();
		}
	</script>
</head>
<body>

	<style>
		.a th{
			border: 1px solid black;
			width: 300px;
			height: 30px;
			background: yellow;
			text-align: center;
		}
		.a, .a td{
			border: 1px solid black;
			width: 300px;
			height: 25px;
			text-align: center;
		}
	</style>

	<h2>합격 결과 보기 페이지</h2>
	
	<%
		request.setCharacterEncoding("UTF-8");
		
		String getMany = request.getParameter("getMany");
		int many = Integer.parseInt(request.getParameter("getMany"));
		
		String[] name = request.getParameterValues("name");
		String[] kor = request.getParameterValues("kor");
		String[] eng = request.getParameterValues("eng");
		String[] math = request.getParameterValues("math");
	%>
	
	<form name ="frm">
		<table class="a">
			<tr>
				<td colspan="3">
					<input type="submit" value="홈으로" onclick="javascript: home()"/>
					<input type="submit" value="성적입력" onclick="javascript: input()"/>
					<input type="submit" value="성적보기" onclick="javascript: showGrade()"/>
					<input type="hidden" name="getMany" value="<%=many %>"/>
				</td>
			</tr>
			<tr>
				<th>이 름</th>
				<th>평 균</th>
				<th>결 과</th>
			</tr>
		<%
		if(name != null){
			for(int i=0; i<name.length; i++) {
				int total = Integer.parseInt(kor[i])+Integer.parseInt(eng[i])+Integer.parseInt(math[i]);
				DecimalFormat dd = new DecimalFormat("##.##");
				String avg = dd.format(total/3.0);
			%>
				<tr>
					<td>
						<%=name[i] %>
					</td>
					<td>
						<%=avg %>
					</td>
						<%
						if(Double.parseDouble(avg)>85.5){
						%>
						<td>합격</td>
						<%
						} else {
						%>
						<td bgcolor="red">불합격</td>
						<%
						}
						%>
				</tr>
				
				<input type="hidden" name="name" value="<%=name[i] %>"/>
				<input type="hidden" name="kor" value="<%=kor[i] %>"/>
				<input type="hidden" name="eng" value="<%=eng[i] %>"/>
				<input type="hidden" name="math" value="<%=math[i] %>"/>
				<input type="hidden" name="total" value="<%=total %>"/>
				<input type="hidden" name="avg" value="<%=avg %>"/>
			<%
			}
		} 
		%>
		</table>
	</form>

</body>
</html>