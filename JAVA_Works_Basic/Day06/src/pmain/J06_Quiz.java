package pmain;

import javax.swing.JOptionPane;

import entity.J06_Baseball;
import entity.J06_Soccer;

public class J06_Quiz {
	
//	1. �߱� ���� ����
//		: �̸�, ���̸�, ����, ����(Ÿ��)
//	2. �౸ ���� ����
//		: �̸�, ���̸�, ����, 100m �޸��� ���
	
//	�޴�:
//	1. �߱����� ���� �Է�
//	2. �߱����� ���� �Է�
//	3. �౸���� ���� �Է�
//	4. �౸���� ���� �Է�
//	5. ���α׷� ����
	
	public static void main(String[] args) {
		
		String showMenu = "1. �߱����� ���� �Է�\n" +
							"2. �౸���� ���� �Է�\n" +
							"3. �߱����� ���� ����\n" +
							"4. �౸���� ���� ����\n" +
							"5. ���α׷� ����";
		
		J06_Baseball bb = null;
		J06_Soccer cc = null;
		
		
		while(true) {
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			if (sel.equals("1")) {//�߱����� ���� �Է�
				bb = new J06_Baseball();
				bb.setData();
				msg = "�߱����� ������ �Է� �ƽ��ϴ�.";
			} else if (sel.equals("2")) {//�౸���� ���� �Է�
				cc = new J06_Soccer();
				cc.setData();
				msg = "�౸���� ������ �Է� �ƽ��ϴ�.";
			} else if (sel.equals("3")) {//�߱����� ���� ����
				if (bb == null) {
					msg = "�߱����� ������ �����ϴ�.";
				} else {
					msg = bb.getData();
				}
			} else if (sel.equals("4")) {//�౸���� ���� ����
				if (cc == null) {
					msg = "�౸���� ������ �����ϴ�.";
				} else {
					msg = cc.getData();
				}
			} else if (sel.equals("5")) {//���α׷� ����
				break;
			} else {//����
				msg = "�߸��� �Է��Դϴ�.";
			}
			JOptionPane.showConfirmDialog(null, msg);
		}
		
	}

}
