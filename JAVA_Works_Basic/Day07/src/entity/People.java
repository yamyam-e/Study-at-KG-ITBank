package entity;

public class People {
	
	String name;
	int age;
	
	public People() {
		
	}
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "(이름 : " + name + ", 나이 : " + age + ")";
	}
	

}
