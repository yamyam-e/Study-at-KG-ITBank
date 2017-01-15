import javax.swing.JOptionPane;

public class J06_Student {
	
	String name;
	int kor, eng, math, total;
	double avg;
	int rank;
	String grade;
	
	String setData(){
		this.name = JOptionPane.showInputDialog("�̸� �Է�");
		modifyData();
		return "������ �Ϸ� �Ǿ����ϴ�.";
	}
	
	int changerInt(String title){
		String rcv = JOptionPane.showInputDialog(title);
		return Integer.parseInt(rcv);
	}
	
	String modifyData(){
		
		this.kor = changerInt("���� ���� �Է�");
		this.eng = changerInt("���� ���� �Է�");
		this.math = changerInt("���� ���� �Է�");
		this.total = this.kor + this.eng + this.math;
		this.avg = total / 3.0;
		this.grade = setGrade(avg);
		
		return "������ ���� �Ǿ����ϴ�.";
	}
	
	String setGrade(double a){
		
		String result = null;
		
		if(a>=90){
			result = "A";
		} else if(a>=80){
			result = "B";
		} else if(a>=70){
			result = "C";
		} else if(a>=60){
			result = "D";
		} else {
			result = "F";
		}
			
		return result;
	}
	
	String showData(){
		return this.name + "\t" + this.kor + "\t" + this.eng + "\t" 
					+ this.math + "\t" + this.total + "\t" + this.avg + "\t" + this.grade;
	}
	
	int getRank(){
		return this.rank;
	}
	
	String getGrade(){
		return this.grade;
	}
	
	String getName(){
		return this.name;
	}

}
