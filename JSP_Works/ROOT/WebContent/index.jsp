<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<!-- 
		각 인클루드에 있는 디렉티브 값들은 지울 수 있다. 인덱스가 가지고 있기 때문이다.
	 -->
	 
	 <%
	 	String mainView = "/mainHome.jsp";
	 
	 	if(request.getParameter("mainView") != null){
	 		mainView = 
	 				"/" + request.getParameter("mainView") + ".jsp";
	 	}
	 %>
	
	<h2>index.jsp</h2>
	
	<table border="1" style="text-align: center; width: 600px; height: 350px">
	
		<tr>
			<td colspan="2">
				<jsp:include page="/top.jsp"></jsp:include>
			</td>
		</tr>
		<tr>
			<td style="width:200px" bgcolor="yellow"><jsp:include page="/left.jsp"></jsp:include></td>
			<td><jsp:include page="<%=mainView %>"></jsp:include></td>
		</tr>
		<tr>
			<td colspan="2">
				<jsp:include page="/bottom.jsp"></jsp:include>
			</td>
		</tr>
	</table>
	

</body>
</html>