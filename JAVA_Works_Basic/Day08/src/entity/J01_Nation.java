package entity;

import javax.swing.JOptionPane;

public class J01_Nation {
	
	private String name;
	private String cap;
	
	public void setData(){
		this.name = JOptionPane.showInputDialog("국가 이름 입력");
		this.cap = JOptionPane.showInputDialog("수도 이름 입력");
	}
	
	public String getData() {
		return "국가명: " + name + " , 수도명: " + cap;
	}
	
	public String getName(){
		return name;
	}

}
