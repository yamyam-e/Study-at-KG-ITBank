import javax.swing.JOptionPane;

public class J05_Student {

	String name;
	int kor, eng, math, sci, total;
	double avg;
	
	int myJopInt(String title){
		String rcv = JOptionPane.showInputDialog(title);
		return Integer.parseInt(rcv);
	}
	
	String setData(){
		
		this.name = JOptionPane.showInputDialog("�л� �̸� �Է�");
		modData(); // ���ϰ��� ������ ������ ���� �ʾұ� ������ 
				   // ������ �Ϸ� �Ǿ��ٴ� �޼��� �ʳ���
		
		return "������ �Ϸ�Ǿ����ϴ�.";
	} 
	
	String modData(){
		
		this.kor = myJopInt("���� �Է�");
		this.eng = myJopInt("���� �Է�");
		this.math = myJopInt("���� �Է�");
		this.sci = myJopInt("���� �Է�");
		this.total = this.kor + this.eng + this.math + this.sci;
		this.avg = this.total / 4.0;
		
		return "������ �Ϸ�Ǿ����ϴ�.";
	}
	
	String showData(){
		
		return "�̸� : " + this.name +"\n���� : " + this.kor + "\n���� : " + this.eng
						 + "\n���� : " + this.math  + "\n���� : " + this.sci 
						 + "\n���� : " + this.total + "\n��� : " + this.avg;
		
	}
}


