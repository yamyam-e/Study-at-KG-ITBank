import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J08_MemController {
	
	String rcv1, rcv2, msg;
	String showMenu = "[회원 정보 관리 프로그램]\n"
							+ "1. 회원가입(아이디중복 금지)\n"
							+ "2. 로그인\n"
							+ "3. 비밀번호 찾기\n"
							+ "4. 프로그램 종료";
	
	J08_Member[] mm = new J08_Member[5];
	
	int nowSaveNum = 0;

	void works(){
		
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			
			if(sel.equals("1")){ // 회원가입
				
				if(nowSaveNum == 5){
					JOptionPane.showMessageDialog(null, new JTextArea("저장할 공간이 없습니다."));
					continue;
				}
					
				mm[nowSaveNum] = new J08_Member();
				rcv1 = JOptionPane.showInputDialog("아이디 입력");
				J08_Member search = searchID(mm, nowSaveNum, rcv1);
				
				if(search == null){
					
					msg = mm[nowSaveNum].setData(rcv1);
					nowSaveNum++;
				} else {
					
					mm[nowSaveNum] = null;
					msg = "사용할 수 없는 아이디 입니다.";
				}
				
			} else if(sel.equals("2")){ // 로그인
				
				if(nowSaveNum == 0) {
					
					msg = "저장된 정보가 없습니다.";
				} else {
					
					rcv1 = JOptionPane.showInputDialog("아이디 입력");
					J08_Member search = searchID(mm, nowSaveNum, rcv1);
					
					if(search == null) {
						
						msg = "아이디가 존재하지 않습니다.";
					} else {
						
						msg = checkPW(search);		
					}
				}
				
			} else if(sel.equals("3")){ // 비밀번호 찾기
				
				if(nowSaveNum == 0) {
					
					msg = "저장된 정보가 없습니다.";
				} else {
				
					rcv1 = JOptionPane.showInputDialog("아이디 입력");
					J08_Member search = searchID(mm, nowSaveNum, rcv1);
					
					if(search == null) {
						
						msg = "아이디가 존재하지 않습니다.";
					} else {
						
						rcv1 = JOptionPane.showInputDialog("이름 입력");
						rcv2 = JOptionPane.showInputDialog("전화번호입력");
						if(rcv1.equals(search.getName())
								&& rcv2.equals(search.getTel())){
							msg = search.getName() +"님의 비밀번호는 : " + search.getPw();
						} else {
							msg = "입력하신 정보가 올바르지 않습니다.";
						}
					}
				}
				
			} else if(sel.equals("4")){ // 종료
				break;
			} else { // 기타
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
	}
	
	J08_Member searchID(J08_Member[] mm, int len, String id) {
		
		J08_Member search = null;
		
		for(int i=0; i<len; i++){
			if(id.equals(mm[i].getId())){
				search = mm[i];
			}
		}
		return search;
	}
	
	String checkPW(J08_Member mm){
		
		rcv1 = JOptionPane.showInputDialog("패스워드 입력");
				
		if(rcv1.equals(mm.getPw())){
			
			J08_LogController logC = new J08_LogController();
			msg = logC.logedIn(mm);
		
		} else{
			
			msg = "패스워드가 올바르지 않습니다.\n"
						+ "다시 시도 해주세요.";
		}
		
		return msg;
	}
}
