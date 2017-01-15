import javax.swing.JOptionPane;

public class J09_Quiz {
	
	public static void main(String[] args) {
		
//		문제: 학생 성적 관리 프로그램
//		JOption을 이용해서 작성
		
//		1. 이름, 국어, 영어, 수학 점수 입력 받음
//			- 각 과목은 정수
//		2. 입력된 모든 정보 및 총점, 평균(double)을 출력
		String name;
		int kor, eng, math;
		name = JOptionPane.showInputDialog("이름입력");
		kor = Integer.parseInt(JOptionPane.showInputDialog("국어성적입력"));
		eng = Integer.parseInt(JOptionPane.showInputDialog("영어성적입력"));
		math = Integer.parseInt(JOptionPane.showInputDialog("수학성적입력"));
		
		int total = kor + eng + math;
		double avg = total /3.0;
		
		JOptionPane.showConfirmDialog(null, "이름: " + name + "\n"
											+ "국어: " + kor + "\n"
											+ "영어: " + eng + "\n"
											+ "수학: " + math + "\n"
											+ "총점: " + total + "\n" 
											+ "평균: " + avg);
		
	}

}
