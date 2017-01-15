<%@page import="dto.PageDTO"%>
<%@page import="dao.BoardDAO"%>
<%@page import="dto.BoardDTO"%>
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
		PageDTO pageDto = new PageDTO();
// 		=> 생성자 설정 상태
// 		- 현재 페이지 숫자(nowPage) : 1
// 		- 한 화면에 노출될 페이지 숫자 갯수(showPageNumberDegree) : 3
// 		- 한 화면에 보여질 글의 갯수 : 5

		if(request.getParameter("nowPage") != null){
			int nowPage = Integer.parseInt(request.getParameter("nowPage"));
			pageDto.setNowPage(nowPage);
		}
	
		ArrayList<BoardDTO> listc = new BoardDAO().selectAll(pageDto);
	%>
	
	<h2>게시판 글 전체보기</h2>
	
	<table border="1" style="text-align: center; width: 1000px">
		<tr>
			<td colspan="9">
				<a href="/curr07/b01_insertForm.jsp">글쓰기</a>
			</td>
		</tr>
		<tr>
			<td>새번호</td>
			<td>번 호</td>
			<td>제 목</td>
			<td>그룹번호</td>
			<td>답변Seq</td>
			<td>답변level</td>
			<td>작성자</td>
			<td>내 용 </td>
			<td>&nbsp;</td>
		</tr>
		<%
			if(listc != null) 
				for(BoardDTO each : listc){
		%>
					<tr>
						<td><%= each.getShowNumberSeq() %></td>
						<td><%= each.getNum()%></td>
						<%
							if(each.getReplySeq() == 0) {
						%>
							<td align="left"><%= each.getTitle()%></td>
						<%
							} else {
						%>
							<td align="left">&nbsp;&nbsp; L <%= each.getTitle()%></td>
						<%
							}
						%>
						<td><%= each.getGroupNum()%></td>
						<td><%= each.getReplySeq()%></td>
						<td><%= each.getReplyLevel()%></td>
						<td><%= each.getWriter()%></td>
						<td><%= each.getContents()%></td>
						
						<%
							if(each.getReplySeq() == 0){
						%>
							<td>
								<a href="/curr07/b04_replyForm.jsp?num=<%= each.getNum()%>">답변작성</a>
							</td>
						<%
							}
						%>
					</tr>
		<%
				}
		%>
		<tr>
			<td colspan="9">
				<%
					if(pageDto.getShowPageNumberBegin() != 1) {
				%>
					<a href ="?nowPage=1">◀◀</a> &nbsp;
					<a href ="?nowPage=<%= pageDto.getNowPage()-1 %>">◀</a>
				<%
					}
				%>
				
				<%
					for(int i=pageDto.getShowPageNumberBegin();
							i<=pageDto.getShowPageNumberEnd(); i++) {
						if(pageDto.getNowPage() == i){
				%>
							[<%= i %>]
				<%
						} else {
				%>
							<a href="?nowPage<%= i %>">[<%=i %>]</a>
				<%
						}
					}
				%>
				
				<%
					if(pageDto.getShowPageNumberEnd() != pageDto.getEndPage()) {
				%>
					<a href ="?nowPage=<%= pageDto.getNowPage() + 1 %>">▶</a>
					<a href ="?nowPage=<%= pageDto.getEndPage() %>">▶▶</a>
				<%
					}
				%>
			</td>
		<tr>
	</table>

</body>
</html>