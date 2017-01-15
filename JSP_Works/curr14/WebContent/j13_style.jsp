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

	<h3>1. 대상 색 변경</h3>
	
	<div id="aaa">파란색으로</div>
	<a>빨간색으로</a>
	
	<style>
		#aaa {
			width: 100px;
			height: 100px;
			background: yellow;
		}
	</style>
	<script type="text/javascript">
		$("#aaa").click(
			function(){ // this=> aaa를 의미
				$(this).css("background-color", "blue")
			}		
		);
		$("a").click( // 테그로 접근해서
			function(){ // aaa 의 색상을 변경
				$("#aaa").css("background-color", "red");
			}		
		);
	</script>
	<hr>
	
	<h3>2. 투명도 변경 : opacity(1 -> 0.3)</h3>
	<div id="bbb">투명도변경</div>
	
	<style>
		#bbb {
			width: 100px;
			height: 100px;
			background: red;
		}
	</style>
	<script type="text/javascript">
		$("#bbb").click(
			function(){
				$(this).css("opacity", "0.3")
			}		
		);
	</script>
	<hr>
	
	<h3>3. display : 보이기/숨기기("" -> none)</h3>
	<div id="ccc">숨기기</div>
	
	<style>
		#ccc {
			width: 100px;
			height: 100px;
			background: green;
		}
	</style>
	<script type="text/javascript">
		$("#ccc").click(
			function(){
				$(this).css("display", "none");
			}		
		);
	</script>
	<hr>
	
	<h3>4. text</h3>
	<button id="tt">text보기</button><br>
	<span id="ss"></span>
	
	<script type="text/javascript">
		$("#tt").click(
			function(){
				$("#ss").text("보여주고 싶은 메시지");
			}		
		);
	</script>
	
	
	
	
	
</body>
</html>