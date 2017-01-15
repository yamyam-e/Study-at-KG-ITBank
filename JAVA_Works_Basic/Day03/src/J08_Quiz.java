
public class J08_Quiz {
	public static void main(String[] args) {
//		학생 정보 관리 프로그램
//		둘리, 국어점수 79, 영어점수78, 수학점수 76점
//		총점?, 평균?
		
//		=> 클래스, 객체, 레퍼런스를 이용하여 작성
		
		J08_Students s1 = new J08_Students();
		s1.name = "둘리";
		s1.kor = 79;
		s1.eng = 78;
		s1.math = 76;
		s1.total = s1.kor + s1.eng + s1.math;
		s1.avg = s1.total / 3.0;
		
		System.out.println("이름 : " + s1.name);
		System.out.println("국어 : " + s1.kor);
		System.out.println("영어 : " + s1.eng);
		System.out.println("수학 : " + s1.math);
		System.out.println("총점 : " + s1.total);
		System.out.println("평균 : " + s1.avg);
		
	}
}
