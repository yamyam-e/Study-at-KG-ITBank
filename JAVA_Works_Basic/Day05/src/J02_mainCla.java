
public class J02_mainCla {
	
	public static void main(String[] args) {
		
//		1. ��ü ���� Ŭ���� �̸� ��ü�� ����
		
//		1-1. static ���
		J02_StaticCla.smth();
		System.out.println(J02_StaticCla.smsg);
		
//		1-2. �Ϲ� ��� => �̿� �Ұ���
//		J02_StaticCla.imth();
//		Sysotem.out.println(J02_StaticCla.imsg);
		
//		2. ��ü ���� �� ����
		J02_StaticCla stc = new J02_StaticCla();
		
//		2-1 static ���
		J02_StaticCla.smth();
		System.out.println(J02_StaticCla.smsg);
		
//		2-2 �Ϲ� ���
		stc.imth();
		System.out.println(stc.imsg);
		
//		3. static ����� ���� Ư��
		J02_StaticCla st1 = new J02_StaticCla();
		System.out.println("st1 : smsg = " + st1.smsg);
		
		st1.smsg = "st1�� ������ smsg";
		System.out.println("st1 : smsg = " + st1.smsg);
		
		J02_StaticCla st2 = new J02_StaticCla();
		System.out.println("st2 : smsg = " + st2.smsg);

//		*************************************************************************************************
//		static Ư¡ : ��ü���� ���� �� ������ ������ �����Ǹ� ��� ��ü�� static ������ �����Ѵ�.********
//		main �޼ҵ� �ȿ��� Ŭ���� �޼ҵ带 ��� �Ϸ��� static�� �ٿ� �������� ���� ���� �ǵ��� �Ѵ�.*****
//		�� static�� ������ ������ main �޼ҵ忡�� ��� �� �� ���� �����̱⵵ �ϴ�.***********************
//		*************************************************************************************************
		
	}

}
