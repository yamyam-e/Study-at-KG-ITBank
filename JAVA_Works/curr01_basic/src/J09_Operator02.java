
public class J09_Operator02 {
	
	public static void main(String[] args) {
	
//		증감연산자 : ++ --
//			a++ && ++a => a = a + 1
//			a-- && --a => a = a - 1
		
//		1. 독립적 사용
		int a1 = 10;
		a1++;	// a1 = a1 + 1
		System.out.println("a1 : " + a1);
		
		int a2 = 10;
		++a2;	// a1 = a1 + 1
		System.out.println("a2 : " + a2);
		
//		2. 다른 명령과 병행되서 사용되는 경우
		
		int b1 = 10;
		System.out.println(++b1); // 전친, 전위 연산
//		전치 연산의 경우 => 증감연산 후 다른 명령 실행
//			1. ++b1;
//			2. System.out.println(b1);
		
		int b2 = 10;
		System.out.println(b2++); // 후치, 후위 연산
//		후치 연산의 경우 => 다른 명령 실행 후 증감연산 실행
//			1. System.out.println(b2);
//			2. b2++;
		
		System.out.println("b2 : " + b2);
		
	}
}
