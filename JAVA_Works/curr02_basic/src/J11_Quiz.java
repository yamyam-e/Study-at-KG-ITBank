import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J11_Quiz {
	public static void main(String[] args) {
		
//		인사 정보 관리 프로그램
//		1. 정보 항목 :  이름, 나이
//		2. 메뉴
//			1. 인사 정보 입력
//			2. 인사 정보 보기
//			3. 프로그램 종료
		
		String showMenu =  "[인사 정보 관리 프로그램]\n"
							+ "1. 인사 정보 입력\n"
							+ "2. 인사 정보 보기\n"
							+ "3. 프로그램 종료";
		
		String  name = null;
		int age = -1;
		
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if (sel.equals("1")) {	// 입력
				name = JOptionPane.showInputDialog("이름 입력");
				String rcv = JOptionPane.showInputDialog("나이 입력");
				age = Integer.parseInt(rcv);
				msg = "저장이 완료 되었습니다.";
			} else if (sel.equals("2")) { // 출력
				if (name == null) {
					msg = "입력된 정보가 없습니다.";
				} else {
					msg = "[인사 정보]\n" 
							+ "이름 \t 나이 \n"
							+ "================\n"
							+ name + "\t" + age;
				}
			} else if(sel.equals("3")){ // 종료
				break;
			} else { // 기타
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
	}

}


















