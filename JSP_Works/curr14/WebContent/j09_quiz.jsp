<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>

	<c:set var="httpRequest_js" value="/curr14/files_js/httpRequest.js"/>
   	<script type="text/javascript" src="${ httpRequest_js }"></script>

</head>
<body>
	
	<a onclick="javascript:fromJsp()">데이터 가져오기</a>
<!-- 	<table id="show" border="1" style="text-align: center;"> -->
<!-- 	</table> -->
	<form action="" id="show">
	</form>
</body>
	<script type="text/javascript">
		
		function fromJsp(){
			sendRequest("/curr14/j09_quizDB.jsp", null, callback, "get");
		}
		
		function callback() {
			if(httpRequest.readyState == 4){
				if(httpRequest.status == 200){
					
					var rcvData = httpRequest.responseText;
					var target = document.getElementById("show");
					target.innerHTML = rcvData;
					
				} else {
					alert("##### 실패 : " + httpRequest.status);
				}
			}
		}
	
	</script>
</html>