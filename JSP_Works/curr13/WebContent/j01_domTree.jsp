<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>

	Dom 트리 구조와 명칭
	
	<document>
		<doc>
			<a>
				<b1 attr1="" attr2="">가</b1>
				<b2>나</b2>
				<b3>다</b3>
				<b4>라</b4>
			</a>
			<a>
				<c1>A</c1>
				<c2>B</c2>
				<c3>C</c3>
			</a>
		</doc>
	</document>
	
	- parent && child 프로퍼티 :
		- doc 노드의 ChildNodes(자식노드목록) : 첫번째a, 두번째a
			(NodeList 형태로 저장됨, length && item(인덱스) 제공)
		- childNode에 대한 이덱스는 0부터 시작
		- doc 노드의 firstChild Node : 첫번째a
		- doc 노드의 lastChild Node : 두번째a
		
	- previousSibing && nextSibing : 자식 노들간의 관계
		- b2 Node의 previousNode : b1
		- b2 Node의 nextNode : b3
	
	- ownerDocument : 해당 노드가 포함된 Document 객체
	
	- documentElement : 문서의 루트노드(첫번째 ChildNode)인 doc를 의미
			(HTML(!DOCTYPE html)의 documentElement는 html)
	
	- 엘리먼트 종류 별 nodeName과 nodeValeu
		- Document : nodeName(#document) / nodValue(null)
		- Element : nodeName(각 태그의 이름) / nodValue(null)
		- Text : nodeName(#text) / nodeValue(입력된 문자 정보)

-------------------------------------------------------------------------

	HTML 구조에 대한 Dom 트리
	
	<document>
		<html>
			<head>
				<title>제목 : 상품소개</title>
			</head>		
			<body>
				<h2>상품목록</h2>
				<div id="a">a</div>
				<div id="b">b</div>
				<div id="c">c</div>
				<div class="d">d</div>
				<div class="d">d</div>
				<div class="d">d</div>
			</body>			
		</html>
	</document>	
	
	
	- HTML 엘리먼트 지정자 : id && class
	
	- DOM 엘리먼트 검색
		- getElementsByTagName() : 
			지정한 이름의 태그에 해당하는 모든 엘리먼트들
		- getElementById() :
			지정한 id를 가진 엘리먼트
			
	- Attribute(태그 꺽새 안의 값들)에 대한 제어 함수
		- getAttibute(attrName)
			엘리먼트에 대하여 attrName에 해당하는 속성값을 구함
		- setAttribute(attrName, attrValue)
			엘리먼트에 대하여 attrName에 해당하는
			속성값 attrValue를 저장
		- removeAttribute(attrName)
			엘리먼트에 대하여 attrName을 삭제
			
	- ChildNode에 대한 제어 함수
		- insertBefore(newChildNode, refhChildNode) :
			현재 존재하는 refChildNode 앞(previousSibing)
			newChildNode를 삽입
		
		- replaceChild(newChildNode, oldChildNode) :
			현재 존재하는 oldChildNode를 newChildNode로 교체
			
		- removeChild(refChildNode) :
			현재 조냊하는 refChildNode를 제거
			
		- appendChild(newChildNode) :
			생성한 newChildNode를 지정한 노드의 마지막 노드의 노드로 추가
		

</body>
</html>
















