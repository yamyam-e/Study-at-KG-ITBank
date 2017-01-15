package pmain;

import javax.swing.JOptionPane;
import entity.*;
import java.util.ArrayList;

public class J01_ArrayEx {
	
	public static void main(String[] args) {
		
		String showMenu =  "1. 국가 정보 저장\n" + "2. 국가 정보 보기\n" + "3. 국가 정보 검색\n" + "4. 프로그램 종료";
		
		ArrayList listc = new ArrayList<>();
		
		while(true){
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")) {//저장
				J01_Nation nt = new J01_Nation();
				nt.setData();
				listc.add(nt);
				msg = "저장완료";		
			}else if(sel.equals("2")){//전체보기
				if(listc.isEmpty()) {
					msg = "저장된 정보가 없습니다.";
				} else {
					msg = "";
					for(Object each :listc) {
						J01_Nation info = (J01_Nation)each;
						msg += info.getData() + "\n";
					}
				}
			}else if(sel.equals("3")){//검색
				if(listc.isEmpty()) {
					msg = "저장된 정보가 없습니다.";
				} else {
					String search = JOptionPane.showInputDialog("검색할 국가명 입력");
					for(Object each : listc){
						J01_Nation info = (J01_Nation)each;
						if (search.equals(info.getName())) {//정보 있음
							msg = info.getData();
							break;
						} else {
							msg = "검색 대상이 없습니다.";
						}
					}
				}		
			}else if(sel.equals("4")){//종료
				break;
			}else{
				msg = "잘못된 입력";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
	}

}
