<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>학생 정보 관리 프로그램</title>
	<script type="text/javascript">
		function input(){
			var aaa = document.frm;
			aaa.action = "/curr01/j34_HW01.jsp";
			aaa.method = "post";
			aaa.submit();
		}
		function showGrade() {
			var bbb = document.frm;
			bbb.action = "/curr01/j34_HW02.jsp";
			bbb.method = "post";
			bbb.submit();
		}
		function showResult() {
			var ccc = document.frm;
			ccc.action = "/curr01/j34_HW03.jsp";
			ccc.method = "post";
			ccc.submit();
		}
	</script>
</head>
<body>
	
	<%--
		학생 성적 관리 프로그램
		
		1. 페이지 구성
			1. [성적 입력 페이지]
				- 이름, 국어, 영어, 수학 입력
				- 인원 가변형
			2. [성적 정보 보기 페이지]
				- 입력된 모든 정보 및 총점, 평균을 출력
			3. [합격 결과 보기 페이지]
				- 평균 85.5 이상인 경우 합격 / 아닌 경우 불합격
		2. 요구사항
			1. 각 페이지는 다른 페이지로 접근할 수 있는 기능(버튼 2개)이 존재
			2. form(post) && table && javascript 등.......
	 --%>
	 
	 <h2>학생 정보 관리 프로그램</h2><hr>
	 <% 
	 	request.setCharacterEncoding("UTF-8");
	 	
	 	String getMany = request.getParameter("getMany");
		int many = 1;
		if(getMany != null){
			many = Integer.parseInt(request.getParameter("getMany"));
		}
		
		String name[] = request.getParameterValues("name");
		String kor[] = request.getParameterValues("kor");
		String eng[] = request.getParameterValues("eng");
		String math[] = request.getParameterValues("math");
		
	 %>
	 <form name="frm">
	 	<input type="submit" value="성적입력" onclick="javascript: input()"/>
	 	<input type="submit" value="성적보기" onclick="javascript: showGrade()"/>
	 	<input type="submit" value="결과보기" onclick="javascript: showResult()"/>
		<input type="hidden" name="getMany" value="<%=many%>"/>
	 	<%
	 	if(name != null && !name[0].equals("")){
	 		for(int i=0; i<name.length; i++){
	 	%>
	 			<input type="hidden" name="name" value="<%=name[i]%>"/>
	 			<input type="hidden" name="kor" value="<%=kor[i]%>"/>
	 			<input type="hidden" name="eng" value="<%=eng[i]%>"/>
	 			<input type="hidden" name="math" value="<%=math[i]%>"/>
	 	<% 
	 		}
	 	}
	 	%>
	 </form>
	 
</body>
</html>