package entity;

import javax.swing.JOptionPane;

public class J05_SuperCla {
	
	String name;
	int price;
	
	public void setData() {
		name = JOptionPane.showInputDialog("이름입력");
		price = Integer.parseInt(JOptionPane.showInputDialog("가격입력"));
	}
	
	public String getData() {
		return "이름: " + this.name + " , 가격: " + this.price;
	}

}
