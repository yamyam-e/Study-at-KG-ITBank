import javax.swing.JOptionPane;

public class J04_Student {
	String name;
	int kor, eng, math, total;
	double avg;
	
	void setData(){
		
		this.name = JOptionPane.showInputDialog("�л� �̸� �Է�");
		modify();
	}
	
	void modify(){
		
		String rcv = JOptionPane.showInputDialog("���� ���� �Է�");
		this.kor = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("���� ���� �Է�");
		this.eng = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("���� ���� �Է�");
		this.math = Integer.parseInt(rcv);
		this.total = this.kor + this.eng + this.math;
		this.avg = this.total / 3.0;
		
	}
	
	String showData(){
		
		return this.name +"\t"+ this.kor +"\t"+ this.eng
				 +"\t"+ this.math +"\t"+ this.total +"\t"+ this.avg;
		
	}
	
	String title(String str) {
		
		String title = str + "\n�̸�\t����\t����\t����\t����\t���\n";
				
		for(int i=0; i<100; i++){
			title += "=";
		}
		return title + "\n";
	}

}
