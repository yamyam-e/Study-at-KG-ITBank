import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J08_LogController {
	
	String msg = "�̸�\t���̵�\t��й�ȣ\t��ȭ��ȣ\n"
					+ "===============================================\n";
	String showMenu = "1. �� ���� ����\n"
						+ "2. �α׾ƿ�";
	
	String logedIn(J08_Member mm){
		
		while(true){
			
			String sel = JOptionPane.showInputDialog("[" + mm.getName() 
															+ "]���� �α��� �ϼ̽��ϴ�.\n" 
															+ showMenu);
									
			if(sel.equals("1")){ // ����
				msg += mm.showData();
			} else if(sel.equals("2")){ // �α׾ƿ�
				break;
			} else {
				msg = "�߸��� �Է��Դϴ�.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		return "�α׾ƿ� �Ǿ����ϴ�.";
	}

}
