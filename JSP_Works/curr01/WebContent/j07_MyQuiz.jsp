<%@page import="javax.swing.JOptionPane"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>학생 정보 관리 프로그램</title>
</head>
<body>
	
	<%!
		String name;
		int kor, eng, math;
		int total;
		double avg;
		
		int sum(){
			return total = kor + eng + math;
		}
		
		double avg(){
			return avg = total/3.0;
		}
		
		String result(){
			
			if(avg()>=95.5){
				return name + "님은 " + avg + "점 최우수 학생" ;
			}
			else if(avg()>=85.5){
				return name + "님은 " + avg + "점  우수 학생";
			}
			else {
				return name + "님은 해당 사항 없음";
			}
		}
	%>
	
	<%
		name = JOptionPane.showInputDialog("이름 입력");
		kor = Integer.parseInt(JOptionPane.showInputDialog("국어 점수 입력"));
		eng = Integer.parseInt(JOptionPane.showInputDialog("영어 점수 입력"));
		math = Integer.parseInt(JOptionPane.showInputDialog("수학 점수 입력"));
		
	%>
	이름 : <%=name %> <br>
	국어 점수 : <%=kor %> <br>
	영어 점수 : <%=eng %> <br>
	수학 점수 : <%=math %> <br>
	총점 : <%=sum() %> <br>
	평균 : <%=avg() %> <br>
	
	결과 : <%=result() %>
	

</body>
</html>