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
		JOptionPane.showMessageDialog(null, "이름: " + name + "\n"
										+"키보드가격: " + keyPrice + "원\n"
										+"모니터가격: " + monPrice + "원\n"
										+"본체가격: " + deskPrice + "원\n"
										+"총구매가격: " + totalPrice + "원\n");
	}
}
