<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<!-- 
		01페이지 : 
			- 이름, 나이 입력
			- 02페이지로 전송
			- form-post && table
		02페이지 ;
			- 성인인 경우 03페이지로 이동
			- 미성년자인 경우 04페이졸 이동
		03페이지 :
			- ***님 환영합니다.
		04페이지 :
			- ***님은 성인닝 아니므로 사용 불가 합니다.
	
	 -->
	 
	 <h2>j11_Quiz01 페이지</h2>
	 
	 <form name="frm">
	 	<table border="1">
	 		<tr>
	 			<td>이 름</td>
	 			<td>
	 				<input type="text" name="name"/>
	 			</td>
	 		</tr>
	 		<tr>
	 			<td>나 이</td>
	 			<td>
	 				<input type="text" name="age"/>
	 			</td>
	 		</tr>
	 		<tr>
	 			<td colspan="2">
	 				<input type="submit" value="들어가기" onclick="javascript: go()"/>
	 			</td>
	 		</tr>
	 	</table>
	 </form>
	 
	 <script type="text/javascript">
	 	function go(){
	 		var aaa = document.frm;
	 		aaa.action = "/curr02/j11_Quiz02.jsp";
	 		aaa.method = "post";
	 		aaa.submit();
	 	}
	 </script>
		
</body>
</html>