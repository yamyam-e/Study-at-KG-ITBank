<%@page import="dto.CoffeeDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	<script type="text/javascript">
		function goInsertForm() {
			location.href = "/quiz03/j01_insertForm.jsp";
		}
		function goLogout(){
			location.href = "/quiz03/j01_loginForm.jsp";
		}
	</script>
	<style>
	  table {
	        width: 300px;
	        border: 1px solid #bcbcbc;
	        text-align: center;
	        font-size: 20;
      }
      td {
        border: 1px solid #bcbcbc;
      }
	
      table.alignCenter {
        margin-left: auto;
        margin-right: auto;
      }
    </style>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
		ArrayList<Object> temp = (ArrayList)request.getAttribute("listc");
		ArrayList<CoffeeDTO> listc = null;
		if(temp != null){
			listc = new ArrayList<>();
			for(Object each : temp){
				CoffeeDTO dto = (CoffeeDTO) each;
				listc.add(dto);
			}
		}
	%>
	<h2 align="center">
		StarBucks 메뉴 리스트
		<img alt="" src="/quiz03/zfiles/starbucks.png" style="width:50px; heigh:50px"/>
	</h2><hr>
	<form action="/quiz03/coffee/selectOne" method="post">
	<table border="1" style="text-align: center;">
		<tr>
			<td colspan="5">
				<input type="button" value="입력폼으로" onclick="javascript: goInsertForm();"/>
				<input type="button" value="로그아웃" onclick="javascript: goLogout();"/>
			</td>
		</tr>
		<tr>
			<td>이 름</td>
			<td>가 격</td>
			<td>칼로리</td>
		</tr>
		<c:choose>
			<c:when test="${ listc != null }">
			<c:forEach var="each" items = "${ listc }">
				<tr>
					<td>
						<a href="/quie03/coffee/selectOne?num=${ each.num }">${ each.name }</a>
					</td>
					<td>${ each.price } </td>
					<td>${ each.cal } </td>
				</tr>
			</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="3">저장된 정보가 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
	</form>

</body>
</html>