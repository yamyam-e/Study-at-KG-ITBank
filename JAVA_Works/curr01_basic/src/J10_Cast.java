
public class J10_Cast {
	public static void main(String[] args) {
		
//		Cast������
//		- ������ ���·� ��ȯ��Ű�� ������
//		- ��������ȯ ������
//		- boolean�� ������ 7���� �⺻�ڷ����� ���� ����ȯ ����
		
		double d1 = 123.456789123456;
		float f1;
			
		f1 = (float)d1;
		
		System.out.println("f1 : " + f1);
		System.out.println("d1 : " + d1);
		
		System.out.println( (int)d1 );
		
		
//		�ڵ�����ȭ
//		- Cast�����ڸ� ������� �ʾƵ�, �ڵ����� Cast�����ڰ� �����
		
//		1. ���ԽĿ����� ����ȯ ���� : **�ڷ� �ս� ���ο� ���� �ڵ� ����ȯ ����**
//		 	short < int < long < float < double
		
		int aa = 10;
		long bb;
		
		bb = aa;
		
		long f2 = 999999999999999999l;
		float f3 = f2;
		
		System.out.println(f3);
		
//		2. �������Ŀ����� ����ȯ
		
		short ss1 = 10;
		short ss2 = 20;
		
//		���� : short ss3 = ss1 + ss2;
//		=> short ��� ������ ����� int
		
		
		int age = 10;
		System.out.println(age + '��');
//		=> int �ڷ������� ���� �����ڵ��� ���������� �����
		
		
		System.out.println( 5 / 2 );
		System.out.println( 5 / 2.0 );
		System.out.println( 5.0 / 2 );
		System.out.println( 5.0 / 2.0 );
		
		
		
		
		
	}

}















