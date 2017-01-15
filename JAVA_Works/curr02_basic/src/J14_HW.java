import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J14_HW {
	public static void main(String[] args) {
		
//		JOptionPane과 for문을 이용하여 작성
		
//		1. 1~100 범위 중 3의 배수들의 총 합
		
		String msg = "";
		
		int sum = 0;
		for(int i=0; i<=100; i+=3) {
			sum += i;
		}
		msg += "1. 1~100 범위 중 3의 배수들의 총 합 :" + sum;
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
//		2. 구구단 출력 프로그램
//			1. 전체 국단 출력
//			2. 1~9의 범위 정수를 입력받은 후, 해당 구구단만 출력
		msg = "[ 1단 ]\t [ 2단 ]\t [ 3단 ]\t [ 4단 ]\t [ 5단 ]\t [ 6단 ]\t [ 7단 ] \t [ 8단 ]\t [ 9단 ]\n";
		for(int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				msg += j + " X " + i + " = " + (i*j) + "\t";
			}
			msg += "\n";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
		while(true){
			String rcv = JOptionPane.showInputDialog("1~9 사이 정수 입력");
			if("123456789".contains(rcv)) {
				int num = Integer.parseInt(rcv);
				msg = "[ " + num + "단]\n";
				for(int i=1; i<10; i++) {
					msg += num + " X " + i + " = " + (num*i) + "\n";
				}
				break;
			} else {
				msg = "잘못된 입력입니다.";
				JOptionPane.showMessageDialog(null, new JTextArea(msg));
			}
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
//		3. 1년 전체 달력 만들기
//			- 홀수 월 : 1일이 월요일 / 마지막날 31일
//			- 짝수 월 : 1일이 목요일 / 마지막날 30일
//			- 2월 : 1일이 화요일 / 마지막날 28일
		
		int date = 0, day = 0; // day는 요일에 대한 숫자
							   // date는 각 달의 마지막날
		msg = "[";
		for(int month=1; month<13; month++){
			
			msg += month + " 월]\n"
					+ "일\t월\t화\t수\t목\t금\t토\n";
			if(month%2 == 0) { // 짝수월
				if(month == 2) { // 2월
					day = 2;
					date = 28;
				} else {
					day = 4;
					date = 30;
				}
			} else { // 홀수월
				day = 1;
				date = 31;
			}
			
			for(int i=1; i<=day; i++) { // 공백
				msg +="\t";
			}
			
			for(int i=1; i<=date; i++) { // 날짜
				msg += i + "\t";
				if((day+i)%7 == 0) {
					msg += "\n";
				}
			}
			
			if (month<12) msg += "\n\n[";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
//		예시:
//		if(홀수월?) {
//			day = 1; date = 31;	
//		}
		
		
	}
	
}
