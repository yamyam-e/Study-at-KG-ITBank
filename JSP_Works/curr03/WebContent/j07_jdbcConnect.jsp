<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
    <%@page import="java.util.ArrayList" %>
    <%@page import="entity.People" %>
    <%@page import="module.J07_JdbcConnector" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<%
		ArrayList<People> listc = null;
		
		try{
		// 	1. Connection
		
			Connection conn = J07_JdbcConnector.getConnection();
		// 	2. SQL executeQuery & executeUpdate
			String sql = "select * from t_peo";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			listc = new ArrayList<>();
			while(rs.next()){
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				People peo = new People(num, name, age);
				listc.add(peo);
			}
			
		// 	3. DB close
			conn.close();
		
			for(People each : listc) {
				System.out.println(each.toString());
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
	
	
	%>
	<h2>인사 정보 전체 보기</h2>


</body>
</html>