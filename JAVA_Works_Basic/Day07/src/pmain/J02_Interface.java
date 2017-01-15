package pmain;

import entity.*;

public class J02_Interface {
	public static void main(String[] args) {
		
//		1. 인터페이스를 구현한 클래스의 객체 이용하기
		J02_Inter inter01 = null;
		inter01 = new J02_SubCla();
		inter01.over01();
		inter01.over02();
		
//		2. 인터페이스의 구현 객체를 이름 없는 상태로 
//			즉석에서 만들어서 사용하는 방법
		J02_Inter inter02 = new J02_Inter() {
			
			public void over02() {
				System.out.println("즉석객체 02");
			}
			
			public void over01() {
				System.out.println("즉석객체 01");
			}
		};
		inter02.over01();
		inter02.over02();
	}
}
