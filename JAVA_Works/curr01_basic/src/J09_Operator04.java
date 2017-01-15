
public class J09_Operator04 {
	public static void main(String[] args) {
		
//		1. 논리연산자 && ||
//			&& : 논리곱연산자, AND연산자
//				 모든 조건 상황이 참인 경우, 최종 결과 참
//			|| : 논리합연산자, or 연산자
//				 조건 상황 중 하나만 참이여도 최종 결과 참
		
		boolean b1 = true && true;
		System.out.println("b1 : " + b1);
		
		boolean b2 = false || true;
		System.out.println("b2 : " + b2);
		
		
//		2. 부정연산자(NOT연산자) : !
//			- 뒤의 논리 상황을 부정
		boolean b3 = !true;
		System.out.println("b3 : " + b3);
		
		
//		3. 조건(삼항) 연산자
//		- 형식 : 조건식  ?  참인경우의 선택값 : 거짓인경우의 선택값;
		
		int n = 10;
		
		String res = n > 10 ?  n + "은 10보다 큰 수"	: n + "은 10보다 크지 않다.";
		
		System.out.println(res);
		
			
		
	}

}














