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

	<table border="1" style="text-align: center; width: 400px;">
		<tr>
			<td id="imgArea" style="height: 250px"></td>
		</tr>
		<tr>
			<td><a onclick="javascript:showImg('둘리')">둘리</a></td>
		</tr>
		<tr>
			<td><a onclick="javascript:showImg('도우너')">도우너</a></td>
		</tr>
		<tr>
			<td><a onclick="javascript:showImg('마이콜')">마이콜</a></td>
		</tr>
	</table>

</body>
	
	<script type="text/javascript">
		
		function showImg(peo){
			var params = "peo=" + peo;
			sendRequest("/curr14/j06_DBdata.jsp", params, callback, "post");
		}
		
		function callback() {
			if(httpRequest.readyState == 4){
				
				if(httpRequest.status == 200){
					
					var rcvImgPath = httpRequest.responseText;
						rcvImgPath = rcvImgPath.trim();
					var targetNode = document.getElementById("imgArea");
					
					targetNode.innerHTML = "<img src='/curr14/files/"
										+ rcvImgPath + "' style='width:400px; "
										+ "height:250px;' />";
				} else {
					alert("##### 실패 : " + httpRequest.status);
				}
			}
		}
		
	</script>

</html>















