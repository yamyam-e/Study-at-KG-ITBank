package spring00.mvc.spring00.dto;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class UserDTO {
	private String email;
	private String password;
	public UserDTO() {
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
