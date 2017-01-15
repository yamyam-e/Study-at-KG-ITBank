package pmain;

import javax.swing.JOptionPane;

import entity.J20_BankAcount;

public class J20_mainCla {
	
	public static void main(String[] args) {
		
		String showMenu = "1. 통장개설\n2. 잔액확인\n3. 입금\n4. 출금\n5. 종료";
		J20_BankAcount ba = null;
		
		while(true) {
			String msg = null;
			String sel = JOptionPane.showInputDialog(showMenu);
			
			if (sel.equals("1")) {
				String rcv1 = JOptionPane.showInputDialog("이름입력");
				int rcv2 = Integer.parseInt(JOptionPane.showInputDialog("나이입력"));
				if (rcv2 <= 0) {
					msg = "나이가 올바르지 않습니다.";
				} else {
					String rcv3 = JOptionPane.showInputDialog("암호입력");
					int rcv4 = Integer.parseInt(JOptionPane.showInputDialog("입금액 입력"));
					if (rcv4<0) {
						msg = "금액이 올바르지 않습니다.";
					} else {
						ba = new J20_BankAcount();
						ba.open(rcv1, rcv2, rcv3, rcv4);
						msg = "통장이 개설 되었습니다.";
					}
				}
			} else if (sel.equals("2")) {
				String rcv3 = JOptionPane.showInputDialog("암호입력");
				msg = ba.show(rcv3);
				
			} else if (sel.equals("3")) {
				int rcv4 = Integer.parseInt(JOptionPane.showInputDialog("입금액 입력"));
				if (rcv4<0) {
					msg = "금액이 올바르지 않습니다.";
				} else {
					msg = ba.save(rcv4);
				}
			} else if (sel.equals("4")) {
				int rcv4 = Integer.parseInt(JOptionPane.showInputDialog("출금액 입력"));
				if (rcv4<0) {
					msg = "금액이 올바르지 않습니다.";
				} else {
					msg = ba.withDraw(rcv4);
				}
				
			} else if (sel.equals("5")) {
				break;
			} else {
				msg = "잘못된 입력";
			}
			JOptionPane.showMessageDialog(null, msg);
			
			
		}
		
	}
}
