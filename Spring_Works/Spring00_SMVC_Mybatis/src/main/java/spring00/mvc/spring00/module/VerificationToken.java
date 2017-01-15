package spring00.mvc.spring00.module;

import com.sun.mail.util.MailSSLSocketFactory;

public class VerificationToken {
	
	private static final int EXPIRATION_DATE = 60*24;
	private String email;
	private String password;
	private boolean verified;
	
	public VerificationToken(String email, String password) {
		this.email = email;
		this.password = password;
		this.verified = false;
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
	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public static int getExpirationDate() {
		return EXPIRATION_DATE;
	}
	public void sendMail(){
		
	}
}
