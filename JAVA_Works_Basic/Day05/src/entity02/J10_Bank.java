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
			JOptionPane.showMessageDialog(null, "나이가 올바르지 않습니다.");
		}
	}
	public void setPass(int newPass) {
		this.pass = newPass;
	}
	public void setBalance(int newBalance) {
		if (newBalance > 0) this.balance = newBalance;
		else {
			JOptionPane.showMessageDialog(null, "금액이 올바르지 않습니다.");
		}
	}
	
	public String withdraw() {
		String rcv = JOptionPane.showInputDialog("출금액입력");
		int mon = Integer.parseInt(rcv);
		if (mon > 0 && mon < this.balance) {
			this.balance -= mon;
			return "출금액은 " + mon +"원\n잔액은 " + this.balance + "원 입니다.";
		} else if (mon > this.balance) {
			return "잔액이 부족합니다.";
		} else {
			return "출금액이 올바르지 않습니다.";
		}
	}
	
	public String save() {
		String rcv = JOptionPane.showInputDialog("입금액입력");
		int mon = Integer.parseInt(rcv);
		if (mon > 0) {
			this.balance += mon;
			return "입금액은 " + mon +"원\n잔액은 " + this.balance + "원 입니다.";
		} else {
			return "입금액이 올바르지 않습니다.";
		}
	}
	
	public boolean checkPass() {
		int inputPass = Integer.parseInt(JOptionPane.showInputDialog("비밀번호입력"));
		if (inputPass != pass) {
			return false;
		} else {
			return true;
		}
	}

}
