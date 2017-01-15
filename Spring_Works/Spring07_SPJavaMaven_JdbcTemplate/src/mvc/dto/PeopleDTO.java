package mvc.dto;

public class PeopleDTO {
	private int num;
	private String name;
	private int age;public PeopleDTO() {
	}
	public PeopleDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public PeopleDTO(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	@Override
	public String toString() {
		return "PeopleDTO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
}
