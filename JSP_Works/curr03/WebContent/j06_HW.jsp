<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%--
		학생 정보 관리 프로그램
		
		1. 테이블 및 시퀀스 생성
			- 테이블 이름 : t_stu
			- 테이블 컬럼 :
			 num(시퀀스PK) / name / kor / eng / math / total / avg
			- 시퀀스 이름 : t_stu_seq
			
		2. 주요 페이지 구성
			1. 01페이지 : 학생 정보 입력 화면
				- 이름 및 과목 3개 입력
				- 입력 후 02 페이지로 자동 이동
			2. 02페이지 : 학생 정보 목록 보기 화면
				- 전체 학생의 번호, 이름만 출력
				- 이름을 선택하면 03페이지로 이동
				- 01페이지로 이동하는 기능이 존재해야 함
			3. 03페이지 : 선택 학생상세정보 보기 화면
				- 선택된 학생의 전체 정보를 출력
				- 다음 3가지 버튼이 존재함
					[목록보기] : 삭제 시 02페이지로 이동
					[수정하기] : 04페이지로 이동
					[삭제하기] : "삭제하시겠습니까?" 확인 메시지 및 
								결과에 따른 처리 진행
								=> 이후 02페이지로 이동 "스크립트 컨펌"
			4. 04페이지 : 학생 정보 수정 화면
				- 기존에 저장한 학생 정보가 기본적으로 보여짐
				- 단, 국어-영어-수학 점수만 수정
				- 수정 후 03페이지로 이동
		
		3. 요구사항
			- table && form-post && a태그 && 기타등등
			- 위의 주요 페이지 이외에 필요한 페이지 만들어서 작성
	
	
	 --%>
	 
	 <%
	 	String msg = request.getParameter("msg");
	 
	 	if(msg == null){
	 		msg = (String)request.getAttribute("msg");
	 	}
	 	
	 	if(msg != null){
	 %>
	 	<script type="text/javascript">
	 		alert(<%=msg %>);
	 	</script>
	 <%
	 	}
	 %>
	 
	 <h2>학생 정보 프로그램</h2><hr>
	 <a href="/curr03/j06Cont?works=move&next=j06_insertStu">학생 정보 입력</a><br>

</body>
</html>









