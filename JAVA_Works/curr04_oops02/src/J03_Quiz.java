import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J03_Quiz {
	public static void main(String[] args) {
		
//		문제 : 햄버거 정보 관리 프로그램
//		1. 정보 항목
//			- 이름, 가격, 칼로리
//		2. 메뉴
//			1. 햄버거 정보 입력
//			2. 햄버거 정보 보기
//			3. 햄버거 정보 수정(이름을 제외한 가격, 칼로리 수정)
//			4. 프로그램 종료
//		3. 객체 갯수 : 1개
		
		String showMenu = "1. 햄버거 정보 입력\n"
							+ "2. 햄버거 정보 보기\n"
							+ "3. 햄버거 정보 수정\n"
							+ "4. 프로그램 종료";		
				
		J03_Hamberger ham = null;
		
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
								
			if(sel.equals("1")){ // 입력
				
				if(ham == null) {
					ham = new J03_Hamberger();
					ham.setData();
					msg = "저장이 완료 되었습니다.";
				} else {
					msg = "저장된 정보가 있습니다.";
				}
				
			} else if(sel.equals("2")){ // 보기
				
				if(ham == null) {
					msg = "저장된 정보가 없습니다.";
				} else {
					
					msg = ham.getTitle("[햄버거정보]", 40) 
							+ ham.showData();
				}
				
			} else if(sel.equals("3")){ // 수정
				
				if(ham == null) {
					msg = "저장된 정보가 없습니다.";
				} else {
				
					String rcv = JOptionPane.showInputDialog("수정을 하시겠습니까?(y/n)");
					if(rcv.equalsIgnoreCase("y")){
						ham.setPriceData();
						ham.setCaloriData();
						msg = "정보가 수정 되었습니다.";
					} else {
						continue;
					}
				}
				
			} else if(sel.equals("4")){ // 종료
				break;
			} else { // 에러
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}		
	}

}
