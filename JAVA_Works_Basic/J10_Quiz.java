package pmain;

import javax.swing.JOptionPane;

import entity02.J10_Bank;

public class J10_Quiz {
	public static void main(String[] args) {
		
//		문제 : 은행 계좌 프로그램
		
//		메뉴 : 
//			1. 통장 개설
//				- 이름, 나이, 비밀번호, 잔액
//				- 개설 시 나이가 0보다 작은 경우 에러
//				- 개설 시 입금 금액이 0보다 작은 경우 에러
//			2. 잔액 조회
//				- 개설 시 입력한 비밀번호와 일치하지 않으면 에러
//			3. 입금
//				- 입금 금액이 0보다 작으면 에러
//			4. 출금
//				- 비밀번호 불일치 시 에러
//				- 출금 금액이 0보다 작으면 에러
//				- 출금 금액이 입금 금액보다 크면 에러
//			5. 프로그램 종료
		
		String showMenu = 
				"1. 통장 개설\n"
				+ "2. 잔액 조회\n"
				+ "3. 입금\n"
				+ "4. 출금\n"
				+ "5. 프로그램 종료";
		
		J10_Bank myAcc = null;
		
		while(true) {
			String sel = 
				JOptionPane.showInputDialog(showMenu);
			
			String msg = null;
			if(sel.equals("1")) {	// 개설
				myAcc = new J10_Bank();
				String res = myAcc.open();
				
				if(res.equals("완료")) {
					msg = "통장 개설 완료";
				} else {
					msg = res;
					myAcc = null;
				}
				
			} else if(sel.equals("2")) {	// 잔액조회
				if(myAcc != null) {
					msg = myAcc.show();
					
				} else {
					msg = "통장이 개설되지 않았습니다.";
				}
				
			} else if(sel.equals("3")) {	// 입금
				if(myAcc != null) {
					msg = myAcc.save();
					
				} else {
					msg = "통장이 개설되지 않았습니다.";
				}
				
			} else if(sel.equals("4")) {	// 출금
				if(myAcc != null) {
					msg = myAcc.draw();
				} else {
					msg = "통장이 개설되지 않았습니다.";
				}
			
			} else if(sel.equals("5")) {
				break;
			} else {
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
		
		
		
	}
}













