
public class J11_mainCla {
	public static void main(String[] args) {
		
//		1. ��ü ���� ���� ���
		J11_StCla.sMth();
		System.out.println(J11_StCla.sMsg);
		
//		���� : J11_StCla.iMth();
//		���� : System.out.println(J11_StCla.iMsg);
//		=> �Ϲ� ����� ��� �Ұ���
		
//		2. ��ü ���� �� ���
		J11_StCla st = new J11_StCla();
		
		st.sMth();
		System.out.println(st.sMsg);
		
		st.iMth();
		System.out.println(st.iMsg);
		
//		static(���, �޼ҵ�)�� ���赵 Ŭ���� ������ ���ϸ��� �����ȴ�.
//		���(����, �޼ҵ�)�� ���� ��������� �����ȴ�.
//		static�� �Ҿƹ���
//		����� ����
//		���� static�� ����� ���� �� ���� �ְ� ���� ���� ����������� ���ο� ����
//		�׷��� ����� static�� �������� ���� ��� ��ü���� ������ �ȴ� �� static ���� �����ϸ� �ٸ� ��ü���� ����� ���� ����.
//		static �� Ŭ���� �ɹ��� �θ��� �����̱⵵ �ϴ�.
		
		
//		3. ���� Ư�� Ȯ��
		J11_StCla p1 = new J11_StCla();
		System.out.println("1. p1 : "  + p1.sMsg);
		
		p1.sMsg = "p1�� ������ �޽���";
		System.out.println("2. p1 : " + p1.sMsg);
		
		J11_StCla p2 = new J11_StCla();
		System.out.println("3. p2 : " + p2.sMsg);
		
		p2.sMsg = "p2�� ������ �޽���";
		System.out.println("4. p2 : " + p2.sMsg);
		System.out.println("4. p1 : " + p1.sMsg);
		
		
	}

}
