<%@page import="java.util.ArrayList"%>
<%@page import="dto.CarDto"%>
<%@page import="dao.CarDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Show One</title>

<script type="text/javascript">
	function goPage(num, page, sel) {
		if(sel == "delete"){
			if(!confirm("Do you want to delete it?")){
				return;
			}
			location.href = "/hw01/" + page + ".jsp?sel=" + sel + "&num=" + num;
		}else if(sel == "modify"){
			location.href = "/hw01/" + page + ".jsp?sel=" + sel + "&num=" + num;
		}
	}
</script>

</head>
<body>
	
	<%
	request.setCharacterEncoding("UTF-8");
	String rcv = request.getParameter("num");
	String name = request.getParameter("name");
	int num = Integer.parseInt(rcv);
	String sel = request.getParameter("sel");
	System.out.println("sel=" + sel);
	CarDao dao = null;
	CarDto dto = null;
	
	if(num>0){
		dao = new CarDao();
		dto = dao.selectOne(num);
	} else {
		dao = new CarDao();
		dto = dao.selectOne(name);
	}
	
	if(sel==null || sel.equals("detail") || sel.equals("modified")){
		if(sel !=null && sel.equals("modified")){
			
			System.out.println("modified");
			dao = new CarDao();
			dto = new CarDto();
			dto.setNum(num); 
			dto.setE_price(Integer.parseInt(request.getParameter("e_price")));
			dto.setT_price(Integer.parseInt(request.getParameter("t_price")));
			dto.setA_price(Integer.parseInt(request.getParameter("a_price")));
			dto.setOp_price(Integer.parseInt(request.getParameter("op_price")));
			dao.update(dto);
			
			dao = new CarDao();
			dto = dao.selectOne(dto.getNum());
		}
	%>
	<h2>More Information of The Car</h2><hr>
	<form action="/hw01/j03_selectOne.jsp" method="post" name="selecOne">
	<table border = "1" style="text-align: center;">
		<tr>
			<th colspan="10">
				<input type="button" value="Show List"
					onclick="javascript:location.href='/hw01/j02_selectAll.jsp'"/>
				<input type="button" value="Modify Information"
					onclick="javascript:goPage(<%=dto.getNum()%>, 'j03_selectOne', 'modify')"/>
				<input type="button" value="Delete Information"
					onclick="javascript:goPage(<%=dto.getNum()%>, 'j02_selectAll', 'delete')"/>
			</th>	
		<tr>
			<th>Number</th>
			<th>Name</th>
			<th>Manufacturer</th>
			<th>Serial Number</th>
			<th>Engine Price</th>
			<th>Tire Price</th>
			<th>AirConditioner Price</th>
			<th>Option</th>
			<th>Total</th>
			<th>SaveDate</th>
		</tr>
		<tr>
			<td><%=dto.getNum() %></td>
			<td><%=dto.getName() %></td>
			<td><%=dto.getMaker() %></td>
			<td><%=dto.getSerial() %></td>
			<td><%=dto.getE_price() %></td>
			<td><%=dto.getT_price() %></td>
			<td><%=dto.getA_price() %></td>
			<td><%=dto.getOp_price() %></td>
			<td><%=dto.getTotal() %></td>
			<td><%=dto.getSavdate() %></td>
		</tr>
	
	</form>
	<%
	} else if(sel.equals("modify")){
		num = Integer.parseInt(request.getParameter("num"));
		dao = new CarDao();
		dto = dao.selectOne(num);
	%>
	<h2>Modification of The Car</h2><hr>
	<form action="/hw01/j03_selectOne.jsp" method="get" name="selecOne">
	<table border = "1" style="text-align: center;">
		<tr>
			<th colspan="10">
				<input type="submit" value="Modify"/>
				<input type="hidden" name="sel" value="modified"/>
				<input type="hidden" name="num" value="<%=num %>"/>
			</th>	
		<tr>
			<th>Number</th>
			<th>Name</th>
			<th>Manufacturer</th>
			<th>Serial Number</th>
			<th>Engine Price</th>
			<th>Tire Price</th>
			<th>AirConditioner Price</th>
			<th>Option</th>
			<th>Total</th>
			<th>SaveDate</th>
		</tr>
		<tr>
			<td><%=dto.getNum() %></td>
			<td><%=dto.getName() %></td>
			<td><%=dto.getMaker() %></td>
			<td><%=dto.getSerial() %></td>
			<td>
				<input type="text" name="e_price" value="<%=dto.getE_price() %>"/>
			</td>
			<td>
				<input type="text" name="t_price" value="<%=dto.getT_price() %>"/>
			</td>
			<td>
				<input type="text" name="a_price" value="<%=dto.getA_price() %>"/>
			</td>
			<td>
				<input type="text" name="op_price" value="<%=dto.getOp_price() %>"/>
			</td>
			<td><%=dto.getTotal() %></td>
			<td><%=dto.getSavdate() %></td>
		</tr>
	
	</form>
	<%
	}
	%>

</body>
</html>