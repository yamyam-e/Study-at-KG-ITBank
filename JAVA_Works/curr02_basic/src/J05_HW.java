import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J05_HW {
	public static void main(String[] args) {

//		1. 정수 2개를 입력받아 다음 결과를 출력
		String rcv = JOptionPane.showInputDialog("첫번째 정수 입력");
		int num1 = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("두번째 정수 입력");
		int num2 = Integer.parseInt(rcv);
		
		String res = "";
		
//		1. 큰 수 출력
//		2. 작은 수의 짝수-홀수 출력
//		3. 두 정수의 합이 짝수이고, 3의 배수인지 출력
		
		if(num1>num2) { //큰 수 출력
			res = "첫번째수 " + num1 + " 더 큽니다." ;
		} else {
			res = "두번째수 " + num2 + " 더 큽니다." ;
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
		
		if(num1>num2) { //작은 수의 짝수-홀수 출력
			if(num2%2==0) {
				res = "작은 수 " + num2 + " 짝수 입니다." ;
			} else {
				res = "작은 수 " + num2 + " 홀수 입니다." ;
			}	
		} else {
			if(num1%2==0) {
				res = "작은 수" + num1 + "는 짝수 입니다." ;
			} else {
				res = "작은 수" + num1 + "는 홀수 입니다." ;
			}	
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
			
		int sum = num1 + num2;
		if (sum%2==0 && sum%3 == 0) { // 두 정수의 합이 짝수이고, 3의 배수인지 출력
			res = "두 정수의 합 " + sum + "은 짝수이고, 3의 배수입니다.";
		} else {
			res = "두 정수의 합 " + sum + "은 짝수 또는 3의 배수가 아닙니다.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
		
//		2. 정수 3개를 입력받아 다음 결과를 출력
//			1. 큰 수 출력
//			2. 큰 수와 작은 수의 차이가 50보다 큰지, 아닌지 출력
		rcv = JOptionPane.showInputDialog("첫번째 정수 입력");
		int num11 = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("두번째 정수 입력");
		int num22 = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("세번째 정수 입력");
		int num33 = Integer.parseInt(rcv);
		int max, small;

		if(num11>num22 && num11>num33) {
			res ="큰수는 " + num11;
			max = num11;
			if(num22>num33) {
				small = num33;
			} else {
				small = num22;
			}
		} else if (num22>num33 && num22>num11) {
			res ="큰수는 " + num22;
			max = num22;
			if(num33>num11) {
				small = num11;
			} else {
				small = num33;
			}
		} else { // (num33>num11 &&num33>num22)
			res ="큰수는 " + num33;
			max = num33;
			if(num11>num22) {
				small = num22;
			} else {
				small = num11;
			}
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
		
		int sub = max - small;
		
		if(sub>50){
			res = "두 수의 차가 50보다 큽니다.";
		} else {
			res = "두 수의 차가 50보다 작습니다.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
	}

}













