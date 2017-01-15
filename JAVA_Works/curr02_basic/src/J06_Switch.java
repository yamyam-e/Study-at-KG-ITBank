import javax.swing.JOptionPane;

public class J06_Switch {
	public static void main(String[] args) {
		
//		switch - case
//		- 입력된 값과 동일한 값을 가진 case의 해당 명령을 실행한 후,
//			이후의 모든 명령을 실행
		
		String rcv1 = JOptionPane.showInputDialog("정수 입력(1~3)");
		int num1 = Integer.parseInt(rcv1);
		System.out.println("1. num1 : " + num1);
		
		switch(num1) {
		
		case 1 :
			System.out.println("1. 1이 입력됨");
		case 2 :
			System.out.println("1. 2이 입력됨");
		case 3 :
			System.out.println("1. 3이 입력됨");
		}
		
		
//		switch - case
		
		String rcv2 = JOptionPane.showInputDialog("정수 입력(1~3)");
		int num2 = Integer.parseInt(rcv2);
		System.out.println("2. num2 : " + num2);
		
		switch(num2) {
		
		case 1 :
			System.out.println("2. 1이 입력됨");
			break;
			
		case 2 :
			System.out.println("2. 2이 입력됨");
			break;
			
		case 3 :
			System.out.println("2. 3이 입력됨");
			break;
			
		}
		
		
//		switch - case - break - default
		
		String rcv3 = JOptionPane.showInputDialog("정수 입력(1~3)");
		int num3 = Integer.parseInt(rcv3);
		System.out.println("3. num3 : " + num3);
		
		switch(num3) {
		
		case 1 :
			System.out.println("3. 1이 입력됨");
			break;
			
		case 2 :
			System.out.println("3. 2이 입력됨");
			break;
			
		case 3 :
			System.out.println("3. 3이 입력됨");
			break;
			
			default :
				System.out.println("3. 잘못된 입력입니다.");
		}
	
		
//		여러가지 case의 공통적인 명령 실행 구조
		
		String rcv4 = JOptionPane.showInputDialog("정수 입력(1~6)");
		int num4 = Integer.parseInt(rcv4);
		System.out.println("4. num4 : " + num4);
		
		switch(num4) {
		
		case 2://여러 케이스의 공통구문을 줄 수 있다.
		case 4:
		case 6:
			System.out.println("4. 짝수");
			break;
		case 1:		case 3:
			System.out.println("4. 홀수");
			break;
		}
		
		
		
//		switch - case 구문에서 사용 가능한 형태
//		: int, char, String
		
		char rcv5 = 'y';
		
		switch(rcv5) {
		
		case 'y': 	case 'Y':
			System.out.println("5. 저장 완료");		break;
			
		case 'n': 	case 'N':
			System.out.println("5. 저장 취소");		break;
		}
		
		
//		사전 프로그램
		String rcv6 = JOptionPane.showInputDialog("원하는 단어 입력(spring/summer/autumn/winter)");
		System.out.println("6. 입력된 단어 : " + rcv6);
		
		switch(rcv6) {
		
		case "spring" :
			System.out.println("6. 봄입니다."); 	break;
		case "summer" :
			System.out.println("6. 여름입니다."); 	break;
		case "autumn" :
			System.out.println("6. 가을봄입니다."); 	break;
		case "winter" :
			System.out.println("6. 겨울봄입니다."); 	break;
		}
		
		
		
	}

}












