import javax.swing.JOptionPane;

public class J01_Quiz {
	
	public static void main(String[] args) {
		
//		1. ���� �� ���� �Է¹��� �� ���� ������ ������ ���� ���
//		- "�Էµ� ���� 1~10 ������ ��" 
//		- "�Էµ� ���� 11~20 ������ ��"
//		- "�Էµ� ���� 21~30 ������ ��"
		String rcv = JOptionPane.showInputDialog("���� �Ѱ��� �Է�");
		int inputNum = Integer.parseInt(rcv);

		String msg = null;
		
		if (inputNum >= 1 && inputNum <= 10) {
			msg = "�Էµ� ���� 1~10 ������ ��";
		} else if (inputNum >= 11 && inputNum <= 20) {
			msg = "�Էµ� ���� 11~20 ������ ��";
		} else if (inputNum >= 21 && inputNum <= 30) {
			msg = "�Էµ� ���� 21~30 ������ ��";
		}
		JOptionPane.showMessageDialog(null, msg);
		
//		2.���� 2���� �Է� �޾Ƽ�
//		- �� ���� ���� 2�� ����̸� "2�� ���"
//		- �� ���� ���� 3�� ����̸� "3�� ���"
//		- �ش���� ������ "�ش���� ����"
		
		rcv = JOptionPane.showInputDialog("���� �ΰ��� �Է��մϴ�.\n" + "ù��° �� �Է�");
		int num1 = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("�ι�° �� �Է�");
		int num2 = Integer.parseInt(rcv);
		
		int sum = num1 + num2;
		
		if (sum%2 == 0) {
			msg = "2�� ���";
		} else if (sum%3 == 0) {
			msg = "3�� ���";
		} else {
			msg = "�ش���� ����"; 
		}
		JOptionPane.showMessageDialog(null, msg);
	
	}

}
