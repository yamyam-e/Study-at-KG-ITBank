import javax.swing.JOptionPane;

public class J05_Buger {

	String name;
	int price;
	double calori;
	
	public J05_Buger(){
		this.name = JOptionPane.showInputDialog("�ܹ��� �̸� �Է�");
		this.price = Integer.parseInt(JOptionPane.showInputDialog("�ܹ��� ���� �Է�"));
		this.calori = Double.parseDouble(JOptionPane.showInputDialog("�ܹ��� Į�θ� �Է�"));
	}
	
	public J05_Buger(String name, int price, double calori){
		this.name = name;
		this.price = price;
		this.calori = calori;
	}
	
	void showData(){
		JOptionPane.showMessageDialog(null, "�̸�: " + this.name + "\n"
											+ "����: " + this.price + "\n"
											+ "Į�θ�: " + this.calori);
	}
}
