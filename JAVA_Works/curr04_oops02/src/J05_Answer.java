import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J05_Answer {
	public static void main(String[] args) {
		
		String showMenu = "[�л� ���� ���� ���α׷�]\n"
				+ "1. �л� ���� �Է�\n"
				+ "2. �л� ���� ����\n"
				+ "3. �л� ���� ����\n"
				+ "4. ���α׷� ����";

		J05_Student stu = null;
		
		while(true){
		
		String sel = JOptionPane.showInputDialog(showMenu);
		String msg = null;
		
		if(sel.equals("1")){
			
			stu = new J05_Student();
			msg = stu.setData();
			
		} else if(sel.equals("2")){
			
			msg = stu.showData();
			
		} else if(sel.equals("3")){
			
			msg = stu.modData();
			
		} else if(sel.equals("4")){
			break;
		} else{
			msg = "�߸��� �Է��Դϴ�.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
	}

}








