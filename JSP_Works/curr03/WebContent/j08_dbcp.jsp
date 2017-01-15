<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
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

	<%--
		DBCP(DataBase Connection Pool)
		- 미리 Connection 객체 생성 후 pool에 보관 -> 서버에서 대여 -> 서버에 반납
			커넥션 개수와 시간등을 설정 하는 것을..
		
		JNDI(Java Naming and Directory Interface)
		- 자바 이외의 파일에 이름을 지정하고 정보를 저장한 후,
			자바 소스 내에서 이르을 통해 이용하는 기술
		- 위치 : javax.naming 패키지
		
		DBCP 설정
		1. tomcat-dbcp 라이브러리 : tomcat -> lib
		2. server의 context.xml에 입력
		
			<Resource
	    	name ="jdbc/oracle"
			auth ="Container" 
			type ="javax.sql.DataSource"
			driverClassName="oracle.jdbc.driver.OracleDriver"
			url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"
			username = "bbcc"
			password = "bbcc"
			maxActive = "50"
			maxIdle = "50"
			maxWait = "-1"
			/>
			
			
			<Resource
	    	name ="jdbc/oracle"
			auth ="Container" 고정값
			type ="javax.sql.DataSource" 고정값
			driverClassName="oracle.jdbc.driver.OracleDriver"
			url = "jdbc:oracle:thin:@127.0.0.1:1521:xe" 아이피는 그때그때 달라요.
			username = "bbcc"
			password = "bbcc"
			maxActive = "50"
			maxIdle = "50" 
			maxWait = "-1" 대기시간 무한대
			/>
	
		3. 프로젝트의 web.xml 입력
		
		  <resource-ref>
		  	<description>Connection</description>
		  	<res-ref-name>jdbc/oracle</res-ref-name>
		  	<res-type>javax.sql.DataSource</res-type>
		  	<res-auth>Container</res-auth>
		  </resource-ref>
			
   
	 --%>
	 
	 <%
	 	ArrayList<People> listc = null;
	 
	 	try{
// 	 		작성법1
// 			Context initContext = new InitialContext();
// 			Context envContext 
// 				= (Context)initContext.lookup("java:/comp/env");
// 			DataSource dataSource =
// 					(DataSource)envContext.lookup("jdbc/oracle");
// 			Connection conn = dataSource.getConnection();

// 			작성법2
			Context initcoContext = new InitialContext();
			DataSource dataSource =
					(DataSource)initcoContext.lookup("java:/comp/env/jdbc/oracle");
			Connection conn = dataSource.getConnection();
			System.out.println("#### DBCP Connection Comp");
			
			String sql = "select * from t_peo";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				
				if(listc == null) listc = new ArrayList<>();
					
				People peo = new People();
				peo.setNum(rs.getInt("num"));
				peo.setName(rs.getString("name"));
				peo.setAge(rs.getInt("age"));
				listc.add(peo);
			
			}
	 		
	 		pstmt.close();
	 		conn.close();
	 		
	 	} catch(Exception e){
	 		e.printStackTrace();
	 	}
	 
	 %>
	
	<h2>인사 정보 전체 보기</h2>
	<table border="1" style="text-align: center">
         <tr>
            <td>번 호</td>
            <td>이 름</td>
            <td>나 이</td>
         </tr>
         
            <%
               for(int i=0; i<listc.size(); i++){
            %>
               <tr>
                  <td>
                     <input type="text" value=<%=listc.get(i).getNum() %>>
                  </td>
                  <td>
                     <input type="text" value=<%=listc.get(i).getName() %>>
                  </td>
                  <td>
                     <input type="text" value=<%=listc.get(i).getAge() %>>
                  </td>
               </tr>
            <%
               }
            %>
            
         
      </table>
	

</body>
</html>