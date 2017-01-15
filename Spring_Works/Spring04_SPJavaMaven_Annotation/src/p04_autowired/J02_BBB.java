package p04_autowired;

import org.springframework.stereotype.Component;

@Component("bbb")
public class J02_BBB {
	private String data = "BBB의 데이터";
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
