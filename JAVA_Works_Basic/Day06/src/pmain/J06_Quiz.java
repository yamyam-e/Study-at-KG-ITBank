package pmain;

import javax.swing.JOptionPane;

import entity.J06_Baseball;
import entity.J06_Soccer;

public class J06_Quiz {
	
//	1. 야구 선수 정보
//		: 이름, 팀이름, 연봉, 성적(타율)
//	2. 축구 선수 정보
//		: 이름, 팀이름, 연봉, 100m 달리기 기록
	
//	메뉴:
//	1. 야구선수 정보 입력
//	2. 야구선수 정보 입력
//	3. 축구선수 정보 입력
//	4. 축구선수 정보 입력
//	5. 프로그램 종료
	
	public static void main(String[] args) {
		
		String showMenu = "1. 야구선수 정보 입력\n" +
							"2. 축구선수 정보 입력\n" +
							"3. 야구선수 정보 보기\n" +
							"4. 축구선수 정보 보기\n" +
							"5. 프로그램 종료";
		
		J06_Baseball bb = null;
		J06_Soccer cc = null;
		
		
		while(true) {
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			if (sel.equals("1")) {//야구선수 정보 입력
				bb = new J06_Baseball();
				bb.setData();
				msg = "야구선수 정보가 입력 됐습니다.";
			} else if (sel.equals("2")) {//축구선수 정보 입력
				cc = new J06_Soccer();
				cc.setData();
				msg = "축구선수 정보가 입력 됐습니다.";
			} else if (sel.equals("3")) {//야구선수 정보 보기
				if (bb == null) {
					msg = "야구선수 정보가 없습니다.";
				} else {
					msg = bb.getData();
				}
			} else if (sel.equals("4")) {//축구선수 정보 보기
				if (cc == null) {
					msg = "축구선수 정보가 없습니다.";
				} else {
					msg = cc.getData();
				}
			} else if (sel.equals("5")) {//프로그램 종료
				break;
			} else {//오류
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showConfirmDialog(null, msg);
		}
		
	}

}
