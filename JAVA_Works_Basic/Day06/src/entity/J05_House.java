package entity;

import javax.swing.JOptionPane;

public class J05_House extends J05_SuperCla {
	
	String parking;
	
	public void setData() {
		super.setData();
		parking = JOptionPane.showInputDialog("������������");
	}
	
	public String getData() {
		return super.getData() + " , ��������: " + parking;
	}
	
	public String showData() {
		return getData() + " , ��������: " + parking;
	}

}
