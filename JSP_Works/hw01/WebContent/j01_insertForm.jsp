<%@page import="dao.CarDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.CarOptionDto"%>
<%@page import="dao.CarOptionDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Main</title>

<script>
	function checkSerial() {
		var aaa = document.getElementById("serial").value;
		var url = "/hw01/j02_checkSerial.jsp?serial=" + aaa;
		window.open(url, "CheckSerial", "width=400, height=300");	
	}
	function getSelectValue(){
		frm.textValue.value = frm.selectBox.options[frm.selectBox.selectedIndex].text;
		frm.optionValue.value = frm.selectBox.options[frm.selectBox.selectedIndex].value;
	}
</script>

</head>
<body>

	<%
	request.setCharacterEncoding("UTF-8");		
	CarDao dao = new CarDao();
	ArrayList<String> listSerial = dao.getSerial();
	%>
	
	<h2>Car Information Program</h2><hr>
	<form action="/hw01/j02_selectAll.jsp" method="post" name="frm" >
	<table border="1" style="text-align: center;">
		<tr>
			<td colspan = "7">
				<input type="button" value="Check Duplicated Serial" required="required" onclick="checkSerial()"/>
				<input type="submit" value="Save"/>
				<input type="hidden" name="sel" value="insert"/>
			</td>
		</tr>
		<tr>
			<th>Name</td>
			<th>Manufacturer</th>
			<th>Serial Number</th>
			<th>Engine Price</th>
			<th>Tire Price</th>
			<th>AirConditioner Price</th>
			<th>Option</th>
		</tr>
		<tr>
			<td><input type="text" name="name" required="required"/>
			</td>
			<td><input type="text" name="maker" required="required"/>
			</td>
			<td><input type="text" name="serial" id="serial" required="required" onchange="checkSerial()"/>
			</td>
			<td><input type="text" name="e_price" required="required"/>
			</td>
			<td><input type="text" name="t_price" required="required"/>
			</td>
			<td><input type="text" name="a_price" required="required"/>
			</td>
			<td>
				<select name="selectBox" onchange="getSelectValue();">
					<%
					CarOptionDao opDao = new CarOptionDao();
					ArrayList<CarOptionDto> listc = opDao.getOptionByPrice();
					for(CarOptionDto each : listc){
					%>
					<option value="<%=each.getName()%>"><%=each.toString()%></option>
					<%
					}
					%>
				</select>
				<input type="hidden" name ="optionValue"/>
			</td>
		</tr>
	
	</table>
	</form>

</body>
</html>