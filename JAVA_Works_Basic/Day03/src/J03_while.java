import javax.swing.JOptionPane;

public class J03_while {
//	while(����  => ��/����) {
//		�ݺ��� ���
//	}
	public static void main(String[] args) {
		
		int n1 = 3;

//		while(n1 < 5) {
//			System.out.println( n1 + "�� 5���� �۴�");
//		}
//		=> ���ѷ���	
		
//		�ݺ��� �ۼ� ���
//		1. �ݺ��� ������ �ľ� (���� �Ǵ� Ƚ��)
//		2. �ݺ����� ����� ���� ����(int ����)
//		3. �ݺ� ������ ������ ���, 
//			���۰��� ������ �ľ� �Ѵ�.
//			Ƚ���� ���, ������ ��ȯ�� �� ���۰�, ���� ����
//		4. ������ ������ ���۰��� ����
//			������ �ݺ����� ���ǽ����� ǥ�� 
//		5. �߰�ȣ �ȿ� �ݺ��Ϸ��� ��� �Է�
		
//		1. 3~9 ������ �����ϴ� ��� ���� ���(3~9)
		int a = 3;
		while (a <= 9) {
			System.out.println("a = " + a);
			a++;
		}
		
//		2. "�ȳ�" 4�� ���(0~3 / 1~4 / 5~8)
		int b = 1;
		while (b <= 4) {
			System.out.println("�ȳ�");
			b++;
		}
		
//		while���� ���ǽ����� ���ư��� ��� : continue (�ݺ��� �ȿ����� �����ؾ� �Ѵ�.)
		int t;
		
		while(true) {
			String rcv = JOptionPane.showInputDialog("���� �Է�(1~10)");
			t = Integer.parseInt(rcv);
			if (t < 1 || t > 10) {
				JOptionPane.showMessageDialog(null, "�߸��� �Է� => �ٽ� �Է��ϼ���");
				continue;// while�� ó������ ���ư��� �Ѵ�.
			}
			JOptionPane.showMessageDialog(null, "�Է��� ���� " + t + "�Դϴ�.");
		}
	}
}
