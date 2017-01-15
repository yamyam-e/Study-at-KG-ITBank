package pmain;

import java.util.*;

import javax.swing.JOptionPane;

import entity.*;

public class J06_HashMapEx {
	public static void main(String[] args) {
		
//		음식 정보 프로그램 : 이름 , 가격
		String showMenu = "1. 음식 정보 입력\n" + "2. 음식 정보 보기\n" + "3. 음식 정보 검색\n" + "4. 프로그램 종료";
		
		HashMap<String , J06_Food> mapc = new HashMap<>();
		
		while(true){
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")) {//입력
				J06_Food ff = new J06_Food();
				ff.setData();
				mapc.put(ff.getName(), ff);
				msg = "저장 완료";
			}else if(sel.equals("2")){//보기
				if(mapc.isEmpty()) {
					msg = "정보가 없습니다.";
				} else {
					msg = "";
					Set<String> keyGroup = mapc.keySet();
					for(String key : keyGroup) {
						J06_Food ff = mapc.get(key);
						msg += ff.getData() + "\n";
					}
				}
				
			}else if(sel.equals("3")){//검색
				if(mapc.isEmpty()) {
					msg = "정보가 없습니다.";
				} else {
					String search = JOptionPane.showInputDialog("검색 음식 이름 입력");
					if(mapc.containsKey(search)) {
						J06_Food ff = mapc.get(search);
						msg = ff.getData();
					} else {
						msg = "정보가 없습니다.";
					}
				}			
			}else if(sel.equals("4")){//종료
				break;
			}else{
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, msg);
			
		}
		
	}
}
