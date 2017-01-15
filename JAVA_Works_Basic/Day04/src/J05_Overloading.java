
public class J05_Overloading {
	
//	메소드 오버로딩
//	- 같은 기능을 실행하는 메소드에 대하여
//		여러가지 상황에서도 하나의 이름으로 메소드를
//		사용할 수 있도ㅗㄱ 하는 편의성 제공
	
	public static void main(String[] args) {
		
		abc();
		abc(100);
		abc(100, 200);
	}
//	1. 매개변수 없음
	public static void abc(){
		System.out.println("1. abc()");
	}
	
//	2. 매개변수 있음, 매개변수 1개
	public static void abc(int a){
		System.out.println("2. abc(int)");
	}
	
//	3. 매개변수 2개, 매개변수 형태(int - int)
	public static void abc(int a , int b){
		System.out.println("3. abc(int , int)");
	}
	
//	4. 매개변수 형태(int - double)
	public static void abc(int a , double b){
		System.out.println("4. abc(int , double)");
	}
	
//	5. 매개변수 순서(double - int)
	public static void abc(double a , int b){
		System.out.println("4. abc(int , double)");
	}

}
