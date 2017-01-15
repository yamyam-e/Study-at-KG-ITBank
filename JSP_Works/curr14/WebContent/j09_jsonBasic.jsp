<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%--
		1. JSON : Javascript Object Notation(자바 객체를 쉽게 보여주기 위한 형식)
		- 서로 다른 프로그램 간 데이터를 교환할 때 사용됨
		2. 표기법 및 이용바업 2가지
			1. 이름/값 => {이름1:값1, 이름2:값2, .....}
			- 이용 시 "객체.이름1" 또는 "객체["이름1"] 을 명령하면 해당 값1이 반환됨
			2. 배열 => [값0, 값1, 값2...]
			- 이용 시 "객체[인덱스0]" 을 명령하면, 해당 값0이 반환됨
	 --%>	
	 
	 1. 이름/값 형식에 대한 데이터 노출<br>
	 <a onclick="javascript:useName1()">인사정보보기1</a><br>
	 <a onclick="javascript:useName2()">인사정보보기2</a><br>
	 
	 <script type="text/javascript">
	 	var doolData = {name:"둘리", age:10};
	 	
	 	function useName1(){
	 		alert("이름 : " + doolData.name + " , 나이 : " + doolData.age);
	 	}
	 	
	 	function useName2(){
	 		alert("이름 : " + doolData["name"] + ", 나이 : " + doolData["age"]);
	 	}
	 	
	 </script>
	 
	 2. 배열 인덱스 형식에 대한 데이터 노출<br>
	 <a onclick="javascript:useArray()">이름 보기</a>
	 <script type="text/javascript">
	 	var jsonArrays = ["둘리", "도우너", "마이콜"];
	 	
	 	function useArray(){
	 		alert(jsonArrays[0]);
	 	}
	 </script>

</body>
</html>