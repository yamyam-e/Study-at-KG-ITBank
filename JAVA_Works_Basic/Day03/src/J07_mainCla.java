
public class J07_mainCla {
	
	public static void main(String[] args) {
		
//		��� ���� ���� ���α׷� :  �̸�, ����
		
		String iname = "�Ѹ�";
		int iage = 10;
		System.out.println(
				"�̸�: " + iname + " , ���� : " + iage);
		
//		Ŭ���� �ۼ� ��
//		1. �ϼ��� ���赵(Ŭ����)�� ��(��ü, �ν��Ͻ�) ����
		new J07_People();
//		=>16���� ���ʹ� ���� ��(��ü)�� �����
//		=>���� ������ȣ(hashCode)�� �����ϴ�
//			������(���۷��� ����) �ʿ�

//		2. ������(���۷�������) �����
		J07_People abc;
//		=> abc��� �������� ������� �ϴ� ���� ���´�
//			J07_People ���赵�� ������� ���̶�� �ǹ�
		
//		3. ��ü�� ���� ��, ���۷����� ������ȣ �����ϱ�
		J07_People bb = new J07_People();
		System.out.println("bb = " + bb);
		
//		��ü�� ������ ���, �� �濡�� �ڵ����� �⺻���� �����
		System.out.println(bb.name);
		System.out.println(bb.age);
		
		bb.name = "������";
		bb.age = 30;
		System.out.println("�̸�: " + bb.name);
		System.out.println("����: " + bb.age);
		
	}

}
