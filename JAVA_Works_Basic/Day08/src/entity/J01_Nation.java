package entity;

import javax.swing.JOptionPane;

public class J01_Nation {
	
	private String name;
	private String cap;
	
	public void setData(){
		this.name = JOptionPane.showInputDialog("���� �̸� �Է�");
		this.cap = JOptionPane.showInputDialog("���� �̸� �Է�");
	}
	
	public String getData() {
		return "������: " + name + " , ������: " + cap;
	}
	
	public String getName(){
		return name;
	}

}
