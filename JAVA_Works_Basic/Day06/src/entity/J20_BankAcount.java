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
			return name + "의 현재 잔액은 " + this.balance + "원 입니다.";
		} else {
			return "비밀번호가 올바르지 않습니다.";
		}
	}
	
	public String save(int inMon) {
		this.balance += inMon;
		return inMon + "원을 입금하였습니다.\n현재 잔액은 " + this.balance +"원 입니다.";
	}
	
	public String withDraw(int outMon){
		if (outMon>this.balance) {
			return "현재 잔액이 부족합니다.";
		} else {
			this.balance -= outMon;
			return outMon + "원을 출금하였습니다.\n현재 잔액은 " + this.balance +"원 입니다.";
		}
		
	}

}
