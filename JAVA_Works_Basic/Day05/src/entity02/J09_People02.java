package entity02;

public class J09_People02 {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("통장 개설 불가");
			return;//프로그램 종료를 위해서 사용
		}
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	

}
