import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J05_Answer {
	public static void main(String[] args) {
		
		String showMenu = "[학생 정보 관리 프로그램]\n"
				+ "1. 학생 정보 입력\n"
				+ "2. 학생 정보 보기\n"
				+ "3. 학생 정보 수정\n"
				+ "4. 프로그램 종료";

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
			msg = "잘못된 입력입니다.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
	}

}








