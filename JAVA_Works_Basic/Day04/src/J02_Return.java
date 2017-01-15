
public class J02_Return {
	
//	메소드의 값을 전달하는 return
	
	public static void main(String[] args) {
//		1. 객체의 고유번호(레퍼런스값)을 이용하는 메소드	
		
		J02_Car car = new J02_Car();
		setCar(car, "수퍼카", 200);
//		System.out.println("car: " + car.name + " , 가격: " + car.price);
		
//		2. 일반 자료형 변수에 대한 메소드
		int a = 0;
		setA(a);
		System.out.println("a = " + a); 
//		=>일반 자료형에 대한 메소드에서는 return 필요
		
//		3. return 이용하기
		int b = 0;
		b = setB();
		System.out.println(("b = " +  b));
		
	}
	
	public static int setB(){
		return 100;
		
//		주의사항 :
//		1. 메소드는 하나의 값만 리턴할 수 있다.
//		2. return 키워드는 값을 전달하는 기능 외에,
//			메소드를 종료시키는 기능도 가지고 있다.
//			return 키워드 뒤에는 다른 명령이 올 수 없다.
	}
	
	public static void setA(int gate) {
		gate = 100;
	}
	
	public static void setCar(J02_Car gate, String gate2, int gate3) {
		gate.name = gate2;
		gate.price = gate3;
	}
}
