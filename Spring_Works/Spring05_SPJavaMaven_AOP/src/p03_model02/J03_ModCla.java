package p03_model02;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Component;

@Component("modBean")
public class J03_ModCla implements J02_Math{

	@Override
	public Object coreWorks() {
		
		String rcv = JOptionPane.showInputDialog("첫번째 정수 입력");
		int num1 = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("두번째 정수 입력");
		int num2 = Integer.parseInt(rcv);
		
		System.out.println("mod : " + num1 + " % " + num2 + " = " + (num1%num2));
		
		return "Mod 작업 정상 종료";
	}

}
