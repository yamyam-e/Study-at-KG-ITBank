package pmain;

import javax.swing.JOptionPane;

import entity02.J10_Bank;

public class J10_Quiz {
	public static void main(String[] args) {
		
//		���� : ���� ���� ���α׷�
		
//		�޴� : 
//			1. ���� ����
//				- �̸�, ����, ��й�ȣ, �ܾ�
//				- ���� �� ���̰� 0���� ���� ��� ����
//				- ���� �� �Ա� �ݾ��� 0���� ���� ��� ����
//			2. �ܾ� ��ȸ
//				- ���� �� �Է��� ��й�ȣ�� ��ġ���� ������ ����
//			3. �Ա�
//				- �Ա� �ݾ��� 0���� ������ ����
//			4. ���
//				- ��й�ȣ ����ġ �� ����
//				- ��� �ݾ��� 0���� ������ ����
//				- ��� �ݾ��� �Ա� �ݾ׺��� ũ�� ����
//			5. ���α׷� ����
		
		String showMenu = 
				"1. ���� ����\n"
				+ "2. �ܾ� ��ȸ\n"
				+ "3. �Ա�\n"
				+ "4. ���\n"
				+ "5. ���α׷� ����";
		
		J10_Bank myAcc = null;
		
		while(true) {
			String sel = 
				JOptionPane.showInputDialog(showMenu);
			
			String msg = null;
			if(sel.equals("1")) {	// ����
				myAcc = new J10_Bank();
				String res = myAcc.open();
				
				if(res.equals("�Ϸ�")) {
					msg = "���� ���� �Ϸ�";
				} else {
					msg = res;
					myAcc = null;
				}
				
			} else if(sel.equals("2")) {	// �ܾ���ȸ
				if(myAcc != null) {
					msg = myAcc.show();
					
				} else {
					msg = "������ �������� �ʾҽ��ϴ�.";
				}
				
			} else if(sel.equals("3")) {	// �Ա�
				if(myAcc != null) {
					msg = myAcc.save();
					
				} else {
					msg = "������ �������� �ʾҽ��ϴ�.";
				}
				
			} else if(sel.equals("4")) {	// ���
				if(myAcc != null) {
					msg = myAcc.draw();
				} else {
					msg = "������ �������� �ʾҽ��ϴ�.";
				}
			
			} else if(sel.equals("5")) {
				break;
			} else {
				msg = "�߸��� �Է��Դϴ�.";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
		
		
		
	}
}













