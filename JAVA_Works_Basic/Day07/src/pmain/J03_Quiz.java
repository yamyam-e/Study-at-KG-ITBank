package pmain;

import javax.swing.JOptionPane;

import entity.*;

public class J03_Quiz {
	
	public static void main(String[] args) {
		
		String showMenu1 = "1. ��ũ" + "2. �����";
		String showMenu2 = "1. ����" + "2. �̵�";
				
		J03_Mouse mm = null;
		
		while(true) {
			String sel = JOptionPane.showInputDialog(showMenu1);
			String msg1 = null;
			
			if (sel.equals("1")) {
				mm = new J03_Tank();
			} else if (sel.equals("2")) {
				mm = new J03_AirPlane();
			}
			
			sel = JOptionPane.showInputDialog(showMenu2);
			if (sel.equals("1")) {
				msg1 = mm.attack();
			} else if (sel.equals("2")) {
				msg1 = mm.move();
			}
			JOptionPane.showMessageDialog(null, msg1);
		}
		
//		String showMenu = "1. ��ũ ����\n" + "2. ����� ����\n"
//				+ "3. ��ũ �̵�\n" + "4. ����� �̵�\n"
//				+ "5. ��������";
//
		
//		while(true){
//			String sel = JOptionPane.showInputDialog(showMenu);
//			String msg = null;
//			if (sel.equals("1")){
//				mm = new J03_Tank();
//				msg = mm.attack();
//			} else if (sel.equals("2")){
//				mm = new J03_AirPlane();
//				msg = mm.attack();
//			} else if (sel.equals("3")){
//				mm = new J03_Tank();
//				msg = mm.move();
//			} else if (sel.equals("4")){
//				mm = new J03_AirPlane();
//				msg = mm.move();
//			} else if (sel.equals("5")){
//				break;
//			}
//			msg = mm.attack();
//			JOptionPane.showMessageDialog(null, msg);
//		}
		
	}

}
