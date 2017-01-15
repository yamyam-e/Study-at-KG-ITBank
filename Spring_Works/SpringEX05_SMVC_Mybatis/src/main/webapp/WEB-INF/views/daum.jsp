<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<style type="text/css">
.datagrid table {
	border-collapse: collapse;
	text-align: left;
	width: 100%;
}

.datagrid {
	font: normal 12px/150% Times New Roman, Times, serif;
	background: #fff;
	overflow: hidden;
	border: 1px solid #EB52D1;
	-webkit-border-radius: 6px;
	-moz-border-radius: 6px;
	border-radius: 6px;
}

.datagrid table td, .datagrid table th {
	padding: 12px 20px;
}

.datagrid table thead th {
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #B804A0
		), color-stop(1, #FF24C5));
	background: -moz-linear-gradient(center top, #B804A0 5%, #FF24C5 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#B804A0',
		endColorstr='#FF24C5');
	background-color: #B804A0;
	color: #FFFFFF;
	font-size: 17px;
	font-weight: bold;
	border-left: 0px solid #0070A8;
}

.datagrid table thead th:first-child {
	border: none;
}

.datagrid table tbody td {
	color: #220C6B;
	font-size: 14px;
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
	border-top: 1px solid #EB52D1;
	background: #EC78F4;
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
	border: 1px solid #C213B0;
	-webkit-border-radius: 8px;
	-moz-border-radius: 8px;
	border-radius: 8px;
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #FF1CF0
		), color-stop(1, #9C20A1));
	background: -moz-linear-gradient(center top, #FF1CF0 5%, #9C20A1 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#FF1CF0',
		endColorstr='#9C20A1');
	background-color: #FF1CF0;
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
<title>Home</title>
</head>
<body>

	<div id="daumShoppingForm">
		<input id="daumShoppingSearch" type="text"
			onkeydown="javascript:if(event.keyCode == 13) daumShoppingSearch.search();" />
		<input id="daumShoppingSubmit" type="submit" value="검색"
			onclick="javascript:daumShoppingSearch.search()" />
	</div>
	<div id="daumShopping"></div>
	<div id="daumShoppingScript"></div>
	<hr>


	<h2>검색테스트</h2>
	<hr>
	<input type="button" value="실행" onclick="search()" />


	<div>${ aa }</div>

	<div class="datagrid">
		<table>
			<thead>
				<tr>
					<th>header</th>
					<th>header</th>
					<th>header</th>
					<th>header</th>
					<th>header</th>
					<th>header</th>
					<th>header</th>
					<th>header</th>
					<th>header</th>
					<th>header</th>
				</tr>
			</thead>
			<tfoot>
				<tr>
					<td colspan="10"><div id="paging">
							<ul>
								<li><a href="#"><span>Previous</span></a></li>
								<li><a href="#" class="active"><span>1</span></a></li>
								<li><a href="#"><span>2</span></a></li>
								<li><a href="#"><span>3</span></a></li>
								<li><a href="#"><span>4</span></a></li>
								<li><a href="#"><span>5</span></a></li>
								<li><a href="#"><span>Next</span></a></li>
							</ul>
						</div>
				</tr>
			</tfoot>
			<tbody>
				<tr class="alt">
					<td>data</td>
					<td>data</td>
					<td>data</td>
					<td>data</td>
					<td>data</td>
					<td>data</td>
					<td>data</td>
					<td>data</td>
					<td>data</td>
					<td>data</td>
				</tr>
			</tbody>
		</table>
	</div>


</body>

<script>
	var daumShoppingSearch = {
		/** 초기화. **/
		init : function() {
			this.apikey = "24f6cb95e6a56956cde76f82526199bd";
			this.q = document.getElementById('daumShoppingSearch');

			//검색 객체들 초기화.
			daumShopping.init(6);
		},
		/** 검색 **/
		search : function() {
			this.query = '?apikey=' + this.apikey + '&output=json&q='
					+ encodeURI(this.q.value);

			//검색어에 맞게 각각 첫페이지를 띄움.
			daumShopping.pingSearch(1);
		},
		/** callback 함수 호출. **/
		pingSearch : function(ds, api, pgno, callback, result) {
			ds.innerHTML = "";

			var s = document.createElement('script');
			s.type = 'text/javascript';
			s.charset = 'utf-8';
			s.src = api + this.query + '&pageno=' + pgno + '&callback='
					+ callback + '&result=' + result;

			ds.appendChild(s);
		},
		/** 결과를 뿌려줌. **/
		pongSearch : function(search, z) {
			var ul = document.createElement('ul');

			for (var i = 0; i < z.channel.item.length; i++) {
				//title 정보를 얻음.
				var title = document.createElement('h4');
				var a = document.createElement('a');
				a.href = z.channel.item[i].link;
				a.target = '_blank';
				a.innerHTML = this.escapeHtml(z.channel.item[i].title)
						+ '<br'+'/>';

				title.appendChild(a);

				//세부 내용을 얻음.
				var content = search.getContent(z.channel.item[i]);

				//리스트 화.
				ul.appendChild(search.getSearch(title, content));
			}
			return ul;
		},
		/** PageNumber를 그려줌. **/
		pongPgno : function(pgno, max, func) {
			var maxpg = (pgno + 6 < max) ? pgno + 6 : max;

			var div = document.createElement('div');
			div.align = 'center';
			div.style.clear = 'left';

			//좌측 화살표.
			var left = document.createElement('a');
			left.innerHTML = "◀";
			if (pgno - 5 > 1) {
				this.onMouseDown(left, pgno - 6, func);
			} else {
				left.style.color = "gray";
				left.style.cursor = "default";
			}
			div.appendChild(left);

			//페이지 번호.
			for (var i = (pgno - 5 > 1) ? pgno - 5 : 1; i < maxpg; i++) {
				var a = document.createElement('a');
				a.innerHTML = " " + i + " ";

				if (i == pgno) {
					a.style.color = 'yellow';
					a.style.cursor = "default";
				} else
					this.onMouseDown(a, i, func);

				div.appendChild(a);
			}

			//우측 화살표.
			var right = document.createElement('a');
			right.innerHTML = ">> ";
			if (pgno + 6 < max)
				this.onMouseDown(right, pgno + 7, func);
			else {
				right.style.color = "gray";
				right.style.cursor = "default";
			}
			div.appendChild(right);

			return div;
		},
		/** 마우스 이벤트. **/
		onMouseDown : function(a, i, func) {
			a.style.cursor = 'pointer';
			a.onmousedown = function() {
				func(i);
			}
		},
		/** HTML태그 안 먹게 하는 함수 **/
		escapeHtml : function(str) {
			str = str.replace(/&amp;/g, "&");
			str = str.replace(/&lt;/g, "<");
			str = str.replace(/&gt;/g, ">");
			return str;
		}
	};
	window.onload = function() {
		daumShoppingSearch.init();
		daumShoppingSearch.search();
	};
</script>

<script>
	/** 쇼핑 검색. **/
	var daumShopping = {
		/** 초기화. **/
		init : function(r) {
			daumShopping.api = 'http://apis.daum.net/shopping/search';
			daumShopping.pgno = 1;
			daumShopping.result = r;
		},
		/** callback 함수 호출. **/
		pingSearch : function(pgno) {
			daumShopping.pgno = pgno;

			var ds = document.getElementById('daumShoppingScript');
			var callback = 'daumShopping.pongSearch';

			daumShoppingSearch.pingSearch(ds, daumShopping.api,
					daumShopping.pgno, callback, daumShopping.result);
		},
		/** 결과를 뿌려줌. **/
		pongSearch : function(z) {
			var dv = document.getElementById('daumShopping');
			dv.innerHTML = "";
			dv.appendChild(daumShoppingSearch.pongSearch(this, z));
			dv.appendChild(daumShoppingSearch.pongPgno(daumShopping.pgno,
					z.channel.totalCount / daumShopping.result,
					daumShopping.pingSearch));
		},
		/** li setting **/
		getSearch : function(title, content) {
			var li = document.createElement('li');

			li.style.height = '150px';
			li.appendChild(title);
			li.appendChild(content);

			return li;
		},
		/** 설명 return **/
		getContent : function(z) {
			var div = document.createElement('div');
			var a = document.createElement('a');
			var b = document.createElement('b');
			var ba1 = document.createElement('a');
			var ba2 = document.createElement('a');
			var ba3 = document.createElement('a');
			var ba4 = document.createElement('a');
			var ba5 = document.createElement('a');
			var img = document.createElement('img');
			var aimg = document.createElement('a');

			img.width = 100;
			img.height = 100;
			img.src = z.image_url;
			img.style.paddingRight = '20px';

			aimg.target = '_blank';
			aimg.href = z.link;
			aimg.style.float = 'left';

			aimg.appendChild(img);

			a.style.clear = 'left';
			a.innerHTML = daumShoppingSearch.escapeHtml(z.price_group)
					+ daumShoppingSearch.escapeHtml(z.description) + '<br'+'/>';

			ba1.innerHTML = '가격 : ' + z.price_min + '원 ~ ' + z.price_max
					+ '원<br'+'/>';
			ba2.innerHTML = 'Maker : ' + daumShoppingSearch.escapeHtml(z.maker)
					+ '<br'+'/>';
			ba3.innerHTML = '카테고리 : '
					+ daumShoppingSearch.escapeHtml(z.category_name)
					+ '<br'+'/>';
			ba4.innerHTML = '출시일 : '
					+ daumShoppingSearch.escapeHtml(z.publish_date)
					+ '<br'+'/>';
			ba5.innerHTML = '상품평 : ' + z.review_count + '<br'+'/>';

			b.appendChild(ba1);
			b.appendChild(ba2);
			b.appendChild(ba3);
			b.appendChild(ba4);
			b.appendChild(ba5);

			div.appendChild(aimg);
			div.appendChild(b);
			div.appendChild(a);

			return div;
		}
	};
</script>

<script>
	function search() {
		alert("AA");
		location.href = "https://apis.daum.net/shopping/search?"
				+ "apikey={24f6cb95e6a56956cde76f82526199bd}&q=신학기 가방&result=20&pageno=3&output=json&sort=min_price";
	}
</script>


</html>
