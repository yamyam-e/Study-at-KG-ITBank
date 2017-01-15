<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
	<%--
		수업 내용
		1. 선언부(Declaration)
		2. 스크립트릿(Scriptlet)
		3. 표현식(Expression)
	 --%>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%--
		선언부(옵션사항)
		1. <%! %> 기호로 표현되는 영역
		2. 자바 메소드 정의 및 전역변수 선언 시 사용
	 --%>
	 <%!
	 	
	 	String mth(int data){
		  return "입력받은 데이터: " + data;
	 	}
	 	
	 	int ret(){
		 return gData;
	 	} // 전역 변수 이기 때문에 에러 발생하지 않음
	 	  // 선언만 하는 것이고 사용은 이 곳에서 불가함
	 
	 	int gData = 100;
	 
	 %>
	 
	<%--
		스크립트릿
		1. <% %> 기호로 표현되는 영역
		2. 일반 자바 명령 코드 영역(메소드를 사용하는 영역)
		3. 선언되는 변수는 지역변수
	 --%>
	 <%
// 	 	에러 : int n = m; => 지역변수 m 사용 불가능
	 	String msg = mth(200);
	 	int m = 20;
	 %>
	 
	 <%--
	 	표현식
	 	1. <%= %> 기호로 표현되는 영역
	 	2. 값을 추력할 때 사용
	 	3. 변수의 값 또는 메소드의 리턴값 출력 가능
	  --%>
	  msg : <%= msg %> <br> <%-- br : 줄바꿈 --%>
	  
	  m : <%= m %> <br>
	  
	  ret() : <%= ret() %>
</body>
</html>










