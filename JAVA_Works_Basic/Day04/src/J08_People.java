import javax.swing.JOptionPane;

public class J08_People {
	
	String name;
	int age;
	
	void setData() {
		name = JOptionPane.showInputDialog("이름 입력");
		String rcv = JOptionPane.showInputDialog("나이 입력");
		age = Integer.parseInt(rcv);
	}
	
	String getData() {	
		return "이름: " + name + "\n" + "나이:" + age;
	}

}
