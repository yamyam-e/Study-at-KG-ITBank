package entity;

public class J01_OldPeople {
	
	String name;
	int age;
	
	public void setOldData(String name, int age) {	
		this.name = name;
		this.age = age;
	}
	
	public String getOldData(){
		return "이름: " + this.name + " , 나이: " + this.age;
	}

}
