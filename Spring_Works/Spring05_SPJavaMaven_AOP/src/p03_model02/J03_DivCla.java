package p03_model02;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Component;

@Component("divBean")
public class J03_DivCla implements J02_Math{

	@Override
	public Object coreWorks() {
		
		String rcv = JOptionPane.showInputDialog("첫번째 정수 입력");
		int num1 = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("두번째 정수 입력");
		int num2 = Integer.parseInt(rcv);
		
		System.out.println("div : " + num1 + " / " + num2 + " = " + (num1/num2));
		
		return "Div 작업 정상 종료";
	}

}
