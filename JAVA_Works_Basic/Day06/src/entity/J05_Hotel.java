package entity;

import javax.swing.JOptionPane;

public class J05_Hotel extends J05_SuperCla {
	
	String VIP;
	
	public void setData() {
		super.setData();
		VIP = JOptionPane.showInputDialog("VIP�� ����");
	}
	
	public String showData() {
		return getData() + " , VIP�� ����: " + VIP; 
	}
	
	public String getData() {
		return super.getData() + " , VIP�� ����: " + VIP; 
	}

}
