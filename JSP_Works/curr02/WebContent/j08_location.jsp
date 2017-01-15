<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>자동으로 이동되는 페이지 만들기</title>
</head>
<body>
	
	<h2>location 페이지</h2>
	
	<%
		String url = "j08_location02.jsp";
	%>
	
	<script type="text/javascript">
		location.href = "/curr02/<%= url%>";
	</script>	

</body>
</html>