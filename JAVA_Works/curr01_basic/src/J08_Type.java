
public class J08_Type {
	
//	타입(자료형) :
//		- 데이터의 형태와 관련된 내용이 약속된 키워드
//		- 변수 공간을 만드는 역할
	
//	변수 선언 시
//	1. 저장되는 데이터 형태 => 기본적으로 , 정해진 형태의 데이터만 저장 가능
//  2. 제공되는 메로리 공간의 크기 => 데이터의 범위 또는 오차율과 관련됨
	
	
	public static void main(String[] args) {
		
//		1. 정수 타입
		
//		1-1. int : 일반형 정수 / 4byte / -21억4748.. ~ +21억4748..
		int i;
		i = 10;

//		에러 : i = 10L;
//		=> 기본적으로, 저장하려는 값의 형태와 변수의 형태 특성이 같아야 저장
		
//		1-2. long : 확장형 정수 / 8byte / -9223경... ~ +9223경...
		long l;
		l = 10L;
		
//		1-3. byte : 일반형 정수 / 1btye / -128 ~ +127
		byte b;
		b = 127;
		
//		1-4. short : 일반형 정수 / 2byte / -32768 ~ +32767
		short sh;
		sh = 32767;
		
//		2. 실수형 타입
		
//		2-1. double : 일반형 실수 / 8byte / ...
		double d;
		d = 123456789.123456789;
		
//		2-2. float : 약식형 실수 / 4byte / ...
		float f;
		f = 12.34f;
		
//		3. 단일문자형 타입 : char / 2byte / C언어는 1byte
//			- 유니코드 표에서 정의된 문자 한 개를 저장
		
		char c;
		
		c = 'A';
		System.out.println(c);
		
		c = 65;	//유니코드의 문자표 숫자의 해당 문자를 불러 온다.
		System.out.println(c);
		
		c = '밥';
		System.out.println(c);
		
//		4. 문자열 타입 : String 클래스
		String s1 = "가나다";
		String s2 = "1234";
		String s3 = "밥";
		
		String s4 = "";
		System.out.println("s4 : " + s4);
		
		String s5 = null; // null 이 출력 된다.
		System.out.println("s5 : " + s5);
		
//		5. 논리 타입 : boolean / 1byte / 
		boolean b1 = true;
		boolean b2 = false;
		
		
//		문제 : 다음 내용을 변수를 이용하는 프로그램으로 작성하세요.
//		- 내 정보 : 이름 , 나이, 키, 전화번호
//		- 친구 정보 : 이름, 나이 , 취미, 성격
		String myName = "이성권";
		short myAge = 43;
		float myHeight = 165f;
		String myTel = "010-4315-2710";
		
		String frName = "둘리";
		short frAge = 10;
		String frhobby = "놀기";
		String frChar = "온순함";
		
		System.out.println("내 정보 : "
							+ "이름: " + myName + ", 나이: " + myAge + ", 키: " + myHeight + ", 전화번호: " + myTel);
		System.out.println("친구 정보 : "
							+ "이름: " + frName + ", 나이: " + frAge + ", 취미: " + frhobby + ", 성격: " + frChar);
		
				
		
		
		
	}
}
