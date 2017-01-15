<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.sql.*" %>
    <%@page import="entity.Student" %>
    <%@page import="java.util.ArrayList" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<!-- 
	2. 02페이지 : 학생 정보 목록 보기 화면
				- 전체 학생의 번호, 이름만 출력
				- 이름을 선택하면 03페이지로 이동
				- 01페이지로 이동하는 기능이 존재해야 함
	 -->
	 
	 <h2>학생 정보 목록 보기 화면</h2><hr>
	 
	 <form name="frm" method="post">
	 <table border="1" style="text-align: center;">
	 	 <tr>
		 	<td colspan="2">
		 	<input type="submit" name=move value="[입력하기]" onclick="javascripte: goBack();"/>
		 	<script type="text/javascript">
		 		function goBack(){
		 			var frm = document.frm;
		 			frm.action = "/curr03/j06_insertStu.jsp";
		 			submit();
		 		}
// 		 		function go(data1) {
// 					location.href="/curr03/j06Cont/j06_showStu01.jsp?works=showOneStu&selNum=" + data2 + "&next=j06_showOneStu.jsp";
// 				}
		 	</script>
		 </tr>
	 	 <tr>
		 	<th>번 호</th>
		 	<th>이 름</th>
		 </tr>
		 <%
		 	String msg = (String)request.getAttribute("msg");
		 
		 	if(msg == null) {
				ArrayList<Student> listc = (ArrayList)request.getAttribute("목록");
				for(Student each : listc){
					int selNum = each.getNum();
					System.out.println(selNum);
			%>
					<tr>
						<td><%=each.getNum() %></td>
						<td>
							<a href="/curr03/j06_showStu01.jsp?selNum=<%=selNum%>"><%=each.getName() %></a>
<%-- 							<a onclick="javascript: go('<%= selNum%>')"><%=each.getName() %></a> --%>
<%-- 							<input type="hidden" name="selNum" value="<%=selNum%>"/> --%>
<!-- 							<input type="hidden" name="next" value="j06_showOneStu"/> -->
<!-- 							<input type="hidden" name="works" value="showOneStu"/> -->
						</td>
					</tr>		
			<%
				}
		 	} else {
		 %>
		 		<script type="text/javascript">
		 			alert(<%= msg%>);
		 			location.href="/curr03/j06_HW.jsp";
		 		</script>
		 <%
		 	}
		 %>
	 </table>
	 </form>
	

</body>
</html>