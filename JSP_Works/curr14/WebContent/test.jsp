<%@page import="java.util.ArrayList"%>
<%@page import="dto.PeopleDTO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="module.jdbcConnector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  /* Note: Try to remove the following lines to see the effect of CSS positioning */
  .affix {
      top: 0;
      width: 100%;
  }

  .affix + .container-fluid {
      padding-top: 70px;
  }
  </style>
</head>
<body>

<%

	request.setCharacterEncoding("UTF-8");
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	ArrayList<PeopleDTO> listc = new ArrayList<>();
	try{
	
	conn = jdbcConnector.getConnection();
	String sql = "select * from t_peo";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
	while(rs.next()){
		PeopleDTO dto = new PeopleDTO();
		dto.setNum(rs.getInt("num"));
		dto.setName(rs.getString("name"));
		dto.setAge(rs.getInt("age"));
		listc.add(dto);
	}
	
	
	} catch (Exception e){
		e.printStackTrace();
	} finally {
		jdbcConnector.close(conn, pstmt, rs);
	}

	request.setAttribute("listc", listc);

%>

<div class="container-fluid" style="background-color:#F44336;color:#fff;height:200px;">
  <h1>Bootstrap Affix Example</h1>
  <h3>Fixed (sticky) navbar on scroll</h3>
  <p>Scroll this page to see how the navbar behaves with data-spy="affix".</p>
  <p>The navbar is attached to the top of the page after you have scrolled a specified amount of pixels.</p>
</div>

<nav class="navbar navbar-inverse" data-spy="affix" data-offset-top="197">
  <ul class="nav navbar-nav">
    <li class="active"><a href="#">Basic Topnav</a></li>
    <li><a href="#">번호</a></li>
    <li><a href="#">이름</a></li>
    <li><a href="#">나이</a></li>
  </ul>
</nav>

<table class="container-fluid" style="height:1000px">
 	
 	<c:forEach var="each" items="${ listc }">
 		<tr>
 			<td>${ each.num }</td>
 			<td>${ each.name }</td>
 			<td>${ each.age }</td>
 		</tr>
 	</c:forEach>
 	
</table>

</body>
</html>

