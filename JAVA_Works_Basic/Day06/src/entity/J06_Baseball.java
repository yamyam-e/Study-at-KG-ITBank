package entity;

import javax.swing.JOptionPane;

public class J06_Baseball extends J06_Player {
	
	double point;
	
	public void setData() {
		super.setData();
		point = Double.parseDouble(JOptionPane.showInputDialog("Ÿ���Է�"));
	}
	
	public String getData() {
		return super.getData() + "\n����(Ÿ��): " + point;
	}

}
