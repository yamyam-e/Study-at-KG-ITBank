package entity;

import javax.swing.JOptionPane;

public class J06_Soccer extends J06_Player{
	
	Double point;
	
	public void setData() {
		super.setData();
		point = Double.parseDouble(JOptionPane.showInputDialog("100m �޸��� ����Է�"));
	}
	
	public String getData() {
		return super.getData() + "\n����(100m): " + point + "��";
	}

}
