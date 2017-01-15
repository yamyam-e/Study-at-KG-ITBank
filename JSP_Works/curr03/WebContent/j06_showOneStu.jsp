<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="entity.Student" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	<script type="text/javascript">
		function showStu(){
			location.href = "/curr03/j06Cont?works=move&next=j06_insertStu01";
		}
		function modifyStu(data){
			location.href = "/curr03/j06Cont?works=showOneStu&next=j06_modifyStu&selNum=" + data ;
		}
		function confrimMsg(){
			var ans = confirm("정말로 삭제 하시겠습니까?");
			if(ans==true){
				location.href = "/curr03/j06Cont?works=deleteStu&next=j06_insertStu01";
			}
		}
	
	</script>
</head>
<body>

	<!-- 
	3. 03페이지 : 선택 학생상세정보 보기 화면
				- 선택된 학생의 전체 정보를 출력
				- 다음 3가지 버튼이 존재함
					[목록보기] : 삭제 시 02페이지로 이동
					[수정하기] : 04페이지로 이동
					[삭제하기] : "삭제하시겠습니까?" 확인 메시지 및 
								결과에 따른 처리 진행
								=> 이후 02페이지로 이동 "스크립트 컨펌"
	 -->
	 
	<h2>학생 상세 정보</h2><hr>
	<from method="post">
		<table border="1" style="text-align: center;">
			<tr>
				<td>번 호</td>
				<td>이 름</td>
				<td>국 어</td>
				<td>영 어</td>
				<td>수 학</td>
				<td>총 점</td>
				<td>평 균</td>
			</tr>
			<%	
				String msg = (String)request.getAttribute("msg");
				Student stu = null;
				int selNum = 0;
				if(msg == null){
					
					stu = (Student)request.getAttribute("학생");
					selNum = stu.getNum();
			%>
			<tr>
				<td><%=stu.getNum() %></td>
				<td><%=stu.getName() %></td>
				<td><%=stu.getKor() %></td>
				<td><%=stu.getEng() %></td>
				<td><%=stu.getMath() %></td>
				<td><%=stu.getTotal() %></td>
				<td><%=stu.getAvg() %></td>
			</tr>
			<%
				}else{
			%>
					<script type="text/javascript">
		 			alert(<%=msg %>);
		 			</script>
			<%
				}
			%>
			<tr>
				<td colspan="7">
					<input type="submit" value="[목록보기]" onclick="javascript: showStu()"/>
					<input type="submit" value="[수정하기]" onclick="javascript: modifyStu('<%=selNum%>')"/>
					<input type="submit" value="[삭제하기]" onclick="javascript: confirmMsg()"/>
					
				</td>
			</tr>
		</table>
	</from>
	

</body>
</html>