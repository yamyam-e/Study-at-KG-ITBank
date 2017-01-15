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

	<div style="background-color: red"></div>
	<div style="background-color: orange"></div>
	<div style="background-color: yellow"></div>
	<div style="background-color: green"></div>
	<div style="background-color: blue"></div>
	<div style="background-color: navy"></div>
	<div style="background-color: purple"></div>
	
	<style>
		div {
			width: 40px;
			height: 50px;
			overflow: hidden;
		}
	</style>
	<script type="text/javascript">
		$("div").hover(
			function() {
				$(this).stop(true, false).animate({width: "300px"}, 200);
			},
			function() {
				$(this).stop(true, false).animate({width: "40px"}, 200);
			}
			
			
		);
	</script>

	

</body>
</html>