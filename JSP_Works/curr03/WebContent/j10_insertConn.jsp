<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="module.JdbcConnector"%>
<%@page import="entity.People"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>인사 정보 목록</h2>
	
	<%
		request.setCharacterEncoding("UTF-8");
		String msg = null;
		
		try{
			Connection conn = JdbcConnector.getConnection();
			String sql = "insert into t_peo values(t_peo_seq.nextval, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			
			int res = pstmt.executeUpdate();
			
			JdbcConnector.close(conn, pstmt);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
	%>
	<script type="text/javascript">
		alert("<%=msg%>");
		location.href = "/curr03/j11_selectAll.jsp";
	</script>

</body>
</html>