package pmain;

import entity.*;

public class J01_Abstract {

	public static void main(String[] args) {
		
//		1. 추상메소드를 구현한 서브클래스 객체를 이용하는 방법
		 
		J01_SuperCla sup1 = null;//형식 사용 방법 메모리
		sup1 = new J01_SubCla();
		sup1.overMth();
		
//		2. 추상메소드를 가진 개체를 즉석에서 생성해서 사용
		
		J01_SuperCla sup2 = new J01_SuperCla() {
			@Override
			public void overMth() {
				System.out.println("즉석 서브 객체의 오버라이드 메소드");
			}
		};//<=============************************
		sup2.overMth();
		
		
	}
}
