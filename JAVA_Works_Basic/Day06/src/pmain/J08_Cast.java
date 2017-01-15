package pmain;

import entity.*;

public class J08_Cast {
	
	public static void main(String[] args) {
		
//		1. 수치 데이터 혀연화 : Cast연산자
		double d = 123.456789;
		float f;
		
		f = (float)d;
		
//		2. 클래스의 레퍼런스 간 형변환?
		
		J08_AAA aa = new J08_AAA();
		J08_BBB bb;
//		에러 : bb = (J08_BBB)aa;
//		=> 클래스 레퍼런스 간 형변환 불가능
		
//		3. 상속 관계 클래스의 레퍼런스 간 형변환
		
//		3-1. 수퍼클래스(new) -> 서브클래스
		J08_SuperCla sup1 = new J08_SuperCla();
		J08_SubCla sub1;
		
		sub1 = (J08_SubCla)sup1;
		
//		3-2. 서브클래스(new) -> 수퍼클래스
		
		J08_SubCla sub2 = new J08_SubCla();
		J08_SuperCla sup2;
		
		sup2 = (J08_SuperCla)sub2;
		sup2 = sub2; // cast 연산자 생략
		
	}

}
