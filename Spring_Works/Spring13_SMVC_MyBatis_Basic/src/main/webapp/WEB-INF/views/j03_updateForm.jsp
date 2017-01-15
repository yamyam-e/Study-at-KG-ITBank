<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/spring13/update" method="post" name="frm">
		<h2>학생 정보 수정</h2>
		<table border="1" style="text-align: center">
			<tr>
				<td colspan="8">
					<input type="button" value="목록보기" onclick="javascript:selectList();"/>
					<input type="submit" value="수정하기"/>
					<input type="button" value="삭제하기" onclick="javascript:deleteOne('${ dto.num }');"/>
				</td>
			</tr>
			<tr>
				<td>번 호</td> 
				<td>이 름</td>
				<td>국 어</td>
				<td>영 어</td>
				<td>수 학</td>
				<td>총 점</td>
				<td>평 균</td>
			</tr>
			<tr>
				<td>
					<input type="text" id=num, name="num" readonly="readonly" value="${ dto.num }"/>
				</td>
				<td>
					<input type="text" readonly="readonly" value="${ dto.name }"/>
				</td>
				<td>
					<input type="text" name="kor" value="${ dto.kor }"/>
				</td>
				<td>
					<input type="text" name="eng" value="${ dto.eng }"/>
				</td>
				<td>
					<input type="text" name="math" value="${ dto.math }"/>
				</td>
				<td>
					<input type="text" readonly="readonly" value="${ dto.total }"/>
				</td>
				<td>
					<input type="text" readonly="readonly" value="${ dto.avg }"/>
				</td>
			</tr>
			
		</table>	
	</form>

</body>
	<script type="text/javascript">
		function deleteOne(num){
			if(!confirm("정말로 삭제 하시겠습니까?")){
				return;
			}
			location.href = "/spring13/deleteOne?num="+num;
		}
		function selectList(){
			location.href="/spring13/selectList";
		}
	</script>
</html>