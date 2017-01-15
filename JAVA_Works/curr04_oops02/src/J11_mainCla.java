
public class J11_mainCla {
	public static void main(String[] args) {
		
//		1. 객체 생성 없이 사용
		J11_StCla.sMth();
		System.out.println(J11_StCla.sMsg);
		
//		에러 : J11_StCla.iMth();
//		에러 : System.out.println(J11_StCla.iMsg);
//		=> 일반 멤버는 사용 불가능
		
//		2. 객체 생성 후 사용
		J11_StCla st = new J11_StCla();
		
		st.sMth();
		System.out.println(st.sMsg);
		
		st.iMth();
		System.out.println(st.iMsg);
		
//		static(멤버, 메소드)는 설계도 클래스 생성시 제일먼저 생성된다.
//		멤버(변수, 메소드)는 집이 만들어져야 생성된다.
//		static은 할아버지
//		멤버는 손자
//		따라서 static은 멤버에 접근 할 수도 있고 없고 집이 만들어졌는지 여부에 따라서
//		그러나 멤버는 static에 언제든지 접근 모든 객체들이 공유가 된다 즉 static 값을 변경하면 다른 객체에도 변경된 값을 본다.
//		static 을 클래스 맴버라 부르는 이유이기도 하다.
		
		
//		3. 공유 특성 확인
		J11_StCla p1 = new J11_StCla();
		System.out.println("1. p1 : "  + p1.sMsg);
		
		p1.sMsg = "p1이 변경한 메시지";
		System.out.println("2. p1 : " + p1.sMsg);
		
		J11_StCla p2 = new J11_StCla();
		System.out.println("3. p2 : " + p2.sMsg);
		
		p2.sMsg = "p2가 변경한 메시지";
		System.out.println("4. p2 : " + p2.sMsg);
		System.out.println("4. p1 : " + p1.sMsg);
		
		
	}

}
