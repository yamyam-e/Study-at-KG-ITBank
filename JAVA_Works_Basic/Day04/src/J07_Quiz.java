
public class J07_Quiz {
	
	public static void main(String[] args) {
		
//		���� : ��ǻ�� ���� ���� ���α׷�
		
//		Ŭ���� �ۼ�
//			1. ��� ����
//				- �̸�, Ű���尡��, ����Ͱ���, ��ü����
//				�� ���Ű���(������ ��ǰ�� ����)
//			2. �޼ҵ�
//			- ������ ���� �޼ҵ�: �̸� �� 3�� ��ǰ ����
//			- ������ ��� �޼ҵ�: ��� ������ ���
		
		J07_Computer com1 = new J07_Computer();
		com1.setData("HP", 15000, 150000, 600000);
		com1.showData();
		
		J07_Computer com2 = new J07_Computer();
		com1.setData("Samsung", 18000, 210000, 800000);
		com1.showData();
	}

}
