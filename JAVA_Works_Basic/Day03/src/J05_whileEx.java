import javax.swing.JOptionPane;

public class J05_whileEx {
	
	public static void main(String[] args) {
		
//		�λ� ���� ���� ���α׷� : �̸�, ����
//		�޴� : 
//			1. �λ� ���� �Է�
//			2. �λ� ���� ����
//			3. ���α׷� ����
		
		String name = null;
		int age = 0;
		
		String showMenu = "1. �λ� ���� �Է�\n" 
						+ "2. �λ� ���� ����\n"
						+ "3. ���α׷� ����\n"
						+ "��ȣ �Է�";
		
		while(true) {
			
			String sel = 
					JOptionPane.showInputDialog(showMenu);
			String msg = null;
			if (sel.equals("1")){ // �Է�
				name =
						JOptionPane.showInputDialog("�̸��� �Է�");
				String rcv = 
						JOptionPane.showInputDialog("���̸� �Է�");
				age = Integer.parseInt(rcv);
				msg = "������ �Ϸ�Ǿ����ϴ�.";
			} else if (sel.equals("2")) { // ����
				if (name == null) {
					msg = "����� ������ �����ϴ�.";
				} else {
					msg = "�̸�: " + name + "\n" + "����: " +  age;
				}
			} else if (sel.equals("3")) { // ����
				break;
			} else{
				msg = "�߸��� �Է�";
			}
			JOptionPane.showMessageDialog(null, msg);
			
		}
	}

}
