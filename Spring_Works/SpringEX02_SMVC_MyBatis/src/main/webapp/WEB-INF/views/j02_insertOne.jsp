<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/spring02/insertOne" method="post">
	<h2>햄버거 정보 입력</h2>
		<table border="1" style="text-align: center;">
			<tr>
				<td colspan="3">
					<input type="submit" value="저장하기"/>
					<input type="button" value="목록보기" onclick="javascript:selectList();"/>
				</td>
			</tr>
			<tr>
				<td>이 름</td>
				<td>가 격</td>
				<td>칼로리</td>
			</tr>
			<tr>
				<td><input type="text" name="name"/>
				</td>
				<td><input type="text" name="price"/>
				</td>
				<td><input type="text" name="cal"/>
				</td>
			</tr>
		</table>
	</form>

</body>
	<script type="text/javascript">
		function selectList(){
			location.href="/spring02/home.jsp";
		}
	</script>
</html>