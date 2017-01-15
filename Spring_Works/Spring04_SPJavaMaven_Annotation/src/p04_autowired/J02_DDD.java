package p04_autowired;

import org.springframework.stereotype.Component;

@Component
public class J02_DDD {
	private String data;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
