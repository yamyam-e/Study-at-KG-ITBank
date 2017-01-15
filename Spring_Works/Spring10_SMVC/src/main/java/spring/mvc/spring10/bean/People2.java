package spring.mvc.spring10.bean;

public class People2 {
	
	private String name;
	private Integer age;
	public People2() {
	}
	public People2(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
