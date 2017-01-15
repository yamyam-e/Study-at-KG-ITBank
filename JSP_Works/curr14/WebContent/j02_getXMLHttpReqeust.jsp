<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<%--
		Ajax : Asynchronous Javascript + XML
		- JSP : 요청(request) -> 서버에서 HTML 발송 -> 페이지 변화
				-> 새로운 HTML이 노출
		- Ajax : 요청(XMLHttpRequest) -> 서버에서 텍스트 또는 XML발송
				-> HTML 코드 추가
	 --%>
	<h2>Ajax</h2>
	
	<input type="button" value="다른 페이지의 내용 가져와서 alert으로 출력" onclick="getData()"/>	
		

</body>
	<script type="text/javascript">
		var httpRequest = null;
		
		function getXMLHttpRequest(){ // 여기부터는 고정 코드 가져다 쓰면 됨
			if(window.ActiveXObject){ 
				try{
					return new ActiveXObject("Msxml12.XMLHTTP");
				} catch(e){
					try{
						return new ActiveXObject("Microsoft.XMLHTTP");
					} catch(e1){
						return null;
					}
				}
				
			} else if(window.XMLHttpRequest){
				return new XMLHttpRequest();
			} else {
				return null;
			}
		}
		
// 		httpRequest 객체 대표 함수
// 		- onreadystatechange : 이벤트를 처리하는 핸들러 역할
// 								(callback 함수에 기술됨)
// 		- open : 요청 정보 설정 함수 - method와 url은 필수 입력 요소
// 		- send : 요청을 서버로 전송

		function getData(){
			
// 			1. httpRequest 객체 획득
			httpRequest = getXMLHttpRequest();
			
// 			2. httpRequest 이벤트 리스너(핸들러 - callback함수) 설정
			httpRequest.onreadystatechange = callback;
			
// 			3. 요청 작업 내용 설정 : method, url, 파라미터 등
			httpRequest.open("Get", "/curr14/j02_viewData.jsp?data=둘리", true); // get 방식일 경우에 이렇게 사용
// 			- 비동기(true) / 동기(false) 방식 지정
// 				- 비동기 true : send() 실행 후 계속해서 다음 명령 실행
// 				- 동기 false : send() 후 서버와의 통신이 완전히 완료된 이후에 다음 명령 실행

// 			4. httpRequest 요청(발송)
			alert("send 함수 실행");
			httpRequest.send(null); // ************post 방식으로 사용 할 때 이용**********
// 			=> post방식으로 전송 시 보낼 파라미터 입력 / 없으면 null
			alert("#### 요청(send) 완료");
		}
		
		function callback() { // 보낼 때 왔을 때 코딩을 직접 해줘야 나는 영역
			if(httpRequest.readyState == 4){
// 				- readyState : XMLHttpRequest의 객체 상태 확인
// 				- 4 : 서버로부터의 응답 성공(전체 데이터 수신 성공)

				if(httpRequest.status == 200){
// 					- status : 서버로부터의 응답받는 http 상태
// 					- 200 : 요청에 대한 서버의 처리 작업이 성공적임
// 					- 403 : 서버에 대한 접근 거부
// 					- 404 : 페이지 없음
// 					- 500 : 서버 오류 발생
					
					var rcvData = httpRequest.responseText;
// 					서버로부터의 응답된 데이터 사용 방식
// 					- responseText : 단순 Text 응답
// 					- responseXML : XML 구조 응답
					alert("요청에 대한 응답 rcvData\n\n" + rcvData);
					
					var repData = rcvData.replace(/\s/g, "");
					alert("모든 공백 제거\n\n" + repData);
					
					var trData = rcvData.trim();
					alert("trim 사용 앞뒤만 공백 제거\n\n" + trData);
					
					alert("용청에 대한 응답 작업 완료");

				} else {
					alert("##### 실패 : " + httpRequest.status);
				}
			}
		}
		
	</script>
</html>











