<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>

	<c:set var="min_js" value="/curr14/files_js/jquery-3.1.1.min.js"/>
	<script type="text/javascript" src="${ min_js }"></script>
	
</head>
<body>

	<img alt="" src="/curr14/files/coffees.jpeg" style="width:400px; height:300px"/>
	<hr>
	
	<button id="fo">fadeOut</button>
	<script type="text/javascript">
		$("#fo").click(
			function(){
				$("img").fadeOut(2000);
			}		
		);
	</script>
	
	<button id="fi">fadeIn</button>
	<script type="text/javascript">
		$("#fi").click(
			function(){
				$("img").fadeIn(2000);
			}		
		);
	</script>
	<hr>
	
	<h3>attribute 이용</h3>
     <button class="ft" op="0">fadeTo(투명도0)</button>
     <button class="ft" op="0.3">fadeTo(투명도0.3)</button>
     <button class="ft" op="0.7">fadeTo(투명도0.7)</button>
     <button class="ft" op="1.0">fadeTo(투명도1.0)</button>
     
     <script type="text/javascript">
        $(".ft").click(
           function() {
              var rcvOpacity = $(this).attr("op");
              
              $("img").fadeTo("slow", rcvOpacity);
           }      
        );
     </script>
	

</body>
</html>

















