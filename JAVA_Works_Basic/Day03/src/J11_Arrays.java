
public class J11_Arrays {

//	1. �⺻�ڷ��� �����Ϳ� ���� �迭�� �̿�
		
	public static void main(String[] args) {

//		���� 3���� ���� �迭 �̿�
		int[] aa = new int[3];
		
//		����System.out.println(aa[3]);
//		=> �迭�� ���ȣ(�ε���)�� 0���� ����
		
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
		System.out.println(aa[0]);
		System.out.println(aa[1]);
		System.out.println(aa[2]);
		System.out.println("==============");
		
//		length : �迭�� ���� ������ ����
		int n = aa.length;
		System.out.println("�迭 ���� : n = " + n);		
		
		for(int i = 0; i<aa.length; i++){
			System.out.println(aa[i]);
		}
		System.out.println("==============");
		
//		Ȯ�� for��
//		for(������ ����� ���� 1�� : �����Ͱ� ���� ���(�迭, �÷���))
		for(int each : aa) {
			System.out.println("each = " + each);
		}
		
		
	}
}
