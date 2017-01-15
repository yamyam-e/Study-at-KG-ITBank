import javax.swing.JOptionPane;

public class J09_Quiz {
	
//	문제 : 학생 정보 관리 프로그램
//	=> 이름, 국어, 영어, 수학, 총점, 평균
//	정보 입력 시, 이름 및 3개 과목 입력 받음
//	정보 수정 시, 3개 과목만 입력 받음(이름제외)
	
	public static void main(String[] args) {
		
		String showMenu = "1. 학생 정보 입력\n"
							+ "2. 학생 정보 보기\n"
							+ "3. 학생 정보 수정\n"
							+ "4. 프로그램 종료";
		
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
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showConfirmDialog(null, msg);
		}
				
	}

}
