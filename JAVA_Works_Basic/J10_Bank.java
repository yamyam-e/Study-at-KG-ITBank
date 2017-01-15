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
		name = JOptionPane.showInputDialog("이름 입력");
		age = myJopInt("나이 입력");
		if(age < 0) {
			return "부적합한 나이입니다.";
		}
		password = JOptionPane.showInputDialog("비밀번호 입력");
		int mm = myJopInt("입금할 금액 입력");
		if(mm < 0) {
			return "부적합한 입금 금액입니다.";
		}
		money = mm;
		
		return "완료";
	}
	
	
	public String show() {
		
		String pw = 
			JOptionPane.showInputDialog("비밀번호 입력");
		if(!password.equals(pw)) {
			return "비밀번호 불일치";
		}
		
		return "현재 잔액 : " + money + "원";
	}
	
	
	public String save() {
		
		int mm = myJopInt("입금할 금액 입력");
		if(mm < 0) {
			return "부적합한 입금 금액입니다.";
		}
		
		money += mm;
		
		return "입금이 완료되었습니다.";
	}
	
	
	public String draw() {
		String pw = JOptionPane.showInputDialog(
						"비밀번호 입력");
		if(!password.equals(pw)) {
			return "비밀번호가 일치하지 않습니다.";
		}
				
		int mm = myJopInt("인출할 금액 입력");
		if(mm < 0) {
			return "부적합한 인출 금액입니다.";
			
		} else if(mm > money) {
			return "잔액이 부족합니다.";
		}
		
		money -= mm;
		return "출금 완료";
	}
	
	
	
}


















