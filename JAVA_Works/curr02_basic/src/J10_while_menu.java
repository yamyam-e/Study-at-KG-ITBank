import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J10_while_menu {
	public static void main(String[] args) {
		
//		��ǻ�� ���� ���� ���α׷�
//		1. ���� �׸�
//		 	- �귣���̸�, Ű���尡��, ����Ͱ���, ��ü����, �ѱ��Ű���
//		2. �޴�
//			1. ��ǻ�� ���� �Է�
//			2. ��ǻ�� ���� ����
//			3. ���α׷� ����

		String showMenu = "1. ��ǻ�� ���� �Է�\n" 
							+ "2. ��ǻ�� ���� ����\n"
							+ "3. ���α׷� ����\n";
		
		String name = null;
		int kp = -1, mp = -1, bp = -1;
		int total = -1;
		
		while(true) {
			String sel = JOptionPane.showInputDialog(showMenu);
			
			String msg = null;
			if(sel.equals("1")) {	// �Է�
				
				name = JOptionPane.showInputDialog("�귣���̸� �Է�");
				String rcv = JOptionPane.showInputDialog("Ű���� �����Է�");
				kp = Integer.parseInt(rcv);
				
				rcv = JOptionPane.showInputDialog("����� �����Է�");
				mp = Integer.parseInt(rcv);
				
				rcv = JOptionPane.showInputDialog("��ü �����Է�");
				bp = Integer.parseInt(rcv);
				
				total = kp + mp + bp;
				
				msg = "������ �Ϸ�Ǿ����ϴ�.";
				
			} else if (sel.equals("2")) {	// ����
				
				if(name == null) {	// ���� ����
					msg = "����� ������ �����ϴ�.";
				} else {	// ���� ����
					msg = "[��ǻ�� ����]\n" 
							+ "�̸�\t Ű����\t �����\t ��ü\t �ѱ��Ű���\n" 
							+ "==============================================================\n"
							+ name + "\t" + kp + "\t" + mp + "\t" + bp + "\t"
							+ total;
				}
				
			} else if (sel.equals("3")) {	// ����
				break;
			} else {
				msg = "�߸��� �Է��Դϴ�.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
	}

}

















