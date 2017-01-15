<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<h2>게시판 글쓰기</h2>
	
	<a href="/curr07/b03_selectAll.jsp">게시판 글 전체보기</a>
	
	<form action="/curr07/b02_insertConn.jsp" method="post">
	<table border="1" style="text-align: center;">
		<tr>
			<td>제 목</td>
			<td>
				<input type="text" name="title"/>
			</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>
				<input type="text" name="writer"/>
			</td>
		</tr>
		<tr>
			<td>내 용</td>
			<td>
				<textarea rows="5" cols="20" name="contents"></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="글저장"/>
			</td>
		</tr>
	</table>
	
	</form>
	

</body>
</html>