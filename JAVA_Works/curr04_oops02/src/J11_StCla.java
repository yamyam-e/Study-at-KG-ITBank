
public class J11_StCla {
	
	static String sMsg = "static �޽���";
	
	static void sMth(){
		System.out.println("static �޼ҵ�");
//		���� : System.out.println("iMsg : " + iMsg);
//		=> sMth()���� ���߿� �����ǹǷ�, �̿� �Ұ���
	}
	
	String iMsg = "�Ϲ� ��� �޽���";
	
	void iMth(){
		System.out.println("�Ϲ� ��� �޼ҵ�");
		System.out.println("sMsg : " + sMsg);
	}
	
	
	

			

}
