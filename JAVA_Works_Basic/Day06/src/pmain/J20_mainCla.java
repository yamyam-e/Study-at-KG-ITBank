package pmain;

import javax.swing.JOptionPane;

import entity.J20_BankAcount;

public class J20_mainCla {
	
	public static void main(String[] args) {
		
		String showMenu = "1. ���尳��\n2. �ܾ�Ȯ��\n3. �Ա�\n4. ���\n5. ����";
		J20_BankAcount ba = null;
		
		while(true) {
			String msg = null;
			String sel = JOptionPane.showInputDialog(showMenu);
			
			if (sel.equals("1")) {
				String rcv1 = JOptionPane.showInputDialog("�̸��Է�");
				int rcv2 = Integer.parseInt(JOptionPane.showInputDialog("�����Է�"));
				if (rcv2 <= 0) {
					msg = "���̰� �ùٸ��� �ʽ��ϴ�.";
				} else {
					String rcv3 = JOptionPane.showInputDialog("��ȣ�Է�");
					int rcv4 = Integer.parseInt(JOptionPane.showInputDialog("�Աݾ� �Է�"));
					if (rcv4<0) {
						msg = "�ݾ��� �ùٸ��� �ʽ��ϴ�.";
					} else {
						ba = new J20_BankAcount();
						ba.open(rcv1, rcv2, rcv3, rcv4);
						msg = "������ ���� �Ǿ����ϴ�.";
					}
				}
			} else if (sel.equals("2")) {
				String rcv3 = JOptionPane.showInputDialog("��ȣ�Է�");
				msg = ba.show(rcv3);
				
			} else if (sel.equals("3")) {
				int rcv4 = Integer.parseInt(JOptionPane.showInputDialog("�Աݾ� �Է�"));
				if (rcv4<0) {
					msg = "�ݾ��� �ùٸ��� �ʽ��ϴ�.";
				} else {
					msg = ba.save(rcv4);
				}
			} else if (sel.equals("4")) {
				int rcv4 = Integer.parseInt(JOptionPane.showInputDialog("��ݾ� �Է�"));
				if (rcv4<0) {
					msg = "�ݾ��� �ùٸ��� �ʽ��ϴ�.";
				} else {
					msg = ba.withDraw(rcv4);
				}
				
			} else if (sel.equals("5")) {
				break;
			} else {
				msg = "�߸��� �Է�";
			}
			JOptionPane.showMessageDialog(null, msg);
			
			
		}
		
	}
}
