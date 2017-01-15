package entity;

import javax.swing.JOptionPane;

public class J06_Player {
	
	String name;
	String team;
	int pay;
	
	public void setData() {
		name = JOptionPane.showInputDialog("이름입력");
		team = JOptionPane.showInputDialog("팀입력");
		pay  = Integer.parseInt(JOptionPane.showInputDialog("연봉입력"));
	}
	
	public String getData() {
		return "이름: " + name + "\n팀이름: " + team + "\n연봉: " + pay;
	}

}
