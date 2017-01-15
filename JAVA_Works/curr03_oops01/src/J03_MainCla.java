import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J03_MainCla {
	public static void main(String[] args) {
		
//		인사 정보 관리 프로그램
//		1. 정보 항목 : 이름, 나이
//		2. 메뉴 : 1. 입력 2. 보기 3. 종료
		
		String showMenu = "1. 인사 정보 입력\n" + "2. 인사 정보 보기\n" + "3. 프로그램 종료\n";
		
		J03_People peo = new J03_People();
		
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")){
				
				peo.name = JOptionPane.showInputDialog("이름 입력");
				String rcv = JOptionPane.showInputDialog("나이 입력");
				peo.age = Integer.parseInt(rcv);
				msg = "저장이 완료되었습니다.";
				
			} else if (sel.equals("2")) {
				if (peo.name != null) {
					msg = "저장된 정보가 없습니다.";
				} else {
					msg = "[인사정보]\n" 
							+ "이름 : " + peo.name +"\n"
							+"나이 : " + peo.age;
				}
			} else if (sel.equals("3")) {
				break;
			} else {
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
	}

}










