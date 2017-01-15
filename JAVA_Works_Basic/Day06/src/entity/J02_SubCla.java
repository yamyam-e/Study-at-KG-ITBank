package entity;

public class J02_SubCla extends J02_SuperCla {
	
	public J02_SubCla() {
		super(); //상속 대상인 수퍼클래스의 생성자 호출
		System.out.println("서브클래스 생성자 실행됨");
		System.out.println("this : " + this);
		
//		에러super();
//		=> 서브클래스의 모든 명령의 최우선 시점에서 실행 되어야 함
	}

	public String subMsg = "서브클래스 메시지";
	
	public void subMth() {
		System.out.println("서브클래스 메소드");
	}
	
}
