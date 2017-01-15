<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>

	<c:set var="min_js" value="/curr14/files_js/jquery-3.1.1.min.js"/>
	<script type="text/javascript" src="${ min_js }"></script>

<!-- 	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script> -->
<!--    위에 것은 인터넷 연결 될 때만 사용 가능한 url 방법 입니다. -->
</head>
<body>

	<%--
		JQuery 다운로드
		- jquery.com/download
		- jqueryui.com/download/all
	 --%>
	 
	 <h3>1. javascript 이벤트 함수</h3>
	 
	 <p id="aaa">알림창보기</p>
	 <script type="text/javascript">
	 	var target = document.getElementById("aaa");
	 	
	 	if(target.addEventListener){
	 		target.addEventListener("click", showAlert); // 소괄호 없음 주의*****
	 	} else {
	 		target.attachEvent("onclick", showAlert()); // 소괄호 있음 주의*****
	 	}
	 	function showAlert(){
	 		alert("알림창입니다.");
	 	}
	 </script>
	 
	 
	 <h3>2. jQuery 이용(TagName && click)</h3>
	 
	 <div id="bbb">알림창보기</div>
	 <script type="text/javascript">
	 	$("div").click(
	 		function(){
	 			alert("jQuery(tagName) 알림창");
	 		}		
	 	);
	 </script>
	 
	 
	 <h3>3. jQuery(id && click)</h3>
	 
	 <span id="ccc">알림창보기</span>
	 <script type="text/javascript">
	 	$("#ccc").click(
	 		function(){
	 			alert("jQuery(id) 알림창");
	 		}		
	 	);
	 </script>
	 
	 
	 <h3>4. jQuery(class && click)</h3>
	 
	 <span class="ddd">알림창보기</span>
	 <script type="text/javascript">
	 	$(".ddd").click(
	 		function(){
	 			alert("jQuery(class) 알림창")
	 		}		
	 	);
	 </script>

</body>
</html>











