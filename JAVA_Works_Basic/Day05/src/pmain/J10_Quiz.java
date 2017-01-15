package pmain;

import javax.swing.JOptionPane;

import entity02.J10_Bank;

public class J10_Quiz {
	
	public static void main(String[] args) {
		
//		문제 : 은행 계좌 프로그램
//		메뉴 :
//			1. 통장 개설
//				- 이름, 나이, 비밀번호, 잔액
//				- 개설 시 나이가 0 보다 작은 경우 에러
//				- 개설 시 입금 금액이 0보다 작은 경우 에러
//			2. 잔액 조회
//				- 개설 시 입력한 비밀번호와 일치하지 않은면
//			3. 입금
//				- 입금 금액이 0보다 작으면 에러
//			4. 출금
//				- 비밀번호 불일치 시 에러
//				- 출금 금액이 0보다 작으면 에러
//				- 출금 금액이 입금 금액보다 크면 에러
//			5. 프로그램 종료
		String showMenu = "1. 통장 개설\n2. 잔액조회\n3. 입금\n4. 출금\n5. 프로그램종료";
		J10_Bank myAcc = null;
		
		while(true) {
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			if (sel.equals("1")) {//1.통장개설
				myAcc = new J10_Bank();
				String rcv1 = JOptionPane.showInputDialog("이름입력");
				myAcc.setName(rcv1);
				rcv1 = JOptionPane.showInputDialog("나이입력");
				if (Integer.parseInt(rcv1) > 0) { 
					myAcc.setAge(Integer.parseInt(rcv1));
					rcv1 = JOptionPane.showInputDialog("입금금액입력");
					if (Integer.parseInt(rcv1) > 0) { 
						myAcc.setBalance(Integer.parseInt(rcv1));
						rcv1 = JOptionPane.showInputDialog("비밀번호입력");
						myAcc.setPass(Integer.parseInt(rcv1));
						msg = "통장개설완료";
					}
				}
				else {
					msg = "나이가 올바르지 않습니다.";
					myAcc = null;
				}
			} else if (sel.equals("2")) {//2.잔액조회
				if (myAcc == null) 	msg = "통장이 개설되지 않았습니다.";
				else {
					if (myAcc.checkPass()) msg = "잔액은" + myAcc.getBalance() + "원 입니다.";	
					else msg = "비밀번호가 올바르지 않습니다.";
				}
			} else if (sel.equals("3")) {//3.입금
				if (myAcc == null) 	msg = "통장이 개설되지 않았습니다.";
				else msg = myAcc.save();
			} else if (sel.equals("4")) {//4.출금
				if (myAcc == null) 	msg = "통장이 개설되지 않았습니다.";
				else {
					if (myAcc.checkPass())	msg = myAcc.withdraw();
					else msg = "비밀번호가 올바르지 않습니다.";
				}
			} else if (sel.equals("5")) {//5. 종료
				break;
			} else {//오류
				msg = "잘못된 입력입니다.";
			}
			
			if (msg != null) JOptionPane.showMessageDialog(null, msg);
		}
		
	}

}
