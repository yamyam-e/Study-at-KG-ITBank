import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J04_Quiz {
	public static void main(String[] args) {
		
//		�л� ���� ���� ���α׷�
//		1. ���� �׸�
//			- �̸�, ����, ����, ����, ����, ���
//		2. �޴�
//			1. �л� ���� �Է�
//			2. �л� ���� ����
//			3. �л� ���� ����
//				- �̸��� ������ ����, ����, ����, �Է�
//			4. ���α׷� ����
		
		String showMenu = "[�л� ���� ���� ���α׷�]\n"
							+ "1. �л� ���� �Է�\n"
							+ "2. �л� ���� ����\n"
							+ "3. �л� ���� ����\n"
							+ "4. ���α׷� ����";
		
		J04_Student stu = null;
		
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")){
				if(stu == null){
					stu = new J04_Student();
					stu.setData();
					msg = "������ �Ϸ� �Ǿ����ϴ�.";
				} else {
					msg = "����� ������ �ֽ��ϴ�.";
				}
				
			} else if(sel.equals("2")){
				if(stu == null){
					msg = "����� ������ �����ϴ�.";
				} else {
					msg = stu.title("[�л�����]")
										+ stu.showData();
				}

			} else if(sel.equals("3")){
				
				if(stu == null){
					msg = "����� ������ �����ϴ�.";
				} else {
					
					String yn = JOptionPane.showInputDialog("�л������� �����Ͻðڽ��ϱ�?(y/n)");
					
					if(yn.equalsIgnoreCase("y")){
						stu.modify();
						msg = "�л������� ���� �Ǿ����ϴ�.";
					} else {
						continue;
					}
				}
			} else if(sel.equals("4")){
				break;
			} else{
				msg = "�߸��� �Է��Դϴ�.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}

	}

}
















