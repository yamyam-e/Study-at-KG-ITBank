
public class J09_Operator01 {
	
	public static void main(String[] args) {
		
//	1. 대입연산자 : = 
//		- 오늘쪽은 저장하려는 값, 왼쪽은 저장하려는 공간
//		- 저장하려는 값과 저장 공간의 형태 특성이 같아야 함
	int a;
	a = 10;
	
	a = a + 20;
	System.out.println("a : " + a);
	
	int b = a = 40;
	System.out.println("a : " + a);
	System.out.println("b : " + b);
	
	String s1 = "가나";
	String s2 = s1;
	System.out.println("s1 : " + s1);
	System.out.println("s2 : " + s2);
	
//	에러 : int c = "가나다";
//	=> 기본적으로, 형태 특성이 같아야만 저장 가능

//	참고 :
//	- String 변수 선언 이후에 저장 값이 결정되는 경우,
//		기본값으로 null을 저장
	String name = null;
	name = "둘리";
	
//	2. 산술연산자 : + - * / %
//		- 기본적으로, 숫자 간 산술연산
//		/ : 나눈 후 몫 결과만 제공
//		% : mod연산자, 나눈 후 나머지 결과만 제공(정수 연산만 가능)
	
	int n = 5, m = 2;
	System.out.println(" + : 합 => " + (n + m) );
	System.out.println(" - : 차 => " + (n - m) );
	System.out.println(" * : 곱 => " + (n * m) );
	System.out.println(" / : 나눈 후 몫 => " + (n / m) );
	System.out.println(" % : 나눈 후 나머지 => " + (n % m) );
	
	double d1 = 6.3, d2 = 2.1;
	System.out.println(d1 % d2);
//	=> % 연산자는 정수 데이터 간 연산에서만 의미 있음
	
//	예외상황 : 정수와 실수 간 / 연산 = > 소수점(나머지값) 제공됨
	System.out.println(5 / 2);
	System.out.println(5 / 2.0);
	System.out.println(5.0 / 2);
	System.out.println(5.0 / 2.0);
	
//	String에 대한 산술연산 : + 연산자만 가능(결합 기능)
	String s0 = "";
	String ss1 = "가";
	String ss2 = "나";
	
	String ss3 = s0 + ss1;
	System.out.println("ss3 : " + ss3);
	
	String ss4 = s0 + ss1 + ss2;
	System.out.println("ss4 : " + ss4);
	
//	String과 다른 type의 + 결합 => 통일된 String 타입으로 진행됨
//	=> 결과 형태는 String
	
	String t1 = "나이 : ";
	int age = 10;
	String t2 = t1 + age;
	System.out.println("t2 : " + t2);
		
	
//	3. 복합대입연산자 : += -= *= /= %=
//		n += m => n = n + m
//		n -= m => n = n - m
//		n *= m => n = n * m
//		n /= m => n = n / m
//		n %= m => n = n % m
	
	int p = 5, k = 2;
	System.out.println("p :" + p + ", k : " + k);
	
	p += k;	// p = p + k;
	System.out.println("p :" + p + ", k : " + k);
	
	p -= k;	// p = p - k;
	System.out.println("p :" + p + ", k : " + k);
	
	p *= k;	// p = p * k;
	System.out.println("p :" + p + ", k : " + k);
	
	p /= k;	// p = p / k;
	System.out.println("p :" + p + ", k : " + k);
	
	p %= k;	// p = p % k;
	System.out.println("p :" + p + ", k : " + k);
	
	
		
		
		
		
		
	}
}
