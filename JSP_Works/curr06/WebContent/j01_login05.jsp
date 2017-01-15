<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
// 	세션 정보 삭제 방법 2가지
// 	1. removeAttribute
		session.removeAttribute("nowLogin");
		
// 	2. invalidate()
		session.invalidate();

//  	에러 : session.setAttribute("session이용?", "");
	%>
	<script type="text/javascript">
		alert("로그아웃 되었습니다. 확인 페이지로 이동합니다.");
		location.href = "/curr06/j01_login04.jsp";
	</script>

</body>
</html>