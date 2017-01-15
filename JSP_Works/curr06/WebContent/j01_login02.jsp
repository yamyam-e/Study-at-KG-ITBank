<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String msg = null;
		
		try{
			Context initContext = new InitialContext();
			DataSource dataSource =
					(DataSource)initContext.lookup("java:/comp/env/jdbc/oracle");
			Connection conn = dataSource.getConnection();
			System.out.println("####JDBC Comp");
			
			String sql = "insert into t_log values (?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			int res = pstmt.executeUpdate();
			msg = res > 0 ? "저장 성공" : "저장 실패";
		
			pstmt.close();
			conn.close();
			
		} catch (Exception e){
			e.printStackTrace();
		}
	%>	
	<script type="text/javascript">
		alert("<%=msg%>");
		location.href = "/curr06/j01_login01.jsp";
	</script>
</body>
</html>