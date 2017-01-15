
public class J09_Operator03 {
	
	public static void main(String[] args) {
	
//		관계연산자 : >  >=  <  <=  ==  !=
//			== : 두 값이 같다.
//			!= : 두 값이 다르다.
//		=> 연산 결과는 참/거짓(boolean) 형태로 제공됨
		
		int n = 10 , m = 5;
		System.out.println(n >= 5);
		
		System.out.println("== : " + (n == m) );
		System.out.println("!= : " + (n != m) );
		
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		boolean b4 = b1 == b2;
		System.out.println("b4 : " + b4);
		
		boolean b5 = b1 == b3;
		System.out.println("b5 : " + b5);
		
		
//		String 값에 대한 동일성 확인
		String s1 = "가나다";
		String s2 = "가나다";
		
		boolean p1 = s1 == s2;
		System.out.println("p1 : " + p1);
//		=> !!!!!!!!!! String 변수의 동일성을 확인할 때에는 == 사용 불가
//		=> .equals() 사용해야 함
		
//		두 문장이 같다 : 문자열1.equals(문자열2)
//		두 문장이 다르다 : !문자열1.equals(문자열2)
//		=> true / false 결과 제공
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}














