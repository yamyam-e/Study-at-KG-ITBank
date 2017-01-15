<%@page import="java.text.DecimalFormat"%>
<%@page import="p00_my.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.reflect.Array"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>성적 정보 보기</title>
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
		function showResult() {
			var ccc = document.frm;
			ccc.action = "/curr01/j34_HW03.jsp";
			ccc.method = "post";
			ccc.submit();
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
		.a, .a td {
			border: 1px solid black;
			width: 300px;
			height: 25px;
			text-align: center;
		}
	</style>

	<h2>학생 성적 보기</h2>
	
	<%
		request.setCharacterEncoding("UTF-8");
		
		String getMany = request.getParameter("getMany");
		int many = Integer.parseInt(request.getParameter("getMany"));
	
		String[] name = request.getParameterValues("name");
		String[] kor = request.getParameterValues("kor");
		String[] eng = request.getParameterValues("eng");
		String[] math = request.getParameterValues("math");
		
	%>
	
	
	<form name="frm">
		<table class="a">
			<tr>
				<td colspan="6">
				<input type="submit" value="홈으로" onclick="javascript: home()"/>
				<input type="submit" value="성적입력" onclick="javascript: input()"/>
				<input type="submit" value="결과보기" onclick="javascript: showResult()"/>
				<input type="hidden" name="getMany" value="<%=many %>"/>
				</td>
			</tr>
			<tr>
				<th>이 름</th>
				<th>국 어</th>
				<th>영 어</th>
				<th>수 학</th>
				<th>총 점</th>
				<th>평 균</th>
			</tr>
			<%
			if(name != null && !name[0].equals("")){
				for(int i=0; i<name.length; i++){
					int total = Integer.parseInt(kor[i])+Integer.parseInt(eng[i])+Integer.parseInt(math[i]);
					DecimalFormat dd = new DecimalFormat("##.##");
					String avg = dd.format(total/3.0);
			%>
				<tr>
					<td>
						<input readonly="readonly" type="text" name="name" value="<%=name[i] %>"/>
					</td>
					<td>
						<input readonly="readonly" type="text" name="kor" value="<%=kor[i] %>"/>
					</td>
					<td>
						<input readonly="readonly" type="text" name="eng" value="<%=eng[i] %>"/>
					</td>
					<td>
						<input readonly="readonly" type="text" name="math" value="<%=math[i] %>"/>
					</td>
					<td>
						<input readonly="readonly" type="text" name="total" value="<%=total %>"/>
					</td>
					<td>
						<input readonly="readonly" type="text" name="avg" value="<%=avg %>"/>
					</td>
				</tr>
			<%	}
			}
			%>
		</table>
	</form>
	
</body>
</html>