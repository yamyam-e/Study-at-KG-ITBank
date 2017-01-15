<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>

	<c:set var="httpRequest_js" value="/mySchool/files_js/httpRequest.js"/>
    <script type="text/javascript" src="${ httpRequest_js }"></script>
	
	<style type="text/css">
		.bt {
		-moz-box-shadow:inset 0px 1px 0px 0px #c1ed9c;
		-webkit-box-shadow:inset 0px 1px 0px 0px #c1ed9c;
		box-shadow:inset 0px 1px 0px 0px #c1ed9c;
		background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #9dce2c), color-stop(1, #8cb82b) );
		background:-moz-linear-gradient( center top, #9dce2c 5%, #8cb82b 100% );
		filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#9dce2c', endColorstr='#8cb82b');
		background-color:#9dce2c;
		-webkit-border-top-left-radius:37px;
		-moz-border-radius-topleft:37px;
		border-top-left-radius:37px;
		-webkit-border-top-right-radius:0px;
		-moz-border-radius-topright:0px;
		border-top-right-radius:0px;
		-webkit-border-bottom-right-radius:37px;
		-moz-border-radius-bottomright:37px;
		border-bottom-right-radius:37px;
		-webkit-border-bottom-left-radius:0px;
		-moz-border-radius-bottomleft:0px;
		border-bottom-left-radius:0px;
		text-indent:0;
		border:1px solid #83c41a;
		display:inline-block;
		color:#ffffff;
		font-family:Times New Roman;
		font-size:13px;
		font-weight:bold;
		font-style:italic;
		height:30px;
		line-height:30px;
		width:149px;
		text-decoration:none;
		text-align:center;
		text-shadow:1px 1px 0px #689324;
		}
		.bt:hover {
			background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #8cb82b), color-stop(1, #9dce2c) );
			background:-moz-linear-gradient( center top, #8cb82b 5%, #9dce2c 100% );
			filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#8cb82b', endColorstr='#9dce2c');
			background-color:#8cb82b;
		}.bt:active {
			position:relative;
			top:1px;
		}

	</style>
	
</head>
<body>
	
			  
		<jsp:include page="/top.jsp"></jsp:include>
		
		<c:choose>
			<c:when test="${ !empty nowLogin }">
				<jsp:include page="menu.jsp"></jsp:include>
				<div style="background-color: white; height: 390px; vertical-align: middle;" align="center">
				<jsp:include page="${ mainView }"></jsp:include>
				</div>	    			
			</c:when>
			<c:when test="${ !empty show }">
				<div style="background-color: white; height: 390px; vertical-align: middle;" align="center">
				<jsp:include page="${ mainView }"></jsp:include>
				</div>			
			</c:when>
			<c:otherwise>
				<jsp:include page="/mainHome.jsp"></jsp:include>
			</c:otherwise>
		</c:choose>
	
		<jsp:include page="/bottom.jsp"></jsp:include>
	  	
	
</body>

	<script type="text/javascript">
		window.onload = function() {
			var msg = "${ msg }";
			var mainView = "${ mainView }"
			alert(mainView);
			if(msg == "") {
				return;
			} else if(msg != ""){
				alert("${ msg }");
			}
		}
		
		function goRegisterForm(){
			location.href = "/mySchool/teach/insertForm";
		}
	</script>
	
</html>