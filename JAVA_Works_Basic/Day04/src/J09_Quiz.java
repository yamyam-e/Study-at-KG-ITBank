import javax.swing.JOptionPane;

public class J09_Quiz {
	
//	���� : �л� ���� ���� ���α׷�
//	=> �̸�, ����, ����, ����, ����, ���
//	���� �Է� ��, �̸� �� 3�� ���� �Է� ����
//	���� ���� ��, 3�� ���� �Է� ����(�̸�����)
	
	public static void main(String[] args) {
		
		String showMenu = "1. �л� ���� �Է�\n"
							+ "2. �л� ���� ����\n"
							+ "3. �л� ���� ����\n"
							+ "4. ���α׷� ����";
		
		J09_Student stu1 = new J09_Student();
		
		while(true) {
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if (sel.equals("1")) {
				msg = stu1.setData();
			} else if (sel.equals("2")) {
				msg = stu1.getData();
			} else if (sel.equals("3")) {
				msg = stu1.modData();
			} else if (sel.equals("4")) {
				break;
			} else {
				msg = "�߸��� �Է��Դϴ�.";
			}
			JOptionPane.showConfirmDialog(null, msg);
		}
				
	}

}
