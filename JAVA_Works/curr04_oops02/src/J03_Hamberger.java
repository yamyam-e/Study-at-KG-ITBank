import javax.swing.JOptionPane;

public class J03_Hamberger {
	
	String name;
	int price, calori;
	
	void setData(){
		
		this.name = JOptionPane.showInputDialog("이름 입력");
		setPriceData();
		setCaloriData();
	}
	
	void setPriceData(){
		
		String rcv = JOptionPane.showInputDialog("가격 입력");
		this.price = Integer.parseInt(rcv);
	}
	
	void setCaloriData(){
		
		String rcv = JOptionPane.showInputDialog("칼로리 입력");
		this.calori = Integer.parseInt(rcv);
	}
	
	String showData(){
		
		return this.name + "\t" 
					+ this.price + "\t" + this.calori;
	}
	
	String getTitle(String str, int lineLength) {
		
		String title = str + "\n이름\t가격\t칼로리\n";
				
		for(int i=0; i<lineLength; i++){
			title += "=";
		}
		return title + "\n";
	}

}
