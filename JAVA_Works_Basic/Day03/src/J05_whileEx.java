import javax.swing.JOptionPane;

public class J05_whileEx {
	
	public static void main(String[] args) {
		
//		인사 정보 관리 프로그램 : 이름, 나이
//		메뉴 : 
//			1. 인사 정보 입력
//			2. 인사 정보 보기
//			3. 프로그램 종료
		
		String name = null;
		int age = 0;
		
		String showMenu = "1. 인사 정보 입력\n" 
						+ "2. 인사 정보 보기\n"
						+ "3. 프로그램 종료\n"
						+ "번호 입력";
		
		while(true) {
			
			String sel = 
					JOptionPane.showInputDialog(showMenu);
			String msg = null;
			if (sel.equals("1")){ // 입력
				name =
						JOptionPane.showInputDialog("이름을 입력");
				String rcv = 
						JOptionPane.showInputDialog("나이를 입력");
				age = Integer.parseInt(rcv);
				msg = "저장이 완료되었습니다.";
			} else if (sel.equals("2")) { // 보기
				if (name == null) {
					msg = "저장된 정보가 없습니다.";
				} else {
					msg = "이릅: " + name + "\n" + "나이: " +  age;
				}
			} else if (sel.equals("3")) { // 종료
				break;
			} else{
				msg = "잘못된 입력";
			}
			JOptionPane.showMessageDialog(null, msg);
			
		}
	}

}
