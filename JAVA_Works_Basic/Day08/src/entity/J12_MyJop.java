package entity;

import javax.swing.JOptionPane;

public class J12_MyJop extends Thread {
	
	@Override
	public void run() {
		
		while(true){
			String data = JOptionPane.showInputDialog("ÀÔ·Â");
			System.out.println(">>>>>>>" + data);
		}
	}
	

}
