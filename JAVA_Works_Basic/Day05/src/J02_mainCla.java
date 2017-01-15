
public class J02_mainCla {
	
	public static void main(String[] args) {
		
//		1. 객체 없이 클래스 이름 자체로 접근
		
//		1-1. static 멤버
		J02_StaticCla.smth();
		System.out.println(J02_StaticCla.smsg);
		
//		1-2. 일반 멤버 => 이용 불가능
//		J02_StaticCla.imth();
//		Sysotem.out.println(J02_StaticCla.imsg);
		
//		2. 개체 생성 후 접근
		J02_StaticCla stc = new J02_StaticCla();
		
//		2-1 static 멤버
		J02_StaticCla.smth();
		System.out.println(J02_StaticCla.smsg);
		
//		2-2 일반 멤버
		stc.imth();
		System.out.println(stc.imsg);
		
//		3. static 멤버의 공유 특성
		J02_StaticCla st1 = new J02_StaticCla();
		System.out.println("st1 : smsg = " + st1.smsg);
		
		st1.smsg = "st1이 변경한 smsg";
		System.out.println("st1 : smsg = " + st1.smsg);
		
		J02_StaticCla st2 = new J02_StaticCla();
		System.out.println("st2 : smsg = " + st2.smsg);

//		*************************************************************************************************
//		static 특징 : 객체보다 먼저 힙 영역에 별도로 생성되며 모든 객체가 static 영역을 공유한다.********
//		main 메소드 안에서 클래스 메소드를 사용 하려면 static을 붙여 힙영역에 먼저 생성 되도록 한다.*****
//		즉 static을 붙이지 않으면 main 메소드에서 사용 할 수 없는 이유이기도 하다.***********************
//		*************************************************************************************************
		
	}

}
