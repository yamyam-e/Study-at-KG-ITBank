<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.io.File"%>
<%@page import="java.awt.Graphics2D"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="javax.media.jai.JAI"%>
<%@page import="javax.media.jai.RenderedOp"%>
<%@page import="java.awt.image.renderable.ParameterBlock"%>
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

	<h2>썸네일 생성</h2>
	
	<%
	
		String filePath = "C:\\Users\\SeongkwonMac\\Desktop\\JSP_Works\\curr06\\WebContent\\zfiles";
		
		MultipartRequest mreq = new MultipartRequest(
									request, filePath, 1024*1024*30,
									"UTF-8", new DefaultFileRenamePolicy());
		
		String sysName = mreq.getFilesystemName("upfile");
		
// 		1. 이미지 가져오기 : ParameterBlock && RenderedOp
		ParameterBlock pb = new ParameterBlock();
		pb.add(filePath + "\\" + sysName);
		RenderedOp rop = JAI.create("fileload", pb);
		
// 		2. 새 이미지 생성
		BufferedImage bfimage = rop.getAsBufferedImage();

// 		3. 크기 설정 등
		int width = bfimage.getWidth()/3;
		int height = bfimage.getHeight()/3;
		
// 		4. ThumNail 객체 생성 및 그리기
		BufferedImage thumb =
				new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = thumb.createGraphics();
		g.drawImage(bfimage, 0, 0, width, height, null);
		
// 		5. 그려진 ThumbNail 파일 생성
		File thumbFile = new File(filePath + "\\thumb_" + sysName);
		String formatName = sysName.substring(sysName.lastIndexOf(".")+1);
		System.out.println("formatName = " + formatName);
		System.out.println("thumFile = " + thumbFile.getAbsolutePath());
		ImageIO.write(thumb, formatName, thumbFile);
		
		String thumbName = "thumb_" + sysName;
		
	%>
	
	<script type="text/javascript">
		alert("썸네일 파일 생성 완료");
		location.href = "/curr06/j16_thumb03.jsp?thumbName=<%= thumbName%>";
	</script>


</body>
</html>









