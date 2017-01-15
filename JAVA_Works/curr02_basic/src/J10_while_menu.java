import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J10_while_menu {
	public static void main(String[] args) {
		
//		컴퓨터 정보 관리 프로그램
//		1. 정보 항목
//		 	- 브랜드이름, 키보드가격, 모니터가격, 본체가격, 총구매가격
//		2. 메뉴
//			1. 컴퓨터 정보 입력
//			2. 컴퓨터 정보 보기
//			3. 프로그램 종료

		String showMenu = "1. 컴퓨터 정보 입력\n" 
							+ "2. 컴퓨터 정보 보기\n"
							+ "3. 프로그램 종료\n";
		
		String name = null;
		int kp = -1, mp = -1, bp = -1;
		int total = -1;
		
		while(true) {
			String sel = JOptionPane.showInputDialog(showMenu);
			
			String msg = null;
			if(sel.equals("1")) {	// 입력
				
				name = JOptionPane.showInputDialog("브랜드이름 입력");
				String rcv = JOptionPane.showInputDialog("키보드 가격입력");
				kp = Integer.parseInt(rcv);
				
				rcv = JOptionPane.showInputDialog("모니터 가격입력");
				mp = Integer.parseInt(rcv);
				
				rcv = JOptionPane.showInputDialog("본체 가격입력");
				bp = Integer.parseInt(rcv);
				
				total = kp + mp + bp;
				
				msg = "저장이 완료되었습니다.";
				
			} else if (sel.equals("2")) {	// 보기
				
				if(name == null) {	// 정보 없음
					msg = "저장된 정보가 없습니다.";
				} else {	// 정보 있음
					msg = "[컴퓨터 정보]\n" 
							+ "이름\t 키보드\t 모니터\t 본체\t 총구매가격\n" 
							+ "==============================================================\n"
							+ name + "\t" + kp + "\t" + mp + "\t" + bp + "\t"
							+ total;
				}
				
			} else if (sel.equals("3")) {	// 종료
				break;
			} else {
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
	}

}

















