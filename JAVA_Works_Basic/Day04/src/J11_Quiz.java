import javax.swing.JOptionPane;

public class J11_Quiz {
	public static void main(String[] args) {
		
//		Ŭ������ �̸� : J12_MyMath
//		=> �� ���� ū�� �� �ϳ��� ����ϴ� Ŭ����
		
//		�ۼ��ؾ� �� �޼ҵ�(�� 4��, ������ ���İ� ����.)
//		- �޼ҵ�(����, ����) : �� �� �� ū���� ���
//		- �޼ҵ�(����, �Ǽ�) : �� �� �� ū���� ���
//		- �޼ҵ�(�Ǽ�, ����) : �� �� �� ū���� ���
//		- �޼ҵ�(�Ǽ�, �Ǽ�) : �� �� �� ū���� ���
		
//		���� : ������� ���� �޼ҵ常 �ۼ�
		
		J12_MyMath m1 = new J12_MyMath();
		String msg = m1.max(1, 2);
		JOptionPane.showMessageDialog(null, msg);
	}
}
