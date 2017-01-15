<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>신체포기각서</title>

<style tpye="text/css">
	.a {
		width: 612px;
/* 		height: 200px; */
		border: 1px solid blue;
	}
	.aa, .bb, .cc {
		float: left;	/* 이전의 div에 대한 상대적 위치 설정 */
		border: 1px solid red;
	}
	.head, .body, .foot {
		clear: both;	/* 해당 float의 값을 초기화 함 */
	}
	.aa {
		width 304px;
	}
	.bb {
		width 100px;
	}
	.cc {
		width 610px;
	}
</style>

</head>
<body>
	
	<div class="a">
		<div class="head">
			<div class="aa">1111</div>
			<div class="aa">2222</div>
		</div>
		<div class="body">
			<div class="bb">3333</div>
			<div class="bb">4444</div>
			<div class="bb">5555</div>
			<div class="bb">6666</div>
			<div class="bb">7777</div>
			<div class="bb">8888</div>
		</div>
		<div class="foot">
			<div class="cc">9999</div>
		</div>
	</div>
	
</body>
</html>
















