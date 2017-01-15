<%@page import="org.apache.catalina.connector.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>j10_forward0201 페이지</h2>
	
	RequestDispatcher의 forward 방식
	- 입력된 주소로 자동으로 이동
	- 주소창에 입력한 URL이 노출되지 않는다.
		(forward 명령 페이지가 노출됨)
	- 절대 주소 표현 기준 위치 : webContent(/프로젝트이름 빼고 URL 표기)
	
	<%	
		RequestDispatcher rd 
			= request.getRequestDispatcher("/j10_forward03.jsp"); // 절대 경로 표시할 때 프로젝트 경로는 빼야 함
		
		rd.forward(request, response);
	%> 

</body>
</html>