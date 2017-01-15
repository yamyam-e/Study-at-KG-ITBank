import javax.swing.JOptionPane;

public class J04_Student {
	String name;
	int kor, eng, math, total;
	double avg;
	
	void setData(){
		
		this.name = JOptionPane.showInputDialog("학생 이름 입력");
		modify();
	}
	
	void modify(){
		
		String rcv = JOptionPane.showInputDialog("국어 점수 입력");
		this.kor = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("영어 점수 입력");
		this.eng = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("수학 점수 입력");
		this.math = Integer.parseInt(rcv);
		this.total = this.kor + this.eng + this.math;
		this.avg = this.total / 3.0;
		
	}
	
	String showData(){
		
		return this.name +"\t"+ this.kor +"\t"+ this.eng
				 +"\t"+ this.math +"\t"+ this.total +"\t"+ this.avg;
		
	}
	
	String title(String str) {
		
		String title = str + "\n이름\t국어\t영어\t수학\t총점\t평균\n";
				
		for(int i=0; i<100; i++){
			title += "=";
		}
		return title + "\n";
	}

}
