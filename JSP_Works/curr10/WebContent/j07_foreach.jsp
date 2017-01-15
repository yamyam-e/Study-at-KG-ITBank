<%@page import="java.util.HashMap"%>
<%@page import="dto.PeopleDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	1. foreach (set은 양수만 가능)<br>
	<c:forEach var="i" begin="0" end="10" step="1">
		${ i } ->
	</c:forEach>
	<hr>
	
	2. 감소하는 for문의 예<br>
	<c:set var="i" value="10"></c:set>
	<c:forEach var="k" begin="0" end="10" step="1">
		${ i - k } ->
	</c:forEach>
	<hr>
	
	3. 배열의 이용
	<%
		String[] data = {"AAA", "BBB", "CCC"};
		request.setAttribute("data", data);
	%>
	<br>
	<c:forEach var="each" items="${ data }">
		each : ${ each } <br>
	</c:forEach>
	<hr>
	
	4. ArrayList 이용<br>
	<%
		ArrayList<PeopleDTO> listc = new ArrayList<>();
		listc.add(new PeopleDTO("마이콜", 10));
		listc.add(new PeopleDTO("둘리", 10));
		listc.add(new PeopleDTO("하니", 10));
		listc.add(new PeopleDTO("또치", 10));
		listc.add(new PeopleDTO("공룡", 10));
		request.setAttribute("listc", listc);
	%>
	<c:forEach var="each" items="${ listc }">
		each : ${ each.name }, ${ each.age } <br>
	</c:forEach>
	<hr>
	
	5. Map 이용<br>
	<%
		HashMap<Integer, PeopleDTO> mapc = new HashMap<>();
		mapc.put(1, new PeopleDTO("마이콜", 10));
		mapc.put(2, new PeopleDTO("아이언맨", 10));
		mapc.put(3, new PeopleDTO("킹콩", 10));
		mapc.put(4, new PeopleDTO("배트맨", 10));
		mapc.put(5, new PeopleDTO("슈퍼맨", 10));
		request.setAttribute("mapc", mapc);
	%>
	<c:forEach var="each" items="${ mapc }">
		key : ${ each.key },
		value : ${ each.value.name }, ${ each.value.age } <br>
	</c:forEach>
	<hr>
	

</body>
</html>