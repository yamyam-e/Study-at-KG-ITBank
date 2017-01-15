
public class J10_Cast {
	public static void main(String[] args) {
		
//		Cast연산자
//		- 지정된 형태로 변환시키는 연산자
//		- 강제형변환 연산자
//		- boolean을 제외한 7개의 기본자료형은 서로 형변환 가능
		
		double d1 = 123.456789123456;
		float f1;
			
		f1 = (float)d1;
		
		System.out.println("f1 : " + f1);
		System.out.println("d1 : " + d1);
		
		System.out.println( (int)d1 );
		
		
//		자동형변화
//		- Cast연산자를 명령하지 않아도, 자동으로 Cast연산자가 적용됨
		
//		1. 대입식에서의 형변환 관계 : **자료 손실 여부에 따라서 자동 형변환 결정**
//		 	short < int < long < float < double
		
		int aa = 10;
		long bb;
		
		bb = aa;
		
		long f2 = 999999999999999999l;
		float f3 = f2;
		
		System.out.println(f3);
		
//		2. 산술연산식에서의 형변환
		
		short ss1 = 10;
		short ss2 = 20;
		
//		에러 : short ss3 = ss1 + ss2;
//		=> short 산술 연산의 결과는 int
		
		
		int age = 10;
		System.out.println(age + '살');
//		=> int 자료형으로 인해 유니코드의 정수값으로 연산됨
		
		
		System.out.println( 5 / 2 );
		System.out.println( 5 / 2.0 );
		System.out.println( 5.0 / 2 );
		System.out.println( 5.0 / 2.0 );
		
		
		
		
		
	}

}















