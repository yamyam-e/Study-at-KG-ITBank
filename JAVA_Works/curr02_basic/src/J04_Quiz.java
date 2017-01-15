import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J04_Quiz {
	public static void main(String[] args) {
		
//		1. 알림메시지 선택 프로그램
//		- "알림 메시지를 보시겠습니까?(y/n)" 질문 후
//			y 또는 Y 선택한 경우 => "2시간 후에 미팅이 있습니다" 메시지 알림
//			n 또는 N 선택한 경우 => 아무것도 실행 안함
		String sel = JOptionPane.showInputDialog("알림 메시지를 보시겠습니까?(y/n)");
		
		String res = "";
		
		if(sel.equalsIgnoreCase("y")){
			res = "2시간 후에 미팅이 있습니다";
			JOptionPane.showMessageDialog(null, new JTextArea(res));
		}
		
//		2. 청소년 인증 프로그램
//		- 나이를 입력받은 후
//			19살 이하인 경우 => "청소년 할인 대상입니다." 알림 메시지
//			20살 이상인 경우 => "청소년 할인 대상이 아닙니다." 알림 메시지
		String rcv = JOptionPane.showInputDialog("나이 입력");
		int age = Integer.parseInt(rcv);
		
		if(age<=19) {
			res = "청소년 할인 대상입니다.";
		} else {
			res = "청소년 할인 대상이 아닙니다.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
		
//		3. 성적 등급 산출 프로그램
//		- 학색의 이름과 국어, 영어, 수학 점수를 입력받음 (점수 int)
//		- 학생의 총점과 평균 산출
		String stuName = JOptionPane.showInputDialog("학생 이름 입력");
		rcv = JOptionPane.showInputDialog("국어 점수 입력");
		int kor = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("영어 점수 입력");
		int eng = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("수학 점수 입력");
		int math = Integer.parseInt(rcv);
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
//		- 평균 점수에 따라 다음과 같은 등급이 정해짐
//			평균이 90점 이상인 경우 
//				- 모든 과목의 점수가 85점 이상이면, 최우수학생, A등급
//				- 하나의 점수라도 85점 미만이면, 우수학생, A등급
//			평균이 80점 이상인 경우, B등급 
//			평균이 70점 이상인 경우, C등급 
//			평균이 60점 이상인 경우, D등급
//			평균이 60점 미만인 경우
//				- 하나의 과목이라도 30점 미만이면, 재수강 불가능, F등급
//				- 모든 과목의 점수가 30점 이상이면, 재수강 가능, F등급
		String msg = "";
		
		if(avg>=90) {
			if (kor>=85&&eng>=85&&math>=85) {
				msg = stuName + "학생은 최우수학생, A등급";
			} else {
				msg = stuName + "학생은 우수학생, A등급";
			}
		} else if (avg>=80 && avg<=89) {
			msg = stuName + "학생은 B등급";
		} else if (avg>=70 && avg<=79) {
			msg = stuName + "학생은 C등급";
		} else if (avg>=60 && avg<=69) {
			msg = stuName + "학생은 D등급";
		} else {
			if(kor>30&&eng>30&&math>30) {
				msg = stuName + "학생은 재수강 가능, F등급";
			} else {
				msg = stuName + "학생은 재수강 불가능, F등급";
			}
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
//		4. 놀이기구 이용 정보 프로그램
//		- 어린이의 이름, 나이(int), 키(double)를 입력
		String childName = JOptionPane.showInputDialog("어린이 이름 입력");
		rcv = JOptionPane.showInputDialog("어린이 나이 입력");
		int childAge = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("어린이 키 입력");
		double childHeight = Double.parseDouble(rcv);
		
//		- 각 조건에 따라 이용 가능한 놀이기구 출력
//			나이가 10살 이상인 경우
//				- 키가 150.5 이상이면 : 자이로드롭, 우주열차 가능
//				- 키가 150.5 미만이면 : 우주열차 가능
//			나이가 10살 미만인 경우
//				- 키가 120.5 이상이면 : 해저탐험, 회전목마 가능
//				- 키가 120.5 미만이면 : 회전목마 가능
		if(childAge>10) {
			if(childHeight>150.5) {
				msg = childName + " 어린이는 자이로드롭, 우주열차 가능";
			} else {
				msg = childName + " 어린이는 우주열차 가능";
			}
		} else {
			if(childHeight>120.5) {
				msg = childName + " 어린이는 해저탐험, 회전목마 가능";
			} else {
				msg = childName + " 어린이는 회전목마 가능";
			}
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
	}
}











