<%@page import="dao.BoardDAO"%>
<%@page import="dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<!--
		답변 1개 형식 게시판
		
		groupNum : 대표글 소속 번호 == 글 고유번호(P.K)
		replySeq : 최초 대표글 0 -> 이후 추가될 때마다 계속 증가
		replyLevel : 대표글(0 또는 원본글+1) / 댓글(원본글+1)
		viewCnt : 조회수
 	-->

	
	<%
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String contents = request.getParameter("contents");
		
		BoardDTO dto = new BoardDTO(title, writer, contents);
		int res = new BoardDAO().inserOne(dto);
		
		String msg = res > 0 ? "저장 성공" : "저장 실패";
	%>
	
	<script type="text/javascript">
		alert("<%=msg%>");
		location.href = "/curr07/b03_selectAll.jsp";
	</script>

</body>
</html>