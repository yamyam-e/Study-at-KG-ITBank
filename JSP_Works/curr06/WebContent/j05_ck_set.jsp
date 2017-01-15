<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
	
		Cookie ck 
			= new Cookie("MyCookie-BaePath", "Ck-BasePath");
		response.addCookie(ck);
	
	%>
	<script type="text/javascript">
		alert("쿠키 생성 및 전송 완료[기본[상위]경로]");
		location.href = "/curr06/j04_ck_home.jsp";
	</script>
</body>
</html>