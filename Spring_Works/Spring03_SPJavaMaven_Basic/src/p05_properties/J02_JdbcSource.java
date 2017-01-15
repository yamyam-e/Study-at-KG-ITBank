package p05_properties;

public class J02_JdbcSource {
	
	private String driverName, url, username, password;
	
	@Override
	public String toString() {
		return "J02_JdbcSource [driverName=" + driverName + ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
