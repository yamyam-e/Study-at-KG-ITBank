<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div align="center">
	<img alt="" src="/wedding/resources/gift/gift_back02.jpg" align="middle">
</div>
<div class="col-sm-16" style="background-color: FloralWhite; height: 3px;"></div>
<jsp:include page="/WEB-INF/views/menu/gift/gift_payCard_Modal.jsp"/>
<div class="container">
	<h3 style="font-style: inherit; color: olive;">
		${ name } 님의 레지스트리 목록
		<img alt="" src="/wedding/resources/gift/gift_icon02.png">
	</h3>
	<h4>
		<c:forEach var="each" items="${ regSelectListCart }">
   	 		<c:if test="${ each.paycheck== null }">
   	 			<c:set var="sum_quantity" value="${sum_quantity + each.buyquantity}"/>
   	 			<c:set var="sum_price" value="${sum_price + each.price}"/>
   	 			<c:set var="sum_total" value="${sum_total + each.total}" />
   	 		</c:if>
   	 	</c:forEach>
		총 수량 : 
		<c:out value="${sum_quantity}"/>&nbsp;
		총 가격 : 
		<c:out value="${sum_price }"/> 원&nbsp;	
		total : 
		<c:out value="${sum_total }"/> 원&nbsp;
		포인트 :
		<c:out value="${totalPoint }"/> 포인트&nbsp;
		<button type="submit" class="btn btn-danger" onclick="javascript:regPayCardModalSome()"
			style="background-color: LightBlue; color: DarkSlateGrey;">
			<img alt="" src="/wedding/resources/gift/gift_icon06.png">
			부분결제
		</button>
	</h4>
	<br>
	<form name="frm">
	<table class="table table-hover">
		<thead style="background-color: AliceBlue">
      		<tr style="color: black;">
        		<th>이름</th>
        		<th>수량</th>
        		<th>가격</th>
        		<th>총 가격</th>
        		<th>종류</th>
        		<th>수정 / 결재</th>
      		</tr>
   	 	</thead>
   	 	<tbody style="color: navy;">
	   	 	<c:choose>
	   	 		<c:when test="${ regSelectListCart != null }">
	   	 			<c:forEach var="each" items="${ regSelectListCart }">
	   	 				<tr>
			   	 			<td>
			   	 				<strong>
			   	 				${ each.name }
			   	 				</strong>
			   	 			</td>
			   	 			<td>${ each.buyquantity }</td>
			   	 			<td>${ each.price } 원</td>
			   	 			<td>${ each.total } 원</td>
			   	 			<td>${ each.category }</td>
			   	 			<td>
			   	 				<c:if test="${ each.paycheck=='ok' }">
			   	 					　　출고예정 중&nbsp;
			   	 					<img alt="" src="/wedding/resources/gift/gift_icon04.png">
			   	 				</c:if>
			   	 				<c:if test="${ each.paycheck== null }">
				   	 				<button type="button" class="btn btn-warning" onclick="javascript:regDeleteCart('${each.num}')"
				   	 					style="background-color: PowderBlue;color: DarkSlateGrey;">
				   	 					<span class="glyphicon glyphicon-floppy-remove"></span>
				   	 					삭제
				   	 				</button>　
				   	 				<button type="button" class="btn btn-warning" onclick="javascript:regPayCardModalOne('${each.num}')" 
				   	 					style="background-color: PowderBlue;color: DarkSlateGrey;" >
	   	 								<img alt="" src="/wedding/resources/gift/gift_icon03.png">
	   	 								단품결제
	   	 							</button>
			   	 				</c:if>
			   	 				
			   	 			</td>
			   	 		</tr>
	   	 			</c:forEach>
	   	 		</c:when>
	   	 		<c:otherwise>
	   	 			<tr>
	   	 				<td colspan="6">
	   	 					레지스트리가 비었습니다.
	   	 				</td>
	   	 			</tr>
	   	 		</c:otherwise>
	   	 	</c:choose>	
   	 	</tbody>
   	 	<tfoot style="color: DimGray;">
   	 		<tr>
   	 			<td colspan="6"></td>
   	 		<tr>
   	 	</tfoot>
	</table>
	</form>
</div>

<jsp:include page="reg_payCard_Modal.jsp" />