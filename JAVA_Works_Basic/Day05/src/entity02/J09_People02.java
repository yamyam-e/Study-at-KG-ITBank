package entity02;

public class J09_People02 {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("���� ���� �Ұ�");
			return;//���α׷� ���Ḧ ���ؼ� ���
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
