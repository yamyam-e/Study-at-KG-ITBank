package p05_required;

import org.springframework.beans.factory.annotation.Required;

public class People {
	private String name;
	private int age;
	
//	@Required
//	- 빈을 생성할 때, 반드시 값을 입력 받아야 할 대상으로 설정
//	- 메소드(setter)
	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
