package entity;

import javax.swing.JOptionPane;

public class J20_BankAcount {
	
	private String name;
	private int age;
	private String pw;
	private int balance;
	
	
	
	public void open(String name, int age, String pw, int balance){
		this.name = name;
		this.age = age;
		this.pw = pw;
		this.balance = balance;
	}
	
	public String show(String pw){
		if(this.pw.equals(pw)){
			return name + "�� ���� �ܾ��� " + this.balance + "�� �Դϴ�.";
		} else {
			return "��й�ȣ�� �ùٸ��� �ʽ��ϴ�.";
		}
	}
	
	public String save(int inMon) {
		this.balance += inMon;
		return inMon + "���� �Ա��Ͽ����ϴ�.\n���� �ܾ��� " + this.balance +"�� �Դϴ�.";
	}
	
	public String withDraw(int outMon){
		if (outMon>this.balance) {
			return "���� �ܾ��� �����մϴ�.";
		} else {
			this.balance -= outMon;
			return outMon + "���� ����Ͽ����ϴ�.\n���� �ܾ��� " + this.balance +"�� �Դϴ�.";
		}
		
	}

}
