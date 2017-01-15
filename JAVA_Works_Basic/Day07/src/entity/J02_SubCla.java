package entity;
//	인터페이스는 extends가 아니라 implements 사용
//	=> 인터페이스에 존재하는 미완성 메소드를 구현하는 클래스라는 의미

public class J02_SubCla implements J02_Inter {

	public void over01() {
		System.out.println("SubCla 01 메소드");
	}

	public void over02() {
		System.out.println("SubCla 02 메소드");
	}

}
