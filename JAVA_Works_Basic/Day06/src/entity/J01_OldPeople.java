package entity;

public class J01_OldPeople {
	
	String name;
	int age;
	
	public void setOldData(String name, int age) {	
		this.name = name;
		this.age = age;
	}
	
	public String getOldData(){
		return "�̸�: " + this.name + " , ����: " + this.age;
	}

}
