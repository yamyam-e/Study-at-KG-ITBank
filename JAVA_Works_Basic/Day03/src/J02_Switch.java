import javax.swing.JOptionPane;

public class J02_Switch {
	
	public static void main(String[] args) {
		
		String rcv1 = JOptionPane.showInputDialog("정수입력");
		int num1 = Integer.parseInt(rcv1);
		
//		switch 문에서 break 가 없으면 모든 케이를 다 실행 한다.
		switch(num1) {//정수, 단일문자, 문자열
		case 1:
			System.out.println("입력된 수는 1");
			break;
		case 2:
			System.out.println("입력된 수는 2");
			break;
		case 3:
			System.out.println("입력된 수는 3");
			break;
			
			default:
				System.out.println("해당 case 없음");
		}
		
//		단일문자 적용
		char c = 'Y';
		switch(c) {
		case 'Y':
			System.out.println("y가 선택됨");
			break;
		case 'N':
			System.out.println("N이 선택됨");
			break;
			
			default:
				System.out.println("해당사항 없음");
		}
		
//		문자열(String) 적용
		String r = JOptionPane.showInputDialog("저장하시겠습니까?(y/n)");
		
		switch(r) {
		case "y":
		case "Y":
			System.out.println("저장 완료");
			break;
			
		case "n":
		case "N":
			System.out.println("저장 취소");
			break;
			
			default:
				System.out.println("잘못된 입력");
		}
		
	}
}
