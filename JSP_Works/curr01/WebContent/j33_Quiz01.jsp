<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	
	<script type="text/javascript">
		function result(){
			var aaa = document.frm;
			aaa.action = "/curr01/j33_Quiz02.jsp";
			aaa.method = "post";
			aaa.submit();
		}
		function discount(){
			var bbb = document.frm;
			bbb.action = "/curr01/j33_Quiz03.jsp";
			bbb.method = "post";
			bbb.submit();
		}
	</script>

</head>
<body>

	<%--
		인사 정보 프로그램
		1. 페이지 구성
			1. 입력 페이지
				- 이름, 나이를 입력하는 화면
				- 버튼 2개(입력 결과 보기/할인 대상 영부 확인)
			2. 입력 결과 페이지
				- 입력된 데이터를 볼 수 있는 화면
				- 입력페이지로 이동하는 기능이 존재
			3. 할인 대상 여부 확인 페이지
				- 19세 이하인 경우 "***님은 할인 대상입니다."를 출력
					아닌 경우 "***님은 할인 대상이 아닙니다."를 출력
				- 입력페이지로 이동하는 기능이 존재
		2. 요구사항
			1. form(post) && table && function 이용
	 --%>
	 <form name="frm">
	 <table border="1" style="text-align: center">
	 	<tr>
	 		<td>이름</td>
	 		<td>나이</td>
	 		
	 	</tr>
	 	<tr>
	 		<td>
	 			<input type="text" name="name"/>
	 		</td>
	 		<td>
	 			<input type="text" name="age"/>
	 		</td>
	 	</tr>
	 	<tr>
	 		<td colspan="2">
	 			<input type="button" value="입력결과" onclick="javascript: result()"/>
	 			<input type="button" value="할인정보" onclick="javascript: discount()"/>
	 		</td>
	 	</tr>
	 	
	 </table>
	 </form>

</body>
</html>