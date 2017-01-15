package entity;

import javax.swing.JOptionPane;

public class J06_Food {

	private String name;
	private int price;
	
	public void setData(){
		this.name = JOptionPane.showInputDialog("이름 입력");
		this.price = Integer.parseInt(JOptionPane.showInputDialog("가격 입력"));
	}
	
	public String getData(){
		return "음식이름 : " +  name + " , 가격 : " + price;
	}
	
	public String getName(){
		return name;
	}
	
//	public String toString(){
//		return "음식이름 : " +  name + " , 가격 : " + price;
//	}
	
}
