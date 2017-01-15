<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
.datagrid table {
	border-collapse: collapse;
	text-align: left;
	width: 100%;
}

.datagrid {
	font: normal 12px/150% Arial, Helvetica, sans-serif;
	background: #fff;
	overflow: hidden;
	border: 1px solid #00AAFF;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
	border-radius: 3px;
}

.datagrid table td, .datagrid table th {
	padding: 3px 10px;
}

.datagrid table thead th {
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #008DD4
		), color-stop(1, #00ABFF));
	background: -moz-linear-gradient(center top, #008DD4 5%, #00ABFF 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#008DD4',
		endColorstr='#00ABFF');
	background-color: #008DD4;
	color: #FFFFFF;
	font-size: 15px;
	font-weight: bold;
	border-left: 1px solid #00AAFF;
}

.datagrid table thead th:first-child {
	border: none;
}

.datagrid table tbody td {
	color: #00496B;
	border-left: 1px solid #E1EEF4;
	font-size: 12px;
	font-weight: normal;
}

.datagrid table tbody .alt td {
	background: #E1EEF4;
	color: #00496B;
}

.datagrid table tbody td:first-child {
	border-left: none;
}

.datagrid table tbody tr:last-child td {
	border-bottom: none;
}

.datagrid table tfoot td div {
	border-top: 1px solid #00AAFF;
	background: #E1EEF4;
}

.datagrid table tfoot td {
	padding: 0;
	font-size: 12px
}

.datagrid table tfoot td div {
	padding: 2px;
}

.datagrid table tfoot td ul {
	margin: 0;
	padding: 0;
	list-style: none;
	text-align: center;
}

.datagrid table tfoot  li {
	display: inline;
}

.datagrid table tfoot li input {
	text-decoration: none;
	display: inline-block;
	padding: 2px 8px;
	margin: 1px;
	color: #FFFFFF;
	border: 1px solid #00AAFF;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
	border-radius: 3px;
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #008DD4
		), color-stop(1, #00A9FC));
	background: -moz-linear-gradient(center top, #008DD4 5%, #00A9FC 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#008DD4',
		endColorstr='#00A9FC');
	background-color: #008DD4;
}

.datagrid table tfoot ul.active, .datagrid table tfoot ul a:hover {
	text-decoration: none;
	border-color: #006699;
	color: #FFFFFF;
	background: none;
	background-color: #00557F;
}

div.dhtmlx_window_active, div.dhx_modal_cover_dv {
	position: fixed !important;
}
</style>

<div class="container">
	<div style="text-align: center">
		<img alt="image"
			src="/wedding/resources/regProduct_gallery/새로운상품등록.png"
			style="size: width:1800px; height: 100px">
	</div>
	<div class="datagrid">
		<form action="/wedding/regInsertOne" method="post"
			enctype="multipart/form-data">
			<table>
				<thead>
					<tr>
						<th>번호</th>
						<th>사진</th>
						<th>상품명</th>
						<th>카타고리</th>
						<th>스펙</th>
						<th>사진</th>
						<th>가격</th>
						<th>수량</th>
					</tr>
				</thead>
				<tbody>
					<c:if test="${ !empty regSelectAll }">
						<c:forEach var="each" items="${ regSelectAll }">
							<tr>
								<td>${ each.num }</td>
								<td>${ each.name }</td>
								<td>${ each.category }</td>
								<td>${ each.spec }</td>
								<td>${ each.orgName }</td>
								<td>${ each.price }</td>
								<td>${ each.quantity }</td>

							</tr>
						</c:forEach>
					</c:if>
				</tbody>
				<tbody>
					<tr>
						<td></td>
						<td>
							<input type="text" name="name" required="required" />
						</td>
						<td> 
							<select name="category" required="required">
									<option>=====카타고리=====</option>
									<option>생활가전</option>
									<option>주방가전</option>
									<option>뷰티가전</option>
									<option>스마트가전</option>
									<option>게임가전</option>
									<option>주방기구</option>
									<option>주방가구</option>
							</select>
						</td>
						<td>
							<input type="text" name="spec" required="required" />
						</td>
						<td>
							<input type="file" name="upfile" required="required" />
						</td>
						<td>
							<input type="text" name="price" required="required" />
						</td>
						<td>
							<input type="text" name="quantity" required="required" />
						</td>
					</tr>
				</tbody>
				<tbody>
					<c:if test="${ !empty regSelectAll }">
						<c:forEach var="each" items="regSelectAll">
							<tr>
								<td>${ each.num }</td>
								<td>
									<img alt="imge" src="/wedding/resources/regProduct_gallery/${ each.orgName }"
											style="width: 100px; height: 100px;">
								</td>
								<td>${ each.name }</td>
								<td>${ each.category }</td>
								<td>${ each.spec }</td>
								<td>${ each.orgName }</td>
								<td>${ each.price }</td>
								<td>${ each.quantity }</td>

							</tr>
						</c:forEach>
					</c:if>
				</tbody>
				<tfoot>
					<c:choose>
				         <c:when test="${ pageDTO != null }">
				            <tr>
				               <td colspan="8" align="center">
					               <ul class="pagination" align="center">
					                  <c:if test="${ pageDTO.showPageNumberBegin != 1 }">
					                     <li><a href="?nowPage=1">◀◀</a></li> &nbsp; 
					                     <li><a href="?nowPage=${ pageDTO.nowPage - 1 }">◀</a></li>
					                  </c:if>
					                  <c:forEach var="k" begin="${ pageDTO.showPageNumberBegin }" 
					                        end = "${ pageDTO.showPageNumberEnd }"
					                        step="1"> 
					                         <c:choose> 
					                            <c:when test="${ pageDTO.nowPage == k }"> 
					                                <li><a class="active">${ k }</a></li> 
					                            </c:when> 
					                            <c:otherwise> 
					                               <li><a href="?nowPage=${ k }">${ k }</a></li>
					                            </c:otherwise> 
					                         </c:choose>    
					                     </c:forEach> 
					                  
					                     <c:if test="${ pageDTO.showPageNumberEnd != pageDTO.endPage }"> 
					                        <li><a href="?nowPage=${ pageDTO.nowPage + 1 }">▶</a></li>
					                        <li><a href="?nowPage=${ pageDTO.endPage }">▶▶</a></li>
					                     </c:if> 
					               </ul>
					               <ul>
										<li><input type="submit" value="상품등록" /></li>
										<li><input type="button" value="상품수정" /></li>
								   </ul>
				               </td>
				            </tr>
				         </c:when>
				      </c:choose>
				</tfoot>
			</table>
		</form>
	</div>

</div>
