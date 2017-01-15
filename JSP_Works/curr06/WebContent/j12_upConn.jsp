<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<!-- 
		MulitpartRequest 생성자 인자값
		1. request
		2. 이미지를 저장할 서버에서의 경로
		3. 업로드를 허용할 파일의 최대 크기 예: 30 메가: 1024*1024*30
		4. request 정보의 인코딩 설정 - 파일 이름 및 파라미터 정보
		5. 옵션
			- 같은 이름의 파일이 업로드 되는 경우 새이름 지원하는 객체
				(DefaultFileRenamePolicy)
	 -->

	<%
	
// 		1. 실제 서버에 대한 경로 확인 : application과 realPath
		System.out.println(request.getParameter("upfile"));
		String realPath = application.getRealPath("/zfiles");
		System.out.println("realPath : " + realPath); 
// 		realPath : C:\Users\SeongkwonMac\Desktop\JSP_Works\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\curr06\zfiles

// 		2. 이클리스 이용 시 경로
		String filePath = "C:\\Users\\SeongkwonMac\\Desktop\\JSP_Works\\curr06\\WebContent\\zfiles";
		MultipartRequest mulreq = new MultipartRequest(
				request,
				filePath,
				1024*1024*30,
				"UTF-8",
				new DefaultFileRenamePolicy()
				);
		
		String msg = null;
		
		try{
			Context initContext = new InitialContext();
			DataSource dataSource = 
					(DataSource)initContext.lookup("java:/comp/env/jdbc/oracle");
			Connection conn = dataSource.getConnection();
			System.out.println("#### JDBC Comp");
			
			String sql = "insert into t_updown values(t_updown_seq.nextval, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
// 			multipart 인코딩 사용 시 request 직접 이용 안됨
			String title = mulreq.getParameter("title");
			String orgName = mulreq.getOriginalFileName("upfile");
			String sysName = mulreq.getFilesystemName("upfile");
			
			pstmt.setString(1, title);
			pstmt.setString(2, orgName);
			pstmt.setString(3, sysName);
			
			int res = pstmt.executeUpdate();
			msg = res > 0 ? "파일 정보 DB저장 완료" : "저장 실패";
			
			pstmt.close();
			conn.close();
			
		} catch(Exception e){
			e.printStackTrace();
		}
	
	%>
	<script type="text/javascript">
		alert("<%=msg%>");
		location.href = "/curr06/j13_selectAll.jsp";
	</script>
	

</body>
</html>