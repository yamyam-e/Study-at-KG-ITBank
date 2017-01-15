<%@page import="dto.PeopleDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		ArrayList<PeopleDTO> listc = (ArrayList)request.getAttribute("listc");
	%>
	<h2>인사 정보 목록</h2><hr>
	
	<%
		if(listc != null)
			for(PeopleDTO each : listc) {
				
	%>
				번호 : <%=each.getNum() %> ,
				이름 : <%=each.getName() %> ,
				나이 : <%=each.getAge() %><br>
	<%
			}
	%>
</body>
</html>