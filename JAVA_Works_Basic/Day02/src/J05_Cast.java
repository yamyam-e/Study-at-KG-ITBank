
public class J05_Cast {
	
//	cast 연산자 : 형태를 변경해서 제공하는 연산자

	public static void main(String[] args) {
		
		double d = 123.456789;
		float f;
//		에러: f = d;
//		=> 저장하려는 경우, 기본적으로 값과 공간의 형태 특성이 같아야 함
		f = (float)d;
		System.out.println("f = " +  f);
//		=> cast 연산자 사용
		
		long l = 123456L;
		int i;
		
		i = (int)l;
		System.out.println("i = " + i);
		
//		주의: String은 Cast 연산자 사용 불가능
		String ss = "1234";
		int ii;
//		에러 ii = (int)ss;
		
		
//		예외 상황:
//		- 다음 관계에서는 Cast 연산자가 자동으로 적용됨
//		- int < long < float < double
//		- 자바에서는 데이터 손실이 발생하지 않을 경우 자동형변환이 된다.
		
		long l2 = 200; //Cast 자동 적용
		
		double dd = 123.456f;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
