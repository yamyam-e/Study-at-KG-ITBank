<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>



</head>
<body>
	<aaa>
	<bbb>00000</bbb>11111
		
		<bbb id="a" msg="둘리">22222</bbb>
		<bbb id="b" msg="마이콜">33333</bbb>
		<bbb id="b" msg="도우너">44444</bbb>
		
		<bbb id="c" id="e" id="e" msg="희동이">많은 아이디</bbb>
		
		<bbb><ccc id="f" mid="아아">55555</ccc></bbb>
		
		<bbb>
			<ccc id="ff" mid="가가">66666</ccc>
		</bbb>
		
		<bbb value="cc"></bbb>
	</aaa>
	
	<aaa>
		<bbb>AAAAA</bbb>
		<bbb id="g">BBBBB</bbb>
	</aaa>
	
	<aaa style="display: none">메시지 X</aaa>
	<aaa id="show" style="display: ">메시지 O</aaa>
	<div id="divEx" style="border: 1px solid black;"></div>
	
	<br><br><br>
	<hr>
	
	1. 루트 노드
	<input type="button" value="루트이름" onclick="root01()"/>
	<script type="text/javascript">
		function root01(){
			var root = document.documentElement;
			alert("root 태그 이름 : " + root.tagName);
		}
	</script>
	
	<input type="button" value="루트의 Child태그들" onclick="root02()"/>
    <script type="text/javascript">
         function root02() {
            var root = document.documentElement;
            alert("child 존재 여부 : " + root.hasChildNodes());
            
            var rootChildList = root.childNodes;
            alert("child 갯수 : " + rootChildList.length);
            
            var msg = "";
            for(i=0; i<rootChildList.length; i++){
               msg += rootChildList.item(i).nodeName+"\n";
            }
            alert("root 태그의 엘리먼트 목록\n"+msg);
         }
    </script>
    <hr>
    
    2. body 노드
    <input type="button"
          value="body노드의 Child태그들(for)" onclick="body01()"/>
    <script type="text/javascript">
       function body01() {
          var root = document.documentElement;
          var rootChildList = root.childNodes;
          
          for(i=0; i<rootChildList.length; i++){
             if(rootChildList.item(i).nodeName == "BODY") {
                
                var bodyChildList = 
                   rootChildList.item(i).childNodes;
                alert("갯수 : " + bodyChildList.length);
                
                var msg = "";
                for(k=0; k<bodyChildList.length; k++){
                   msg += bodyChildList.item(k).nodeName + "\n";
                }
                alert("bodyChildList 목록\n" + msg);
             }
          }
       }
   	</script>
   
   	<input type="button"
           value="body 노드의 Child태그들(byTagName이용)" onclick="body02()"/>
   	<script type="text/javascript">
		function body02(){
			var bodyEles = document.getElementsByTagName("body");
			alert("bodyEles : " + bodyEles.item(0).nodeName);
			
			var bodyChildList = bodyEles.item(0).childNodes;
			alert("갯수 : " + bodyChildList.length);
			
			var msg = "";
			for(i=0; i<bodyChildList.length; i++){
				msg += bodyChildList.item(i).nodeName +"\n";
			}
			alert("bodyChildList 목록\n" + msg);
   		}
   	</script>
   	<hr>
   	
   	3. 첫번째 aaa 엘리먼트 노드 정보
    <input type="button" value="첫번째 aaa노드의 childNodes"
          onclick="aaa01()"/>
    <script type="text/javascript">
	     function aaa01() {
	        var aaaEles = document.getElementsByTagName("aaa");
	        var aaaEle = aaaEles.item(0);
	        var aaaChildList = aaaEle.childNodes;
	        
	        var msg = "";
	        for(i=0; i<aaaChildList.length; i++){
	           msg += i + "번째 노드\n"
	              + "- 이름 : "
	                 + aaaChildList.item(i).nodeName + "\n"
	              + "- 값 : "
	                 + aaaChildList.item(i).nodeValue + "\n\n"
	        }
	        alert("aaaChildList 목록\n" + msg);
	     }
    </script>
   	
   	<input type="button"
            value="첫번째 aaa노드의 firstChild" onclick="aaa02()"/>
      <script type="text/javascript">
         function aaa02() {
            var aaaEles = document.getElementsByTagName("aaa");
            var firstaaa = aaaEles.item(0);
            var firstaaaFirstChild = firstaaa.firstChild;
            
            var msg = 
               "firstChild 노드 - 이름 : "
                  + firstaaaFirstChild.nodeName + ", "
               + "값 : " + firstaaaFirstChild.nodeValue;
            alert(msg);
         }
     </script>      
     <hr>
	
	4. bbb 엘리먼트 노드
	<input type="button" value="bbb태그들(ByTagName)"
	      onclick="bbb01()"/>
	<script type="text/javascript">
	   function bbb01() {
	      var bbbEles = document.getElementsByTagName("bbb");
	      alert("갯수 : " + bbbEles.length);
	      
	      var msg = "";
	      for(i=0; i<bbbEles.length; i++){
	         msg += i + "번째 bbb \n"
	         + "- attribute 유무 : "
	            + bbbEles.item(i).hasAttributes() + "\n"
	         + "- nodeValue = "
	            + bbbEles.item(i).nodeName + "\n"
	         + "- childNodes 유무 : "
	            + bbbEles.item(i).hasChildNodes() + "\n";
	            
	            if(bbbEles.item(i).hasChildNodes() == true) {
	               msg +=
	                  "------- 첫번째 childNode의 nodeName : "
	                   + bbbEles.item(i).childNodes.item(0).nodeName
	                   + "\n"
	                  + "------ 첫번째 childNode의 nodeValue : "
	                   + bbbEles.item(i).childNodes.item(0).nodeValue
	                   + "\n\n";
	            }else{
	               msg += "\n";
	            }
	      }
	      alert("bbbList 목록\n" + msg);
	   }
	</script>      
    <hr>
    
    
    5. id 이용
    <input type="button" value="id가 a인 노드(ById)" onclick="id01()"/>
    <script type="text/javascript">
    	function id01(){
    		var nodeId = document.getElementById("a");
    		var msg = 
                "- id attribute 값 = "
                   + nodeId.getAttribute("id") + "\n" +
                "- msg attr 유무 = "
                   + nodeId.hasAttribute("msg") + "\n" +
                "- data attr 유무 = "
                   + nodeId.hasAttribute("data") + "\n" +
                "- msg attr 값 = "
                   + nodeId.getAttribute("msg") + "\n" +
                "- 첫번째 childNode의 nodeName = "
                   + nodeId.childNodes.item(0).nodeName + "\n" +
                "- 첫번째 childNode의 nodeValue = "
                   + nodeId.childNodes.item(0).nodeValue;
             alert(msg);
    	}
    </script>
    
    <input type="button" value="[중복id] id가 b인 노드(ById)" onclick="id02()"/>
    <script type="text/javascript">
    	function id02(){
    		var nodeId = document.getElementById("b");
    		var msg = 
                "- id attribute 값 = "
                   + nodeId.getAttribute("id") + "\n" +
                "- msg attr 유무 = "
                   + nodeId.hasAttribute("msg") + "\n" +
                "- data attr 유무 = "
                   + nodeId.hasAttribute("data") + "\n" +
                "- msg attr 값 = "
                   + nodeId.getAttribute("msg") + "\n" +
                "- 첫번째 childNode의 nodeName = "
                   + nodeId.childNodes.item(0).nodeName + "\n" +
                "- 첫번째 childNode의 nodeValue = "
                   + nodeId.childNodes.item(0).nodeValue;
             alert(msg);
    	}
    </script>
    
    <input type="button" value="[여러개id] id가 c,d,e인 노드(ById)" onclick="id03()"/>
    <script type="text/javascript">
    	function id03(){
    		var nodeId = document.getElementById("c");
    		var msg = 
                "- id attribute 값 = "
                   + nodeId.getAttribute("id") + "\n" +
                "- msg attr 유무 = "
                   + nodeId.hasAttribute("msg") + "\n" +
                "- data attr 유무 = "
                   + nodeId.hasAttribute("data") + "\n" +
                "- msg attr 값 = "
                   + nodeId.getAttribute("msg") + "\n" +
                "- 첫번째 childNode의 nodeName = "
                   + nodeId.childNodes.item(0).nodeName + "\n" +
                "- 첫번째 childNode의 nodeValue = "
                   + nodeId.childNodes.item(0).nodeValue;
             alert(msg);
    	}
    </script>
    <hr>
    
    
    6. 노드 제어(id가 show인 대상의 attribute 변경)
    <input type="button" value="id가 show인 노드의 메시지 O 숨기기"  onclick="displayNone()"/>
    <script type="text/javascript">
    	function displayNone(){
    		var target = document.getElementById("show");
    		alert("target의 style 속성 >> " + target.getAttribute("style"));
    		
    		target.setAttribute("style", "display: none");
    		alert("target의 style 속성 >> " + target.getAttribute("style"));
    		
//     		다음 명령 형식도 가틍
// 			target.style.display = "none";
    	}
    </script>
    <br>
    문제 : 위에서 사라진 id가 show인 노드의 메시지를 다시 보이기
    <input type="button" value ="위에서 사라진 id가 show인 노드의 메시지를 다시 보이기" onclick="displayOn()"/>
    <script type="text/javascript">
    	function displayOn(){
    		var target = document.getElementById("show");
    		target.setAttribute("style", "display:" );
    	}
    </script>
    <br>
    
    문제 : div의 선 굵기와 색 바꾸기
    <input type="button" value="div의 선 굵기와 색 바꾸기" onclick="changeDiv()"/>
    <script type="text/javascript">
    	function changeDiv(){
    		var target = document.getElementById("divEx");
    		target.setAttribute("style", "border: 10px solid red;");
    	}
    </script>
   	
   	
   	
   	
   	
</body>
</html>































