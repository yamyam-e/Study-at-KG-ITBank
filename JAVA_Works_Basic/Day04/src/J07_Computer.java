import javax.swing.JOptionPane;

public class J07_Computer {
	
	String name;
	int keyPrice, monPrice, deskPrice, totalPrice;
	
	void setData(String theName, int theKeyPrice, int theMonPrice, int theDeskPrice) {
		name = theName;
		keyPrice = theKeyPrice;
		monPrice = theMonPrice;
		deskPrice = theDeskPrice;
		totalPrice = theKeyPrice + theMonPrice + theDeskPrice; 
	}
	
	void showData() {
		JOptionPane.showMessageDialog(null, "�̸�: " + name + "\n"
										+"Ű���尡��: " + keyPrice + "��\n"
										+"����Ͱ���: " + monPrice + "��\n"
										+"��ü����: " + deskPrice + "��\n"
										+"�ѱ��Ű���: " + totalPrice + "��\n");
	}
}
