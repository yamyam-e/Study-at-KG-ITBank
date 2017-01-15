
public class J04_Operator {

//	연산자
	
	public static void main(String[] args) {
	
//		1. 대입연산자 =
		
//		일반형 정수 10을 저장하려는 경우
		int a;
		a = 10;
		
//		에러 a = 10L;
//		=> 대입연사자 이용시, 
//			기본적으로 저장하려는 값의 형태와
//			저장공간의 형태 특성이 같아야 한다.

		int p1 = 10;
		int p2 = 20;
		int p3;
		
		p3 = p1 + p2;
//		=> 오른쪽은 값의 자리, 왼쪽은 공간의 자리
		System.out.println("p3 = " + p3);
		
		p3 = p3 + 40;
		System.out.println("p3 = " + p3);
		
//		각 자료형 변수에 대한 기본값 설정
//		=> 프로그램 작성 시 설계 목적상 기본이 되는 값을
//			저장한 후 사용해야 할 때가 있음
		int ab = 0;
		
		String name = null;
//		=> String 변수에는 null 이라는 키어드로
//			기본값을 설정할 수 있다.
//		=> null은 "값이 없다"를 의미하는 키워드
		
		
//		2. 산술연산자 + - * / %
//		/: 나누고 난 후 몫만 제공
//		%(모드연산자): 나누고 난 후 나머지 값만 제공
		
		System.out.println("+ : " + (5+2));
		System.out.println("- : " + (5-2));
		System.out.println("* : " + (5*2));
		System.out.println("/ : " + (5/2));
		System.out.println("% : " + (5%2));
		
		System.out.println("% 에러 : " + (6.3%2.1));
//		=> 정수끼리의 연산에 대해서만 사용해야 함
		
//		특별히 + 연산자는 String 에서도 사용 가능
		String s1 = "ab";
		String s2 = "cd";
		System.out.println(s1 + s2);
		
		String s3 = s1 + s2;
		System.out.println("s3 = " +  s3);
		
//		String과 다른 형태의 데이터를 + 연산하는 경우
//		결과 형태는 String이 된다.
		String s4 = "가나다";
		int pp = 10;
		String s5 = s4 + pp;
		
//		문자열 누적하기
		String s6 = "";	//아무 내용이 없는 것을 저장
		
		s6 = s6 + "가나";
		System.out.println("1. s6 = " + s6);
		
		s6 = s6 + "다라";
		System.out.println("2. s6 = " + s6);
		
		
//		3. 복합데이터 연산자  += -= /= %=
//			예: a+= b; => a = a + b;
		
		int m1 = 10;
		int m2 = 20;
		
		m1 += m2; // m1 = m1 + m2;
		System.out.println("+= : " + m1);
		
		m1 -= m2; // m1 = m1 - m2;
		System.out.println("-= : " + m1);
		
		m1 *= m2; // m1 = m1 * m2;
		System.out.println("*= : " + m1);
		
		m1 /= m2; // m1 = m1 / m2;
		System.out.println("/= : " + m1);
		
		m1 %= m2; // m1 = m1 % m2;
		System.out.println("%= : " + m1);
		
		
//		4. 증감연산자 ++ --
//			1. a++ 또는  ++a 
//				- a의 값에 1을 더한 후 다시 저장
//				- a = a + 1;
//			2. a-- 또는  --a
//				-a의 값에 1을 뺀 후 다시 저장
//				- a = a - 1;
		int t1 = 10;
		t1++; //t1 = t1 + 1;
		System.out.println("t1 = " + t1);
		
		int t2 = 10;
		t2--; //t2 = t2 + 1;
		System.out.println("t2 = " + t2);
		
//		다른 명령과 복합적으로 사용되는 경우, 
//		전치증감연산자와 후치증감연산자가 구별됨
		int k1 = 10;
		System.out.println("1. ++k1 : " + (++k1));
//		=> 전치연산자(전치연산 후 다른 명령 실행)
//		1. ++k1;
//		2. System.out.println(k1);
		int k2 = 10;
		System.out.println("2. k2++ : " + (k2++));
//		=> 후치연산자(다른 병령 실행 후 후치연산)
//		1. System.out.println(k2);
//		2. k2++;
		System.out.println("2. k2 : " + k2);
		
		
//		5. 관계연산자 > >= < <= == !=
//		== 같다
//		!= 다르다
//		=> 결과는 boolean 형태로 제공 됨
		
		int n = 3;
		
		boolean b1 = n >= 2;
		System.out.println("b1 = " +  b1);
		
		boolean b2 = n == 3;
		System.out.println("b2 = " +  b2);
		
		boolean b3 = n != 3;
		System.out.println("b3 = " +  b3);
		
//		주의: String의 동일성을 확인할 때에는
//			== 를 사용하지 말고, equal()를 사용해야 함
		String ss1 = "가나";
		String ss2 = "가나";
		boolean b4 = ss1.equals(ss2);
		System.out.println("b4 = " +  b4);
		
		
//		6. 논리연산자 && || !
//		- 각 상황의 참/거짓 정보를 바탕으로 약속된 규칙에 대한 결과를 산출
//		- && : 논리곱연산자 - 모든 상황이 참인 경우 결과 참
//		- || : 논리합연산자 - 모든 상황이 거짓이면 결과 거짓
//		- !  : 부정연산자 - 뒤의 논리상황을 부정
		
		boolean bb1 = true && true;
		System.out.println("bb1 = " +  bb1);
		
		boolean bb2 = false || false;
		System.out.println("bb2 = " +  bb2);
		
		boolean bb3 = !true;
		System.out.println("bb3 = " +  bb3);
		
		
//		7. 조건연산자(삼항연산자)
//		- 형식:  조건식 ? 참인경우의 값 : 거짓인경우의 값
		
		int h1 = 10;
		int h2 = 23;
		int max = h1 > h2 ? h1 : h2;
		
		int age = 14;
		String child = age <= 19 ?  "청소년" : "성인";
		System.out.println("child = " + child);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
