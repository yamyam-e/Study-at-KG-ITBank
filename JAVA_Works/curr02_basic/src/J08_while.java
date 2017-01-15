import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class J08_while {
	public static void main(String[] args) {
		
//		while
//		- 조건식이 참인 경우, 해당 명령 실행 후 다시 조건식을 판별
//		
		
//		while(true){
//			System.out.println("1. 무한 루프 출력");
//		}
//		
//		int a;
//		=> 무한 루프 이후에서는 명령 불가능
		
		
//		반복문 작성 방법
//		1. 반복하고자 하는 내용에 대하여 범위 또는 횟수를 파악
//		2. 반복하고자 하는 내용에 따라
//			- 범위인 경우, 시작값과 끝값을 파악
//			- 횟수인 경우, 횟수를 범위 형식으로 변환한 후
//							시작값과 끝값을 결정
//		3. 반복문이 사용할 변수 선언한다.
//			- 일반적으로 int
//		4. 선언된 변수에 시작값을 저장
//		5. 반복문의 조건식을 통해서 끝값에 대한 범위를 표현
//		6. 반복 과정 속에서, 선언된 변수가 증가 또는 감소되도록 증감식 명령
//		7. 반복하고자 하는 명령을 입력
		
		
//		1. 1~10 범위에 존재하는 모든 정수 출력 : 시작값1, 끝값10
		int a = 1;
		while(a <= 10){
			System.out.println("1. a : " + a);
			a++;
		}
		
//		2. "안녕"을 5번 출력 : 시작값1~끝값5 / 0~4 / 15~19
		int b = 1;
		while(b <= 5){
			System.out.println("2. 안녕");
			b++;
		}
		
		
//		while - if - break;
		
		while(true){
			String rcv3 = JOptionPane.showInputDialog("3. 데이터 입력(종료:0)");
			
			if(rcv3.equals("0")){
				break;
			}
			
			JOptionPane.showMessageDialog(null, 
					new JTextArea("2. 정장 완료\n 저장을 계속합니다."));
		}
		
		
//		while - if - continue
//		- 특정 상황에서 반복문의 조건식으로 이동하고자 할 때 사용
		
		while(true){ // 입력을 정상적으로 하면 한번만 수행함.
			String rcv4 = JOptionPane.showInputDialog("4. 정수 입력(1~5)");
			int num4 = Integer.parseInt(rcv4);
			
			if(num4 < 1 || num4 > 5) {
				JOptionPane.showMessageDialog(null, 
						new JTextArea("4. 다시입력하세요. 처음으로 돌아갑니다."));
				continue; // while 조건식으로 이동해서 다시 시작.
						  // continue 키워드는 while문에서만 for문에서 사용하면 증감식으로 이동	
			}
			
			JOptionPane.showMessageDialog(null, new JTextArea("4. 입력된 수 : " + num4));
			break;
		}
		
		
//		while - switch - break label
//		- break가 영향을 주는 대상 3가지 : switch, while, for
//		- 대상이 중첩적으로 사용된 경우,
//			가장 가까이에 있는 대상에 영향을 줌
		
		abc : while(true){
			String rcv5 = JOptionPane.showInputDialog("5. 알림을 보시겠습니까?(y/n)");
			
			switch(rcv5) {
			
			case "y" : case "Y" :
				JOptionPane.showMessageDialog(null, 
						new JTextArea("5. 5시에 미팅이 있습니다."));
				break;
			
			case "n" : case "N" :
				JOptionPane.showMessageDialog(null, 
						new JTextArea("5. 프로그램 종료"));
				break abc;
				
			}
			
		}
		
		
//		do - while
//		- 명령을 무조건 1회 실행 후, 
//			while문의 조건식을 통해 반복 여부를 판단
		String rcv6  = null;
		do {
			
			rcv6 = JOptionPane.showInputDialog(
					"6. 미팅이 7시 입니다.\n" + "알림을 계속 보시겠습니까? (y/n)");
			
		} while(rcv6.equals("y"));
		
		
	}

}














