    
<!-- HTML 주석 기호 -->
<%-- JSP 주석 기호 --%>
    
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%--
    	Directive
    	1. <%@ %> 영역
    	2. 종류
    		- page : JSP 페이지에 대한 정보 설정
    		- taglib : JSP에서 사용할 taglib를 지정한다.
    		- include : JSP 페이지의 특정 영역에 다른 페이지를 포함시킨다.
    		
    	3. 주요 속성
    		1. language : 사용할 언어 설정 - java만 가능하다.
    		2. contentType : 
    			JSP가 생성할 문서 타입 설정
    				- text/html(기본), text/xml, text/plain
    			생성 문서에서 사용할 인코딩 설정
    				- ISO-8859-1(기본 : 영문만 됨), EUC-KR, UTF-8 등
    		3. pageEncoding : 현재 JSP 페이지의 인코딩 설정
    		
    		<<<<< 참고 내용
    		
    		4. import : JSP에서 사용할 자바 클래스 설정
    		5. session : 
    			JSP에서 세션을 사용할 지 여부 설정
    				- true(기본) / false
    		6. bugger : JSP 페이지의 추력 버퍼 크기 설정 - (예 : none / 8kb)
    		7. autoFlush:
    			출력 버퍼 최고점 시 자동으로 스트림을 보내고 버퍼를 비울 지 설정
    				- true(기본) / false
    		8. info : JSP 페이지에 대한 설명 입력
    		9. errorPage : JSP 페이지에서 에러가 발생할 경우, 보여줄 에러 JSP 페이지 지정
    		10. isErrorPage : 현재 페이지가 에러 JSP 페이지인지 여부 설정 - true / false(기본)
    		11. isELIgnore : 표현 언어 기능 지원 여부 설정 - true / false(기본)	
    		12. trimDerectiveWhitespaces : 
    			출력 결과에서 템플릿 텍스트의 공백 문자를 제거할 지 여부 결정 - true / false(기본)	
    		13. deferredeSyntaxAllowedAsLiteral :
    			#{ 기호로 시작하는 문자가 문자열 값으로 사용될 지 여부 설정 - true / false(기본)
    		
    		<<<<< 참고 내용
    			
     --%>
    
<!DOCTYPE html> <%-- DTD : 문서 타입 정의 --%>
<html> <%-- 브라우저에게 HTML 문서임을 알림 --%>
<head> <%-- 머릿글 --%>
	<meta charset="UTF-8"> <%-- 브라우저에 나타나지 않는 일반 정보 : 일반적인 웹 검색 엔진이 검색 체크 --%>
	<title>Insert title here</title> <%-- 제목 : 웹브라우저 텝에 나타나는 제목 --%>
</head>
<body> <%-- 문서 내용 --%>

	

</body>
</html>