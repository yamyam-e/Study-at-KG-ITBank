<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h1>popView01 페이지</h1>
	
	<input type="button" value="닫기" onclick="javascript: thisClose()"/> <br>
	<input type="button" value="팝업화면 이동" onclick="javascript: thisMove()"/> <br>
	<input type="button" value="부모화면 이동" onclick="javascript: openerMove()"/> <br>
	
	<script type="text/javascript">
		function thisClose(){
			self.close();
		}
		function thisMove(){
			location.href = "/curr01/j35_popView02.jsp";
		}
		function openerMove(){
			opener.location.href = "/curr01/j35_home02.jsp";
			self.close();
		}
	</script>

</body>
</html>