package entity;

import javax.swing.JOptionPane;

public class J06_Food {

	private String name;
	private int price;
	
	public void setData(){
		this.name = JOptionPane.showInputDialog("�̸� �Է�");
		this.price = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
	}
	
	public String getData(){
		return "�����̸� : " +  name + " , ���� : " + price;
	}
	
	public String getName(){
		return name;
	}
	
//	public String toString(){
//		return "�����̸� : " +  name + " , ���� : " + price;
//	}
	
}
