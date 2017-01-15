<%@page import="dto.CarOptionDto"%>
<%@page import="dao.CarOptionDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.CarDto"%>
<%@page import="dao.CarDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Show List</title>
	<script type="text/javascript">
		function getOrderByValue() {
			var aaa = document.getElementById("orderBy").value;
			location.href = "/hw01/j02_selectAll.jsp?order=" + aaa;
		}
		function getShowMaker(){
			var bbb = document.getElementById("showMaker").value;
			location.href = "/hw01/j02_selectAll.jsp?order=" + bbb;
		}
		function getSearchName() {
			var ccc = document.getElementById("writtenName").value;
			location.href = "/hw01/j03_selectOne.jsp?num=0&name=" + ccc;
		}
	</script>
</head>
<body>

	<%	
	request.setCharacterEncoding("UTF-8");
	String sel = request.getParameter("sel");
	String order = null;
	CarDao dao = new CarDao();
	ArrayList<String> listcDistinct = dao.getDistinct();
	ArrayList<CarDto> listc = null;
	CarDto dto = null;
	
	if(sel == null){
		
		order = request.getParameter("order");
		listc = dao.selectAll(order);
		
	} else if(sel.equals("insert")){
		
		String name = request.getParameter("name");
		String maker = request.getParameter("maker");
		String serial = request.getParameter("serial");
		String e_price = request.getParameter("e_price");
		String t_price = request.getParameter("t_price");
		String a_price = request.getParameter("a_price");
		String op_name = request.getParameter("selectBox");
		op_name = op_name.replace("+", " ");
		
		System.out.println("op_name= " + op_name);
		CarOptionDao opDao = new CarOptionDao();
		CarOptionDto opDto = opDao.selectOne(op_name);
		
		dto = new CarDto();
		dto.setName(name);
		dto.setMaker(maker);
		dto.setSerial(serial);
		dto.setE_price(Integer.parseInt(e_price));
		dto.setT_price(Integer.parseInt(t_price));
		dto.setA_price(Integer.parseInt(a_price));
		dto.setOp_name(op_name);
		dto.setOp_price(opDto.getPrice());
		dao.insertOne(dto);
		
		dao = new CarDao();
		listc = dao.selectAll();
		
	} else if(sel.equals("delete")) {

		String rcv = request.getParameter("num");
		int num = Integer.parseInt(rcv);
		String msg = dao.delete(num);
		sel = null;
		dao = new CarDao();
		listc = dao.selectAll();
	}
	%>
	
	<h2>Show Car List</h2><hr>
	<form action="/hw01/j02_selectAll.jsp" method="post" name="selecAll" id="selectAll" >
	<table border="1" style="text-align: center;">
		<tr>
		<%
			if(order != null && order.equals("Show Option")){
			%>
			<th colspan="4">
			<%
			} else {
			%>
			<th colspan="5">
			<%
			}
		%>
			<input type="button" value="InsertForm" 
						onclick="javascript:location.href='/hw01/j01_insertForm.jsp'"/>
			<select id="orderBy" onchange="getOrderByValue(this.frm);">
				<option value="">--- Order by ---</option>
				<option value="Order by Low Price">Low Price</option>
				<option value="Show Option">Show Option</option>
			</select>
			<select id="showMaker" onchange="getShowMaker(this.frm)">
				<option value="">--- Show maker ---</option>
				<%
				for(String each : listcDistinct){					
				%>
				<option value="<%=each %>"><%=each %></option>
				<%
				}
				%>
			</select>
			<input type="text" id="writtenName" width="100"  onchange="getSearchName();" />
			<input type="button" value="searchName"/>
		</th>
		<tr>
			<th>Name</th>
			<th>Manufacturer</th>
			<%if(order != null && order.equals("Show Option")) {%>
			<th>Option</th>
			<%} %>
			<th>Total</th>
			<th>SaveDate</th>
		</tr>
		<%
		if(listc != null){
			for(CarDto each : listc){
		%>
		<tr>
			<td>
				<a href="/hw01/j03_selectOne.jsp?num=<%=each.getNum()%>&sel=detail"><%=each.getName() %></a>
			</td>
			<td><%=each.getMaker() %></td>
			<%
			if(order != null && order.equals("Show Option")){
			%>
			<td><%=each.getOp_name() %></td>
			<%
			}
			%>
			<td><%=each.getTotal() %></td>
			<td><%=each.getSavdate() %></td>
		</tr>
		<%
			}
			
		} else {
		%>
		<tr>
			<td colspan="5">No Data</td>
		</tr>
	<%
		}
	%>
		</table>
	</form>
</body>
</html>










