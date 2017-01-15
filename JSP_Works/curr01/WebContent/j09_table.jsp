<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title></title>
</head>
<body>

	<%--
		테이블 <table>
		- 행과 열 구조의 엘리먼트
		- 행 : <tr> / 셀 : <th>머릿글, <td>정보
		- 속성값
			border : 테이블 테두리 두꼐(px) 선종류 선색
			border-spacing : 테이블 테두리와 셀 테두리 간격(기본값2)
			padding : 테이블 셀 테두리와 셀 안의 내용문 간격(기본값1)
			colspan : 셀 간 수평 결합(열의 갯수 지정)
			rowspan : 셀 간 수직 결합(행의 갯수 지정)
			align : 수평 정렬 / valign : 수직 정렬
			height : 높이 / width : 너비 => 단위는 px
	 --%>
	<h3>테이블 생성 (기본)</h3>
	
	<table border="1", style="border-color: blue; color: red;">
		<caption>[ 테이블 만들기 ]</caption>
		<tr> <!-- 한줄 -->
			<th>제목1</th>
			<th>제목2</th>
		</tr>
		<tr>
			<td>AAAAAA</td>
			<td>BBBBBB</td>
		</tr>
	</table>
	
	<!-- 
		엘리먼트 지정자 : id && class
		- id : 엘리먼트에 부여하는 유일한 이름(하나의 문서에서 중복 불가)
		- class : 엘리먼트에 부여하는 이름(중복 사용 가능)	
	 -->
	 
	<h3>A. 테이블 - class(.)을 이용하여 윤곽선 설정</h3>
	 
	<style>
		.a, .a td {
			border: 1px solid red;
			/*선굵기 선종류 선색 :  선 종류는 필수*/
		}
	</style>
	
	<table class="a">
		<tr> <!-- 한줄 -->
			<th>AAAAAA</th>
			<th>BBBBBB</th>
		</tr>
		<tr>
			<td>111111</td>
			<td>222222</td>
		</tr>
	</table>
	<hr>
		
	<table class="a">
		<tr> <!-- 한줄 -->
			<th>AAAAAA</th>
			<th>BBBBBB</th>
			<th>CCCCCC</th>
		</tr>
		<tr>
			<td>111111</td>
			<td>222222</td>
			<th>333333</th>
		</tr>
		<tr>
			<td>가가가가</td>
			<td>나나나나</td>
			<th>다다다다</th>
		</tr>
	</table>
	<hr>
	
	<h3>B. 테이블 - id(#)를 이용한 윤과선 설정</h3>
	
	<style>
		#b, #b td{
			border: 1px solid blue;
			/*선굵기 선종류 선색 :  선 종류는 필수*/
		}
	</style>
	
	<table id="b">
		<tr> <!-- 한줄 -->
			<th>AAAAAA</th>
			<th>BBBBBB</th>
		</tr>
		<tr>
			<td>111111</td>
			<td>222222</td>
		</tr>
	</table>
	<hr>
	
	
	<h3>C. 테이블 크기 설정 : px이용</h3>
	<style>
		.c, .c3, .c4 {
			border: 1px solid red;
		}
		.c {
			width: 600px;
			height: 300px;
		}
		.c1 {
			height: 100px;
		}
		.c4 {
			width: 120px;
		}
	</style>
	<table class="c">
		<tr class="c1">
			<td class="c3">AAAAAA</td>
			<td class="c4">BBBBBB</td>
		</tr>
		<tr class="c2">
			<td class="c3">111111</td>
			<td class="c4">222222</td>
		</tr>
	</table>
	<hr>
	
	<h3>D. 테이블 크기 설정 : %이용 - html, body 설정 필요</h3>
	<style>
		.d, .d td {
			border: 1px solid blue;
		}
		html, body {
			width: 100%;	height: 100%;
		}
		.d {
			width: 100%;	height: 100%;
		}
		.d1 {
			heigth: 20%;
		}
	</style>
	<table class="d">
		<tr class="d1">
			<td>AAAAAA</td>
			<td>BBBBBB</td>
		</tr>
		<tr>
			<td>111111</td>
			<td>222222</td>
		</tr>
	</table>
	<hr>
	
	<h3>E. 테두리, 셀, 내용물 간격</h3>
	<style>
		.e, .e td{
			border: 1px solid blue;
			border-spacing: 30px;
			/* 테이블 테두리와 셀 테두리 간격(기본값 2) */
		}
		.e td{
			padding: 30px
			/* 셀 테두리와 셀 안쪽 간격(기본값 1) */
		}
	</style>
	<table class ="e">
		<tr>
			<td>AAAAAAA</td>
			<td>BBBBBBB</td>
		</tr>
		<tr>
			<td>1111111</td>
			<td>2222222</td>
		</tr>
	</table>
	<hr>
	
	<h3>F. 테이블 셀 병합</h3>
	<style>
	.f, .f td {
		border: 1px solid blue;
	}
	</style>
	<table class="f" style="width: 300px; height: 200px;">
		<tr>
			<td colspan="2">AAA&BBB</td>
<!-- 			<td>BBBBBBB</td> -->
			<td>CCC</td>
			<td align="center">DDD</td>
		</tr>
		<tr>
			<td valign="top">EEE</td>
			<td>FFF</td>
			<td rowspan="2">GGG</td>
			<td>HHH</td>
		</tr>
		<tr>
			<td>III</td>
			<td>JJJ</td>
<!-- 			<td>KKKKKKK</td> -->
			<td>LLLL</td>
		</tr>	
	</table>
	<hr>
	
	<h3>G. 테이블 배경 이미지 설정</h3> <!-- 사진 크기 조절 숙제 -->
	<style>
		.g, .g td {
			border: 1px solid blue;
			width: 600px;
			height: 300px;
			background-image: url('/curr01/files/사진.jpg'); width 100px; height 100px;
		}
	</style>
	<table class="g">
		<tr>
			<td>AAAAA</td>
			<td>BBBBB</td>
		</tr>
		<tr>
			<td>11111</td>
			<td>22222</td>
		</tr>
	</table>

</body>
</html>





























