package entity;

public abstract class J01_SuperCla {
	
	public abstract void overMth();
//	=> 다형성 이용을 위한 메소드에 abstract를 적용하면
//		기능 구현부를 제거할 수 있다.
//	=> 클래스 내부에 abstract 메소드가 하나라도 존재하는 경우 
//		클래스에도abstract 키워드가 필요하다.
//	=> 이를 "추상화" 되었다고 말한다.
//		(기능이 현재 애매모호한 상태로 존재한다는 의미)
	
	public void mth() {
		System.out.println("일반 메소드 사용 가능");
	}
	
	String msg;

}