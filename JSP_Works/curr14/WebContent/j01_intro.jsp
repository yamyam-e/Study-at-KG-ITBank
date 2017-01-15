<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
// 		페이지 이동 없이 정보를 가져오는 기법 아이작스 사용법
		String corpMenu = "";
		String bizMenu = "";
		
		String param = request.getParameter("param");
		System.out.println(param);
		
		if(param != null && param.equals("corp")){
			corpMenu = "1. 인사말<br>2. 회사연혁<br>3. 오시는 길";
		}
		if(param != null && param.equals("prod")){
			bizMenu = "1. 상품보기<br>2. 온라인 마켓";
		}
	
	%>
	
	<table align="center">
		<tr>
			<td><a href="?">HOME</a></td>
			<td><a href="?param=corp">회사소개</a></td>
			<td><a href="?param=prod">상품소개</a></td>
		</tr>
		<tr>
			<td></td>
			<td><%=corpMenu %></td>
			<td><%=bizMenu %></td>
			
		</tr>
	</table>
	

</body>
</html>