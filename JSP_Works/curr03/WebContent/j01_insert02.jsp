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
			
// 			1. Driver Load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. Driver Load Comp");
			
// 			2. DB Connection
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user ="bbcc";
			String password = "bbcc";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB Connection");
			
// 			3. SQL(insert) && executeUpdate && result(int)
			String sql = 
				"insert into t_peo values(t_peo_seq.nextval, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			request.setCharacterEncoding("UTF-8");
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			
			int res = pstmt.executeUpdate();
			msg = res > 0 ? "저장 완료" : "저장 실패";
			
// 			4. close
			pstmt.close();
			conn.close();
			
			
		} catch (Exception e){
			e.printStackTrace();
		}
	
	
	%>
	<script type="text/javascript">
		alert("<%= msg %>");
		location.href="/curr03/j01_insert01.jsp";
	</script>

</body>
</html>