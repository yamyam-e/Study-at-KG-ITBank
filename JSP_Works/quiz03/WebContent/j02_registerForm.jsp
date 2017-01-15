<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	<script type="text/javascript">
		function winClose(){
			window.close();
		}
		function register(){
			document.frm.submit();
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
		String msg = (String)request.getParameter("msg");
		System.out.println("msg : " + msg);
		request.setAttribute("msg", msg);
	%>
	<c:set var="res" value="<%=msg %>" scope="request"/>
	<c:choose>
		<c:when test="${ msg eq null }">
				<img alt="" src="/quiz03/zfiles/starbucks.png" style="width:50px; heigh:50px"/>
				<h2 align="center">
					<img alt="" src="/quiz03/zfiles/starbucks.png" style="width:50px; heigh:50px"/>
					StarBucks 회원가입
				</h2><hr>
				<form action="/quiz03/mem/insertOne" method="post" name="frm">
					<table class="alignCenter">
						<tr>
							<td>아이디</td>
							<td>
								<input type="text" name="id" required="required"/>				
							</td>
						</tr>
						<tr>
							<td>비밀번호</td>
							<td>
								<input type="text" name="pw" required="required"/>				
							</td>
						</tr>
						<tr>
							<td>이 름</td>
							<td>
								<input type="text" name="name" required="required"/>				
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="button" value="가입하기" onclick="javascript: register();"/>
								<input type="button" value="취소" onclick="javascript: winClose();"/>
							</td>
						</tr>
					</table>
				</form>
			</c:when>
		<c:otherwise>
			<h2 align="center">
				<img alt="" src="/quiz03/zfiles/starbucks.png" style="width:50px; heigh:50px"/>
				StarBucks 회원가입
			</h2><hr>
			<p align="center">회원 가입을 축하드립니다.<br>
			<p align="center"><input type="button" value="확인" onclick="javascript: close();"/>
		</c:otherwise>
	</c:choose>
</body>
</html>