<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		Cookie ck = new Cookie("pop10", "no pop");
	
		ck.setMaxAge(10);
		response.addCookie(ck);
	%>
	<script type="text/javascript">
		self.close();
	</script>

</body>
</html>