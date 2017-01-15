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

	<input type="button" value="JSON정보 가져오기" onclick="getData()"/>
	<script type="text/javascript">
		function getData(){
			sendRequest("/curr14/j11_jsonData.jsp", null, callback, "get");
			
		}
		function callback() {
			if(httpRequest.readyState == 4){
				if(httpRequest.status == 200){
					
					var rcvData = httpRequest.responseText;
					alert(rcvData);
					
					var res = JSON.parse(rcvData);
// 					JSON.parse() :
// 					- JSON 형식의 String 정보를 객체로 변환
// 					- 단, 키와 값 모두 ""처리 필요(숫자는 제외)
// 					- 모든 브라우저에서 지원

					if(res.info == "peo"){
						var peo = res.data.peoInfo;
						for(i=0; i<peo.length; i++){
							alert(peo[i].name + ", " + peo[i].age);
						}
					}
					
				} else {
					alert("##### 실패 : " + httpRequest.status);
				}
			}
		}
	</script>

</body>
</html>