import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J07_Quiz_HW {
	public static void main(String[] args) {
		
//		����1
//		- 1 ~ 12�� �� ���ϴ� ���� �Է�
//		- �ش� ���� ���� ���
//			��(3~5) / ����(6~8) / ����(9~11) / �ܿ�(12~2)
		
		String rcv1 = JOptionPane.showInputDialog("1 ~ 12�� �� ���ϴ� ���� �Է�");
		int month = Integer.parseInt(rcv1);
		
		String res1 = "";
		
		switch(month) {
		case 3: case 4: case 5:
			res1 = "��"; 	break;
		case 6: case 7: case 8:
			res1 = "����"; 	break;
		case 9: case 10: case 11:
			res1 = "����"; 	break;
		case 12: case 1: case 2:
			res1 = "�ܿ�"; 	break;
			default:
				res1 = "�� ���� �Է��Դϴ�.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res1));
		
//		����2
//		- "�����͸� �����Ͻðڽ��ϱ�? (y/n)"
//		- y �Ǵ� Y �� �Է��� ���
//			����� �̸�, ���� ������ �Է¹��� �� �Է� ������ ���
//		- n �Ǵ� N �Է��� ��� => �ƹ� �۾� ���� ����
//		- �߸� �Է��� ��� "�߸��� �Է��Դϴ�."�� ���
		
		String rcv2 = JOptionPane.showInputDialog("�����͸� �����Ͻðڽ��ϱ�? (y/n)");
		
		String res2 = "";
		
		switch(rcv2) {
		case "y": case "Y":
			String name = JOptionPane.showInputDialog("�̸� �Է�");
			String rcv3 = JOptionPane.showInputDialog("���� �Է�");
			int age = Integer.parseInt(rcv3);
			res2 = "[�Է�������]\n" + "�̸� : " + name + "\n" + "���� : " + age + "��";
			JOptionPane.showMessageDialog(null, new JTextArea(res2));
			break;
			
		case "n": case "N":
			break;
			
			default :
				res2 = "�� ���� �Է��Դϴ�.";
				JOptionPane.showMessageDialog(null, new JTextArea(res2));
		}
		
//		����
//		���� 2���� ��Ģ���� ��ȣ( +, -, *, / ) �� �Է¹޾�
//			�� ����� ����ϴ� ���⸦ �ۼ��ϼ���.
		
		String rcv3 = JOptionPane.showInputDialog("ù��° ���� �Է�");
		int num1 = Integer.parseInt(rcv3);
		rcv3 = JOptionPane.showInputDialog("�ι�° ���� �Է�"); 
		int num2 = Integer.parseInt(rcv3);
		rcv3 = JOptionPane.showInputDialog("��Ģ���� ��ȣ( +, -, *, / )�Է�");
		
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
				res3 = "�߸��� �Է��Դϴ�.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res3));
	}

}









