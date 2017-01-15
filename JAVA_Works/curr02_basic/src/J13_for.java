import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J13_for {
	public static void main(String[] args) {
		
//		for(초기식; 조건식; 증감식) {
//			반복할 명령;
//		}
		
//		1. 1 ~ 10 범위의 모든 정수 출력 : 시작값1, 끝값10
		for(int i=1; i<=10; i++){
			System.out.println(i + ". " + i);
		}
		
		
//		2. "안녕" 5번 출력 : 시작값11, 끝값15;
		for(int i=11; i<=15; i++){
			System.out.println(i + ". " + "안녕");
		}
		
		
//		문제 : 1 ~ 20 범위에 존재하는 모든 정수들의 합
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			sum += i;
		}
		JOptionPane.showMessageDialog(null, new JTextArea("1 ~ 20 범위에 존재하는 모든 정수들의 합 : " + sum));
	}

}









