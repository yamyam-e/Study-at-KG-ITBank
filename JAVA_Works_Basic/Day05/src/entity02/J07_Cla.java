package entity02;

public class J07_Cla {
	
	private String priv = "private 메시지";
	String def = "default 메시지";
	protected String prot = "protected 메시지";
	public String pub = "public 메시지";
	
	void work() {
		System.out.println(priv);
	}

}
