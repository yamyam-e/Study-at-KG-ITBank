<%@page import="dto.CoffeeDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	<script type="text/javascript">
		function goDelete(num) {
			if(!confirm("정말 삭제 하시겠습니까?")){
				return;
			}
			location.href = "/quiz03/coffee/delete?num=" + num;
		}
		function goSelectList() {
			location.href = "/quiz03/coffee/selectList";
		}
		function goSelectOne(num) {
			location.href = "/quiz03/coffee/selectOne?num=" + "&sel=modify";
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
		CoffeeDTO dto = (CoffeeDTO) request.getAttribute("obj");
		String sel = request.getParameter("sel");
	%>
	<c:choose>
		<c:when test="${ sel eq null }">
			<c:set var="dto" value="<%=dto %>" scope="request"></c:set>
			<h2 align="center">
				StarBucks 메뉴 상세 정보
				<img alt="" src="/quiz03/zfiles/starbucks.png" style="width:50px; heigh:50px"/>
			</h2><hr>
			<form action="/quiz03/j03_selectOne.jsp?sel=modify" method="post">
				<table class="alignCenter">
					<tr>
						<td colspan="6">
							<input type="button" value="목록보기" onclick="javascript: goSelectList();"/>
							<input type="submit" value="수정하기" />
							<input type="button" value="삭제하기" onclick="javascript: goDelete('${ dto.num }');"/>
							<input type="button" value="로그아웃" onclick="javascript: goLogout();"/>
						</td>
					</tr>
					<tr>
						<td>번 호</td>
						<td>이 름</td>
						<td>가 격</td>
						<td>칼로리</td>
						<td>orgName</td>
						<td>sysName</td>
					</tr>
					<tr>
						<td>${ dto.num }
							<input type="hidden" name="num" value="${ dto.num }"/>
						</td>
						<td>${ dto.name }
							<input type="hidden" name="name" value="${ dto.name }"/>
						</td>
						<td>${ dto.price }
							<input type="hidden" name="price" value="${ dto.price }"/>
						</td>
						<td>${ dto.cal }
							<input type="hidden" name="cal" value="${ dto.cal }"/>
						</td>
						<td>${ dto.orgName }
							<input type="hidden" name="cal" value="${ dto.orgName }"/>
						</td>
						<td>${ dto.sysName }
							<input type="hidden" name="cal" value="${ dto.sysName }"/>
						</td>
					</tr>			
				</table>
			</form>
		</c:when>
		<c:otherwise>
			<c:set var="num" value="<%=request.getParameter("num") %>"></c:set>
			<c:set var="name" value="<%=request.getParameter("name") %>"></c:set>
			<c:set var="price" value="<%=request.getParameter("price") %>"></c:set>
			<c:set var="cal" value="<%=request.getParameter("cal") %>"></c:set>
			
			<h2 align="center">
				StarBucks 메뉴 수정
				<img alt="" src="/quiz03/zfiles/starbucks.png" style="width:50px; heigh:50px"/>
			</h2><hr>
			<form action="/quiz03/coffee/modify" method="post">
				<table class="alignCenter">
					<tr>
						<td colspan="4">
							<input type="submit" value="수정하기"/>
						</td>
					</tr>
					<tr>
						<td>번 호</td>
						<td>이 름</td>
						<td>가 격</td>
						<td>칼로리</td>
						<td>orgName</td>
						<td>sysName</td>
					</tr>
					<tr>
						<td>${ num }
							<input type="hidden" name="num" value="${ num }"/>
						</td>
						<td>${ name }
							<input type="hidden" name="name" value="${ name }"/>
						</td>
						<td>
							<input type="text" name="price" value="${ price }"/>
						</td>
						<td>
							<input type="text" name="cal"  value="${ cal }"/>
						</td>
						<td>
							<input type="text" name="cal"  value="${ orgName }"/>
						</td>
						<td>
							<input type="text" name="cal"  value="${ sysName }"/>
						</td>
					</tr>			
				</table>
			</form>
		</c:otherwise>
	</c:choose>
	
</body>
</html>