import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J04_Quiz {
	public static void main(String[] args) {
		
//		학생 정보 관리 프로그램
//		1. 정보 항목
//			- 이름, 국어, 영어, 수학, 총점, 평균
//		2. 메뉴
//			1. 학생 정보 입력
//			2. 학생 정보 보기
//			3. 학생 정보 수정
//				- 이름을 제외한 국어, 영어, 수학, 입력
//			4. 프로그램 종료
		
		String showMenu = "[학생 정보 관리 프로그램]\n"
							+ "1. 학생 정보 입력\n"
							+ "2. 학생 정보 보기\n"
							+ "3. 학생 정보 수정\n"
							+ "4. 프로그램 종료";
		
		J04_Student stu = null;
		
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")){
				if(stu == null){
					stu = new J04_Student();
					stu.setData();
					msg = "저장이 완료 되었습니다.";
				} else {
					msg = "저장된 정보가 있습니다.";
				}
				
			} else if(sel.equals("2")){
				if(stu == null){
					msg = "저장된 정보가 없습니다.";
				} else {
					msg = stu.title("[학생정보]")
										+ stu.showData();
				}

			} else if(sel.equals("3")){
				
				if(stu == null){
					msg = "저장된 정보가 없습니다.";
				} else {
					
					String yn = JOptionPane.showInputDialog("학생정보를 수정하시겠습니까?(y/n)");
					
					if(yn.equalsIgnoreCase("y")){
						stu.modify();
						msg = "학생정보가 수정 되었습니다.";
					} else {
						continue;
					}
				}
			} else if(sel.equals("4")){
				break;
			} else{
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}

	}

}
















