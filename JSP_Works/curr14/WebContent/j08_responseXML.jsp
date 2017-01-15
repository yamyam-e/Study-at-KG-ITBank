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

	<a onclick="javascript:show()">클릭하세요</a>
	<br>
	<a onclick="javascript:show02()">서블릿정보</a>

</body>

	<script type="text/javascript">
		
		function show(){
			sendRequest("/curr14/j08_xmlData.xml", null, callback, "get");
		}
		
		function show02(){
			sendRequest("/curr14/J08", null, callback, "get");
		}
		
		function callback() {
			if(httpRequest.readyState == 4){
				if(httpRequest.status == 200){
					
					var rcvXMLData = httpRequest.responseXML;
					var peoId = rcvXMLData.getElementById("둘리");
					alert(peoId.getAttribute("age"));
					
				} else {
					alert("##### 실패 : " + httpRequest.status);
				}
			}
		}
		
	</script>
</html>