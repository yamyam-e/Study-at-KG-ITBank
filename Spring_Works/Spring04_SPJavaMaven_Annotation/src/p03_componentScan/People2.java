package p03_componentScan;

import org.springframework.stereotype.Component;

@Component("ppp") // 원하는 id를 직접 설정
public class People2 {
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
