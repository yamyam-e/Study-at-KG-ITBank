import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J03_MainCla {
	public static void main(String[] args) {
		
//		�λ� ���� ���� ���α׷�
//		1. ���� �׸� : �̸�, ����
//		2. �޴� : 1. �Է� 2. ���� 3. ����
		
		String showMenu = "1. �λ� ���� �Է�\n" + "2. �λ� ���� ����\n" + "3. ���α׷� ����\n";
		
		J03_People peo = new J03_People();
		
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")){
				
				peo.name = JOptionPane.showInputDialog("�̸� �Է�");
				String rcv = JOptionPane.showInputDialog("���� �Է�");
				peo.age = Integer.parseInt(rcv);
				msg = "������ �Ϸ�Ǿ����ϴ�.";
				
			} else if (sel.equals("2")) {
				if (peo.name != null) {
					msg = "����� ������ �����ϴ�.";
				} else {
					msg = "[�λ�����]\n" 
							+ "�̸� : " + peo.name +"\n"
							+"���� : " + peo.age;
				}
			} else if (sel.equals("3")) {
				break;
			} else {
				msg = "�߸��� �Է��Դϴ�.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
	}

}










