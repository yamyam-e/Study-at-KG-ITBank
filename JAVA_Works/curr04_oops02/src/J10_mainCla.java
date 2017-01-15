
public class J10_mainCla {
	public static void main(String[] args) {
		
//		문제 :
//		J10_MyMath 클래스를 생성한 후,
//		다음과 같은 메소드를 설계하고 이용하세요
		
//		1. 정수와 정수의 합을 출력 - 예: 메소드이름(10, 20);
//		2. 실수와 실수의 합을 출력 - 예: 메소드이름(1.1, 2.2);
//		3. 정수와 실수의 합을 출력 - 예: 메소드이름(10, 1.2);
		
//		4. 요구사항
//			단, 멤버변수(필드) 없이 클래스를 설계
		
		J10_MyMath mm = new J10_MyMath();
		mm.sum(10, 20);
		mm.sum(1.1, 2.2);
		mm.sum(10, 1.2);
		
		J10_MyMath.sum(42, 55);
		
		
	}

}



















