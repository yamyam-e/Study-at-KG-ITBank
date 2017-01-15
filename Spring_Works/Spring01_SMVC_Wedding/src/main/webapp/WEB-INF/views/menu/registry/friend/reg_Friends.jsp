<%@page import="spring.mvc.wedding.dto.RegistryFriendsDTO"%>
<%@page import="spring.mvc.wedding.dto.RegistryProductDTO"%>
<%@page import="java.util.ArrayList"%>
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
	text-align: center;
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
	text-align: right;
}

.datagrid table tfoot  li {
	display: inline;
}

.datagrid table tfoot li a {
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

.modal-body input {
	border: 1px solid #F4DA9C;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
	border-radius: 3px;
}
</style>

<form action="/wedding/regInsertOneFriend" method="post">
	<div class="container">
		<div style="text-align: center">
			<img alt="image"
				src="/wedding/resources/regProduct_gallery/레지스트리 친구.png"
				style="size: width:1800px; height: 100px">
		</div>
		<h3>
			<button type="button" class="btn btn-info" data-toggle="modal"
				data-target="#regFriendModal">새친구 추가</button>
			<a href="/wedding/regSendMailtoAllFriends" type="button" class="btn btn-info">전체 이메일 발송</a>
		</h3>

		<!-- Modal -->
		<div class="modal fade" id="regFriendModal" role="dialog">
			<div class="modal-dialog">


				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header"
						style="background-image: url('/wedding/resources/regProduct_gallery/ModalFrame.jpg');">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h3></h3>
					</div>
					<div class="modal-body">
						<jsp:include page="reg_New_Friend.jsp" />
					</div>
					<div class="modal-footer"
						style="background-image: url('/wedding/resources/regProduct_gallery/ModalFrame.jpg');">
						<input type="submit" value="새친구 등록" class="btn btn-warning" />
					</div>

				</div>
			</div>
		</div>

		<div class="datagrid">

			<table style="text-align: center">
				<thead>
					<tr>
						<th>이름</th>
						<th>이메일</th>
						<th>전화번호</th>
						<th>수정/삭제</th>
					</tr>
				</thead>
				<tfoot>
					<c:choose>
				         <c:when test="${ pageDTO != null }">
				            <tr>
				               <td colspan="4" align="center">
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
				               </td>
				            </tr>
				         </c:when>
				      </c:choose>
				</tfoot>
				<tbody>
					<c:choose>
						<c:when test="${ !empty regSelectAllFriends }">
							<c:forEach var="each" items="${ regSelectAllFriends }">
								<tr>
									<td>${ each.fName }</td>
									<td>${ each.fEmail }</td>
									<td>${ each.fPhone }</td>
									<td>
										<button type="button" class="btn btn-xs btn-info"
											data-toggle="modal"
											data-target="#regFriendModal${ each.num }">수정</button> <a
										href="javascript:deleteOneFriend(${ each.num });"
										class="btn btn-xs btn-info">삭제</a>
									</td>
								</tr>

								<!-- Modal -->
								<div class="modal fade" id="regFriendModal${ each.num }"
									role="dialog">
									<div class="modal-dialog">

										<!-- Modal content-->
										<div class="modal-content">
											<div class="modal-header"
												style="background-image: url('/wedding/resources/regProduct_gallery/ModalFrame.jpg');">
												<button type="button" class="close" data-dismiss="modal">&times;</button>
												<h3></h3>
											</div>
											<div class="modal-body" style="text-align: center;">
												<div style="text-align: center">
													<h3>친구 정보 수정</h3>
												</div>
												<input type="text" id="newfName" value="${ each.fName }"
													required="required" /> <input type="email" id="newfEmail"
													value="${ each.fEmail }" required="required" /> <input
													type="text" id="newfPhone" value="${ each.fPhone }"
													required="required" />
											</div>
											<div class="modal-footer"
												style="background-image: url('/wedding/resources/regProduct_gallery/ModalFrame.jpg');">
												<button type="button" class="btn btn-warning"
													onclick="updateOneFriend(${ each.num });">수정</button>
											</div>
										</div>

									</div>
								</div>

							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td colspan="4">저장된 정보가 없습니다.</td>
							</tr>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>

		</div>
	</div>
	<c:if test="${ !empty regMsg }">
		<script type="text/javascript">
			alert("${ regMsg }")
		</script>
	</c:if>
</form>



<script type="text/javascript">
	
	function deleteOneFriend(num){
		if(!confirm("삭제 하시겠습니까?")){
			return;
		}
		location.href = "/wedding/regDeleteOneFriend?num="+num;
	}
	function updateOneFriend(num){
		if(!confirm("수정 하시겠습니까?")){
			return;
		}
		var fName = document.getElementById("newfName").value;
		var fEmail = document.getElementById("newfEmail").value;
		var fPhone = document.getElementById("newfPhone").value;
		location.href = "/wedding/regUpdateOneFriend?num=" + num 
						+ "&fName=" + fName
						+ "&fEmail=" + fEmail
						+ "&fPhone=" + fPhone
	}
    function autoHypenPhone(str){
        str = str.replace(/[^0-9]/g, '');
        var tmp = '';
        if( str.length < 4){
            return str;
        }else if(str.length < 7){
            tmp += str.substr(0, 3);
            tmp += '-';
            tmp += str.substr(3);
            return tmp;
        }else if(str.length < 11){
            tmp += str.substr(0, 3);
            tmp += '-';
            tmp += str.substr(3, 3);
            tmp += '-';
            tmp += str.substr(6);
            return tmp;
        }else{              
            tmp += str.substr(0, 3);
            tmp += '-';
            tmp += str.substr(3, 4);
            tmp += '-';
            tmp += str.substr(7);
            return tmp;
        }
        return str;
    }

	var cellPhone = document.getElementById('newfPhone');
	newfPhone.onkeyup = function(event){
	    event = event || window.event;
	    var _val = this.value.trim();
	    this.value = autoHypenPhone(_val) ;
	}
</script>
