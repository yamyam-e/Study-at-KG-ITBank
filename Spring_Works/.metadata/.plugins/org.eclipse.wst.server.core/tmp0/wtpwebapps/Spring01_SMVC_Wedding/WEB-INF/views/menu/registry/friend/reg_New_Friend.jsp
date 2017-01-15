<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<style>
		.mydatagrid table {
			border-collapse: collapse;
			text-align: left;
			width: 100%;
		}
		
		.mydatagrid {
			font: normal 12px/150% Arial, Helvetica, sans-serif;
/*  			background: rgba(240, 120, 100, 0.1); */
			overflow: hidden;
			border: 1px solid #F4DA9C;
			-webkit-border-radius: 3px;
			-moz-border-radius: 3px;
			border-radius: 3px;
		}
		
		.mydatagrid table td, .datagrid table th {
			padding: 3px 10px;
		}
		
		.mydatagrid table tbody td {
			color: #000000;
			border-left: 1px solid #F4DA9C;
			font-size: 12px;
			font-weight: normal;
		}
		
		.mydatagrid table tbody input {
			border: 1px solid #F4DA9C;
			-webkit-border-radius: 3px;
			-moz-border-radius: 3px;
			border-radius: 3px;
		}
		
		.mydatagrid table tbody td:first-child {
			border-left: none;
		}
		
		.mydatagrid table tbody tr:last-child td {
			border-bottom: none;
		}
	</style>
	<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
</head>
<body>

<form action="/wedding/regInsertOneFriend" method="post">
	<div>
	<div class="mydatagrid">
		<table>
			<tbody>
				<tr>
					<td colspan="2" style="text-align: center;"><h4><strong>새친구 등록</strong></h4></td>
				</tr>
			</tbody>
		</table>
	</div>
	<br>
	<div class="mydatagrid">
		<table>
			<tbody>
				<tr>
					<td><strong>이 름</strong></td>
					<td>
						<input type="text" name="fName" required="required" size="20"/>
					</td>
				</tr>
				<tr>
					<td><strong>이메일</strong></td>
					<td>
						<input type="email" name="fEmail" required="required"/>
					</td>
				</tr>
				<tr>
					<td><strong>핸드폰</strong></td>
					<td>
						<input type="text" name="fPhone" id="phone" required="required" maxlength="13" size="10"/>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	</div>
</form>

</body>
	<script type="text/javascript">
	  //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
    function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 도로명 조합형 주소 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }
                // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
                if(fullRoadAddr !== ''){
                    fullRoadAddr += extraRoadAddr;
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('postcode').value = data.zonecode; //5자리 새우편번호 사용
                document.getElementById('roadAddress').value = fullRoadAddr;
                document.getElementById('jibunAddress').value = data.jibunAddress;

                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    //예상되는 도로명 주소에 조합형 주소를 추가한다.
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    document.getElementById('guide').innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    document.getElementById('guide').innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';

                } else {
                    document.getElementById('guide').innerHTML = '';
                }
            }
        }).open();
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

	var cellPhone = document.getElementById('phone');
	phone.onkeyup = function(event){
	    event = event || window.event;
	    var _val = this.value.trim();
	    this.value = autoHypenPhone(_val) ;
	}
	</script>
</html>