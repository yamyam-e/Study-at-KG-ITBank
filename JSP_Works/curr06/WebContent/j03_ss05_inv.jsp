<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
	<!-- 
		j03_ss03_set.jsp
		j03_ss04_get.jsp
		j03_ss05_inv.jsp
	
		세션의 이용(정보 저장/정보 호출/정보 삭제)
	 -->
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<%
		Object rcv1 = session.getAttribute("mmm");
		String msg = (String) rcv1;
		
		int n = (int)session.getAttribute("nnn");
		
		ArrayList<String> listc = (ArrayList<String>) session.getAttribute("listc");
	
	%>
	
	msg : <%=msg %><br>
	n   : <%=n %><br>
	<%
	for(String each : listc) {
	%>
		listc : <%=each %><br>
	<%
	}
	%>
	
	삭제전 session = <%=session %><br>
	
	<%
// 		1. removeAttribute()
// 		String data = (String)session.getAttribute("mmm"); // 에러

// 		2. invalidate()
		session.invalidate();

//		에러 : 세션 이용 불가능
// 		String data = (String)session.getAttribute("mmm"); // 에러
	%>
	
	삭제 후 session <%=session %>
	삭제 후 hSession <%=request.getSession() %>
					삭제 후 이용하기 위해 재생성된 session<br>
	

</body>
</html>