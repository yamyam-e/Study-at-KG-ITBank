package pmain;

import javax.swing.JOptionPane;

import entity02.J10_Bank;

public class J10_Quiz {
	
	public static void main(String[] args) {
		
//		���� : ���� ���� ���α׷�
//		�޴� :
//			1. ���� ����
//				- �̸�, ����, ��й�ȣ, �ܾ�
//				- ���� �� ���̰� 0 ���� ���� ��� ����
//				- ���� �� �Ա� �ݾ��� 0���� ���� ��� ����
//			2. �ܾ� ��ȸ
//				- ���� �� �Է��� ��й�ȣ�� ��ġ���� ������
//			3. �Ա�
//				- �Ա� �ݾ��� 0���� ������ ����
//			4. ���
//				- ��й�ȣ ����ġ �� ����
//				- ��� �ݾ��� 0���� ������ ����
//				- ��� �ݾ��� �Ա� �ݾ׺��� ũ�� ����
//			5. ���α׷� ����
		String showMenu = "1. ���� ����\n2. �ܾ���ȸ\n3. �Ա�\n4. ���\n5. ���α׷�����";
		J10_Bank myAcc = null;
		
		while(true) {
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			if (sel.equals("1")) {//1.���尳��
				myAcc = new J10_Bank();
				String rcv1 = JOptionPane.showInputDialog("�̸��Է�");
				myAcc.setName(rcv1);
				rcv1 = JOptionPane.showInputDialog("�����Է�");
				if (Integer.parseInt(rcv1) > 0) { 
					myAcc.setAge(Integer.parseInt(rcv1));
					rcv1 = JOptionPane.showInputDialog("�Աݱݾ��Է�");
					if (Integer.parseInt(rcv1) > 0) { 
						myAcc.setBalance(Integer.parseInt(rcv1));
						rcv1 = JOptionPane.showInputDialog("��й�ȣ�Է�");
						myAcc.setPass(Integer.parseInt(rcv1));
						msg = "���尳���Ϸ�";
					}
				}
				else {
					msg = "���̰� �ùٸ��� �ʽ��ϴ�.";
					myAcc = null;
				}
			} else if (sel.equals("2")) {//2.�ܾ���ȸ
				if (myAcc == null) 	msg = "������ �������� �ʾҽ��ϴ�.";
				else {
					if (myAcc.checkPass()) msg = "�ܾ���" + myAcc.getBalance() + "�� �Դϴ�.";	
					else msg = "��й�ȣ�� �ùٸ��� �ʽ��ϴ�.";
				}
			} else if (sel.equals("3")) {//3.�Ա�
				if (myAcc == null) 	msg = "������ �������� �ʾҽ��ϴ�.";
				else msg = myAcc.save();
			} else if (sel.equals("4")) {//4.���
				if (myAcc == null) 	msg = "������ �������� �ʾҽ��ϴ�.";
				else {
					if (myAcc.checkPass())	msg = myAcc.withdraw();
					else msg = "��й�ȣ�� �ùٸ��� �ʽ��ϴ�.";
				}
			} else if (sel.equals("5")) {//5. ����
				break;
			} else {//����
				msg = "�߸��� �Է��Դϴ�.";
			}
			
			if (msg != null) JOptionPane.showMessageDialog(null, msg);
		}
		
	}

}
