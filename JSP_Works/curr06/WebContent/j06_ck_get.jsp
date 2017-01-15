<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		String msg = "";
		Cookie[] cks = request.getCookies();
	
// 		쿠키 확인 시 반드시 null값 확인 필요
		if(cks != null){
			for(Cookie each : cks){
				String name = each.getName();
				String value = each.getValue();
				msg += name + ">>>>>" + value + "\\n";
			}
		} else {
			msg = "전달되는 쿠키가 없습니다.";
		}
	
	%>
	<script type="text/javascript">
		alert("서버에 수신된 쿠키 정보\n<%= msg %>");
		location.href = "/curr06/j04_ck_home.jsp";
	</script>

</body>
</html>