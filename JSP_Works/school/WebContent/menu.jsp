<%@page import="dto.TeacherDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
		TeacherDTO dto = (TeacherDTO) session.getAttribute("dto");
	%>
	<form method="post">
	<div align="right" style="background-color: green;font-family:굴림체;font-size:14px;font-style:normal;font-weight:normal;color:#ffffff;">
		<%=dto.getName() %> 선냉님 <%=dto.getBan() %>반 학생은 총 <%=dto.getNumOfStu() %>명 입니다.
	</div>
	<div style="background-color: green; height: 35px; vertical-align: middle;" align="center">
		<a href="/school/stu/insertForm" class="bt">학생 개인정보 입력</a>&nbsp;
		<a href="/school/stu/setectList" class="bt">학생 성적정보 보기</a>&nbsp;
		<a href="/school/stu/selectListAll" class="bt">전체 학생 목록</a>&nbsp;
		<input type="text" id="writtenName" width="100"  onchange="javascript: getSearchName()"/>&nbsp;
		<a href="/school/stu/searchName" class="bt">SearchName</a>&nbsp;
		<a href="/school/teach/selectOne" class="bt">My Info</a>&nbsp;
		<a href="/school/log/logout" class="bt" >Logout</a>&nbsp;
	</div>
	</form>
</body>
</html>