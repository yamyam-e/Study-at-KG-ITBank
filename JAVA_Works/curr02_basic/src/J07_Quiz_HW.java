import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J07_Quiz_HW {
	public static void main(String[] args) {
		
//		문제1
//		- 1 ~ 12월 중 원하는 월을 입력
//		- 해당 월의 계절 출력
//			봄(3~5) / 여름(6~8) / 가을(9~11) / 겨울(12~2)
		
		String rcv1 = JOptionPane.showInputDialog("1 ~ 12월 중 원하는 월을 입력");
		int month = Integer.parseInt(rcv1);
		
		String res1 = "";
		
		switch(month) {
		case 3: case 4: case 5:
			res1 = "봄"; 	break;
		case 6: case 7: case 8:
			res1 = "여름"; 	break;
		case 9: case 10: case 11:
			res1 = "가을"; 	break;
		case 12: case 1: case 2:
			res1 = "겨울"; 	break;
			default:
				res1 = "잘 못된 입력입니다.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res1));
		
//		문제2
//		- "데이터를 정장하시겠습니까? (y/n)"
//		- y 또는 Y 를 입력한 경우
//			사람의 이름, 나이 정보를 입력받은 후 입력 정보를 출력
//		- n 또는 N 입력한 경우 => 아무 작업 없이 종료
//		- 잘못 입력한 경우 "잘못된 입력입니다."를 출려
		
		String rcv2 = JOptionPane.showInputDialog("데이터를 정장하시겠습니까? (y/n)");
		
		String res2 = "";
		
		switch(rcv2) {
		case "y": case "Y":
			String name = JOptionPane.showInputDialog("이름 입력");
			String rcv3 = JOptionPane.showInputDialog("나이 입력");
			int age = Integer.parseInt(rcv3);
			res2 = "[입력한정보]\n" + "이름 : " + name + "\n" + "나이 : " + age + "살";
			JOptionPane.showMessageDialog(null, new JTextArea(res2));
			break;
			
		case "n": case "N":
			break;
			
			default :
				res2 = "잘 못된 입력입니다.";
				JOptionPane.showMessageDialog(null, new JTextArea(res2));
		}
		
//		숙제
//		정수 2개와 사칙연산 부호( +, -, *, / ) 를 입력받아
//			그 결과를 출력하는 계산기를 작성하세요.
		
		String rcv3 = JOptionPane.showInputDialog("첫번째 수를 입력");
		int num1 = Integer.parseInt(rcv3);
		rcv3 = JOptionPane.showInputDialog("두번째 수를 입력"); 
		int num2 = Integer.parseInt(rcv3);
		rcv3 = JOptionPane.showInputDialog("사칙연산 부호( +, -, *, / )입력");
		
		String res3 = "";
		
		switch(rcv3) {
		case "+":
			//int sum = num1 + num2;
			res3 = num1 +  " + " + num2 + " = " + (num1 + num2);
			break;
		case "-":
			//int sub = num1 - num2;
			res3 = num1 +  " - " + num2 + " = " + (num1 - num2);
			break;
		case "*":
			//int mul = num1 * num2;
			res3 = num1 +  " X " + num2 + " = " + (num1 * num2);
			break;
		case "/":
			//int div = num1 / num2;
			res3 = num1 +  " / " + num2 + " = " + (num1 / num2);
			break;
			
			default:
				res3 = "잘못된 입력입니다.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res3));
	}

}









