import javax.swing.JOptionPane;

public class J08_People {
	
	String name;
	int age;
	
	void setData() {
		name = JOptionPane.showInputDialog("�̸� �Է�");
		String rcv = JOptionPane.showInputDialog("���� �Է�");
		age = Integer.parseInt(rcv);
	}
	
	String getData() {	
		return "�̸�: " + name + "\n" + "����:" + age;
	}

}
