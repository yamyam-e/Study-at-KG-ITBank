<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		
		Cookie ck = new Cookie("MyCookie-age10", "age10");
	
		ck.setMaxAge(10); // 단위: 초
		
		response.addCookie(ck);
// 		=> 쿠키의 모든 설정은 response.addCookie() 이전에 명령되야 함
	%>
	<script type="text/javascript">
		alert("생존시간 10초 쿠키 생성 및 전송 완료[기본경로]");
		location.href = "/curr06/j04_ck_home.jsp";
	</script>
</body>
</html>