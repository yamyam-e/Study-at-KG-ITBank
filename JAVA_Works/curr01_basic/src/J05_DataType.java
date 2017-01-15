
public class J05_DataType {
	
//	자바에서의 데이터 형태 종류
	
	public static void main(String[] args) {
	
//		1. 정수 데이터
//			- 소수점이 없는 숫자값
//			- 일반형(기본): 숫자 크기에 제한이 있다 && 확장형(L/l): 숫자 크기가 제한이 없다
		
		System.out.println(123123);
		System.out.println(123123L);
		
//		에러 : System.out.println(2200000000);
//		=> 일반형 정수가 적용되는 범위 : -21억.... ~ +21억....
		
		System.out.println(2200000000L);
		
//		2. 실수 데이터
//			- 소숫점이 있는 숫자값
//			- 일반형(기본): 오차가 적다 && 약식형(F/f): 오차가 크다.
		
		System.out.println(12.34);
		System.out.println(12.34f);
		
		System.out.println(123123.123123123);
		System.out.println(123123.123123123f);
		
//		3. 단일문자 데이터
//			- 유니코드 표에 명시된 데이터 1개
//			- 각 나라 언어, 숫자, 기호
//			- 외따옴표 표기 필요
		
		System.out.println('A');
		System.out.println('ㄱ');
		System.out.println('밥');
		System.out.println('&');
		
//		4. 문자열 데이터
//			- 일반적으로 사용되는 문장 형태
//			- String
//			- 쌍따옴표 표기 필요
		
		System.out.println("둘리");
		System.out.println("밥");
		System.out.println("1234");
		
//		5. 참/거짓 데이터
//			- 맞다/틀리다의 의미를 가짐
//			- true/false 키워드로 표현
//			- 출력 시 키워드가 그대로 출력 됨
		System.out.println(true);
		System.out.println(false);
		
		
		
		
		
		
		
	}
}
