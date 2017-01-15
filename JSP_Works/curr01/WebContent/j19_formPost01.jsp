<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<h2>전송 페이지 - form의 Post 방식</h2>
	
	<form action="/curr01/j19_formPost02.jsp" method="post">
		이름 : <input type="text" name ="name"/>
		나이 : <input type="text" name ="age"/>
		
		<input type="submit" value="전송"/>
	</form>
</body>
</html>