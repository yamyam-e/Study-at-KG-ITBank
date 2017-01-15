<%@page import="dao.PeopleDao"%>
<%@page import="dto.PeopleDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<%
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
	
		PeopleDao dao = new PeopleDao();
		int res = dao.insertOne(new PeopleDto(name, age));

		String msg = res > 0 ? "저장 완료" : "저장 실패";
	%>
	<script type="text/javascript">
		alert("<%= msg%>");
		location.href="/curr04/j02_selectAll.jsp";
	</script>

</body>
</html>