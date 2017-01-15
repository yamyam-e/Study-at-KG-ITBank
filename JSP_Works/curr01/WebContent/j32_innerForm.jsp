<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	<script type="text/javascript">
		function viewData() {
			alert(document.inFrm.data.value);
		}
	</script>
	
</head>
<body>

	<h2>form 사용 시 주의사항(inner form 사용 금지)</h2>
	<form name ="outFrm>
		<form name ="inFrm">
			입력 : <input type="text name="data"/>
			<hr>
			
			<input type="button"" value="확인"
					onclick="javascript: viewData()"/>
		</form>
	</form>
</body>
</html>