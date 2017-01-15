<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>

	<!-- servlet 과 연관되어 있기 때문에 spring url을 사용한다. resources 폴더에 대한  -->
	<spring:url var="httpRequest_js" 
				value="/resources/files_js/httpRequest.js"/>
	<spring:url var="min_js" 
				value="/resources/files_js/jquery-3.1.1.min.js"/>
	<script src="${ httpRequest_js }"></script>
	<script src="${ min_js }"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h2>객체 정보를 Json 형식 응답으로 사용</h2>
	
	<h3>1. 객체 1개 정보</h3>
	<div id="target1">클릭하세요(객체하나)</div>
	<div id="showOne"></div>
	
	<hr>
	
	<h3>2. 객체 여러개를 가진 컬렉션 정보</h3>
	<div id="target2">클릭하세요(컬렉션)</div>
	<div id="showAll"></div>
	
	<script>
		$("#target1").click(
			function(){
				sendRequest("/spring14/json01", null, callback01, null);
			}		
		);
		
		function callback01(){
			if(httpRequest.readyState == 4){
				if(httpRequest.status == 200){
					
					var rcvText = httpRequest.responseText;
					alert(rcvText);
					
					var res = JSON.parse(rcvText); //제이슨 정보를 개체로 바꿔주는 메소드
					var name = res.name;
					var age = res.age;
					var targetNode1 = document.getElementById("target1");
					targetNode1.innerHTML = "1. " + name + ", " + age;
					var targetNode2 = document.getElementById("showOne");
					targetNode2.innerHTML = "2. " + httpRequest.responseText;
					
				} else {
					alert("### 실패 : " + httpRequest.status);
				}
			}
		}
		
		$("#target2").click(
				function(){
					sendRequest("/spring14/json02", null, callback02, null);
				}		
			);
			
			function callback02(){
				if(httpRequest.readyState == 4){
					if(httpRequest.status == 200){
						
						var rcvText = httpRequest.responseText;
						alert(rcvText);
						var res = JSON.parse(rcvText);
						
						var peoList = res.listc;
						var msg = "";
						for(i=0; i<peoList.length; i++){
							var name = peoList[i].name;
							var age = peoList[i].age;
							msg += i + ". " + name + ", " + age + "\n";
						}
						alert(msg);
						
					} else {
						alert("### 실패 : " + httpRequest.status);
					}
				}
			}		
	</script>

</body>
</html>