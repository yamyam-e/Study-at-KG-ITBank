<%@page import="dao.BoardDAO"%>
<%@page import="com.sun.corba.se.impl.ior.WireObjectKeyTemplate"%>
<%@page import="dto.BoardDTO"%>
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
		int num = Integer.parseInt(request.getParameter("num"));
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String contents = request.getParameter("contents");
		
		BoardDTO dto = new BoardDTO(title, writer, contents);
		dto.setNum(num);
		
		int res = new BoardDAO().insertReply(dto);
		String msg = res > 0 ? "답변 저장 완료" : "답변 저장 실패";
	%>
	
	<script type="text/javascript">
		alert("<%= msg%>");
		location.href="/curr07/b03_selectAll.jsp";
	</script>

</body>
</html>