
public class J03_Type {
	
//	자룔형 이해하기
	
	public static void main(String[] args) {

//		자료형: 약속된 내용대로 메모리에 특정 공간을 생성
//		- 약속 내용
//			1. 저장할 데이터의 형태
//			2. 공간의 크기
//		- 예: int, double, float, long........
//		- 참고: String 
		
//		1. 정수 데이터와 관련된 자료형
		
//		1-1. int: 일반형 정수,  4byte
		int i;
		i = 10;
		System.out.println("i = " + i);
		
//		1-2. long: 확장형 정수, 8byte
		long l;
		l = 2200000000l;
		System.out.println("l = " + l);
		
//		1-3. byte: -128 ~ 127, 1byte
		byte b;
		b = 120;
		System.out.println("b = " + b);
		
//		1-4. short: -32768 ~32767, 2yte
		short sh;
		sh = 32700;
		System.out.println("sh = " + sh);
		
//		2. 실수 세이터와 관련된 자료형
		
//		2-1. double: 일반형 실수, 8byte 
		double d;
		d = 123456.123456;
		System.out.println("d = " + d);
		
//		2-2. float: 약식형 실수, 4byte
		double f;
		f = 123.123f;
		System.out.println("f = " + f);
		
//		3. 단일문자 데이터와 관련된 자료형
//			- 유니코드 표에 존재하는 데이터 한 개를 의미
//			- char: 2byte
		char c;
		c = 'A';
		System.out.println("c = " + c);
		c = '밥';
		System.out.println("c = " + c);

//		4. 문자열 데이터와 관련된 키워드
//			- String
		String s = "가나다라";
		System.out.println("s = " + s);
		
//		5. 참/거짓 데이터와 관련된 키워드
//			- boolean, 1byte
		boolean b1;
		b1 = true;
		System.out.println("b1 = " + b1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
