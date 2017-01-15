package pmain;

import entity02.J06_Cla02;

public class J06_mainCla {
	public static void main(String[] args) {
		
//		1. 다른 패키지의 클래스로 객체 만들기
		
//		에러:
//		J06_Cla01 pc01 = new J06_Cla01();
//		=> 다른 패키지의 클래스는 기본적으로 이용 불가능함
		
//		2. 다른 패키지의 클래스 이용 방법 2가지
		
//		2-1. 클래스 전체이름(Full Name) 이용
//			=> 클래스 전체 이름 : 패키지명.클래스이름
		entity01.J06_Cla01 pc01 = new entity01.J06_Cla01();
		
//		2-2. import 선언
//			=> 클래스 상단에서 기본클래스이름 선언		
		J06_Cla02 pc02 = new J06_Cla02();
		
//		에러:System.out.println(pc02.msg);
//		=> 다른 패키지의 클래스 안에 있는 멤버들은 기본적으로 접근 불가능
//		=> 접근제한자 추가 설정이 필요
		
		
	}
}
