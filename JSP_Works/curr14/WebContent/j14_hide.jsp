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
	
	<button id="hide1">숨기기(기본)</button>
	<script type="text/javascript">
		$("#hide1").click(
			function(){
				$("img").hide();
			}		
		);
	</script>
	
	<button id="hide2">숨기기(시간설정)</button>
	<script type="text/javascript">
		$("#hide2").click(
			function(){
				$("img").hide(2000);
			}		
		);
	</script>
	
	<button id="hide3">숨기기(시간설정) + 옵션</button>
	<script type="text/javascript">
		$("#hide3").click(
			function(){
				$("img").hide(2000, function(){
					alert("숨기기 완료");
				});
			}		
		);
	</script>
	
	<button id="show">보기</button>
	<script type="text/javascript">
		$("#show").click(
			function(){
				$("img").show(1500);
			}		
		);
	</script>
	<hr>
	
	
	<button id="tt">보기/숨기기(toggle)</button>
	<script type="text/javascript">
		$("#tt").click(
			function(){
				$("img").toggle(2000);
			}		
		);
	</script>

</body>
</html>







