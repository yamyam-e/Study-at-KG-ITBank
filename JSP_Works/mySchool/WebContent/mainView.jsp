<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
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
			var url = "/mySchool/popup.jsp";
			var popname = "pop";
			var size = "width=350 , height=350"
			window.open(url, popname, size);
		</script>
	<%
		}
	%>
	
	<div style="background-color: white; height: 380px; vertical-align: middle;" align="center">
	MainView
	</div>
				 					    			
</body>
</html>