import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J11_Quiz {
	public static void main(String[] args) {
		
//		�λ� ���� ���� ���α׷�
//		1. ���� �׸� :  �̸�, ����
//		2. �޴�
//			1. �λ� ���� �Է�
//			2. �λ� ���� ����
//			3. ���α׷� ����
		
		String showMenu =  "[�λ� ���� ���� ���α׷�]\n"
							+ "1. �λ� ���� �Է�\n"
							+ "2. �λ� ���� ����\n"
							+ "3. ���α׷� ����";
		
		String  name = null;
		int age = -1;
		
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if (sel.equals("1")) {	// �Է�
				name = JOptionPane.showInputDialog("�̸� �Է�");
				String rcv = JOptionPane.showInputDialog("���� �Է�");
				age = Integer.parseInt(rcv);
				msg = "������ �Ϸ� �Ǿ����ϴ�.";
			} else if (sel.equals("2")) { // ���
				if (name == null) {
					msg = "�Էµ� ������ �����ϴ�.";
				} else {
					msg = "[�λ� ����]\n" 
							+ "�̸� \t ���� \n"
							+ "================\n"
							+ name + "\t" + age;
				}
			} else if(sel.equals("3")){ // ����
				break;
			} else { // ��Ÿ
				msg = "�߸��� �Է��Դϴ�.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
	}

}


















