package p04_autowired;

import org.springframework.stereotype.Component;

@Component("cccBean")
public class J02_CCC {
	private String data = "CCC의 데이터";
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
