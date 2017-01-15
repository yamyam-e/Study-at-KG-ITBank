<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<h2>팝업 화면</h2>
	
	<input type="button" value="닫기" onclick="javascript:self.close()"/>
	<input type="button" value="10초동안 보이지않기" onclick="javascript:noView()"/>	
	<script type="text/javascript">
		function noView(){
			location.href="/curr06/j10_ckNew.jsp";
		}
	</script>	
	
</body>
</html>