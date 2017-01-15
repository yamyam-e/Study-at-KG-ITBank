package spring.mvc.spring14.dto;

public class J07_People {
	private String name;
	private int age;
	public J07_People() {
	}
	public J07_People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
