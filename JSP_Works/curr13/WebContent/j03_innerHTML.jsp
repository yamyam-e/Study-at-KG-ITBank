<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<div id="viewFrame1">기본값 text</div>
	
	<a onclick="viewRead()">viewFrame1 정보 읽은 후 변경</a>
	<script type="text/javascript">
		function viewRead(){
			var target = document.getElementById("viewFrame1");
			alert("읽어오기 : " + target.innerHTML);
			
			target.innerHTML = "<input type='text' name='name'/>";
			alert("수정 후 읽어오기 : " + target.innerHTML);
		}
	</script>
	<hr>
	
	<div id="viewFrame2"></div>
	<%-- 테이블 (나의 입력 input 존재) --%>
	
	<a onclick="viewInput()">테이블 (나의 이름 입력 input 존재)</a>
	<script type="text/javascript">
		function viewInput(){
			var target = document.getElementById("viewFrame2");
			target.innerHTML = 	"<table border='1'>"
								+"<tr>"
								+"<td>"
								+	"<input type='text' id='myName'/>&nbsp;" 
								+	"<input type='button' value='입력' onclick='showMyName()'/>"
								+"</td>"
								+"</tr>"
								+"</table>";
		}
		function showMyName(){
			var myName = document.getElementById("myName").value;
			alert("내 이름은 " +  myName + " 입니다.");
		}
	</script>

</body>
</html>