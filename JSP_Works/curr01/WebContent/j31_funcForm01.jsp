<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	
	<script type="text/javascript">
		function showData(){
			var bbb = document.frm;
			alert(bbb.data.value);			
		}
		function go01() {
			var bbb = document.frm;
			bbb.action = "/curr01/j31_funcForm02.jsp";
			bbb.method = "post";
			bbb.submit(); // 꼭 할 것 괄호도 꼭 할 것
		}
		function go02() {
			var bbb= document.frm;
			bbb.action = "/curr01/j31_funcForm02.jsp?param=도리도리";
			bbb.method = "get";
			bbb.submit();
		}
	</script>
	
</head>
<body>

	<h2>전송 페이지 : function과 form 이용</h2>
	
	<form name="frm">
	
		입력 : <input type="text" name="data"/> <hr>
		
		<input type="button" 
				value="0. form에 입력된 값들 호출하기"
				onclick="javascript:showData()"/>
		<hr>
		
		<input type="button"
		        value="1. 페이지 이동"
		        onclick="javascript:go01()"/>
		<hr>
		
		<input type="button"
		        value="2. 에러 : URL 파라미터로 값 보내기"
		        onclick="javascript:go02()"/>
		<hr>
		
		<input type="hidden" name="hData" value="hidden값"/>
		
	</form>

</body>
</html>




















