import javax.swing.JOptionPane;

public class J09_Quiz {
	
	public static void main(String[] args) {

//		학생 정보 관리 프로그램
//		=> 이름, 국어, 영어 , 수학 , 총점, 평균
		
//		메뉴
//			1. 학생 정보 입력
//			2. 학생 정보 보기
//			3. 합격 결과 보기
//				- 평균 85.5 이상이면 합격/아니면 불합격
//			4. 프로그램 종료
		
		String showMenu = "1. 학생 정보 입력\n2. 학생 정보 보기\n3. 합격 결과 보기\n4. 프로그램종료";
		
		J09_Students s1 = new J09_Students();
		
		while(true) {
			String num = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			if(num.equals("1")) { //입력
				s1.name = JOptionPane.showInputDialog("이름입력");
				
				String rcv = JOptionPane.showInputDialog("국어점수");
				s1.kor = Integer.parseInt(rcv);
				
				rcv = JOptionPane.showInputDialog("영어점수");
				s1.eng = Integer.parseInt(rcv);
				
				rcv = JOptionPane.showInputDialog("수학점수");
				s1.math = Integer.parseInt(rcv);
				
				s1.total = s1.kor + s1.eng + s1.math;
				
				s1.avg = s1.total / 3.0;	
			} else if(num.equals("2")) { //정보
				if (s1.name == null) {
					msg = "해당정보가 없음";
				}
				else {
					msg = "이름: " + s1.name +"\n"
							+"국어: " + s1.kor +"\n"
							+"영어: " + s1.eng +"\n"
							+"수학: " + s1.math +"\n"
							+"총점: " + s1.total +"\n"
							+"평균: " + s1.avg;
				}
				
			} else if(num.equals("3")) { //합격여부
				if (s1.name == null) {
					msg ="해당정보가 없음";
				} else {
					if (s1.avg >= 85.5) {
						msg = s1.name + "님은 합격입니다.";
					} else {
						msg =  s1.name + "님은 불합격입니다.";
					}		
				}
				
			} else if(num.equals("4")) { //종료
				break;
			} else {
				msg = "잘못된 정보 입력";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
	}

}
