import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J05_HW {
	public static void main(String[] args) {

//		1. ���� 2���� �Է¹޾� ���� ����� ���
		String rcv = JOptionPane.showInputDialog("ù��° ���� �Է�");
		int num1 = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("�ι�° ���� �Է�");
		int num2 = Integer.parseInt(rcv);
		
		String res = "";
		
//		1. ū �� ���
//		2. ���� ���� ¦��-Ȧ�� ���
//		3. �� ������ ���� ¦���̰�, 3�� ������� ���
		
		if(num1>num2) { //ū �� ���
			res = "ù��°�� " + num1 + " �� Ů�ϴ�." ;
		} else {
			res = "�ι�°�� " + num2 + " �� Ů�ϴ�." ;
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
		
		if(num1>num2) { //���� ���� ¦��-Ȧ�� ���
			if(num2%2==0) {
				res = "���� �� " + num2 + " ¦�� �Դϴ�." ;
			} else {
				res = "���� �� " + num2 + " Ȧ�� �Դϴ�." ;
			}	
		} else {
			if(num1%2==0) {
				res = "���� ��" + num1 + "�� ¦�� �Դϴ�." ;
			} else {
				res = "���� ��" + num1 + "�� Ȧ�� �Դϴ�." ;
			}	
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
			
		int sum = num1 + num2;
		if (sum%2==0 && sum%3 == 0) { // �� ������ ���� ¦���̰�, 3�� ������� ���
			res = "�� ������ �� " + sum + "�� ¦���̰�, 3�� ����Դϴ�.";
		} else {
			res = "�� ������ �� " + sum + "�� ¦�� �Ǵ� 3�� ����� �ƴմϴ�.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
		
//		2. ���� 3���� �Է¹޾� ���� ����� ���
//			1. ū �� ���
//			2. ū ���� ���� ���� ���̰� 50���� ū��, �ƴ��� ���
		rcv = JOptionPane.showInputDialog("ù��° ���� �Է�");
		int num11 = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("�ι�° ���� �Է�");
		int num22 = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("����° ���� �Է�");
		int num33 = Integer.parseInt(rcv);
		int max, small;

		if(num11>num22 && num11>num33) {
			res ="ū���� " + num11;
			max = num11;
			if(num22>num33) {
				small = num33;
			} else {
				small = num22;
			}
		} else if (num22>num33 && num22>num11) {
			res ="ū���� " + num22;
			max = num22;
			if(num33>num11) {
				small = num11;
			} else {
				small = num33;
			}
		} else { // (num33>num11 &&num33>num22)
			res ="ū���� " + num33;
			max = num33;
			if(num11>num22) {
				small = num22;
			} else {
				small = num11;
			}
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
		
		int sub = max - small;
		
		if(sub>50){
			res = "�� ���� ���� 50���� Ů�ϴ�.";
		} else {
			res = "�� ���� ���� 50���� �۽��ϴ�.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
	}

}













