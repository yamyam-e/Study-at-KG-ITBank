package pmain;

import entity.*;

public class J04_Override {
	
//	상속 관계의 오버라이드 메소드
//	- 수퍼클래스에 존재하는 메소드와 동일한 형식의
//		메소드를 서브클래스에 작성하는 경우,
//		메소드 호출 시 서브클래스의 메소드가 실행된다.
//	- 기능을 수정하는 횽과가 있다.
	
	public static void main(String[] args) {
		
		J04_SubCla sub = new J04_SubCla();
		sub.works();
		
		
	}

}
