import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J12_HW {
	public static void main(String[] args) {
		
//		학생 정보 관리 프로그램
//		1. 정보항목
//			- 이름, 국어 , 영어, 수학, 총점, 평균, 등급(ABCDEF)
//			- 각 과목 점수(int) / 평균 / dobule
//			- 등급은 기존 형식대로..(90점이상 - A, 80점이상 - B....)
//		2. 메뉴
//			1. 학생 정보 입력
//				- 이름, 각 과목 점수
//			2. 학생 정보 보기
//				- 모든 정보 항목
//			3. 성적 결과 보기
//				- 평균 80점 이상 && 각 과목 모두 70점 이상이면 합격
//			4. 프로그램 종료
//		3. 조건
//			1. 정보가 입력되지 않은 상황에서 메뉴2,3번" 선택 시
//				경고 알림 등으로 상황 처리
//			2. 정보가 입력된 상황에서 "메뉴1번" 선택 시
//				기존 정보 삭제 알림 및 동의 확인 철리 필요(y/n)
		
		String showMenu = "[학생정보관리 프로그램}\n"
							+ "1. 학생 정보 입력\n"
							+ "2. 학생 정보 보기\n"
							+ "3. 성적 결과 보기\n"
							+ "4. 프로그램 종료";
		
		String stuName = null, grade = null;
		int kor = -1 , eng = -1 , math = -1;
		int total = 0;
		double avg = 0;
		
		while(true){
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")) { // 학생 정보 입력	
				if(stuName == null) {
					stuName = JOptionPane.showInputDialog("학생 이름 입력");
					String rcv = JOptionPane.showInputDialog("국어 성적 입력");
					kor = Integer.parseInt(rcv);
					
					rcv = JOptionPane.showInputDialog("국어 성적 입력");
					eng = Integer.parseInt(rcv);
					
					rcv = JOptionPane.showInputDialog("국어 성적 입력");
					math = Integer.parseInt(rcv);
					
					total = kor + eng + math;
					avg = total / 3.0;
					
					msg = "정보 입력이 완료되었습니다.";
					
					if(avg>=90) {
						grade = "A 등급";
					} else if(avg>=80&&avg<=89){
						grade = "B 등급";
					} else if(avg>=70&&avg<=79){
						grade = "C 등급";
					} else if(avg>=60&&avg<=69){
						grade = "D 등급";
					} else if(avg>=50&&avg<=59){
						grade = "E 등급";
					} else {
						grade = "F 등급";
					}
				} else {
					String ans = JOptionPane.showInputDialog("기존 정보를 삭제하고 계속하시겠습니까? (y/n)");
					if(ans.equalsIgnoreCase("y")) {
						stuName = null;
						msg = "기존 정보를 삭제 하였습니다.";
					} else if(ans.equalsIgnoreCase("n")) {
						msg = "기존 정보를 유지 하였습니다.";
					} else {
						msg = "잘못된 입력입니다.";
					}
				}
										
			} else if(sel.equals("2")) { // 학생 정보 보기
				if(stuName == null) {
					msg = "정보가 없습니다.";
				} else {
					msg = "[학생정보]\n"
							+ "이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등급\n"
							+ "==================================================================================\n"
							+ stuName + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t"
							+ avg + "\t" + grade;
				}
				
			} else if(sel.equals("3")) { // 성적 결과 보기
				if(stuName == null) {
					msg = "정보가 없습니다.";
				} else {
					if (avg>=80&&kor>=70&&eng>=70&&math>=70) {
						msg = stuName + " 학생은 합격입니다.";
					} else {
						msg = stuName + " 학생은 불합격입니다.";
					}
				}
				
			} else if(sel.equals("4")) { // 프로그램 종료
				break;
			} else { // 오류
				msg = "잘모된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
		
	}

}










