
//���ο� Ŭ���� ����� ����Ű Ctrl + n

public class J04_Syso {
	public static void main(String[] args) {
		
//		�������� ���Ŀ� ���� ��� ��� �Ǵ� ������ ��Ȯ�� �˰� ���� ��.
		System.out.println("�ƹ��� ���� : ");
		System.out.println(30);
		System.out.println("��");
		
		System.out.print("��Ӵ� ���� : ");
		System.out.print(20);
		System.out.println("��");
		
		System.out.println("�� ���� : " + 10 + "��");
//		=> 10�� �ֵ���ǥ ���� �̱� ������ �ֵ���ǥ ���·� ó��
		
		System.out.println(30 + 20);
		System.out.println("30 + 20");
		System.out.println("30" + "20");
		
		System.out.println("�ƹ��� ���̿� ��Ӵ� ���� �� : " + 30 + 20 + "��");
//		=> ��� ��� �� �ֵ���ǥ ������ ������ ���Ŀ� �����ϴ� �����ʹ�
//			                                   ��� �ֵ���ǥ ���·� ó�� �ȴ�.
		
		System.out.println("�ƹ��� ���̿� ��Ӵ� ���� �� : " + (30 + 20) + "��");
//		=> �߰�ȣ ó���� ����� ����Ͽ� �ջ�
		
		System.out.println(30 + 20 + "���� �ƹ����� ��Ӵ� ������ ��");
//		=> �ֵ���ǥ �� ���ڴ� ����� ó���Ͽ� �ջ�
		
	}
}
