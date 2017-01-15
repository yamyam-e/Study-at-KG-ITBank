
public class J04_Car {
	
	String name;
	int price;
	
//	생성자 이용 목적
//	=> 객체 생성 시 원하는 초기화 작업을 자동으로 실행함
//		(편의성)
	
	public J04_Car() {
		System.out.println("기본생성자 작동");
//		this.name = null;
//		this.price = 0;
	}
	
	public J04_Car(String name, int price) {
		System.out.println("사용자 재정의 생성자 작동");	
		this.name = name;
		this.price = price;
	}
	
	void setCar(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void showData() {
		System.out.println("이름: " + this.name + ", 가격 : " + this.price);
	}
	
//	J04_Car() {
//		this.name = null;
//		this.price = 0;
//	}
}
