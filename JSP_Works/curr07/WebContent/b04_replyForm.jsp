<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>관심글 답변달기</h2>
	
	<form action="/curr07/b05_replyConn.jsp" method="post">
		<input type="hidden" name="num" value="<%=request.getParameter("num") %>" />
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