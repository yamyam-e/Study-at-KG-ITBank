import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J14_HW {
	public static void main(String[] args) {
		
//		JOptionPane�� for���� �̿��Ͽ� �ۼ�
		
//		1. 1~100 ���� �� 3�� ������� �� ��
		
		String msg = "";
		
		int sum = 0;
		for(int i=0; i<=100; i+=3) {
			sum += i;
		}
		msg += "1. 1~100 ���� �� 3�� ������� �� �� :" + sum;
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
//		2. ������ ��� ���α׷�
//			1. ��ü ���� ���
//			2. 1~9�� ���� ������ �Է¹��� ��, �ش� �����ܸ� ���
		msg = "[ 1�� ]\t [ 2�� ]\t [ 3�� ]\t [ 4�� ]\t [ 5�� ]\t [ 6�� ]\t [ 7�� ] \t [ 8�� ]\t [ 9�� ]\n";
		for(int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				msg += j + " X " + i + " = " + (i*j) + "\t";
			}
			msg += "\n";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
		while(true){
			String rcv = JOptionPane.showInputDialog("1~9 ���� ���� �Է�");
			if("123456789".contains(rcv)) {
				int num = Integer.parseInt(rcv);
				msg = "[ " + num + "��]\n";
				for(int i=1; i<10; i++) {
					msg += num + " X " + i + " = " + (num*i) + "\n";
				}
				break;
			} else {
				msg = "�߸��� �Է��Դϴ�.";
				JOptionPane.showMessageDialog(null, new JTextArea(msg));
			}
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
//		3. 1�� ��ü �޷� �����
//			- Ȧ�� �� : 1���� ������ / �������� 31��
//			- ¦�� �� : 1���� ����� / �������� 30��
//			- 2�� : 1���� ȭ���� / �������� 28��
		
		int date = 0, day = 0; // day�� ���Ͽ� ���� ����
							   // date�� �� ���� ��������
		msg = "[";
		for(int month=1; month<13; month++){
			
			msg += month + " ��]\n"
					+ "��\t��\tȭ\t��\t��\t��\t��\n";
			if(month%2 == 0) { // ¦����
				if(month == 2) { // 2��
					day = 2;
					date = 28;
				} else {
					day = 4;
					date = 30;
				}
			} else { // Ȧ����
				day = 1;
				date = 31;
			}
			
			for(int i=1; i<=day; i++) { // ����
				msg +="\t";
			}
			
			for(int i=1; i<=date; i++) { // ��¥
				msg += i + "\t";
				if((day+i)%7 == 0) {
					msg += "\n";
				}
			}
			
			if (month<12) msg += "\n\n[";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
//		����:
//		if(Ȧ����?) {
//			day = 1; date = 31;	
//		}
		
		
	}
	
}
