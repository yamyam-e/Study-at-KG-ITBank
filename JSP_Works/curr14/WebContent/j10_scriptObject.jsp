<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h3>1. 자바 스크립트 트랠스 정의 형식1(세미콜롬 붙이는 것 주의)</h3>	
	
	<input type="button" value="클래스이용" onclick="using01()"/>
	<script type="text/javascript">
		People1 = function() {
			
			this.setData = function(name, age){
				this.name = name;
				this.age = age;
			};
			this.getData = function(){
				return "이름 : " + this.name + ", 나이 : " + this.age;
			};
		};
		
		function using01(){
			var peo = new People1();
			peo.setData("둘리", 10);
			alert(peo.getData());
		}
	</script>
	
	<h3>2. 자바스크립트 클래스 정의 형식2(세미콜롬 붙이는 것 주의)</h3>
	
	<input type="button" value="클래스이용" onclick="using02()"/>
	<script type="text/javascript">
		People2 = function(name, age){
			this.name = name;
			this.age = age;
			this.getData = function(){
				return "이름 : " + this.name + ", 나이 : " + this.age;
			};
		};
		
		function using02(){
			var peo = new People2("마이콜", 20);
			alert(peo.getData());
		}
	</script>
	
	<h3>3. 클래스 정의 형식3(세미콜롬 붙이는 것 주의)</h3>
	
	<input type="button" value="클래스이용"  onclick="using03()"/>
	<script type="text/javascript">
		People3 = function() {};
		
		People3.prototype.setData = function(name, age){
			this.name = name;
			this.age = age;
		};
		People3.prototype.getData = function(){
			return "이름 : " + this.name + ", 나이 : " + this.age;
		};
		
		function using03(){
			var peo = new People3();
			peo.setData("도우너", 11);
			alert(peo.getData());
		}
	</script>
	
	
	<h3>4. JSON을 이용한 클래스 형식(세미콜롬 콤마 주의)</h3>
	
	<input type="button" value="클래스이용" onclick="using04()"/>
	<script type="text/javascript">
		People4 = function() {};
		
		People4.prototype = {
		
			setData : function(name, age) {
				this.name = name;
				this.age = age;
			},
			getData : function() {
				return "이름 : " + this.name + ", 나이 : " + this.age;
			}
		};
		
		function using04(){
			var peo = new People4();
			peo.setData("또치", 12);
			alert(peo.getData());
		}
	</script>
	
	<h3>5. 익명클래스 정의</h3>
	
	<input type="button" value="익명클래스이용" onclick="using05()"/>
	<script type="text/javascript">
		function using05() {
			var pp = new Object();
			pp.name = "둘리";
			pp.age = 10;
			pp.showData = function() {
				alert(this.name + ", " + this.age);
			};
			pp.setData = function(name, age){
				this.name = name;
				this.age = age;
			};
			pp.showData();
			pp.setData("수정둘리", 34);
			pp.showData();
		}
	</script>
	
	
	
	
</body>
</html>














