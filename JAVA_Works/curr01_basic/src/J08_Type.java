
public class J08_Type {
	
//	Ÿ��(�ڷ���) :
//		- �������� ���¿� ���õ� ������ ��ӵ� Ű����
//		- ���� ������ ����� ����
	
//	���� ���� ��
//	1. ����Ǵ� ������ ���� => �⺻������ , ������ ������ �����͸� ���� ����
//  2. �����Ǵ� �޷θ� ������ ũ�� => �������� ���� �Ǵ� �������� ���õ�
	
	
	public static void main(String[] args) {
		
//		1. ���� Ÿ��
		
//		1-1. int : �Ϲ��� ���� / 4byte / -21��4748.. ~ +21��4748..
		int i;
		i = 10;

//		���� : i = 10L;
//		=> �⺻������, �����Ϸ��� ���� ���¿� ������ ���� Ư���� ���ƾ� ����
		
//		1-2. long : Ȯ���� ���� / 8byte / -9223��... ~ +9223��...
		long l;
		l = 10L;
		
//		1-3. byte : �Ϲ��� ���� / 1btye / -128 ~ +127
		byte b;
		b = 127;
		
//		1-4. short : �Ϲ��� ���� / 2byte / -32768 ~ +32767
		short sh;
		sh = 32767;
		
//		2. �Ǽ��� Ÿ��
		
//		2-1. double : �Ϲ��� �Ǽ� / 8byte / ...
		double d;
		d = 123456789.123456789;
		
//		2-2. float : ����� �Ǽ� / 4byte / ...
		float f;
		f = 12.34f;
		
//		3. ���Ϲ����� Ÿ�� : char / 2byte / C���� 1byte
//			- �����ڵ� ǥ���� ���ǵ� ���� �� ���� ����
		
		char c;
		
		c = 'A';
		System.out.println(c);
		
		c = 65;	//�����ڵ��� ����ǥ ������ �ش� ���ڸ� �ҷ� �´�.
		System.out.println(c);
		
		c = '��';
		System.out.println(c);
		
//		4. ���ڿ� Ÿ�� : String Ŭ����
		String s1 = "������";
		String s2 = "1234";
		String s3 = "��";
		
		String s4 = "";
		System.out.println("s4 : " + s4);
		
		String s5 = null; // null �� ��� �ȴ�.
		System.out.println("s5 : " + s5);
		
//		5. �� Ÿ�� : boolean / 1byte / 
		boolean b1 = true;
		boolean b2 = false;
		
		
//		���� : ���� ������ ������ �̿��ϴ� ���α׷����� �ۼ��ϼ���.
//		- �� ���� : �̸� , ����, Ű, ��ȭ��ȣ
//		- ģ�� ���� : �̸�, ���� , ���, ����
		String myName = "�̼���";
		short myAge = 43;
		float myHeight = 165f;
		String myTel = "010-4315-2710";
		
		String frName = "�Ѹ�";
		short frAge = 10;
		String frhobby = "���";
		String frChar = "�¼���";
		
		System.out.println("�� ���� : "
							+ "�̸�: " + myName + ", ����: " + myAge + ", Ű: " + myHeight + ", ��ȭ��ȣ: " + myTel);
		System.out.println("ģ�� ���� : "
							+ "�̸�: " + frName + ", ����: " + frAge + ", ���: " + frhobby + ", ����: " + frChar);
		
				
		
		
		
	}
}
