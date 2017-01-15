<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	<script type="text/javascript">
		window.onload = function() {
			var msg = "${ msg }";
			if(msg != "") {
				alert("${ msg }");
			}
		}
		function register(){
			var url="/quiz03/j02_registerForm.jsp"
			var popname="register"
			var size="width=400, height=300, left=200, top=150";
			window.open(url, popname, size);
		}
		function login(){
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

	<h2 align="center">StarBucks</h2><hr>
	
	<c:choose>
		<c:when test="${ !empty nowLogin }">
			<jsp:forward page="/j03_insertForm"></jsp:forward>
		</c:when>
	</c:choose>
	
	<form action="/quiz03/mem/logConn" method="post" name="frm">
		<table class="alignCenter" >
			<tr>
				<td colspan="2" height="300px">
					<img alt="" src="/quiz03/zfiles/starbucks.png" style="width:300px; heigh:300px"/>
				</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="id" required="required"/>
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="pw" required="required"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="회원가입하기" onclick="javascript: register();"/>
					<input type="button" value="로그인" onclick="javascript: login();"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					로그인이 필요한 서비스입니다.
				</td>
			</tr>
		</table>
	</form>

</body>
</html>