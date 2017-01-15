import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J04_Quiz {
	public static void main(String[] args) {
		
//		문제 : 자동차 정보 관리 프로그램
		
//		1. 정보 항목
//			- 이름, 엔진가격, 타이어가격,
//				옵션 부품 이름, 옵션 부품 가격, 총 구매가격
//		2. 메뉴
//			1. 자동차 정보 입력
//				- 이름 및 각 부품 가격
//				- 옵션이 있는지 질문 후, 옵션에 대한 입력을 진행
//			2. 자동차 정보 출력
//				- 모든 정보
//				- 단, 옵션이 없는 경우 제외
//			3. 자동차 정보 삭제
//			4. 프로그램 종료
		
		String showMenu = "[자동차 정보 관리 프로그램]\n"
							+ "1. 자동차 정보 입력\n"
							+ "2. 자동차 정보 출력\n"
							+ "3. 자동차 정보 삭제\n"
							+ "4. 프로그램 종료";
		
		J04_CarInfo car = new J04_CarInfo();
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")){
				
				//car = new J04_CarInfo();
				
				car.name = JOptionPane.showInputDialog("자동차 이름 입력");
				String rcv = JOptionPane.showInputDialog("엔진가격 입력");
				car.engPrice = Integer.parseInt(rcv);
				rcv = JOptionPane.showInputDialog("타이어가격 입력");
				car.tirePrice = Integer.parseInt(rcv);
				
				rcv = JOptionPane.showInputDialog("옵션을 선택하시겠습니까? (y/n)");
				
				if (rcv.equalsIgnoreCase("y")){ 
					car.optionName = JOptionPane.showInputDialog("옵션 부품명 입력");
					rcv = JOptionPane.showInputDialog("옵션 가격 입력");
					car.optionPrice = Integer.parseInt(rcv);
				} 
				
				car.totalPrice = car.engPrice + car.tirePrice + car.optionPrice;
				msg = "저장이 완료되었습니다.";
			} else if(sel.equals("2")){
				if(car.name == null){
					msg = "저장된 정보가 없습니다.";
				} else {
					msg = "[자동차 정보]\n" 
							+ "이름 : " + car.name + "\n"
							+ "엔지가격 : " + car.engPrice + "\n"
							+ "타이어가격 : " + car.tirePrice;
					if(car.optionName != null) {
						msg +=  "\n옵션이름 : " + car.optionName 
								+ "\n옵션가격 : " + car.optionPrice;
					}
					msg += "\n총 구매가격 : " + car.totalPrice;
				}	
			} else if(sel.equals("3")){
				car.name = null;
				msg = "저장된 정보가 삭제되었습니다.";
			} else if(sel.equals("4")){
				break;
			} else {
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
		
	}

}














