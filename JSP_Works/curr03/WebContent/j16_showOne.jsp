<%@page import="entity.Computer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	<script type="text/javascript">
		function goPage(sel, nextPage) {
			location.href = "/curr03/cont?" 
							+ "sel=" + sel 
							+ "&nextPage=" + nextPage;
		}
		function goPage(sel, nextPage, num) {
			if(sel == "삭제하기"){
				if(!confirm("삭제하시겠습니까?")) {
					return;
				}
			} else {
			location.href = "/curr03/j16_showOne.jsp?"
							+ "sel=" + sel 
							+ "&nextPage=" + nextPage 
							+ "&num="+ num;
		}
	</script>
</head>
<body>

	<%
		Computer com = (Computer)request.getAttribute("com");
// 		Computer com = new Computer(1, "삼송", "ddd", 100000, 100000, 100000, 300000);
		String sel = request.getParameter("sel");
	%>
	
	<%
	if(sel.equals("상세보기")){
	%>
		<h2>상세보기</h2><hr>
	<%
	} else {
	%>
		<h2>수정하기</h2>
	<%
	}
	%>
	<form method="post">
	<table border="1" style="text-align: center;">
		<tr>
			<td>번호</td>
			<td>제조사</td>
			<td>상품명</td>
			<td>모니터가격</td>
			<td>본체가격</td>
			<td>키도드가격</td>
			<td>합계</td>
		</tr>
		<tr>
			<td><%=com.getNum() %></td>
			<td><%=com.getManufacturer() %></td>
			<td><%=com.getProductName() %></td>
			<%
			if(sel.equals("상세보기")){
			%>
			<td><%=com.getPriceOfMon() %></td>
			<td><%=com.getPriceOfDesk() %></td>
			<td><%=com.getPriceOfKey() %></td>
			<%
			} else {
			%>
			<td><input type="text" value="<%=com.getPriceOfMon() %>"/>
			</td>
			<td><input type="text" value="<%=com.getPriceOfDesk() %>"/>
			</td>
			<td><input type="text" value="<%=com.getPriceOfKey() %>"/>
			</td>
			<%
			}
			%>
			<td><%=com.getTotal() %></td>
		</tr>
		<tr>
			<td colspan="7">
			<%
				if(sel.equals("상세보기")){
			%>
				<input type="button" value="목록보기" 
							onclick="javascript: goPage('목록보기', 'j16_showAll')"/>
				<input type="button" value="수정하기"
							onclick="javascript: goPage('수정하기', 'j16_showOne', '<%=com.getNum()%>')"/><!-- 나중에 확인 -->
				<input type="button" value="삭제하기"
							onclick="javascript: goPage('삭제하기', 'j16_showAll', '<%=com.getNum()%>')"/>
			<%
				} else {
			%>
				<input type="button" value="수정하기"
							onclick="javascript: goPage('수정하기', 'j16_showOne', '<%=com.getNum()%>')"/><!-- 나중에 확인 -->
			<%
				}
			%>
			</td>
		</tr>
	</table>
	</form>

</body>
</html>