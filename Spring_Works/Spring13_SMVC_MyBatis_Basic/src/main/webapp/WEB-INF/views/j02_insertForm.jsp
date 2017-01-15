<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post">
		<h2>학생 정보 입력</h2>
		<table border="1" style="text-align: center">
			<tr>
				<td colspan="4">
					<input type="submit" value="저장하기"/>
					<input type="button" value="목록보기" onclick="javascript:selectList();"/>
				</td>
			</tr>
			<tr>
				<td>이 름</td>
				<td>국 어</td>
				<td>영 어</td>
				<td>수 학</td>
			</tr>
			<tr>
				<td>
					<input type="text" name="name" />
				</td>
				<td>
					<input type="text" name="kor" />
				</td>
				<td>
					<input type="text" name="eng" />
				</td>
				<td>
					<input type="text" name="math" />
				</td>
			</tr>
			
		</table>
	</form>

</body>
	<script type="text/javascript">
		function selectList(){
			location.href="/spring13/selectList";
		}
	</script>
</html>