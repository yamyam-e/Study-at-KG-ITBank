import javax.swing.JOptionPane;

public class J03_Quiz {
	public static void main(String[] args) {
		
//		문제 : 학생 정보 관리 프로그램
//		=>이름, 국어, 영어, 수학 점수, 총점, 평균
		
//		1. 둘리, 79, 78, 76
//		2. 도우너, 84, 85, 77
		
//		클래스 작성 && 개체 생서 &&
//		메소드 작성
//			1. 위의 값을 저장하는 메소드
//			2. 입력된 모든 값 및 총점, 평균을 출력하는 메소드
		
		J03_Student stu1 = new J03_Student();
		setData(stu1, "둘리", 79, 78, 76);
//		stu1.total = total(stu1);
//		stu1.avg = avg(stu1);
		showData(stu1);
		
		J03_Student stu2 = new J03_Student();
		setData(stu2, "도우너", 84, 85, 77);
//		stu2.total = total(stu2);
//		stu2.avg = avg(stu2);
		showData(stu2);	
		
	}
	
	public static void setData(J03_Student theStu, String theName, int theKor, int theEng, int theMath) {
		theStu.name = theName;
		theStu.kor = theKor;
		theStu.eng = theEng;
		theStu.math = theMath;
		theStu.total = total(theStu);
		theStu.avg = avg(theStu);
	}
	
	public static void showData(J03_Student theStu){
		JOptionPane.showMessageDialog(null, "이름: " + theStu.name + "\n"
											+ "국어: " + theStu.kor + "\n"
											+ "영어: " + theStu.eng + "\n"
											+ "수학: " + theStu.math + "\n"
											+ "총점: " + theStu.total + "\n"
											+ "평균: " + theStu.avg);
	}
	
	public static int total(J03_Student theStu) {
		return theStu.kor+theStu.eng+theStu.math;
	}
	
	public static double avg(J03_Student theStu) {
		return total(theStu)/3.0;
	}
	
}
