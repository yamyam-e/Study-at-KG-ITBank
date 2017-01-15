package entity;

public interface J02_Inter {
	
//	다형성에 특화된 수퍼클래스로 이해 하고
//	하나의 객체가 아니다.
//	생성자가 필요 없다. 따라서 생성자를 만드려고 하면 에러
//	
//	public J02_Inter() {
//		
//	}
//	=> 생성자 생성 에러: 다형성에 특화된 인터페이스는 객체가 필요 없으므로 생성자를 없애버림
	
//	String msg;
//	public void mth() {
//		
//	}
//  => 따라서, 객체가 있어야만 사용 가능한 인스턴스 멤버는 모두 이용 불가능
	
	public abstract void over01();
	public void over02();
	
//  => 다형성에 특화된 인터페이스는 자동으로 모두 메소드를 abstract 상태로 정의 함
	
//	=> 참고 :
	static final String msg = "초기화된 static final 변수";//상수화 된 변수는 사용 가능
}
