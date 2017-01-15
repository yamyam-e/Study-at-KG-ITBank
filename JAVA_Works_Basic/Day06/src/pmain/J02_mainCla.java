package pmain;

import entity.*;

public class J02_mainCla {
	
//	상속
//	- 기존에 존재하는 프로그램(클래스)의 데이터 속성 및 
//		메소드 기능을 물려 바을 수 있는 처리 기법
//	- 상속 처리가 적합한 관계 :
//		"A 클래스는 일조의 B 클래스이다." 인 경우
//		예) 학생은 일종의 사람이다.
//		예) 야구선수는 일종의 선수이다.
//		예) 축구선수는 일종의 선수이다.
//	- 상속 관계의 명칭
//		기존의 클래스 	- 	새로 만드는 클래스
//		수퍼클래스		- 	서브클래스
//		부모클래스		- 	자식클래스
//		상위클래스 		- 	하위클래스
//	- 상속 관계의 서브클래스 생성자는
//		수퍼클래스 생성자를 우선적으로 호출한다.
	
	public static void main(String[] args) {
	
		J02_SubCla sub = new J02_SubCla();
		
		System.out.println(sub.subMsg);
		sub.subMth();
		
		System.out.println(sub.supMsg);
		sub.supMth();
		
//		같은 고유번호가 출력 된다.
//		다시 말하면 슈퍼클래스 호출 후 생성된 주소에다
//		서브클래스가 실행 되면서 같은 주소에 확장을 하는 것이다.
		
		
		
	}

}
