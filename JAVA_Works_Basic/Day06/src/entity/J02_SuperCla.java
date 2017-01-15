package entity;

public class J02_SuperCla {
	
	public J02_SuperCla() {
		System.out.println("수퍼클래스 생성자 실행됨");
		System.out.println("this : " + this);
	}
	
	public String supMsg = "수퍼클래스 메시지";
	
	public void supMth() {
		System.out.println("수퍼클래스 메소드");
	}

}
