import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J02_JOptionPane {
	public static void main(String[] args) {
		
		String msg = "출력하고 싶은 메시지";
		
		System.out.println(msg);	// 콘솔창에 출력
		
		JOptionPane.showMessageDialog(null, msg);
		
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
//		에러 : JOptionPane.showMessageDialog(null, new JTextArea(1000));
//		=> 출력하려는 대상의 형태는 String만 가능
		
		
		String aa = JOptionPane.showInputDialog("입력하세요");
//		=> 무조건 String으로 제공
	
		
		String name = JOptionPane.showInputDialog("이름 입력");
		String age = JOptionPane.showInputDialog("나이 입력");
		
		JOptionPane.showMessageDialog(null, 
				new JTextArea(name + "의 나이는 " + age + "살"));
		
//		문제 : 위 사람의 10년 후 나이를 jop로 출력하세요.
		int age2 = Integer.parseInt(age);
		JOptionPane.showMessageDialog(null, 
				new JTextArea(name + "의 10 후의 나이는 " + (age2 + 10) + "살"));
		
//		문제
//		다음 내용을 JOptionPane을 이용하여 작성
//			1. 이름, 국어, 영어, 수학 점수 입력받음(각 점수는 int)
//			2. 총점 및 평균 계산 (평균은 double)
//			3. 모든 정보를 출력
		
		
//		*******하나의 입력 변수를 재사용하는 습관 : String rcv 사용******
//		*******결과 String 메세지 사용하는 습관 :  String res ***********
//		*******결과 값 타이틀도 입력해주는 습과 : [학생 정보 결과]*******
//		*******변수이름 적정하게 사용하는 습관 : String stuName *********
		
		String stuName = JOptionPane.showInputDialog("학생 이름 입력");
		String rcv = JOptionPane.showInputDialog("국어 점수 입력");
		int kor = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("영어 점수 입력");
		int eng = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("수학 점수 입력");
		int math = Integer.parseInt(rcv);
		
//		int kor = Integer.parseInt(JOptionPane.showInputDialog("국어 성적 입력"));
//		int eng = Integer.parseInt(JOptionPane.showInputDialog("영어 성적 입력"));
//		int math = Integer.parseInt(JOptionPane.showInputDialog("수학 성적 입력"));
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		String res = "[학생 정보 결과]\n" 
						+ "이름 : " + stuName + "\n"
						+ "국어 : " + kor + "\n"
						+ "영어 : " + eng + "\n"
						+ "수학 : " + math + "\n"
						+ "총점 : " + total + "\n"
						+ "평균 : " + avg;
		
		JOptionPane.showMessageDialog(null,	new JTextArea(res));
		
		
		
		
		
	}
}










