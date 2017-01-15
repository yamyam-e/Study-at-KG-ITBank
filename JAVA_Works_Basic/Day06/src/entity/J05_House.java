package entity;

import javax.swing.JOptionPane;

public class J05_House extends J05_SuperCla {
	
	String parking;
	
	public void setData() {
		super.setData();
		parking = JOptionPane.showInputDialog("주차공간여부");
	}
	
	public String getData() {
		return super.getData() + " , 주차공간: " + parking;
	}
	
	public String showData() {
		return getData() + " , 주차공간: " + parking;
	}

}
