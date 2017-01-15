<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>달력프로그램</title>
	
	<script type="text/javascript">
		function go(){
			var aaa = document.frm;
			aaa.action = "/curr01/j27_HW.jsp";
			aaa.method = "post"
			aaa.submit();
		}
	</script>
	
</head>
<body>

	<%--
		숙제 : 전체 달력 만들기
		- 이전달/다음달 버튼 존재
		- Calendar 사용
	 --%>
	 <% 
	 	request.setCharacterEncoding("UTF-8");	
	 
	 	String sel = request.getParameter("do");
	 	String newMonth = request.getParameter("todayMonth");
	 	String newYear = request.getParameter("todayYear");
	 	
	 	Calendar realToday = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
	 	String[] day = {"일", "월", "화", "수", "목", "금", "토"};
	 	
	 	if(sel != null){
	 		today.set(Calendar.MONTH, Integer.parseInt(newMonth));
	 		today.set(Calendar.YEAR, Integer.parseInt(newYear));
	 		
	 		if(sel.equals("이전달")){
	 			today.add(Calendar.MONTH, -1);
	 		} else if(sel.equals("다음달")){
	 			today.add(Calendar.MONTH, +1);
	 		}
	 		
	 	}
	 %>

	 <style>
	 .a, .a td{
 		border: 1px groove black;
		width: 300px;
		height: 30px
	 }
	 </style>
	 
	 <form name="frm">
	 
		 <table class="a" style="text-align: center">
		 	<tr>
<%-- 		 		<td colspan="7"><h1><%=today.get(Calendar.MONTH)+1 %> 월</h1></td> --%>
		 		<td colspan="7">
		 			<h1><%=today.get(Calendar.YEAR)%> 년 <%=today.get(Calendar.MONTH)+1 %> 월</h1>
		 			<input type="submit" name="do" value="이전달" onclick="javascript: go()"/>
					<input type="submit" name="do" value="다음달" onclick="javascript: go()"/>
		 		</td>
		 	</tr>
			<tr>
		 	<%
		 	for(int i=0; i<day.length; i++){
		 	
		 		if(i==0){%>
		 			<td style="color: red"><%=day[i]%></td>
		 	<%	} else if(i==6){%>
		 			<td style="color: blue"><%=day[i]%></td>
		 	<%	} else {%>
		 			<td style="color: black"><%=day[i]%></td>
		 	<% 	}
		 	}
		 	%>
		 	</tr>
		 	<tr>
		 	<% 
		 	today.set(Calendar.DATE, 1);
		 	int colspan1 = today.get(Calendar.DAY_OF_WEEK)-1;
		 	if(colspan1 != 0){
		 	%>
		 		<td colspan="<%=colspan1%>"></td>
		 	<%
		 	}
		 	%>
		 	<%
			int lastDay = today.getActualMaximum(Calendar.DATE);
		 	
		 	for(int d=1; d<=lastDay; d++){
		 		
		 		today.set(Calendar.DATE, d);
			 	
		 		boolean isToday = (today.get(Calendar.YEAR) == realToday.get(Calendar.YEAR))
			 					&&(today.get(Calendar.MONTH) == realToday.get(Calendar.MONTH))
			 					&&(d == realToday.get(Calendar.DATE));
		 		
		 		int date = today.get(Calendar.DAY_OF_WEEK);
		 	
		 		if(date==7){%>
		 			<td style="color: blue"><%=d %></td>
		 			</tr><tr>
		 	<% 	} else if(date==1) {%>
		 			<td style="color: red"><%=d %></td>
		 	<% 	} else if(isToday){%>
		 			<td bgcolor="yellow"><%=d %></td>
		 	<% 	} else {%>
		 			<td style="color: black"><%=d %></td>
		 	<%  }
		 	}
			int colspan2 = 7-today.get(Calendar.DAY_OF_WEEK);
		 	if(colspan2>0){%>
		 		<td colspan="<%=colspan2%>"></td>
		 	<%	
		 	}
		 	%>
		 	</tr>
		</table>

		<%
			int month = today.get(Calendar.MONTH);
			int year = today.get(Calendar.YEAR);
		%>
		<input type="hidden" name="todayMonth" value="<%=month %>" onclick="javascript: go()"/>
		<input type="hidden" name="todayYear" value="<%=year %>" onclick="javascript: go()"/>
	
	</form>
</body>
</html>