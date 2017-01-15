import javax.swing.JOptionPane;

public class J05_Buger {

	String name;
	int price;
	double calori;
	
	public J05_Buger(){
		this.name = JOptionPane.showInputDialog("햄버거 이름 입력");
		this.price = Integer.parseInt(JOptionPane.showInputDialog("햄버거 가격 입력"));
		this.calori = Double.parseDouble(JOptionPane.showInputDialog("햄버거 칼로리 입력"));
	}
	
	public J05_Buger(String name, int price, double calori){
		this.name = name;
		this.price = price;
		this.calori = calori;
	}
	
	void showData(){
		JOptionPane.showMessageDialog(null, "이름: " + this.name + "\n"
											+ "가격: " + this.price + "\n"
											+ "칼로리: " + this.calori);
	}
}
