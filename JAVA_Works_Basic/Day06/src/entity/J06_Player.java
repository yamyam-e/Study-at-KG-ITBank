package entity;

import javax.swing.JOptionPane;

public class J06_Player {
	
	String name;
	String team;
	int pay;
	
	public void setData() {
		name = JOptionPane.showInputDialog("�̸��Է�");
		team = JOptionPane.showInputDialog("���Է�");
		pay  = Integer.parseInt(JOptionPane.showInputDialog("�����Է�"));
	}
	
	public String getData() {
		return "�̸�: " + name + "\n���̸�: " + team + "\n����: " + pay;
	}

}
