
public class J09_Operator04 {
	public static void main(String[] args) {
		
//		1. �������� && ||
//			&& : ����������, AND������
//				 ��� ���� ��Ȳ�� ���� ���, ���� ��� ��
//			|| : ���տ�����, or ������
//				 ���� ��Ȳ �� �ϳ��� ���̿��� ���� ��� ��
		
		boolean b1 = true && true;
		System.out.println("b1 : " + b1);
		
		boolean b2 = false || true;
		System.out.println("b2 : " + b2);
		
		
//		2. ����������(NOT������) : !
//			- ���� �� ��Ȳ�� ����
		boolean b3 = !true;
		System.out.println("b3 : " + b3);
		
		
//		3. ����(����) ������
//		- ���� : ���ǽ�  ?  ���ΰ���� ���ð� : �����ΰ���� ���ð�;
		
		int n = 10;
		
		String res = n > 10 ?  n + "�� 10���� ū ��"	: n + "�� 10���� ũ�� �ʴ�.";
		
		System.out.println(res);
		
			
		
	}

}














