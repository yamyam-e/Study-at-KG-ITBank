//주석처리: Ctrl + Shift + C
//1.저장: Ctrl + Shift + S
//2.실행:  Ctrl + F11
public class J01_Variable {
	
//	변수
	public static void main(String[] args) {
		
		int a;
//		변수 선언: 변수를 만드는 작업
//		int: 자료형 키워드 중 하나
//			- int 키워드의 야곡된 내용대로 메모리에
//			특정 공간을 만들라는 의미
//		a: 변수명(변수이름) - 만들어진 공간에 붙이는 이름

//		에러System.out.println(a);
//		=> 값이 저장되지 않은 변수는 사용 불가능
//		변수 초기화: 만들어진 변수에 최초로 값을 저장하는 작업
//		정장하는 방법: = 연산자를 이용
		
		a = 10;
//		=> = 연산자의 오른쪽에 정하려는 값 입력
//		=> = 연산자의 왼쪽은 저장하려는 공간의 이름 입력
		
		System.out.println(a);
		
		a = 200;
		System.out.println(a);
		
//		에러int a; 
//		=> 같은이름의 공간은 생성(선언) 불가능.
		
		int b; //변수선언
		b = 300; //변수초기화
		System.out.println("b=" + b);
		
		int c = 400; 
//		=> 변수 선언과 초기화를 동시에 진행
		
		int e;		int f;		int g;
		
		int h, i, j;
//		=> int 공간 3개가 생성됨
		
		
//		변수 이름 짓는 규칙들
//		1. 이미 선언된 변수의 이름은 사용 불가능
//		2. 자바 프로그램이 사용하는 키워드는 사용 불가능
//			ex) int int;
//		3. 변수의 이름은 소문자로 시작
//		4. 숫자로 시작할 수 없음
//		5. 기호 $ _ 만 사용 가능
//		6. 의미 있는 단어로 이름 지을 것
		int age;
	}

}
