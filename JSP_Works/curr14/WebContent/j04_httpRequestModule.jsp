<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>

	<c:set var="httpRequest_js" value="/curr14/files_js/httpRequest.js"/>
	<script type="text/javascript" src="${ httpRequest_js }"></script>
	
</head>
<body>

	<div id="target"></div>
	<a onclick="javascript:showMsg()">메시지 보여주기</a>
	
</body>
	
	<script type="text/javascript">
		function showMsg(){
			sendRequest("/curr14/j04_viewData.jsp", null, callback, "get");
		}
		
		function callback(){
			
			if(httpRequest.readyState == 4){
				
				if(httpRequest.status == 200){
					
					var targetNode = document.getElementById("target");
					targetNode.innerHTML = httpRequest.responseText;
					
					
				} else {
					alert("#### 실패 : " + httpRequest.status);
				}
			}
		}
	</script>


</html>