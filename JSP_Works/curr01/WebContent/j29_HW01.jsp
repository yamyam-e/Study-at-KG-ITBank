<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title here</title>
	<%
		String[] web = {"naver.com", "daum.net", "google.com", "hotmail.com", "nate.com"};
		String[] phone = {"010", "011", "017", "016"};
	%>
	
	<script type="text/javascript">
		function emailCheck(email) {
			var aaa = document.frm;
			if(email.contains("@")){
				alert("이메일 입력이 올바르지 않습니다.")
			}
		}
		
		function searchZipcode() {
			var aaa = document.frm;
			aaa.action = "https://www.epost.go.kr/search.RetrieveIntegrationNewZipCdList.comm";
			aaa.method = "post";
			aaa.submit();
		}
	</script>
</head>
<body>
	<style>
		.a, .a td{
			border: 1px solid white;
			width:500;
			height: 30;
			font-size: 11pt;
		}
		.b, .b th{
			border: 1px solid white;
			width:800;
			height: 30;
			text-align: "center";
			font-size: 15pt;
		}
	</style>
	<%
		String getZip = "";
		
	%>
	
	
	
	<form>
	<table class="b">
		<tr>
			<th align="center">회원 정보 입력</th>
		</tr>
	</table>
	
	<table class ="a">
		<tr>
			<td>아이디</td>
			<td>
				<input type="text" name ="id"/>
				<input type="button" name ="idCheck" value ="중복확인"/>
			</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>
				<input type="text" name ="password"/>
			</td>
		</tr>
		<tr>
			<td>비밀번호확인</td>
			<td>
				<input type="text" name ="password"/>
			</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>
				<input type="text" name ="name"/>
			</td>
		</tr>
		<tr>
			<td>별명</td>
			<td>
				<input type="text" name ="nickName"/>
			</td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td>
				<select name ="birthYear">
					<option value="select">선택</option>
					<%Calendar today = Calendar.getInstance();
					  
					  for(int i=1900; i<=2016; i++){ %>
						<option value="<%=i%>"><%=i %></option>
					<%}%>
				</select>년
				<select name ="birthMonth">
					<option value="select">선택</option>
					<%for(int i=1; i<=12; i++){ %>
						<option value="<%=i%>"><%=i%></option>
					<%}%>
				</select>월
				<select name ="birthDate">
					<option value="select">선택</option>
					<%for(int i=1; i<=31; i++){ %>
						<option value="<%=i%>"><%=i%></option>
					<%}%>
				</select>일
			</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>
				<input type="text" name="email" onclick="javascript: emailCheck(email)"/>@
				<select name ="web">
					<option value="select">선택</option>
					<%for(int i=0; i<web.length; i++){ %>
						<option value="<%=web[i]%>"><%=web[i]%></option>
					<%}%>
				</select>
			</td>
		</tr>
		<tr>
			<td>메일수신</td>
			<td>
				수신동의<input type="radio" name="sendAgree" value="yes"/>
				수신거부<input type="radio" name="sendAgree" value="no"/>
			</td>
		</tr>
		<tr>
			<td>우편번호</td>
			<td>
				<input type="text" name="zipcode" value="<%=getZip%>"/>
				<input type="button" name="zipcode" value="검색" onclick="javascript: searchZipcode()"/>
			</td>
		</tr>
		<tr>
			<td>주소</td>
			<td>
				<input type="text" name="address1"/>
			</td>
		</tr>
		<tr>
			<td></td>	
			<td>
				<input type="text" name="address2"/>
			</td>
		</tr>
		<tr>
			<td>연락처</td>
			<td>
				<select name="telephone1">
					<option value="select">선택</option>
					<%for(int i=0; i<phone.length; i++){ %>
						<option value="<%=phone[i]%>"><%=phone[i]%></option>
					<%}%>
				</select>-
				<input type="text" name="telephone2" maxlength="4"/>-
				<input type="text" name="telephone3" maxlength="4"/>
			</td>
		</tr>
		<tr>
			<td>취미</td>
			<td>
				<input type="checkbox" checked="checked"/>놀기
				<input type="checkbox"/>먹기
				<input type="checkbox"/>자기
			</td>
		</tr>
		<tr>
			<td>남기실말</td>
		</tr>
	</table>
	</form>
</body>
</html>