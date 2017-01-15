<%@page import="dto.StudentDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	<style type="text/css">
	.tg  {border-collapse:collapse;border-spacing:0;}
	.tg td{font-family:Arial, sans-serif;font-size:14px;padding:4px 20px;border-style:solid;border-width:0px;overflow:hidden;word-break:normal;border-top-width:1px;border-bottom-width:1px;}
	.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:4px 20px;border-style:solid;border-width:0px;overflow:hidden;word-break:normal;border-top-width:1px;border-bottom-width:1px;}
	.tg .tg-h510{font-style:italic;font-size:12px;font-family:"Lucida Console", Monaco, monospace !important;;background-color:#32cb00;color:#ffffff;text-align:center;vertical-align:center}
	.tg .tg-es4k{font-weight:bold;font-style:italic;font-size:14px;font-family:"Lucida Console", Monaco, monospace !important;;background-color:#036400;color:#ffffff;text-align:center;vertical-align:middle}
	.tg .tg-frtr{font-style:italic;font-size:14px;font-family:"Lucida Console", Monaco, monospace !important;;text-align:center;vertical-align:bottom}
	</style>
	
	<script type="text/javascript">
		function getOrderByValue() {
			var aaa = document.getElementById("orderBy").value;
			location.href = "/school/student/selectAll.jsp?order=" + aaa;
			document.frm.submit();
		}
		function getShowBan(){
			var bbb = document.getElementById("showBan").value;
			location.href = "/school/student/selectAll.jsp?order=" + bbb;
			document.frm.submit();
		}
		function getSearchName() {
			var ccc = document.getElementById("writtenName").value;
			location.href = "/school/student/selectOne.jsp?num=0&name=" + ccc;
			document.frm.submit();
		}
	</script>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
		ArrayList<StudentDTO> listc = (ArrayList<StudentDTO>)request.getAttribute("selectList");
		request.setAttribute("selectList", listc);
	%>
	<form action="" method="post" name="frm">
	<br>
	<table class="tg">
	  <tr>
	    <th class="tg-frtr" colspan="10">학생 성적 보기</th>
	  </tr>
	  <tr>
	  	<td colspan="10" align="center">
	  		<a href="/school/student/insertForm.jsp" class="bt">입력하기</a>
	  		<select id="orderBy" onchange="javascript: getOrderByValue()">
	  			<option value="">--- 성적순보기 ---</option>
				<option value="asc">오름차순</option>
				<option value="desc">내림차순</option>
			</select>
	  		<select id="showBan" onchange="javascript: getShowBan()">
				<option value="">--- 반별보기 ---</option>
				<c:forEach var="each" items="listcDistinct" >
					<option value="${ each }">${ each }</option>
				</c:forEach>
			</select>
	  		<input type="text" id="writtenName" width="100"  onchange="javascript: getSearchName()" />
			<input type="button" class="bt" value="searchName"/>
	  	</td>
	  </tr>
	  <tr>
	    <td class="tg-es4k">사진</td>
	    <td class="tg-es4k">번호</td>
	    <td class="tg-es4k">학년</td>
	    <td class="tg-es4k">반</td>
	    <td class="tg-es4k">이름</td>
	    <td class="tg-es4k">국어</td>
	    <td class="tg-es4k">영어</td>
	    <td class="tg-es4k">수학</td>
	    <td class="tg-es4k">총점</td>
	    <td class="tg-es4k">평균</td>
	  </tr>
	  <c:choose>
	  	<c:when test="${ !empty listc }">
	  		<c:forEach var="each" items="${ selectList }">
			  <tr>
			   	<td class="tg-h510">
			    	<c:choose>
			    		<c:when test="${ each.exName eq 'jpg' || each.exName eq 'png' || each.exName eq 'jpeg' ||
			    						 each.exName eq 'bmp' || each.exName eq 'gif'}">
			    			<img alt="파일로딩 에러" src="/mySchool/zfiles/${ each.sysName }" style="width:40px; height:40px;"/>
			    		</c:when>
			    		<c:otherwise>
			    			문서 화일입니다.
			    		</c:otherwise>
			    	</c:choose>
			    </td>
			    <td class="tg-h510">${ each.num }</td>
			    <td class="tg-h510">${ each.grade }</td>
			    <td class="tg-h510">${ each.ban }</td>
			    <td class="tg-h510">
			    	<a href="/mySchool/stu/updateInfo?num=${ each.num }">${ each.name }</a>
			    </td>
			    <td class="tg-h510">${ each.kor }</td>
			    <td class="tg-h510">${ each.eng }</td>
			    <td class="tg-h510">${ each.math }</td>
			    <td class="tg-h510">${ each.total }</td>
			    <td class="tg-h510">${ each.avg }</td>
			  </tr>
	  		</c:forEach>
	  	</c:when>
	  	<c:otherwise>
	  		<tr><td colspan="10"></td><tr>
	  	</c:otherwise>
	  </c:choose>
	  
	</table>
	</form>
</body>
</html>