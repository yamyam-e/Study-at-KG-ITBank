import javax.swing.JOptionPane;

public class J06_Switch {
	public static void main(String[] args) {
		
//		switch - case
//		- �Էµ� ���� ������ ���� ���� case�� �ش� ����� ������ ��,
//			������ ��� ����� ����
		
		String rcv1 = JOptionPane.showInputDialog("���� �Է�(1~3)");
		int num1 = Integer.parseInt(rcv1);
		System.out.println("1. num1 : " + num1);
		
		switch(num1) {
		
		case 1 :
			System.out.println("1. 1�� �Էµ�");
		case 2 :
			System.out.println("1. 2�� �Էµ�");
		case 3 :
			System.out.println("1. 3�� �Էµ�");
		}
		
		
//		switch - case
		
		String rcv2 = JOptionPane.showInputDialog("���� �Է�(1~3)");
		int num2 = Integer.parseInt(rcv2);
		System.out.println("2. num2 : " + num2);
		
		switch(num2) {
		
		case 1 :
			System.out.println("2. 1�� �Էµ�");
			break;
			
		case 2 :
			System.out.println("2. 2�� �Էµ�");
			break;
			
		case 3 :
			System.out.println("2. 3�� �Էµ�");
			break;
			
		}
		
		
//		switch - case - break - default
		
		String rcv3 = JOptionPane.showInputDialog("���� �Է�(1~3)");
		int num3 = Integer.parseInt(rcv3);
		System.out.println("3. num3 : " + num3);
		
		switch(num3) {
		
		case 1 :
			System.out.println("3. 1�� �Էµ�");
			break;
			
		case 2 :
			System.out.println("3. 2�� �Էµ�");
			break;
			
		case 3 :
			System.out.println("3. 3�� �Էµ�");
			break;
			
			default :
				System.out.println("3. �߸��� �Է��Դϴ�.");
		}
	
		
//		�������� case�� �������� ��� ���� ����
		
		String rcv4 = JOptionPane.showInputDialog("���� �Է�(1~6)");
		int num4 = Integer.parseInt(rcv4);
		System.out.println("4. num4 : " + num4);
		
		switch(num4) {
		
		case 2://���� ���̽��� ���뱸���� �� �� �ִ�.
		case 4:
		case 6:
			System.out.println("4. ¦��");
			break;
		case 1:		case 3:
			System.out.println("4. Ȧ��");
			break;
		}
		
		
		
//		switch - case �������� ��� ������ ����
//		: int, char, String
		
		char rcv5 = 'y';
		
		switch(rcv5) {
		
		case 'y': 	case 'Y':
			System.out.println("5. ���� �Ϸ�");		break;
			
		case 'n': 	case 'N':
			System.out.println("5. ���� ���");		break;
		}
		
		
//		���� ���α׷�
		String rcv6 = JOptionPane.showInputDialog("���ϴ� �ܾ� �Է�(spring/summer/autumn/winter)");
		System.out.println("6. �Էµ� �ܾ� : " + rcv6);
		
		switch(rcv6) {
		
		case "spring" :
			System.out.println("6. ���Դϴ�."); 	break;
		case "summer" :
			System.out.println("6. �����Դϴ�."); 	break;
		case "autumn" :
			System.out.println("6. �������Դϴ�."); 	break;
		case "winter" :
			System.out.println("6. �ܿﺽ�Դϴ�."); 	break;
		}
		
		
		
	}

}












