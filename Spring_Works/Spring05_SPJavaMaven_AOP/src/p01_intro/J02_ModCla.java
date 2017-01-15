package p01_intro;

import javax.swing.JOptionPane;

public class J02_ModCla {

public Object works(){
		
		System.out.println("프로그램 시작(관련 메모리 확보");
		
		try {
			String rcv = JOptionPane.showInputDialog("첫번째 정수 입력");
			int num1 = Integer.parseInt(rcv);
			rcv = JOptionPane.showInputDialog("두번째 정수 입력");
			int num2 = Integer.parseInt(rcv);
			System.out.println("mod : " + num1 + " % " + num2 + " = " + (num1%num2));
		} catch (Exception e) {
			System.out.println("예외 발생 : 정보 -" + e.getMessage());
		} finally {
			System.out.println("관련 메모리 반납");
		}
		
		System.out.println("프로그램 종료");
		
		return "Mod 작업이 정상 종료 :";
		
	}
}
