package entity02;

public class J08_People {
	
//	클래스의 멤버 변수에는 private
//	외부에서 사용해야 할 메소드에만 public
	
	private String name;
	private int age;
	private String hobby;
	
	public J08_People() {
		this.name = null;
		this.age = 0;
	}
	
//	1. 저장하는 메소드 : setter()이용
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
//	2. 값을 제공하는 메소드 : getter() 이용
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

	public String getHobby() {
		return hobby;
	}
//	source >> generate getters and setters 을 이용하여 setter&getter 생성 메뉴
}
