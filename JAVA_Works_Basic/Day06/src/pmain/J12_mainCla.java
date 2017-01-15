package pmain;

import javax.swing.JOptionPane;

import entity.J12_Airplane;
import entity.J12_Mouse;
import entity.J12_Tank;

public class J12_mainCla {
	
	public static void main(String[] args) {
		
		String showMenu = "1. 탱크 선택\n" + "2. 비행기 선택\n" +"3. 게임 종료";
		
		J12_Mouse mm = null;
		
		while(true) {
			String sel = JOptionPane.showInputDialog(showMenu);
			
			if (sel.equals("3")) {
				break;
			}
			
			if (sel.equals("1")) {
				mm = new J12_Tank();
			} else if (sel.equals("2")) {
				mm = new J12_Airplane();
			}
			
			mm.attack();
						
		}
		
		
	}

}
