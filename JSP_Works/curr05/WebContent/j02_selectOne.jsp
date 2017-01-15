<%@page import="dto.PeopleDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.PeopleDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	<script type="text/javascript">
		function goSelectAll(){
			var aaa = document.getElementById("num").value;
			location.href="/curr05/j02_selectAll.jsp";
		}
		function goModify(){
			var aaa = document.getElementById("num").value;
			location.href="/curr05/j02_selectOne.jsp?sel=modify&num=" + aaa;
		}
		function goDelete(){
			var aaa = document.getElementById("num").value;
			if(!confirm("정말 삭제 하시겠습니까?")){
				return;
			}
			location.href="/curr05/j02_selectOne.jsp?sel=delete&num=" + aaa;
		}
	</script>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
		String sel = request.getParameter("sel");
		int num = 0;
		int age = 0;
		int res = 0;
		String msg = null;
		PeopleDAO dao = null;
		PeopleDTO dto = null;
		ArrayList listc = null;
		if(sel.equals("selectOne") || sel.equals("modify")){
			num = Integer.parseInt(request.getParameter("num"));
			dao = new PeopleDAO();
			listc = (ArrayList)dao.selectOne(num);
			dto = (PeopleDTO) listc.get(0);
			
		} else if(sel.equals("modified")){
			num = Integer.parseInt(request.getParameter("num"));
			dao = new PeopleDAO();
			listc = (ArrayList)dao.selectOne(num);
			dto = (PeopleDTO) listc.get(0);
			
			age = Integer.parseInt(request.getParameter("age"));
			dto.setNum(num);
			dto.setAge(age);
			dao = new PeopleDAO();
			res = dao.update(dto);
			msg = res > 0 ? "수정 성공" : "수정 실패";
			
		} else if(sel.equals("delete")){
			num = Integer.parseInt(request.getParameter("num"));
			dao = new PeopleDAO();
			dto = new PeopleDTO();
			
			dto.setNum(num);
			res = dao.delete(dto);
			msg = res > 0 ? "삭제 성공" : "삭제 실패";
			
		}
	%>
	<%
		if(sel.equals("selectOne") || sel.equals("modified")){
	%>
		<h2>인사 정보 상세 보기</h2><hr>
		<form action="/curr05_selectOne.jsp" method="post" name="frm" >
			<table border="1" style="text-align: center;">
				<tr>
					<td colspan="3">
						<input type="button" name="selectAll" value="목록보기" onclick="goSelectAll()"/>
						<input type="button" name="modify" value="수정하기" onclick="goModify()"/>
						<input type="button" name="delete" value="삭제하기" onclick="goDelete()"/>
						<input type="hidden" name="num" id="num" value="<%=dto.getNum() %>"/>
	 				</td>
				</tr>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>나이</th>
				</tr>
				<tr>
					<td><%=dto.getNum() %></td>
					<td><%=dto.getName() %></td>
					<td><%=dto.getAge() %></td>
				</tr>
			</table>
		</form>
			<%
			if(msg != null){
			%>
				<script type="text/javascript">
					alert("<%=msg%>");
				</script>
			<%
			}
			%>
	<%
		} else if(sel.equals("modify")) {
	%>
		<h2>인사 정보 수정</h2><hr>
		<form action="/curr05/j02_selectOne.jsp?sel=modified" method="post" name="frm">
			<table border="1" style="text-align: center;">
				<tr>
					<td colspan="3">
						<input type="submit" name="modify" value="수정하기" onclick="goModify()"/>
						<input type="hidden" name="num" id="num" value="<%=dto.getNum() %>"/>
	 				</td>
				</tr>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>나이</th>
				</tr>
				<tr>
					<td><%=dto.getNum() %></td>
					<td><%=dto.getName() %></td>
					<td><input type="text" name="age" id="age" value ="<%=dto.getAge() %>"/>
					</td>
				</tr>
			</table>
		</form>	
	<%
		} else if(sel.equals("delete")) {
	%>
		<script type="text/javascript">
			alert("<%=msg%>");
			location.href = "/curr05/j02_selectAll.jsp";
		</script>
	<%
		}
	%>

</body>
</html>