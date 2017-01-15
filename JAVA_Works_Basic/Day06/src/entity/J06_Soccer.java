package entity;

import javax.swing.JOptionPane;

public class J06_Soccer extends J06_Player{
	
	Double point;
	
	public void setData() {
		super.setData();
		point = Double.parseDouble(JOptionPane.showInputDialog("100m 달리기 기록입력"));
	}
	
	public String getData() {
		return super.getData() + "\n성적(100m): " + point + "초";
	}

}
