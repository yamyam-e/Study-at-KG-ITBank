<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>성적 입력</title>

	<script type="text/javascript">
		function home(){
			var ccc = document.frm;
			ccc.action = "/curr01/j34_HW.jsp";
			ccc.method = "post";
			ccc.submit();
		}
		function input() {
			var aaa = document.frm;
			aaa.action = "/curr01/j34_HW01.jsp";
			aaa.method = "post";
			aaa.submit();
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
		.a th {
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
	
	<h2>성적 입력 페이지</h2>

	<%
		
		request.setCharacterEncoding("UTF-8");

		String getMany = request.getParameter("getMany");
		int many = Integer.parseInt(request.getParameter("getMany"));
		String sel = request.getParameter("sel");
		
		String name[] = request.getParameterValues("name");
		String kor[] = request.getParameterValues("kor");
		String eng[] = request.getParameterValues("eng");
		String math[] = request.getParameterValues("math");
		
		
		if(sel != null){
			
			if(sel.equals("인원추가")){
				many++;
			} else if(sel.equals("인원삭제")){
				many--;
				if(many<1) {
					many = 1;
					name[0] = " ";
					kor[0] = "0";
					eng[0] = "0";
					math[0] = "0";
				}
			}
		}
			
	%>
	<form name="frm">
	<table class="a">
		<tr>
			<td colspan="4">
				<input type="submit" value="홈으로" onclick="javascript: home()"/>
				<input type="submit" name="sel" value="인원추가" onclick="javascript: input()"/>
				<input type="submit" name="sel" value="인원삭제" onclick="javascript: input()"/>
				<input type="submit" value="성적보기" onclick="javascript: showGrade()"/>
				<input type="hidden" name="getMany" value="<%=many%>"/>
			</td>
		</tr>
	 	<tr>
	 		<th>이 름</th>
	 		<th>국 어</th>
	 		<th>영 어</th>
	 		<th>수 학</th>
	 	</tr>
	 	<%
	 	if(sel != null && sel.equals("인원삭제")){
	 		
	 		for(int i=0; i<many; i++){
	 	%>		
	 				<tr>
	 	 			<td>
	 					<input type="text" name="name" value="<%=name[i] %>"/>
	 				</td>
	 				<td>
	 					<input type="text" name="kor" value="<%=kor[i] %>"/>
	 				</td>
	 				<td>
	 					<input type="text" name="eng" value="<%=eng[i] %>"/>
	 				</td>
	 				<td>
	 					<input type="text" name="math" value="<%=math[i] %>"/>
	 				</td>
	 			</tr>
	 	<%
	 	 	 	}
	 	} else if(name != null && many==name.length){
			
	 		for(int i=0; i<name.length; i++){
	 	%>		
	 				<tr>
	 	 			<td>
	 					<input type="text" name="name" value="<%=name[i] %>"/>
	 				</td>
	 				<td>
	 					<input type="text" name="kor" value="<%=kor[i] %>"/>
	 				</td>
	 				<td>
	 					<input type="text" name="eng" value="<%=eng[i] %>"/>
	 				</td>
	 				<td>
	 					<input type="text" name="math" value="<%=math[i] %>"/>
	 				</td>
	 			</tr>
	 	<%
	 	 	 	}
	 	} else {
	 		
	 	 	for(int i=0; i<many; i++){
		%>		
				<tr>
	 			<td>
					<input type="text" name="name" 
									<%
									if(i<(many-1)){
									%>
									value="<%=name[i] %>"
									<%
									} else {
									%>
									value=" ";
									<%
									}
									%>/>
				</td>
				<td>
					<input type="text" name="kor" 
									<%
									if(i<(many-1)){
									%>
									value="<%=kor[i] %>"
									<%
									} else {
									%>
									value="0";
									<%
									}
									%>/>
				</td>
				<td>
					<input type="text" name="eng" 
									<%
									if(i<(many-1)){
									%>
									value="<%=eng[i] %>"
									<%
									} else {
									%>
									value="0";
									<%
									}
									%>/>
				</td>
				<td>
					<input type="text" name="math"
									<%
									if(i<(many-1)){
									%>
									value="<%=math[i] %>"
									<%
									} else {
									%>
									value="0";
									<%
									}
									%>/>
				</td>
			</tr>
		<%
	 	 	}
	 	}
 	 	%>
	 </table>
	 </form>
</body>
</html>