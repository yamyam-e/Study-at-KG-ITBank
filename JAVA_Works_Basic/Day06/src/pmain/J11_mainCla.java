package pmain;

import javax.swing.JOptionPane;

import entity.*;

public class J11_mainCla {
	
	public static void main(String[] args) {
		
		String showMenu = "1. ��α� �б�\n" + "2. ���� �б�\n" + "3. ���α׷� ����";
		
		J11_SuperCla sup = null;
		
		while(true) {
			String sel = JOptionPane.showInputDialog(showMenu);
			
			if (sel.equals("3")) {
				break;
			}
			
			String msg = null;
			if (sel.equals("1")) {
				sup = new J11_Blog();				
			} else if (sel.equals("2")) {
				sup = new J11_News();
			}
			
			msg = sup.read();
			JOptionPane.showMessageDialog(null, msg);
		}
		
		
		
	}

}
