<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
	
		Cookie[] cks = request.getCookies();
		String msg = "";
		
		if(cks != null){
			for(Cookie each : cks){
				String name = each.getName();
				String value = each.getValue();
				
				String dcName = URLDecoder.decode(name, "UTF-8");
				String dcValue = URLDecoder.decode(value, "UTF-8");
				
				msg += dcName + ">>>>>>>" + dcValue + "\\n";
			}
		}
	%>
	<script type="text/javascript">
		alert("<%=msg %>");
	</script>

</body>
</html>