<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="dto.FileDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<%
	
		ArrayList<FileDTO> listc = new ArrayList();
	
		try{
			Context initContext = new InitialContext();
			DataSource dataSource = 
					(DataSource)initContext.lookup("java:/comp/env/jdbc/oracle");
			Connection conn = dataSource.getConnection();
			System.out.println("#### JDBC Comp");
			
			String sql = "select * from t_updown order by num desc";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				FileDTO dto = new FileDTO();
				dto.setNum(rs.getInt("num"));
				dto.setTitle(rs.getString("title"));
				dto.setOrgName(rs.getString("orgName"));
				dto.setSysName(rs.getString("sysName"));
				
				listc.add(dto);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch(Exception e){
			e.printStackTrace();
		}
	
	%>
	
	<h2>파일 목록</h2>
	
	<table border="1" style="text-align: center;">
		<tr>
			<td colspan="6">
				<a href = "/curr06/j11_upForm.jsp">파일업로드</a>
			</td>
		</tr>
		<tr>
			<td>번 호</td>
			<td>제 목</td>
			<td>orgName</td>
			<td>sysName</td>
			<td>사진보기</td>
			<td> &nbsp;</td>
		</tr>
		
		<%
			if(listc.size()>0)
				for(FileDTO each : listc){
		%>
					<tr>
					<td><%=each.getNum() %></td>
					<td><%=each.getTitle() %></td>
					<td><%=each.getOrgName() %></td>
					<td><%=each.getSysName() %></td>
					<td>
					<%
						String sysName = each.getSysName();
						String exName =
								sysName.substring(sysName.lastIndexOf(".")+1);
						if(exName.equalsIgnoreCase("jpg") || exName.equalsIgnoreCase("png")){
					%>
							<img alt="파일로딩에러"
                            src="/curr06/zfiles/<%= each.getSysName() %>"
                            style="width: 200px; height: 150px">
					<%
						} else {
					%>
							문서화일
					<%
						}
					%>
					</td>
					<td>
						<a href="/curr06/j14_down.jsp?org=<%= each.getOrgName() %>&sys=<%= each.getSysName() %>"/>다운로드</a>
						<a href="/curr06/j15_del.jsp?num=<%= each.getNum() %>">삭제하기</a>
					</td>
					</tr>
		<%		
				}
		
		%>
	</table>
	

</body>
</html>