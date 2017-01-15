<%@page import="javax.swing.JOptionPane"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>학생 정보 관리 프로그램</title>
</head>
<body>

	<%-- 
		문제 : 학생 정보 관리 프로글매
		1. 항목 : 이름, 국어, 영어, 수학, 총점, 평균, 결과
		2. 결과 : 
			- 평균 95.5 이상이면 => **는 **점으로 우등상
			- 평균 85.5 이상이면 => **는 **점으로 장려상
			- 나머지 점수 => **는 해당사항 없음
		3. 요구사항
			- JOtionPane을 이용하여 각 항목을 입력받음
			- 모든 정보 출력 및 결과 출력(JSP페이지에 출력)
	
	--%>
	
	<% 
		
		String name = JOptionPane.showInputDialog("이름 입력");
		int kor = Integer.parseInt(JOptionPane.showInputDialog("국어 점수 입력"));
		int eng = Integer.parseInt(JOptionPane.showInputDialog("영어 점수 입력"));
		int math = Integer.parseInt(JOptionPane.showInputDialog("수학 점수 입력"));
		int total = kor + eng + math;
		double avg = total/3.0;
		
		if(avg>=95.5){
	%>
			<%=name %>은 <%=avg %> 점으로 우등상
	<% 
		} else if(avg>=85.5){
	%>
			<%=name %>은 <%=avg %> 점으로 장려상
	<%  
		} else {
	%>
			<%=name %>은 해당사항 없음
	<% 	
		}
	%>

</body>
</html>