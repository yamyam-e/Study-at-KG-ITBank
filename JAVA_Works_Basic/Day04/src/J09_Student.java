import javax.swing.JOptionPane;

public class J09_Student {
	String name;
	int kor, eng, math, sci, total;
	double avg;
	
	String setData() {
		name = JOptionPane.showInputDialog("이름입력");
		modData();
		return "저장이 완료 되었습니다.";
	}
	
	String modData() {
		kor = myJopInt("국어점수");
		eng = myJopInt("영어점수");
		math = myJopInt("수학점수");
		sci = myJopInt("과학점수");
		total = kor + eng + math + sci;
		avg = total/4.0;
		return "수정이 완료 되었습니다.";
	}
	
	int myJopInt(String title) {
		String rcv = JOptionPane.showInputDialog(title);
		return Integer.parseInt(rcv);
	}
	
	String getData(){
		return "이름: " + name + "\n"
				+ "국어: " + kor + "\n"
				+ "영어: " + eng + "\n"
				+ "수학: " + math + "\n"
				+ "과학: " + sci + "\n"
				+ "총점: " + total + "\n"
				+ "평균: " + avg;
	}

}
