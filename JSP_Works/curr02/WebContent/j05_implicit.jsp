<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
//		내장 객체
		
// 		1. request
// 		- 웹 브라우저에게 JSP 페이지로 전달되는 정보를 가진 객체

// 		2. response
// 		- 웹 브라우저로 응답할 응답 정보를 가진 객체

// 		3. session
// 		- 웹 브라우저 요청시, 
// 			요청한 웹 브라우저에 관한 정보를 저장하고 관리하는 객체
// 		- 웹 브라우저 당 1개 생성됨

// 		4. application
// 		- 웹 어플리케이션의 설정 정보를 갖는 context 관련 객체

// 		5. out
// 		- JSP 페이지가 생성한 결과를 웹 브라우저에 
// 			전송하는 출력 스트림 객체

// 		6. pageContext
// 		- 현재 JSP 페이지의 Context 정보를 가진 객체
// 		- 주로 다른 내장 객체를 구할 때 사용
		
// 		7. page
// 		- JSP 페이지 그 자체를 나타내는 객체
		
// 		8. config
// 		- 서블릿이 초기화되는 동안 참조해야 할 정보를 전달해주는 객체

// 		9. exception
// 		- JSP 페이지에서 예외가 발생한 경우 예외 처리 페이지에
// 			전달되는 객체


// 		정보 저장 개념으로 정리하자면......
// 		page : 현재 페이지의 정보 유지
// 		request : 다음 페이지까지 정보 유지
// 		session : 브라우저 닫기전 정보 유지
// 		application : 서버 전원이 꺼지기 전까지 정보 유지


// 		내장 객체의 주요 메소드
// 		1. setAttribute(String key, Object value) // key : 속성 값
// 			- 내장 객체에 원하는 값을 저장
// 		2. getAttribute(String key)
// 			- 내장 객체에 저장된 값을 추출
// 		3. getAttributeNames()
// 			- 내장 객체가 가지고 있는 속성이름들을 추출
// 		4. removeAttribute(String key)
// 			- 내장 객체에 저장한 속성값을 삭제

	%>

</body>
</html>