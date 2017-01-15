<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		int many = 1;
		String addNum = request.getParameter("add");
		if(addNum != null){
			many = Integer.parseInt(addNum);
			
			if(many <=0){
				many = 1;
			}
		}
	
	%>
	<h2>학생 정보 입력</h2>
	<form action="/curr01/j26_oneEx02.jsp" method="post">
	<table border="1" style="text-align: center">
		<tr>
			<td colspan="4">
				<a href="?add=<%= many+1 %>">인원추가</a> &nbsp;&nbsp;&nbsp;&nbsp;
				<a href="?add=<%= many-1 %>">인원삭제</a>
<%-- 				<a href="?add=<% --%>
// 								if(many<=0){
									
// 								}
<%-- 								%>">인원삭제</a> --%>
				
			</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
		</tr>
	<%
		for(int i=0; i<many; i++){
	%>
		<tr>
			<td>
				<input type="text" name="name"/>
 			</td>
 			<td>
				<input type="text" name="kor"/>
 			</td>
 			<td>
				<input type="text" name="eng"/>
 			</td>
 			<td>
				<input type="text" name="math"/>
 			</td>
		</tr>
	<%
		}
	%>
		<tr>
		<td colspan="4">
			<input type="submit" value="전송하기"/>
		</td>
		</tr>
	</table>
	
	</form>

</body>
</html>