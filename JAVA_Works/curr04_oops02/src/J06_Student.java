import javax.swing.JOptionPane;

public class J06_Student {
	
	String name;
	int kor, eng, math, total;
	double avg;
	int rank;
	String grade;
	
	String setData(){
		this.name = JOptionPane.showInputDialog("이름 입력");
		modifyData();
		return "저장이 완료 되었습니다.";
	}
	
	int changerInt(String title){
		String rcv = JOptionPane.showInputDialog(title);
		return Integer.parseInt(rcv);
	}
	
	String modifyData(){
		
		this.kor = changerInt("국어 점수 입력");
		this.eng = changerInt("영어 점수 입력");
		this.math = changerInt("수학 점수 입력");
		this.total = this.kor + this.eng + this.math;
		this.avg = total / 3.0;
		this.grade = setGrade(avg);
		
		return "정보가 수정 되었습니다.";
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
