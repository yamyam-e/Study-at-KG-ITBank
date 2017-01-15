<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
	
	<table align="center">
		<tr>
			<td>
				<a onclick="getList('corp')">회사소개</a>
			</td>
			<td>
				<a onclick="getList('prod')">상품소개</a>
			</td>
		</tr>
		<tr>
			<td id="corpTd"></td>
			<td id="prodTd"></td>
		</tr>
	</table>
	

</body>
	
	<script type="text/javascript">
		
		var httpRequest = null;
		
		function getXMLHttpRequest(){ // 여기부터는 고정 코드 가져다 쓰면 됨
			if(window.ActiveXObject){ 
				try{
					return new ActiveXObject("Msxml12.XMLHTTP");
				} catch(e){
					try{
						return new ActiveXObject("Microsoft.XMLHTTP");
					} catch(e1){
						return null;
					}
				}
				
			} else if(window.XMLHttpRequest){
				return new XMLHttpRequest();
			} else {
				return;
			}
		}
		
		var target = null;
		
		function getList(sel){
			
			target = sel;
			
			httpRequest = getXMLHttpRequest();
			httpRequest.onreadystatechange = callback;
// 			=> callback 함수는 매개변수 이용 불가능
			var targetUrl = "/curr14/j03_view_" + target + "List.jsp";
			
			httpRequest.open("Get", targetUrl, true);
			httpRequest.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
			httpRequest.send(null);
			
		}
		
		function callback() {
	       
			if(httpRequest.readyState == 4){
	        
				if(httpRequest.status == 200){
	               
	               var menuList = httpRequest.responseText;
	               var corpTd = document.getElementById("corpTd");
	               var prodTd = document.getElementById("prodTd");
	               
	               if(target == "corp"){
	                  corpTd.innerHTML = menuList;
	                  prodTd.innerHTML = "";
	                  
	               }else if(target == "prod"){
	                  prodTd.innerHTML = menuList;
	                  corpTd.innerHTML = "";
	               }
	            
				}else{
	               alert("##### 실패 : " + httpRequest.status)
	            }
	         }
	      }
		
	</script>


</html>














