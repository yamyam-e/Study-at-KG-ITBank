import javax.swing.JOptionPane;

public class J02_Switch {
	
	public static void main(String[] args) {
		
		String rcv1 = JOptionPane.showInputDialog("�����Է�");
		int num1 = Integer.parseInt(rcv1);
		
//		switch ������ break �� ������ ��� ���̸� �� ���� �Ѵ�.
		switch(num1) {//����, ���Ϲ���, ���ڿ�
		case 1:
			System.out.println("�Էµ� ���� 1");
			break;
		case 2:
			System.out.println("�Էµ� ���� 2");
			break;
		case 3:
			System.out.println("�Էµ� ���� 3");
			break;
			
			default:
				System.out.println("�ش� case ����");
		}
		
//		���Ϲ��� ����
		char c = 'Y';
		switch(c) {
		case 'Y':
			System.out.println("y�� ���õ�");
			break;
		case 'N':
			System.out.println("N�� ���õ�");
			break;
			
			default:
				System.out.println("�ش���� ����");
		}
		
//		���ڿ�(String) ����
		String r = JOptionPane.showInputDialog("�����Ͻðڽ��ϱ�?(y/n)");
		
		switch(r) {
		case "y":
		case "Y":
			System.out.println("���� �Ϸ�");
			break;
			
		case "n":
		case "N":
			System.out.println("���� ���");
			break;
			
			default:
				System.out.println("�߸��� �Է�");
		}
		
	}
}
