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

	<div id="show"></div>
	<div id="target">클릭하세요.</div>
	
	<script type="text/javascript">
		$("#target").click(
			function(){
				sendRequest("ajax", null, callback, null); // ajax == "/spring14/ajax"
			}		
		);
		function callback(){
			if(httpRequest.readyState == 4){
				if(httpRequest.status == 200){
					
					var targetNode = document.getElementById("show");
					targetNode.innerHTML = httpRequest.responseText;
					
				} else {
					alert("### 실패 : " + httpRequest.status);
				}
			}
		}		
		
	</script>


</body>



</html>