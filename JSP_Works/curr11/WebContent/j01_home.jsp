<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
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
	</script>
</head>
<body>

	<h2>인사 정보 관리 프로그램</h2>
	
	<c:choose>
		<c:when test="${ !empty nowLogin }">
			<a href="/curr11/peo/selectList">인사 정보 전체 목록</a>
			
		
		</c:when>
		<c:otherwise>
			로그인이 필요한 서비스입니다.<br>		
			
			<form action="/curr11/log/logConn" method="post">
				아이디: <input type="text" name="id"/><br>
				비밀번호: <input type="text" name="pw"/><br>
				<input type="submit" value="로그인하기"/>
 			</form>
		
		</c:otherwise>
	
	
	</c:choose>

</body>
</html>