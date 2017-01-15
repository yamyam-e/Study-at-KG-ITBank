<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
// 		원하는 쿠키에 대해 같은 이름의 쿠키 생성 및 시간 설정
// 		Cookie ck = new Cookie("MyCookie-BasePath", "del");
// 		ck.setMaxAge(0);
// 		response.addCookie(ck);

		Cookie[] cks = request.getCookies();
		if(cks != null) {
			for(Cookie each : cks){
				
				if(each.getName().equals("MyCookie-BasePath")){
					each.setMaxAge(0);
					response.addCookie(each);
					break;
				}
			}
		}
	
	%>
	<script type="text/javascript">
		alert("쿠키 MyCookie_BasePath 삭제 완료");
		location.href ="/curr06/j04_ck_home.jsp";
	</script>

</body>
</html>