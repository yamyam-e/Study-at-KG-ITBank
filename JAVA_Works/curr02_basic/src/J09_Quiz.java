import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J09_Quiz {
	public static void main(String[] args) {
		
//		JOptionPane && while &&......
		
//		1. �ݺ� ���� ��� ���α׷�
//			1. ���� 1�� �� ������ �Է� ���� �� ������ ���� ���
//			2. ��:
//				�Է»��� :
//				- ���� �Է� : 3
//				- �ݺ� ����Ϸ��� ���� �Է� : Hello Java
//				��� ȭ��
//					1. Hello Java
//					2. Hello Java
//					3. Hello Java
		String rcv1 = JOptionPane.showInputDialog("1. ����ϰ� ���� Ƚ�� �Է�");
		int end = Integer.parseInt(rcv1);
		rcv1 = JOptionPane.showInputDialog("1. ����� ������ �Է�");
		int start = 1;
		String res1 = "";
		
		while(start <= end) {
			res1 += start + ". " + rcv1 + "\n";
			++start;
		}
//		JOptionPane.showMessageDialog(null, new JTextArea(res1));
		
//		2. �� �� ���� ���α׷�
//			1. ���� 2���� �Է����� ��
//				�� ���� ���� ���̿� �����ϴ� ��� �������� �� ����
//			2. ��
//				�Է� ���� :
//				- ù��° ���� �Է� : 1
//				- �ι�° ���� �Է� : 10
//				��� ȭ�� :
//					1~10 ������ ��� ���� �� : 55
		String rcv2 = JOptionPane.showInputDialog("2. ù��° ���� �Է�");
		start = Integer.parseInt(rcv2);
		rcv2 = JOptionPane.showInputDialog("2. �ι�° ���� �Է�");
		end = Integer.parseInt(rcv2);
		int sum = 0;
		String res2 = start +"";
		
		while(start<=end){
			sum += start;
			++start;
		}
		res2 += "~" + end + " ������ ��� ���� �� : " + sum + "\n";
//		JOptionPane.showMessageDialog(null, new JTextArea(res2));
		
//		3. �� �� ���� ���α׷�
//			1. ���� 2���� �Է����� ��
//				�� ���� ������ �����ϴ� 7�� ����� �� ����
//			2. ��:
//				�Է� ���� :
//				- ù��° ���� �Է� : 1
//				- �ι�° ���� �Է� : 20
//				��� ȭ�� :
//					1~20 ������ 7�� ������� �� : 98
		String rcv3 = JOptionPane.showInputDialog("3. ù��° ���� �Է�");
		start = Integer.parseInt(rcv3);
		rcv3 = JOptionPane.showInputDialog("3. �ι�° ���� �Է�");
		end = Integer.parseInt(rcv3);
		int mul = 1;
		String res3 = start +"";
		
		while(start<=end){
			if (start%7==0) {
				mul *= start;
				if((end-start < 7)) {
					break;
				}
			}
			++start;
		}
		res3 += "~" + end + " ������ 7�� ������� �� : " + mul + "\n";
//		JOptionPane.showMessageDialog(null, new JTextArea(res3));
		
//		4. �� �� �� ������ �� ���� ���α׷�
//			1. ���� 2���� �Է����� ��
//				�� ���� ������ �����ϴ� 6�� ������� �� �� ��
//				�������� ������ ���� ���
//			2. ��:
//				�Է� ���� :
//				- ù��° ���� �Է� : 1
//				- �ι�° ���� �Է� : 20
//				��� ȭ�� :
//				1~20 ������ 6�� ��� �� �� : 36, ������ �� : 18
		String rcv4 = JOptionPane.showInputDialog("4. ù��° ���� �Է�");
		start = Integer.parseInt(rcv4);
		rcv4 = JOptionPane.showInputDialog("4. �ι�° ���� �Է�");
		end = Integer.parseInt(rcv4);
		sum = 0;
		String res4 = start +"";
		int lastNum = 0;
		
		while(start<=end){
			if (start%6==0) {
				sum += start;
				lastNum = start;
				if((end-start < 6)) {
					break;
				}
			}
			++start;
		}
		res4+= "~" + end + " ������ 6�� ��� �� �� : " + sum 
				+ " ������ �� : " + lastNum;
		JOptionPane.showMessageDialog(null, new JTextArea(res1 + res2 + res3 + res4));
		
	}

}







