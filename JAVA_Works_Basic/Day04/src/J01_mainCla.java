
public class J01_mainCla {
	
//	�޼ҵ� : ��뵵�� ���� ����� ���������� �ۼ��� ���� ���α׷� ����
	
	public static void main(String[] args) {
		
//		�λ����� : �̸�, ����
//		reference      =    instance
		J01_People pp1 = new J01_People();
		setData(pp1, "�Ѹ�", 10);
		showData(pp1);
		
		J01_People pp2 = new J01_People();
		setData(pp2, "�����", 20);
		showData(pp2);
		
	}
	
	public static void setData(J01_People gate, String gate2, int gate3) {
		gate.name = gate2;
		gate.age = gate3;
	}
	
	public static void showData(J01_People gate) {
		System.out.println("�̸�: " + gate.name + " , ����: " + gate.age);
	}
	
//	�޼ҵ� �ۼ� ���
//	1. �ۼ��Ϸ��� ����� �����Ѵ�.
//	2. �̸��� ���Ѵ�.
//	3. �޼ҵ��� �⺻ Ʋ�� �ۼ�
//		void �޼ҵ��̸�() {
//	
//		}
//		=> ��, main�� ������ Ŭ���� �ȿ����޼ҵ带 
//		�ۼ��� �� �̿��� ������
//		public static void �޼ҵ��̸�() {
//	
//		}
//	4. �޼ҵ尡 ���� �޾ƾ� �� ���� �ִٸ�,
//		�Ա�(�Ű����� ����)�� ���(�Ű�����)�� �����Ѵ�.
//	5. �޼ҵ� �߰�ȣ �ȿ� ����� �ۼ��Ѵ�.
//	6. �޼ҵ尡 ������ �־�� �� ���� �ִٸ�,
//		�߰�ȣ�� ��� ��� ����������
//		return ��; �� ����ϰ�, 
//		�ⱸ(�����ڷ���)�� ������ ���� ���¸� ����Ѵ�.
	
	
	
	
	
	
	
}
