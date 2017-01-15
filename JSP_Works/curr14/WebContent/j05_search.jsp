<%@ page language="java" contentType="text/html; charset=UTF-8" 
   pageEncoding="UTF-8"%>
   
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
	<head><meta charset="UTF-8"><title>Insert Title</title>
      
    	<c:set var="httpRequest_js" value="/curr14/files_js/httpRequest.js"/>
    	<script type="text/javascript" src="${ httpRequest_js }"></script>
    	
  	</head>
	
	<body align="center">
   
   	<h2>단어검색</h2>
   	<div>
      	<input type="text" id="search" onkeyup="searchKey()"/> <br>
	 	<%-- onkeyup : 키를 눌렀다가 뗄 때 해당 함수 작동 --%>
	
		<div id="preView" style="display: ">
        <div id="preViewList"></div>
      	</div>
   </div>   
   
</body>
   
      <script type="text/javascript">
         function searchKey() {
            var target = document.getElementById("search");
            var searchParams = target.value.trim();
            var nowKeyLength = searchParams.length;
            var preView = document.getElementById("preView");
               preView.style.display = "";
               
            if(searchParams == "" || nowKeyLength == 0){
               if(nowKeyLength == 0){
                  preView.style.display = "none";
               }
               return;
            }
//             => 단어 삭제 상황
            var params = "key=" + encodeURIComponent(searchParams);
            sendRequest("/curr14/j05_DBdata.jsp", params, callback, "post");
         }
         
         function callback() {
            if(httpRequest.readyState == 4){
               if(httpRequest.status == 200){
                  var rcvData = httpRequest.responseText;
                  var preViewList = document.getElementById("preViewList");
                  preViewList.innerHTML = rcvData;
               
               }else{
                  alert("##### 실패 : " + httpRequest.status);
               }
            }
            
         }
      </script>
</html>