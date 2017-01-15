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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String msg = null;
		
		try{
			Context initContext = new InitialContext();
			DataSource dataSource =
					(DataSource)initContext.lookup("java:/comp/env/jdbc/oracle");
			Connection conn = dataSource.getConnection();
			String sql = "select * from t_log where id=? and pw=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				msg = id + "님 환영합니다.";
				
// 				세션 세팅
				session.setAttribute("nowLogin", id);

			} else {
				msg = "비밀번호가 일치하지 않습니다.";
			}
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch(Exception e){
			e.printStackTrace();
		}
	
	%>
	<script type="text/javascript">
		alert("<%=msg%>");
	</script>
	<a href="/curr06/j01_login04.jsp">
			로그인 회원만 이용 가능한 페이지로 이동하기</a>
	
</body>
</html>