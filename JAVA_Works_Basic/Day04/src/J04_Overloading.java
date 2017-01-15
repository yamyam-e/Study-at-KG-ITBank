
public class J04_Overloading {
	
	public static void main(String[] args) {
		
//		두 개의 값에 대한 합을 계산하는 메소드 작성
		
//		원하는 상황들
//		메소드 (10, 20);
		sum01(10, 20);
//		메소드 (10, 1.2);
		sum02(10, 1.2);
//		메소드 (1.2, 3.4);
		sum03(1.2, 3.4);
//		메소드 (1.2, 10);
		sum04(1.2, 10);
	}
	
	public static void sum01(int a, int b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	public static void sum02(int a, double b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	public static void sum03( double a, double b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	public static void sum04(double a, int b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}

}
