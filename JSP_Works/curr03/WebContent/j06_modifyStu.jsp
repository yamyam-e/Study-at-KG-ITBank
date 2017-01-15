<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="entity.Student" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	<script type="text/javascript">
		function confirmMsg(data){
			var ans = confirm("정말로 수정 하시겠습니까?");
			if(ans==true){
// 				location.href = "/curr03/j06Cont?works=modifyStu&next=j06_showStu01";
// 				location.href = "/curr03/j06Cont?works=modifyStu&next=j06_showOneStu01&selNum=" + data;
			}
		}
	
	</script>

</head>
<body>

	<!-- 
		4. 04페이지 : 학생 정보 수정 화면
		- 기존에 저장한 학생 정보가 기본적으로 보여짐
		- 단, 국어-영어-수학 점수만 수정
		- 수정 후 03페이지로 이동

	-->

<h2>학생 정보 수정</h2><hr>
			<%	
				Student stu = (Student)request.getAttribute("학생");
				int selNum = stu.getNum();
			%>
	<from action="/curr03/j06Cont" method="post">
		<table border="1" style="text-align: center;">
			<tr>
				<td colspan="7">
					<input type="submit" name="modifyStu" value="수정완료" />
				</td>
			</tr>
			<tr>
				<td>번 호</td>
				<td>이 름</td>
				<td>국 어</td>
				<td>영 어</td>
				<td>수 학</td>
				<td>총 점</td>
				<td>평 균</td>
			</tr>
			<tr>
				<td><%=stu.getNum() %></td>
				<td><%=stu.getName() %></td>
				<td><input type="text" name="modifyKor" value="<%=stu.getKor() %>"/></td>
				<td><input type="text" name="modifyEng" value="<%=stu.getKor() %>"/></td>
				<td><input type="text" name="modifyMath" value="<%=stu.getKor() %>"/></td>
				<td><%=stu.getTotal() %></td>
				<td><%=stu.getAvg() %></td>
			</tr>
			<input type="hidden" name="selNum" value="<%=stu.getNum() %>"/>
			<input type="hidden" name="next" value="j06_showOneStu"/>
		</table>
	</from>

</body>
</html>