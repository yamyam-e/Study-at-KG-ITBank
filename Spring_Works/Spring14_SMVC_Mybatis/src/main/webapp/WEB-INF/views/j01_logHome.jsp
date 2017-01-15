<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript">
		var msg = "${ msg }"
		if(msg == ""){
			
		} else if(msg != null){
			alert(msg);
		}
	</script>

</head>
<body>

	<h2>로그인 페이지</h2>
	<a href="/spring14/">홈 화면가기</a>
	
	<c:choose>
		<c:when test="${ nowLogin == null }">
			<a href="j01_regHome">회원 가입하기</a>
			<form action="login" method="post">
				<table border="1" style="text-align: center;">
					<tr>
						<td>아이디</td>
						<td>
							<input type="text" name="id"/>
						</td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td>
							<input type="text" name="pw"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="로그인"/>
						</td>
					</tr>
				</table>
			</form>
		</c:when>
		<c:otherwise>
			<a href="logOut">로그아웃</a>
		</c:otherwise>
	</c:choose>

</body>
</html>