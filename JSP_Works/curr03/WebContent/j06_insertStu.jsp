<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<!-- 
	1. 01페이지 : 학생 정보 입력 화면
				- 이름 및 과목 3개 입력
				- 입력 후 02 페이지로 자동 이동
	 -->
	 <h2>학생 정보 프로그램</h2><hr>
	 
	 <form action="/curr03/j06Cont" method="post">
	 	<table border="1" style="text-align: center;">
	 		<tr>
	 			<th>이 름</th>
	 			<th>국 어</th>
	 			<th>영 어</th>
	 			<th>수 학</th>
	 		</tr>
	 		<tr>
	 			<td>
	 				<input type="text" name="name"/>
	 			</td>
	 			<td>
	 				<input type="text" name="kor" maxlength="3"/>
	 			</td>
	 			<td>
	 				<input type="text" name="eng" maxlength="3"/>
	 			</td>
	 			<td>
	 				<input type="text" name="math" maxlength="3"/>
	 			</td>
	 		</tr>
	 		<tr>
	 			<td colspan="4">
	 				<input type="submit" value="학생정보입력"/>
	 				<input type="hidden" name="works" value="insertOne"/>
	 				<input type="hidden" name="next" value="j06_insertStu01"/>
	 			</td>
	 		</tr>
	 	</table>
	 
	 </form>

</body>
</html>