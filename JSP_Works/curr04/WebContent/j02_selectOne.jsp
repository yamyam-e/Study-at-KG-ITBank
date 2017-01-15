<%@page import="dto.PeopleDto"%>
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
		PeopleDao dao = new PeopleDao();
		PeopleDto dto = dao.selectOne(num);
		System.out.println(dto.toString());
	%>
	<%
		if(sel != null && sel.equals("수정")){
	%>
			<h2>인사 정보 수정</h2><hr>
	<%
		} else {
	%>
			<h2>인사 상세 정보</h2><hr>
	<%
		}
	%>
	<form action="/curr04/j02_update.jsp" method="get">
	<table border="1" style="text-align: center;">
		<tr>
			<td colspan="3">
	<%
		if(sel != null && sel.equals("수정")) {
	%>
<!-- 				<input type="button" value="수정하기" -->
<%-- 							onclick="javascript:goPage('j02_update', '수정', <%=dto.getNum()%>)"/> --%>
				<input type="submit" value="수정하기"/>
				<input type="hidden" name="sel" value="수정"/>
				<input type="hidden" name="num" value="<%=dto.getNum() %>"/>
	<%
		} else {
	%>
				<input type="button" value="목록보기" 
							onclick="javascript:location.href='/curr04/j02_selectAll.jsp'"/> &nbsp;
				<input type="button" value="수정하기"
							onclick="javascript:goPage('j02_selectOne', '수정', <%=dto.getNum()%>)"/> &nbsp;
				<input type="button" value="삭제하기"
							onclick="javascript:goPage('j02_update', '삭제', <%=dto.getNum()%>)"/>
	
	<%
		}
	%>
			</td>
		</tr>
		<tr>
			<td>번 호</td>
			<td>이 름</td>
			<td>나 이</td>
		</tr>
		<tr>
			
	<%
		if(sel != null && sel.equals("수정")) {
	%>
			<td><%=dto.getNum() %></td>
			<td><%=dto.getName() %></td>
			<td><input type="text" name="age" value="<%=dto.getAge() %>"/></td>
	<%
		} else {
	%>
			<td><%=dto.getNum() %></td>
			<td><%=dto.getName() %></td>
			<td><%=dto.getAge() %></td>
	<%
		}
	%>
		</tr>
	</table>
	</form>
	
	<script type="text/javascript">
		function goPage(page, sel, num){
// 			alert("Aa");
			if(sel == "삭제"){
				if(!confirm("삭제하시겠습니까?")){
					return;
				}
				location.href = "/curr04/" + page + ".jsp?num=" + num + "&sel=" + sel;
			} else {
				location.href = "/curr04/" + page + ".jsp?num=" + num + "&sel=" + sel;
			}
		}
	</script>

</body>
</html>