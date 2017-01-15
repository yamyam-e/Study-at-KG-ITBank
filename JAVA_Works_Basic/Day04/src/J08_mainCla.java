import javax.swing.JOptionPane;

public class J08_mainCla {
	public static void main(String[] args) {
		
		String showMenu = "1. 인사 정보 입력\n"
						+ "2. 인사 정보 보기\n"
						+ "3. 프로그램 종료\n";
		
		J08_People peo = new J08_People();
		while(true){
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			if (sel.equals("1")) {
				peo.setData();
				msg = "저장이 완료 되었습니다.";
			} else if(sel.equals("2")) {
				msg = peo.getData();
			} else if(sel.equals("3")) {
				break;
			} else {
				msg = "잘못된 입력";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
		
		
		
	}
}
