<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	<script type="text/javascript">
		function goback(){
			var aaa = document.frm;
			aaa.action = "/curr01/j33_Quiz01.jsp";
			aaa.submit();
		}
	
	</script>
	
</head>
<body>

	<h2>j33_Quiz03 페이지</h2>
	
	<%
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
	
		String res = null;
		if(Integer.parseInt(age)<=19){
			res = name + "님은 할인 대상입니다.";
		}else{ 
			res= name + "님은 할인 대상이 아닙니다.";
		}
	%>
	
	<form name="frm">
		<%= res%> <br>
		<input type="button" value="입력페이지로가기" onclick="javascript: goback()"/>
	</form>
	

</body>
</html>