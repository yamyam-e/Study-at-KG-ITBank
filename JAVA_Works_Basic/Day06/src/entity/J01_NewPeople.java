package entity;

public class J01_NewPeople extends J01_OldPeople {
	
	String hobby;
	
	public void setNewData(String name, int age, String hobby) {
//		this.name = name;
//		this.age = age;
		setOldData(name, age);
		
		this.hobby = hobby;
	}
	
	public String getNewData(){
//		return "�̸�: " + this.name + " , ����: " + this.age + ", ���: " + this.hobby;
		
		return getOldData() + ", ���: " + this.hobby; 
	}
	

}
