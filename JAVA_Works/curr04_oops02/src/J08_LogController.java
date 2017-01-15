import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J08_LogController {
	
	String msg = "이름\t아이디\t비밀번호\t전화번호\n"
					+ "===============================================\n";
	String showMenu = "1. 내 정보 보기\n"
						+ "2. 로그아웃";
	
	String logedIn(J08_Member mm){
		
		while(true){
			
			String sel = JOptionPane.showInputDialog("[" + mm.getName() 
															+ "]님이 로그인 하셨습니다.\n" 
															+ showMenu);
									
			if(sel.equals("1")){ // 정보
				msg += mm.showData();
			} else if(sel.equals("2")){ // 로그아웃
				break;
			} else {
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		return "로그아웃 되었습니다.";
	}

}
