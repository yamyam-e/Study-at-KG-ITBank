package entity;

import javax.swing.JOptionPane;

public class J06_Baseball extends J06_Player {
	
	double point;
	
	public void setData() {
		super.setData();
		point = Double.parseDouble(JOptionPane.showInputDialog("타율입력"));
	}
	
	public String getData() {
		return super.getData() + "\n성적(타율): " + point;
	}

}
