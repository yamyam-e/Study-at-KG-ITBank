package spring.mvc.spring14.dto;

import org.apache.ibatis.type.Alias;

@Alias("log")
public class LogValidateDTO {
	private String id;
	private String pw;
	public LogValidateDTO() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
