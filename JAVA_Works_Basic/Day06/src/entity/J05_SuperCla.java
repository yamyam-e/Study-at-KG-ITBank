package entity;

import javax.swing.JOptionPane;

public class J05_SuperCla {
	
	String name;
	int price;
	
	public void setData() {
		name = JOptionPane.showInputDialog("�̸��Է�");
		price = Integer.parseInt(JOptionPane.showInputDialog("�����Է�"));
	}
	
	public String getData() {
		return "�̸�: " + this.name + " , ����: " + this.price;
	}

}
