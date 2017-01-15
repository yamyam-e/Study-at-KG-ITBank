package pmain;

import entity.*;

public class J05_Object {
	public static void main(String[] args) {
		
//		API : www.oracle.com -> API 문서 참고
	
//		Object
//		- 자바의 모든 클래스들에 대한 최상위 수퍼클래스
//		- 위치 : java.lang 패키지
//			(lang 패키지는 import 없이 사용 가능)
			
		J05_MyCla mm = new J05_MyCla();
//		mm.
		
//		1. toString() :
//			- 오버라이드를 통해
//				작성된 클래스의 엠버값을 출력하도록
//				권장하기 위해 준비된 메소드
		System.out.println(mm);
		System.out.println(mm.toString());
//		=> 위의 명령은 동일한 명령이다.
//		=> 기본적으로 toString()은 객체의 고유번호(hashCode)를
//			제공하도록 만들어져 있다.
		
//		2. Object 다형성
		Object obj1 = 10;
		Object obj2 = 12.34;
		Object obj3 = 'A';
		Object obj4 = "가나다라";
		
		J05_MyCla mc = new J05_MyCla();
		Object obj5 = mc;
		Object obj6 = new J05_MyCla();
		
		
	}

}
