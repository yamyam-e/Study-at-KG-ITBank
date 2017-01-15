	<%@page import="dto.PeopleDTO"%>
<%@page import="dao.PeopleDAO"%>
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
	
		PeopleDAO dao = new PeopleDAO();
		int res = dao.insertOne(new PeopleDTO(name, age));
		String msg = res > 0 ? "저장 완료" : "저장 실패";
	%>
	<script type="text/javascript">
		alert("<%=msg%>");
		location.href = "/curr05/j02_selectAll.jsp";
	
	</script>
	

</body>
</html>