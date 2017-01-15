<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript">
		function nopop() {
			location.href="/spring14/nopop";
// 			self.close(); 셀프 클로즈를 쓰면 컨트롤러에 들어 가지 않기 때문에 반드시 따로 처리 할 것
		}
		window.onload = function () {
			var closer = "${ msg }";
			if(closer == "nopop"){
				self.close();
			}
		}
	</script>
</head>
<body>

	<h2>popView 페이지</h2>
	
	<input type="button" value="팝업창 그만보기" onclick="nopop()"/>


</body>
</html>