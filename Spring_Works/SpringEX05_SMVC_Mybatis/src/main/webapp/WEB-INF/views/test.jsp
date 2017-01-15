<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>

	<!-- servlet 과 연관되어 있기 때문에 spring url을 사용한다. resources 폴더에 대한  -->
	<spring:url var="httpRequest_js" value="/resources/files_js/httpRequest.js"/>
	<spring:url var="min_js" value="/resources/files_js/jquery-3.1.1.min.js"/>
	<script src="${ httpRequest_js }"></script>
	<script src="${ min_js }"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/spring05/test3" method="post">
	<input type="text" id="item"/>
	<div id="target">클릭하세요.</div>
	<div id="show"></div>
	<input type="submit" value="go test3"/>
	</form>
	
</body>

	<script type="text/javascript">
	
		$("#target").click(
			function(){
				
				var searchItem = document.getElementById("item").value;
				
				$.ajax({
		            url: "https://apis.daum.net/shopping/search?"
					+"apikey=24f6cb95e6a56956cde76f82526199bd&q=" 
					+ searchItem
					+"&result=20&pageno=3&output=json&sort=min_price",
		            type: "GET",
		            data: null, //JSON.stringify(arr), Array를 JSON string형태로 변환
		            dataType: "JSON",
		            contentType: "application/json",
		            success: function(data) {
		            	
		            	alert(data);
// 		            	var targetNode1 = document.getElementById('target');  
//                     	targetNode1.innerHTML = data;
		            },
		            error:function(){
		            	alert("실패");
		            }
		        });
			}		
		);
			
		
	</script>

</html>