<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="/spring02/update" method="post">
	<h2>햄버거 정보</h2>
	<table border="1" style="text-align: center;">
		<tr>
			<td colspan="4">
				<input type="button" value="목록보기" onclick="javascript:selectList();"/>
				<input type="submit" value="수정하기"/>
				<input type="submit" value="삭제하기" onclick="javascript:deleteOne('${dto.num}')" />			
			</td>
		</tr>
		<tr>
			<td>번 호</td>
			<td>이 름</td>
			<td>가 격</td>
			<td>칼로리</td>
		</tr>
		<tr>
			<td>
				<input type="text" name="num" value="${ dto.num }" readonly="readonly"/>
			</td>
			<td>
				<input type="text" name="name" value="${ dto.name }" readonly="readonly"/>
			</td>
			<td>
				<input type="text" name="price" value="${ dto.price}"/>
			</td>
			<td>
				<input type="text" name="cal" value="${ dto.cal }"/>
			</td>
		</tr>
	</table>
	</form>

</body>
	<script type="text/javascript">
		function selectList(){
			location.href="/spring02/selectList";
		}
		function deleteOne(num){
			if(!confirm("정말로 삭제 하시겠습니까?")){
				return;
			}
			location.href="/spring02/deleteOne?num="+num;
		}
	</script>
</html>