import javax.swing.JOptionPane;

public class J03_Hamberger {
	
	String name;
	int price, calori;
	
	void setData(){
		
		this.name = JOptionPane.showInputDialog("�̸� �Է�");
		setPriceData();
		setCaloriData();
	}
	
	void setPriceData(){
		
		String rcv = JOptionPane.showInputDialog("���� �Է�");
		this.price = Integer.parseInt(rcv);
	}
	
	void setCaloriData(){
		
		String rcv = JOptionPane.showInputDialog("Į�θ� �Է�");
		this.calori = Integer.parseInt(rcv);
	}
	
	String showData(){
		
		return this.name + "\t" 
					+ this.price + "\t" + this.calori;
	}
	
	String getTitle(String str, int lineLength) {
		
		String title = str + "\n�̸�\t����\tĮ�θ�\n";
				
		for(int i=0; i<lineLength; i++){
			title += "=";
		}
		return title + "\n";
	}

}
