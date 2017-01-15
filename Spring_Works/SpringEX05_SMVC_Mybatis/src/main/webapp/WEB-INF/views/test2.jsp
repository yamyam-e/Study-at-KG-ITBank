<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Daum 웹 검색 API</title>
	<script type="text/javascript">
		function init(){
			var rcvText = JSON.parse(function() {      
			alert("Aaa");
				var url = "http://apis.daum.net/search/web";
				url += "?output=json";
				url += "&apikey=24f6cb95e6a56956cde76f82526199bd"
				url += "&q=daum";
				
				location.href= url;
			}); 
			
			alert(rcvText);
		}
	</script>
</head>

	<body onload="init();">
	</body>
	
</html>