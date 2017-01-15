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
		
		this.name = JOptionPane.showInputDialog("학생 이름 입력");
		modData(); // 리턴값이 있지만 저장을 하지 않았기 때문에 
				   // 수정이 완료 되었다는 메세지 않나옴
		
		return "저장이 완료되었습니다.";
	} 
	
	String modData(){
		
		this.kor = myJopInt("국어 입력");
		this.eng = myJopInt("영어 입력");
		this.math = myJopInt("수학 입력");
		this.sci = myJopInt("과학 입력");
		this.total = this.kor + this.eng + this.math + this.sci;
		this.avg = this.total / 4.0;
		
		return "수정이 완료되었습니다.";
	}
	
	String showData(){
		
		return "이름 : " + this.name +"\n국어 : " + this.kor + "\n영어 : " + this.eng
						 + "\n수학 : " + this.math  + "\n과학 : " + this.sci 
						 + "\n총점 : " + this.total + "\n평균 : " + this.avg;
		
	}
}


