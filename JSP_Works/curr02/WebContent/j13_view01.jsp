<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>j13_view01 페이지</h2>
	
	<a href ="/curr02/j13_view02.jsp">a태그 redirect</a> &nbsp; &nbsp;
	<a href ="/curr02/j13_view03.jsp">a태그 forward</a>
	<hr>
	
	<form method="get" name="getfrm">
		<input type="button" value="form-get && redirect 이동"
							onclick="javascript:getRedirect()"/>  &nbsp; &nbsp;
		<input type="button" value="form-get && forward 이동"
							onclick="javascript:getForward()"/>  &nbsp; &nbsp;
	</form>
	
	<script type="text/javascript">
		function getRedirect(){
			var frm = document.getfrm;
			frm.action = "/curr02/j13_view02.jsp";
			frm.submit();
		}
		function getForward(){
			var frm = document.getfrm;
			frm.action = "/curr02/j13_view03.jsp";
			frm.submit();
		}
	</script>
	
	<form method="post" name="postfrm">
		<input type="button" value="form-post && redirect 이동"
							onclick="javascript:postRedirect()"/>  &nbsp; &nbsp;
		<input type="button" value="form-post && forward 이동"
							onclick="javascript:postForward()"/>  &nbsp; &nbsp;
	</form>
	
	<script type="text/javascript">
		function postRedirect(){
			var frm = document.postfrm;
			frm.action = "/curr02/j13_view02.jsp";
			frm.submit();
		}
		function postForward(){
			var frm = document.postfrm;
			frm.action = "/curr02/j13_view03.jsp";
			frm.submit();
		}
	</script>

</body>
</html>













