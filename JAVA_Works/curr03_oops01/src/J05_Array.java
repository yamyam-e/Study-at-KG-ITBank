import javax.swing.JOptionPane;

public class J05_Array {
	public static void main(String[] args) {
		
//		�⺻ Ÿ��(�ڷ���)�� �迭 �̿��ϱ�
		
//		1. �迭 ����
		
//		1-1. ���� 3���� �����ϴ� �迭
		int[] i = new int[3]; //int[] �ؼ� => int ������ �迭 ����
		
		System.out.println("i : " + i);
		
//		���� : �Ǽ� 4���� �����ϴ� �迭 ���� �� ���۷��� ����ϱ�
		double[] d = new double[4];
		
		System.out.println("d : " + d);
		
//		���� : String�� �Ϲ��ڷ��� �迭�� ������ ������� ��� ����
		String[] ss = new String[2];
		
		ss[0] = "ù��° ����";
		ss[1] = "�ι�° ����";
		
		System.out.println("ss[0] : " + ss[0]);
		System.out.println("ss[1] : " + ss[1]);
		
//		���� : i�� ������� �ϴ� ������ �迭 ������ 50 ���� �� ���
		i[2] = 50;
		System.out.println("i : " + i[0] + ", " + i[1] + ", " + i[2]);
//		�迭�� �������� ��������� ������ �⺻�� 0, null.....�� ��� �ǰ� �Ǿ� �ִ�.************
//		�׷��� �Ϲ� ������ �⺻�� ���� ����� �� �� ����.
		
//		2. �⺻ Ÿ��(�ڷ���) �迭 �ʱ�ȭ�� Ư�� ����
		
		int[] i2 = { 10, 20, 30 };
		System.out.println("i2 : " + i2);
		
		String[] s2 = { "������", "ABC", "1234" };
		System.out.println("s2 : " + s2);
		
//		2-2.
		double[] d2 = new double[] {1.1, 2.2};
		
		String[] s3 = new String[] {"������", "�Ѹ�"};
		
//		����
//		1. String �迭 ���� - ���� 3�� ���� ������ �迭
//		2. JOptionPane�� �̿��Ͽ� ���� �� syso ���
		
		String[] s4 = new String[3];
	
		for(int j=0; j<s4.length; j++){
			s4[j] = JOptionPane.showInputDialog((j+1) + "�� �����Է�");
		}
		for(int j=0; j<s4.length; j++){
			System.out.println((j+1) + "�� ���� : " + s4[j]);
		}
		
	}

}
