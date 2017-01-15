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
		TeacherDTO dto = (TeacherDTO) session.getAttribute("nowLogin");
	%>
	<form method="post">
	<div align="right" style="background-color:white;font-family:굴림체;font-size:14px;font-style:normal;font-weight:normal;color:#006666;">
		<%=dto.getBan() %>반 <%=dto.getName() %> 선냉님 로그인 상태 입니다.
	</div>
	<div style="background-color: green; height: 35px; vertical-align: middle; overflow-x:hidden; overflow-y:hidden;" align="center";>
		<a href="/mySchool/stu/insertForm" class="bt">학생 개인정보 입력</a>&nbsp;
		<a href="/mySchool/stu/setectListByGrade" class="bt">학생 성적정보 보기</a>&nbsp;
		<a href="/mySchool/stu/selectListAll" class="bt">전체 학생 목록</a>&nbsp;
		<input type="text" id="writtenName" style="width:150px; height:20px;"  onchange="javascript: getSearchName()"/>&nbsp;
		<a href="/school/stu/searchName" class="bt">SearchName</a>&nbsp;
		<a href="/mySchool/teach/selectOne" class="bt">My Info</a>&nbsp;
		<a href="/mySchool/teach/logout" class="bt" >Logout</a>&nbsp;
	</div>
	</form>
</body>
</html>