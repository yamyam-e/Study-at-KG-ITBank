
public class J03_People {
	
	String name;
	int age;
	
	void setData(String name, int age) {
		System.out.println("set: this = " + this);
		
		this.name = name;
		this.age = age;
	}
	
	void showData(){
		System.out.println("�̸�: " + name + " , ����: " + age);
	}

}
