<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.sql.*" %>
    <%@page import="entity.People" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<%
		People peo = null;
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. Driver Load.");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "bbcc";
			String password ="bbcc";
			Connection conn =
					DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection Comp");
			
			String sql = "select * from t_peo where num=?";
			
			request.setCharacterEncoding("UTF-8");
			int search =
					Integer.parseInt(request.getParameter("search"));
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, search);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){ // num 검색이므로, while을 if 사용 가능
				peo = new People();
				peo.setNum(rs.getInt("num"));
				peo.setName(rs.getString("name"));
				peo.setAge(rs.getInt("age"));
			}
			
			rs.close();
			pstmt.close();
			conn.close();
					
			
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
	
	<%
		if(peo != null){
	%>
			번호 : <%=peo.getNum() %>,
			이름 : <%=peo.getName() %>, 나이 : <%=peo.getAge() %>
	<%
		} else {
	%>
			검색 대상이 존재하지 않습니다.
	<%
		}
	%>
	
	

</body>
</html>

















