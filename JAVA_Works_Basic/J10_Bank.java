package entity02;

import javax.swing.JOptionPane;

public class J10_Bank {

	private String name;
	private int age;
	private String password;
	private int money;
	
	private int myJopInt(String title) {
		String rcv = JOptionPane.showInputDialog(title);
		return Integer.parseInt(rcv);
	}
	
	public String open() {
		name = JOptionPane.showInputDialog("�̸� �Է�");
		age = myJopInt("���� �Է�");
		if(age < 0) {
			return "�������� �����Դϴ�.";
		}
		password = JOptionPane.showInputDialog("��й�ȣ �Է�");
		int mm = myJopInt("�Ա��� �ݾ� �Է�");
		if(mm < 0) {
			return "�������� �Ա� �ݾ��Դϴ�.";
		}
		money = mm;
		
		return "�Ϸ�";
	}
	
	
	public String show() {
		
		String pw = 
			JOptionPane.showInputDialog("��й�ȣ �Է�");
		if(!password.equals(pw)) {
			return "��й�ȣ ����ġ";
		}
		
		return "���� �ܾ� : " + money + "��";
	}
	
	
	public String save() {
		
		int mm = myJopInt("�Ա��� �ݾ� �Է�");
		if(mm < 0) {
			return "�������� �Ա� �ݾ��Դϴ�.";
		}
		
		money += mm;
		
		return "�Ա��� �Ϸ�Ǿ����ϴ�.";
	}
	
	
	public String draw() {
		String pw = JOptionPane.showInputDialog(
						"��й�ȣ �Է�");
		if(!password.equals(pw)) {
			return "��й�ȣ�� ��ġ���� �ʽ��ϴ�.";
		}
				
		int mm = myJopInt("������ �ݾ� �Է�");
		if(mm < 0) {
			return "�������� ���� �ݾ��Դϴ�.";
			
		} else if(mm > money) {
			return "�ܾ��� �����մϴ�.";
		}
		
		money -= mm;
		return "��� �Ϸ�";
	}
	
	
	
}


















