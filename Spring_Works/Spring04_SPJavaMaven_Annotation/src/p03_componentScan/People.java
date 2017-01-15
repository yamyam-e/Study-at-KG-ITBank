package p03_componentScan;

import org.springframework.stereotype.Component;

// @Component
// - 기본적으로, 첫글자를 소문자로 바꾼 클래스 이름이 id로 설정됨
// 	예 : class People{} => id : people 

@Component
public class People {
	private String name = "둘리";
	private int age = 10;
	
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
