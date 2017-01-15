package p02_intro;

import javax.swing.JOptionPane;

public class J01_mainCla {
	public static void main(String[] args) {
		
		String showMenu = "1. 정보 입력\n"
						+ "2. 정보 보기\n"
						+ "3. 프로그램 종료";
		
		String showDB = "1. 오라클DB\n" + "2. MySQLDB";
		J03_Injection injector = null;
		
		while(true){
			String selDB = JOptionPane.showInputDialog(showDB);
			if(selDB.equals("1")){
				injector = new J03_OracleDB();
			} else if(selDB.equals("2")){
				injector = new J03_MySQLDB();
			}
			
			String sel = JOptionPane.showInputDialog(showMenu);
			J02_DAO dao = new J02_DAO(injector);
			
			if(sel.equals("1")){
				dao.insertOne();
			}else if(sel.equals("2")){
				dao.selectList();
			}else if(sel.equals("3")){
				break;
			}
		}
	}	
}
