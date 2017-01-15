<%@page import="dao.PeopleDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	<%
		String num = request.getParameter("num");
		String sel = request.getParameter("sel");
		String msg = null;
		String url = null;
		PeopleDao dao = new PeopleDao();
		if(sel.equals("삭제")){
			msg = dao.delete(num);
			url = "/curr04/j02_selectAll.jsp";
		} else if(sel.equals("수정")){
			int age = Integer.parseInt(request.getParameter("age"));
			msg = dao.update(num, age);
			url = "/curr04/j02_selectOne.jsp?num=" + num;
		}
	%>
		<script type="text/javascript">
			alert("<%=msg %>");
			location.href="<%=url%>";
		</script>
	

</body>
</html>