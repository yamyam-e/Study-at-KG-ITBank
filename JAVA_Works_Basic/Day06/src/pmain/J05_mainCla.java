package pmain;

import entity.J05_Hotel;
import entity.J05_House;

public class J05_mainCla {
	
	public static void main(String[] args) {
		
//		부동산 정보 관리 프로그램
		
//		주택정보 : 이름, 가격, 주차공간여부
//		호텔정보 : 이름, 가격, vip룸 갯수
		
		J05_House hh = new J05_House();
		hh.setData();
		System.out.println(hh.showData());
		
		J05_Hotel tt = new J05_Hotel();
		tt.setData();
		System.out.println(tt.getData());
		
		
	}

}
