<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%--
		URL 구성
		
		1. 서버의 ip와 port 및 관련 서비스 경로 
			http://search.11st.co.kr/SearchPrdAction.tmall
		2. 대상 주소와 요청 정보를 구분하는 기호
			?
		3. 요청 정보 => 파라미터라 부른다.
			method=getTotalSearchSeller
			&
			targetTab=T
			&
			semanticKeyword=
			&
			search=
			&
			isGnb=Y
			&
			prdType=
			&
			category=
			&
			cmd=
			&
			pageSize=
			&l
			CtgrNo=
			&
			mCtgrNo=
			&
			sCtgrNo=
			&
			dCtgrNo=
			&
			fromACK=
			&
			semanticFromGNB=
			&
			gnbTag=TO
			&
			schFrom=
			&
			ID=
			&
			ctgrNo=
			&
			srCtgrNo=
			&
			kwd=%B3%EB%C6%AE%BA%CF
			&
			keyword=
			&
			adUrl=
			&
			adKwdTrcNo=
			&
			adPrdNo=
			
			파라미터는 request 객체로부터 추출.
			request.getParameter("이름"); => 해당 이름의 값을 제공
			단, 제공 형태는 무조건 String으로 제공함.
	 --%>
	 
	 <%
	 	String data1 = request.getParameter("method");
	 	String data2 = request.getParameter("adUrl");
	 	String data3 = request.getParameter("noParameter");
	 %>
	 
	 <h2>JSP 페이지</h2>
	 
	 data1 : <%= data1 %> <br>
	 data2 : <%= data2 %>
	 			 =====> null ?? : <%= data2 == null %>, 
	 					""  ?? : <%= data2.equals("") %> <br>
	 data2 : <%= data3 %>
				 =====> null ?? : <%= data2 == null %> <br> 
</body>
</html>





















