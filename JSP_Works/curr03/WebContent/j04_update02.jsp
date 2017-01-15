<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		String msg = null;
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. Driver Load.");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "bbcc";
			String password ="bbcc";
			Connection conn =
					DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection Comp");
			
			String sql =
					"update t_peo set name=?, age=? where num=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			request.setCharacterEncoding("UTF-8");
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			int selNum = Integer.parseInt(request.getParameter("selNum"));
			
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setInt(3, selNum);
			
			int res = pstmt.executeUpdate();
			msg = res > 0 ? "수정 완료" : "수정 실패";
			
			pstmt.close();
			conn.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
	%>
	<script type="text/javascript">
		alert("<%=msg %>");
		location.href="/curr03/j02_selectAll02.jsp";
	</script>

</body>
</html>














