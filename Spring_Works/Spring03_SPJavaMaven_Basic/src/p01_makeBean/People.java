package p01_makeBean;

public class People {
	private String name;
	private int age;
	public People() {
		// TODO Auto-generated constructor stub
		System.out.println("기본생성자 : " + this);
	}
	public People(String name, int age) {
		super();
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
