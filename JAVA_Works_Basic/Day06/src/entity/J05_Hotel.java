package entity;

import javax.swing.JOptionPane;

public class J05_Hotel extends J05_SuperCla {
	
	String VIP;
	
	public void setData() {
		super.setData();
		VIP = JOptionPane.showInputDialog("VIP·ë °¹¼ö");
	}
	
	public String showData() {
		return getData() + " , VIP·ê °¹¼ö: " + VIP; 
	}
	
	public String getData() {
		return super.getData() + " , VIP·ë °¹¼ö: " + VIP; 
	}

}
