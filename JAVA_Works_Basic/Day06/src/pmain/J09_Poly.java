package pmain;

import entity.*;

public class J09_Poly {
	
	public static void main(String[] args) {
		
//		1. 상속 관계의 sub 객체 생성
		
		J09_SubCla sub1 = new J09_SubCla();
		System.out.println("1.");
		sub1.supMth();
		System.out.println(sub1.supMsg);
		sub1.subMth();
		System.out.println(sub1.subMsg);
		
//		2. 레퍼런스 형변환 후
		
		System.out.println("2.");
		J09_SuperCla sup1;
	    sup1 = (J09_SuperCla)sub1;
	    
	    sup1.supMth();
	    System.out.println(sup1.supMsg);
	    
//	    에러:
//	    sup1.subMth();
//	    System.out.println(sup1.subMsg);
//	    => 형변환 후 서브클래스의 기능 사용 불가능
	    
//	    3. 레퍼런스 재형변화
	    J09_SubCla sub2;
	    sub2 = (J09_SubCla)sup1;//cast연산자 반드시 필요
	    
	    sub2.supMth();
	    System.out.println(sub2.supMsg);
	    
	    sub2.subMth();
	    System.out.println(sub2.subMsg);
	    
		
		
		
	
		
	}

}
