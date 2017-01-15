<%@page import="java.io.File"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
	
		int num = Integer.parseInt(request.getParameter("num"));
		String msg = null;
		
		try{
			Context initContext = new InitialContext();
			DataSource dataSource = 
					(DataSource)initContext.lookup("java:/comp/env/jdbc/oracle");
			Connection conn = dataSource.getConnection();
			System.out.println("#### JDBC Comp");
			
			String sql = "select * from t_updown where num=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				String sysNanme = rs.getString("sysName");
				
//		 		- 이클립스 이용 시 경로
				String filePath = "C:\\Users\\SeongkwonMac\\Desktop\\JSP_Works\\curr06\\WebContent\\zfiles";

				File ff = new File(filePath + "\\" + sysNanme);
				if(ff.exists()){
					ff.delete();
				}
				
				sql = "delete from t_updown where num=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				int res = pstmt.executeUpdate();
				msg = res > 0 ? "삭제 완료" : "삭제 실패";
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e){
			e.printStackTrace();
		}
	%>
	<script type="text/javascript">
		alert("<%=msg%>");
		location.href = "/curr06/j13_selectAll.jsp";
	</script>
	

</body>
</html>