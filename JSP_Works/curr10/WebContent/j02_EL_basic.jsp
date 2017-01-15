<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%--
		EL : Expression Language Tag(출력언어태그)
		- ${}
		- 변수값 출력 불가능
		- 연산 가능
		- requeset && session의 attribute 값을 자동으로 호출
	 --%>
	 
	 <h2>EL 연산</h2>
	 
	 참고 : \ 이후의 명령은 노출되는 문자로 인식 됨<hr>
	 
	 \${ 3 } = ${ 3 } <br>
	 
	 \${ 3 > 5 } = ${ 3 > 5 } <br>
	 \${ 3 gt 5 } = ${ 3 gt 5 } <br>
	 <hr>
	 
	 \${ 3 >= 5 } = ${ 3 >= 5 } <br>
	 \${ 3 ge 5 } = ${ 3 ge 5 } <br>
	 <hr>
	 
	 \${ 3 < 5 } = ${ 3 < 5 } <br>
	 \${ 3 lt 5 } = ${ 3 lt 5 } <br>
	 <hr>
	 
	 \${ 3 <= 5 } = ${ 3 <= 5 } <br>
	 \${ 3 le 5 } = ${ 3 le 5 } <br>
	 <hr>
	 
	 \${ 3 == 5 } = ${ 3 == 5 } <br>
	 \${ 3 eq 5 } = ${ 3 eq 5 } <br>
	 <hr>
	 
	 \${ 3 != 5 } = ${ 3 != 5 } <br>
<%-- 	 \${ 3 ne 5 } = ${ 3 ne 5 } <br> --%>
	 <hr>
	 
	 \${ "둘리" == "둘리" } = ${ "둘리" == '둘리' } <br> <!-- 외따옴표 쌍따옴표 모두 사용 가능 -->
	 \${ "둘리" eq "둘리" } = ${ "둘리" eq '둘리' } <br>
	 <hr>
	 
	 EL의 조건(삼항) 연산자<br>
	 \${ 3 > 5 ? '참' : '거짓' } = { 3 > 5 ? '참' : '거짓' } <br>
	 

</body>
</html>