<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.sql.*" %>
    <%@page import="entity.People" %>
    <%@page import="java.util.ArrayList" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
	
		ArrayList<People> listc = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. Driver Load.");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "bbcc";
			String password ="bbcc";
			Connection conn =
					DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection Comp");
			
			String sql = "select * from t_peo order by num desc";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				
				if(listc == null){ listc = new ArrayList<>(); }
				
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				People peo = new People(num, name, age);
				listc.add(peo);
			}
			rs.close();
			pstmt.close();
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
	%>
	
	<h2>인사 전체 정보</h2>
	<table border="1" style="text-align: center;">
		<tr>
			<td>번 호</td>
			<td>이 름</td>
			<td>나 이</td>
			<%
				if(listc != null){
					for(People each : listc){ %>
					<tr>
					<td><%=each.getNum() %></td>
					<td><%=each.getName() %></td>
					<td><%=each.getAge() %></td>
					<tr>
					<%
					}
				} else {
			%>
				<tr>
					<td colspan="3">저장된 정보가 없습니다.</td>
				</tr>
			<%
				}
			%>
		</tr>
	</table>

</body>
</html>


















