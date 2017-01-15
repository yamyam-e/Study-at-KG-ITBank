
public class J11_StCla {
	
	static String sMsg = "static 메시지";
	
	static void sMth(){
		System.out.println("static 메소드");
//		에러 : System.out.println("iMsg : " + iMsg);
//		=> sMth()보다 나중에 생성되므로, 이용 불가능
	}
	
	String iMsg = "일반 멤버 메시지";
	
	void iMth(){
		System.out.println("일반 멤버 메소드");
		System.out.println("sMsg : " + sMsg);
	}
	
	
	

			

}
