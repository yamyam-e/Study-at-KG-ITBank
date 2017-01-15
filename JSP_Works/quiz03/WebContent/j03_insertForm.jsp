<%@page import="dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	<script type="text/javascript">
		function goLogout(){
			location.href = "/quiz03/j01_loginForm.jsp";
		}
		function goSelectList(){
			location.href = "/quiz03/j04_selectList.jsp";
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
	
	<h2 align="center">
		<img alt="" src="/quiz03/zfiles/starbucks.png" style="width:50px; heigh:50px"/>
		StarBucks 정보 관리 프로그램
	</h2><hr>
	
	<c:choose>
		<c:when test="${ !empty nowLogin }">
			<form action="/quiz03/coffee/insertOne" method="post">
				<table class="alignCenter">
					<tr>
						<td>이 름</td>
						<td>가 격</td>
						<td>칼로리</td>
						<td>파일선택</td>
					</tr>
					<tr>
						<td>
							<input type="text" name="name" required="required"/>
						</td>
						<td>
							<input type="text" name="price" required="required"/>
						</td>
						<td>
							<input type="text" name="cal" required="required"/>
						</td>
						<td>
							<input type="file" name="upfile"/>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							<input type="button" value="목록보기" onclick="javascript: goSelectList();"/>
							<input type="submit" value="저장하기"/>
							<input type="button" value="로그아웃" onclick="javascript: goLogout();"/>
						</td>
					</tr>
				</table>
			</form>
		</c:when>
		<c:otherwise>
			<script type="text/javascript">
				alert("회원 가입후 사용하세요.");
				location.href = "/quiz03/j01_loginForm.jsp";
			</script>
		</c:otherwise>
	</c:choose>

</body>
</html>