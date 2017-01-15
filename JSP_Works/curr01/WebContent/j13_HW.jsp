<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%@page import="java.util.Calendar"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>달력만들기</title>

<style>
		.d, .d td{
			border: 1px groove black;
			width: 250px;
			height: 30px
		}
</style>

</head>
<body>

<!--  		이번 달 달력 만들기 (테이블, 캘니더 이용) -->
<!--  		- 1일 이전 및 마지막 날 이후의 빈공간은 합치기 -->
	
	<%
		Calendar today = Calendar.getInstance();	
		String[] dayName = {"일", "월", "화", "수",  "목", "금", "토"};
		
		String str = request.getParameter("go");
		
		if(str != null) {
			if(str.equals("이전달")){
				today.add(Calendar.MONTH, -1);
			}else if(str.equals("다음달")){
				today.add(Calendar.MONTH, 1);
			}
		}
	%>
		
<!-- 		month = today.get(Calendar.MONTH); -->
		<table class="d" style="text-align: center">
			<tr>
				<td colspan="7"><h1><%=today.get(Calendar.MONTH)+1 %> 월</h1></td>
			</tr>
			
			<tr>
			<%for(int i=0; i<dayName.length; i++){ // 요일 테이블
					if(i==0) {%>
						<td style="color: red"><%=dayName[i] %></td>
			<%		} else if(i==6) {%>
						<td style="color: blue"><%=dayName[i] %></td>
			<%		} else {%>
						<td style="color: black"><%=dayName[i] %></td>
			<% 		}
					
				} %>
			</tr>
			
			<tr>
			<%
			  int lastDay = today.getActualMaximum(Calendar.DATE); // 마지막 날짜
			 
			  today.set(Calendar.DATE, 1);
			  int colspan = today.get(Calendar.DAY_OF_WEEK)-1;
			  if(colspan != 0){%>
			  	<td colspan="<%=colspan%>"></td>
			<%}
			 
			 for(int d=1; d<=lastDay; d++){
			 	  	today.set(Calendar.DATE, d);
			 	  	int day = today.get(Calendar.DAY_OF_WEEK);
			 		if(day == 1){ // 일요일: 빨강색%>
			 			</tr><tr>
			 			<td style="color: red"><%=d %></td>
			 		<%} else if(day == 7){ // 토요일 : 파랑색 그리고 다음주 만들기%>
			 			<td style="color: blue"><%=d %></td>
			 		<%} else { // 그외 검정색%>
			 			<td><%=d %></td>
			 		<%}
			  } %>
			  
			  <%
			  lastDay = today.get(Calendar.DAY_OF_WEEK);
			  int colspan2 = 7-lastDay;
			  %>
				<td colspan="<%=colspan2%>"></td>
			</tr>
		</table>
		<form action="/curr01/j13_HW.jsp">
		 &nbsp; &nbsp; &nbsp; &nbsp;<input type="submit" name="go" value="이전달"/> 
		 				            <input type="submit" name="go" value="다음달"/></td>
		</form>
</body>
</html>