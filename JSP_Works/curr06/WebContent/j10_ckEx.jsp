<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<h2>팝업 보여지는 화면</h2>
	
	<%
		Cookie[] cks = request.getCookies();
		boolean show = true;
		
		if(cks != null){
			for(Cookie each : cks){
				if(each.getName().equals("pop10")){
					show = false;
					break;
				}
			}
		}
	%>
	
	<%
		if(show){
	%>
		<script type="text/javascript">
			var url = "/curr06/j10_pop.jsp";
			var popname = "pop";
			var size = "width=800 , height=450"
			window.open(url, popname, size);
		</script>
	<%
		}
	%>
</body>
</html>