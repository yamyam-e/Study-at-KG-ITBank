<%@page import="java.util.ArrayList"%>
<%@page import="dto.PeopleDTO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="module.jdbcConnector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
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
		
// 		out.println("<tr>"
// 				+	"<td>" + "번호" + "</td>"
// 				+	"<td>" + "이름" + "</td>"
// 				+	"<td>" + "나이" + "</td>"
// 				+"</tr>");
		
// 		for(PeopleDTO each : listc){
// 			out.println(
// 						"<tr>" 
// 						+	"<td>" + each.getNum() + "</td>"
// 						+	"<td>" + each.getName() + "</td>"
// 						+	"<td>" + each.getAge() + "</td>"
// 						+"</tr>");
// 		}
	
		request.setAttribute("listc", listc);
	%>
	
	<table border="1" style="text-align: center;">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>나이</td>
		</tr>
		<c:forEach var="each" items="${ listc }">
			<tr>
				<td>${ each.num }</td>
				<td>${ each.name }</td>
				<td>${ each.age }</td>
			</tr>
		</c:forEach>
	</table>
	
	
	