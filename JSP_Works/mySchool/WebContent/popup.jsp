<%@page import="dto.TeacherDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>

	<style type="text/css">
	.bt {
		-moz-box-shadow: inset 0px 1px 0px 0px #c1ed9c;
		-webkit-box-shadow: inset 0px 1px 0px 0px #c1ed9c;
		box-shadow: inset 0px 1px 0px 0px #c1ed9c;
		background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #9dce2c
			), color-stop(1, #8cb82b));
		background: -moz-linear-gradient(center top, #9dce2c 5%, #8cb82b 100%);
		filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#9dce2c',
			endColorstr='#8cb82b');
		background-color: #9dce2c;
		-webkit-border-top-left-radius: 37px;
		-moz-border-radius-topleft: 37px;
		border-top-left-radius: 37px;
		-webkit-border-top-right-radius: 0px;
		-moz-border-radius-topright: 0px;
		border-top-right-radius: 0px;
		-webkit-border-bottom-right-radius: 37px;
		-moz-border-radius-bottomright: 37px;
		border-bottom-right-radius: 37px;
		-webkit-border-bottom-left-radius: 0px;
		-moz-border-radius-bottomleft: 0px;
		border-bottom-left-radius: 0px;
		text-indent: 0;
		border: 1px solid #83c41a;
		display: inline-block;
		color: #ffffff;
		font-family: Times New Roman;
		font-size: 13px;
		font-weight: bold;
		font-style: italic;
		height: 30px;
		line-height: 30px;
		width: 149px;
		text-decoration: none;
		text-align: center;
		text-shadow: 1px 1px 0px #689324;
	}
	
	.bt:hover {
		background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #8cb82b
			), color-stop(1, #9dce2c));
		background: -moz-linear-gradient(center top, #8cb82b 5%, #9dce2c 100%);
		filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#8cb82b',
			endColorstr='#9dce2c');
		background-color: #8cb82b;
	}
	
	.bt:active {
		position: relative;
		top: 1px;
	}
	</style>

</head>
<body>

	<%
		TeacherDTO dto = (TeacherDTO)session.getAttribute("nowLogin");
		String name = dto.getName();
		String grade = dto.getGrade();
		String ban = dto.getBan();
		int numOfStu = dto.getNumOfStu();
	%>

	<div align="center">
		<div align="left" style="width:200px;">
			<h3 align="left" style="font-family:굴림체;font-size:18px;font-style:normal;font-weight:normal;color:#006666;height: 300px;">
				<br>
				<br>
				<br>
				<%=grade%>-<%=ban %>반 현황 안내<br>
				담임 : <%=name %> 선생님<br>
				총원 : <%=numOfStu %> 명
			</h3>
		</div>
	</div>
	
	<div align="center" style="background-color: white;font-family:굴림체;font-size:14px;font-style:normal;font-weight:normal;color:#ffffff;heigth:60px">
		<input type="button" class="bt" value="닫기" onclick="javascript:self.close()"/>
		<input type="button" class="bt" value="10초동안 보이지않기" onclick="javascript:noView()"/>	
	</div>
	<script type="text/javascript">
		function noView(){
			location.href="/mySchool/popNew.jsp";
		}
	</script>	

</body>
</html>