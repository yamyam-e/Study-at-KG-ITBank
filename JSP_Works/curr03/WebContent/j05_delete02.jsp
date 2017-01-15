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
			
			String sql = "delete from t_peo where num=?";
			
			int selNum = Integer.parseInt(request.getParameter("selNum"));
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, selNum);
			
			int res = pstmt.executeUpdate();
			msg = res > 0 ? "삭제 완료" : "삭제 실패";
			
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