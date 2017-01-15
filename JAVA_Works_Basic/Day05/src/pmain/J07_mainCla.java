package pmain;

import entity02.J07_Cla;

public class J07_mainCla {
	
//	접근제한자
//	- private < (default) < protected < public
//	- private
//		같은 클래스 내부에서만 이용 가능
//		(이 외의 모든 상황에서는 이용 불가능)
//	- (default) : 아무런 키워드도 입력되지 않은 상태
//		같은 패키지의 클래스들에 대해서는 접근 허용
//		다른 패키지의 클래스들에 대해서 접근 거부
//	- protected
//		같은 패키지의 클래스들에 대해서는 접근 허용
//		다른 패키지의 클래스들에 대해서 접근 거부
//		단, 다른 패키지의 클래스라 하더라도
//			상속 관계에 있는 서브클래스에 대해서는 접근 허용
//	- public
//		무조건 개방
	
	public static void main(String[] args) {
		
//		다른 패키지의 클래스 객체
		J07_Cla other = new J07_Cla();
		
//		같은 패키지의 클래스 객체
		J07_Cla2 same = new J07_Cla2();
		
//		1. private
//		에러: System.out.println("other : " + other.priv);
//		에러: System.out.println("same : " + same.priv);
		
//		2. default
//		에러: System.out.println("other : " + other.def);
		System.out.println("same : " + same.def);
		
//		3. protected
//		에러: System.out.println("other : " + other.prot);
		System.out.println("same : " + same.prot);
		
//		4. public
		System.out.println("other : " + other.pub);
		System.out.println("same : " + same.pub);
		
		
		
	}
}
