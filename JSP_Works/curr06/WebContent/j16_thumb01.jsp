<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
	<!-- 
		파일 이름
		- j16_thumb01.jsp
		- j16_thumb02.jsp
		- j16_thumb03.jsp
		
		1. 썸네일 파일 생성
			- 편집용 이미지
			- 원본 이미지는 보존됨
		2. jai-codec.jar && jai-core.jar 필요
			- http://www.java2s.com/code/jar/j/Downloadjaicodec113jar.htm
				(www.java2s.com -> basic -> jar File DownLoad - 검색
	 -->
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	<h2>이미지 업로드</h2>
	
	<form action="/curr06/j16_thumb02.jsp" method="post" enctype="multipart/form-data">
		<table border="1" style="text-align: center;">
			<tr>
				<td>사진 선택</td>
				<td>
					<input type="file" name="upfile"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="서버에 전송"/>				
				</td>
			</tr>
		</table>
	</form>
	

</body>
</html>