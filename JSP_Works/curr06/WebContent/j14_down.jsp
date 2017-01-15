<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		String orgName = request.getParameter("org");
		String sysName = request.getParameter("sys");
		
		String encOrgName = URLEncoder.encode(orgName, "UTF-8");

		response.setHeader("Content-Disposition", "attachment;filename=" + encOrgName);
		
// 		- 파일을 읽는 스트림

// 		- 이클립스 이용 시 경로
		String filePath = "C:\\Users\\SeongkwonMac\\Desktop\\JSP_Works\\curr06\\WebContent\\zfiles";

		InputStream is =
				new FileInputStream(filePath + "\\" + sysName);
		
// 		브라우저로 파일을 보내는 스트림(ServletOutputStream)
		out.clear();
		out = pageContext.pushBody(); // 리셋 하는 라인
		
		ServletOutputStream sos = response.getOutputStream();
		
		int data = 0;
		while( (data = is.read()) != -1 ){
			sos.write(data);
			sos.flush();
		}
		sos.close();
		is.close();
	%>

</body>
</html>