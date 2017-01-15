package entity02;

import javax.swing.JOptionPane;

public class J10_Bank {
	
	private String name;
	private int age;
	private int pass;
	private int balance;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPass() {
		return pass;
	}
	public int getBalance() {
		return balance;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	public void setAge(int newAge) {
		if(newAge > 0) this.age = newAge;
		else {
			JOptionPane.showMessageDialog(null, "���̰� �ùٸ��� �ʽ��ϴ�.");
		}
	}
	public void setPass(int newPass) {
		this.pass = newPass;
	}
	public void setBalance(int newBalance) {
		if (newBalance > 0) this.balance = newBalance;
		else {
			JOptionPane.showMessageDialog(null, "�ݾ��� �ùٸ��� �ʽ��ϴ�.");
		}
	}
	
	public String withdraw() {
		String rcv = JOptionPane.showInputDialog("��ݾ��Է�");
		int mon = Integer.parseInt(rcv);
		if (mon > 0 && mon < this.balance) {
			this.balance -= mon;
			return "��ݾ��� " + mon +"��\n�ܾ��� " + this.balance + "�� �Դϴ�.";
		} else if (mon > this.balance) {
			return "�ܾ��� �����մϴ�.";
		} else {
			return "��ݾ��� �ùٸ��� �ʽ��ϴ�.";
		}
	}
	
	public String save() {
		String rcv = JOptionPane.showInputDialog("�Աݾ��Է�");
		int mon = Integer.parseInt(rcv);
		if (mon > 0) {
			this.balance += mon;
			return "�Աݾ��� " + mon +"��\n�ܾ��� " + this.balance + "�� �Դϴ�.";
		} else {
			return "�Աݾ��� �ùٸ��� �ʽ��ϴ�.";
		}
	}
	
	public boolean checkPass() {
		int inputPass = Integer.parseInt(JOptionPane.showInputDialog("��й�ȣ�Է�"));
		if (inputPass != pass) {
			return false;
		} else {
			return true;
		}
	}

}
