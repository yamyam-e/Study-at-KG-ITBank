
public class J06_Data {
	// �ڹ��� ������ ���� ����
	public static void main(String[] args) {
		
		//1. ������ : �Ҽ����� ���� ��
		//1-1. �Ϲ��� ����(�⺻����)
		System.out.println(100);
		
		//1-2. Ȯ���� ����(L �Ǵ� �� ǥ��)
		System.out.println(100L);
		
		//���� System.out.println(2200000000);
		//=> �Ϲ��� ���� ���� : -21�� ~ +22��
		
		System.out.println(2200000000L);
		
		//2. �Ǽ��� : �Ҽ����� �ִ� ��
		//2.1 �Ϲ��� �Ǽ�(�⺻����)
		System.out.println(12.34);
		
		//2.2 ����� �Ǽ�(F �Ǵ� f ǥ��)
		System.out.println(12.34f);
		
		System.out.println(123123.123123);
		System.out.println(123123.123123f);//123123.125 ��� �ݿø��� �ƴ� ������
		
		//3. ���Ϲ����� :  
		//	 	-�����ڵ� ǥ�� ����(���ĺ�, ����, ��ȣ, ���� ����)
		//		-ǥ�� �� �ܵ���ǥ�� �̿��ؾ� ��
		System.out.println('A');
		System.out.println('$');
		System.out.println('��');
		
		//���ǻ���
		System.out.println(10 + '��');//49342��� 
		//=> ��� ������ ���� �� ��� �Ұ���

		//4. ���ڿ� ��
		//		-�Ϲ����� ����
		//		-�ֵ���ǥ�� ǥ��
		System.out.println("�Ѹ��� �����");
		System.out.println("123");//���ڰ� �ƴ� ���� 123
		
		//5. ����
		//		-�´�(true) / Ʋ����(false)�� �ǹ� Ű����
		System.out.println(true);
		System.out.println(false);
		
	}
}
