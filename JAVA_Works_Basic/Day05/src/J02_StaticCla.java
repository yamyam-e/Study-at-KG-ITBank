
public class J02_StaticCla {
	
	static String smsg = "static �޽���";
	
	static void smth() {
		System.out.println("static �޼ҵ�");
//		*******************************************************************************
//		���� System.out.println(imsg);*************************************************
//		static�� ���� ���� �ǰ� ������ ��ü ������ ���� �Ǳ� ������ �̿� �� �� ����.*
//		*******************************************************************************
	}
	
	String imsg = "�Ϲ� ��� ���� �޽���";
	
	void imth(){
		System.out.println("�Ϲ� �޼ҵ�");
		System.out.println(smsg);
//		****************************************************************************
//		��ü ������ ���� ���� static�� ���� ���� �Ǳ� ������ smsg�� ��� ���� �ϴ�.*
//		****************************************************************************
	}

}