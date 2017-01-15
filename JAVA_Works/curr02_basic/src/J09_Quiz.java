import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J09_Quiz {
	public static void main(String[] args) {
		
//		JOptionPane && while &&......
		
//		1. 반복 구문 출력 프로그램
//			1. 정수 1개 및 문장을 입력 받은 후 다음과 같이 출력
//			2. 예:
//				입력사항 :
//				- 정수 입력 : 3
//				- 반복 출력하려는 문장 입력 : Hello Java
//				결과 화면
//					1. Hello Java
//					2. Hello Java
//					3. Hello Java
		String rcv1 = JOptionPane.showInputDialog("1. 출력하고 싶은 횟수 입력");
		int end = Integer.parseInt(rcv1);
		rcv1 = JOptionPane.showInputDialog("1. 출력할 문장을 입력");
		int start = 1;
		String res1 = "";
		
		while(start <= end) {
			res1 += start + ". " + rcv1 + "\n";
			++start;
		}
//		JOptionPane.showMessageDialog(null, new JTextArea(res1));
		
//		2. 총 합 산출 프로그램
//			1. 정수 2개를 입력했을 때
//				두 정수 범위 사이에 존재하는 모든 정수들의 함 산출
//			2. 예
//				입력 사항 :
//				- 첫번째 정수 입력 : 1
//				- 두번째 정수 입력 : 10
//				결과 화면 :
//					1~10 범위의 모든 정수 합 : 55
		String rcv2 = JOptionPane.showInputDialog("2. 첫번째 정수 입력");
		start = Integer.parseInt(rcv2);
		rcv2 = JOptionPane.showInputDialog("2. 두번째 정수 입력");
		end = Integer.parseInt(rcv2);
		int sum = 0;
		String res2 = start +"";
		
		while(start<=end){
			sum += start;
			++start;
		}
		res2 += "~" + end + " 범위의 모든 정수 합 : " + sum + "\n";
//		JOptionPane.showMessageDialog(null, new JTextArea(res2));
		
//		3. 총 곱 산출 프로그램
//			1. 정수 2개를 입력했을 때
//				두 정수 범위의 존재하는 7의 배수의 곱 산출
//			2. 예:
//				입력 사항 :
//				- 첫번째 정수 입력 : 1
//				- 두번째 정수 입력 : 20
//				결과 화면 :
//					1~20 범위의 7의 배수들의 곱 : 98
		String rcv3 = JOptionPane.showInputDialog("3. 첫번째 정수 입력");
		start = Integer.parseInt(rcv3);
		rcv3 = JOptionPane.showInputDialog("3. 두번째 정수 입력");
		end = Integer.parseInt(rcv3);
		int mul = 1;
		String res3 = start +"";
		
		while(start<=end){
			if (start%7==0) {
				mul *= start;
				if((end-start < 7)) {
					break;
				}
			}
			++start;
		}
		res3 += "~" + end + " 범위의 7의 배수들의 곱 : " + mul + "\n";
//		JOptionPane.showMessageDialog(null, new JTextArea(res3));
		
//		4. 총 합 및 마지막 수 산출 프로그램
//			1. 정수 2개를 입력했을 때
//				두 정수 범위에 존재하는 6의 배수들의 총 합 및
//				마지막에 더해진 수를 출력
//			2. 예:
//				입력 사항 :
//				- 첫번째 정수 입력 : 1
//				- 두번째 정수 입력 : 20
//				결과 화면 :
//				1~20 범위의 6의 배수 총 합 : 36, 마지막 수 : 18
		String rcv4 = JOptionPane.showInputDialog("4. 첫번째 정수 입력");
		start = Integer.parseInt(rcv4);
		rcv4 = JOptionPane.showInputDialog("4. 두번째 정수 입력");
		end = Integer.parseInt(rcv4);
		sum = 0;
		String res4 = start +"";
		int lastNum = 0;
		
		while(start<=end){
			if (start%6==0) {
				sum += start;
				lastNum = start;
				if((end-start < 6)) {
					break;
				}
			}
			++start;
		}
		res4+= "~" + end + " 범위의 6의 배수 총 합 : " + sum 
				+ " 마지막 수 : " + lastNum;
		JOptionPane.showMessageDialog(null, new JTextArea(res1 + res2 + res3 + res4));
		
	}

}







