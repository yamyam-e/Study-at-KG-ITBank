<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>쿠키 생성(한글)</h2>
	
	<%
// 		에러 :
// 		Cookie ck = new Cookie("나의이름은", "둘리");
	
		String name = URLEncoder.encode("나의 이름은 둘리", "UTF-8");
		String value = URLEncoder.encode("둘리", "UTF-8");
		
		Cookie ck = new Cookie(name, value);
		response.addCookie(ck);
		
	%>	
	<script type="text/javascript">
		alert("쿠키 전송 완료");
		location.href = "/curr06/j09_utf02.jsp";
	</script>
</body>
</html>