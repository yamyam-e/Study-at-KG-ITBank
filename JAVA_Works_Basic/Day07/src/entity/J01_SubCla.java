package entity;

public class J01_SubCla extends J01_SuperCla{
	
//	=> 프로그래머의 실수를 방지하기 위해서 추상클래스를 상속을 할 경우
//		미구현 된 수퍼클래스의 메소드를 반드시 구현하도록 강제하고 있다.
	public void overMth() {
		System.out.println("다형성 이용을 위한 구현 메소드");
	}
//	=> abstract 클래스를 상속하는 경우,
//		다형성 사용을 위해 반드시 해당 메소드를
//		오버라이드 하도록 가용한다.

}
