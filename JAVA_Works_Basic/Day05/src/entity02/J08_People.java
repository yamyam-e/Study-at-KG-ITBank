package entity02;

public class J08_People {
	
//	Ŭ������ ��� �������� private
//	�ܺο��� ����ؾ� �� �޼ҵ忡�� public
	
	private String name;
	private int age;
	private String hobby;
	
	public J08_People() {
		this.name = null;
		this.age = 0;
	}
	
//	1. �����ϴ� �޼ҵ� : setter()�̿�
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
//	2. ���� �����ϴ� �޼ҵ� : getter() �̿�
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

	public String getHobby() {
		return hobby;
	}
//	source >> generate getters and setters �� �̿��Ͽ� setter&getter ���� �޴�
}
