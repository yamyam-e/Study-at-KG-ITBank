import javax.swing.JOptionPane;

public class J01_Quiz {
	
	public static void main(String[] args) {
		
//		1. 정수 한 개를 입력받은 후 수의 범위를 다음과 같이 출력
//		- "입력된 수는 1~10 범위의 수" 
//		- "입력된 수는 11~20 범위의 수"
//		- "입력된 수는 21~30 범위의 수"
		String rcv = JOptionPane.showInputDialog("정수 한개를 입력");
		int inputNum = Integer.parseInt(rcv);

		String msg = null;
		
		if (inputNum >= 1 && inputNum <= 10) {
			msg = "입력된 수는 1~10 범위의 수";
		} else if (inputNum >= 11 && inputNum <= 20) {
			msg = "입력된 수는 11~20 범위의 수";
		} else if (inputNum >= 21 && inputNum <= 30) {
			msg = "입력된 수는 21~30 범위의 수";
		}
		JOptionPane.showMessageDialog(null, msg);
		
//		2.정수 2개를 입력 받아서
//		- 두 수의 합이 2의 배수이면 "2의 배수"
//		- 두 수의 합이 3의 배수이면 "3의 배수"
//		- 해당사항 없으면 "해당사항 없음"
		
		rcv = JOptionPane.showInputDialog("정수 두개를 입력합니다.\n" + "첫번째 수 입력");
		int num1 = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("두번째 수 입력");
		int num2 = Integer.parseInt(rcv);
		
		int sum = num1 + num2;
		
		if (sum%2 == 0) {
			msg = "2의 배수";
		} else if (sum%3 == 0) {
			msg = "3의 배수";
		} else {
			msg = "해당사항 없음"; 
		}
		JOptionPane.showMessageDialog(null, msg);
	
	}

}
