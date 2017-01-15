<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	제목 : <input id="title" type="text"/> &nbsp;
	input의 name 속성 값 : <input id="nameAttr" type="text"/> &nbsp;
	<input type="button" value="추가하기" onclick="addForm()"/>
	<hr>
	
	<form action="/curr13/j04_domCreate02.jsp">
	<table border="1" style="text-align: center;">
		<tr id="trTitle">
			<td>이 름</td>
		</tr>
		<tr id="trValue">
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td id="colNum" colspan="2">
				<input type="submit" value="전송하기"/>
			</td>
		</tr>
	</table>
	</form>	
	
	<script type="text/javascript">
		
		var colNum = 1;
		
		function addForm(){
			var titleNode = document.getElementById("title");
			var titleValue = titleNode.value;
			
			var newTitleNode = document.createElement("td");
				newTitleNode.innerHTML = titleValue;
			var trTarget = document.getElementById("trTitle");
				trTarget.appendChild(newTitleNode);
				
			var newTdNode = document.createElement("td");
			var nameAttr = document.getElementById("nameAttr");
			
				newTdNode.innerHTML = "<input type='text' name='" + nameAttr.value + "'/>";
			
			var trTarget2 = document.getElementById("trValue");
				trTarget2.appendChild(newTdNode);
			
			titleNode.value = "";
			nameAttr.value = "";
			titleNode.focus();
			
			colNum++;
			var colNumTarget = document.getElementById("colNum");
				colNumTarget.setAttribute("colspan", colNum);
		}		
	</script>

</body>
</html>














