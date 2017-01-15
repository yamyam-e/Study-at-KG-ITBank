import javax.swing.JOptionPane;

public class J05_Array {
	public static void main(String[] args) {
		
//		기본 타입(자료형)의 배열 이용하기
		
//		1. 배열 선어
		
//		1-1. 정수 3개를 저장하는 배열
		int[] i = new int[3]; //int[] 해석 => int 형태의 배열 형식
		
		System.out.println("i : " + i);
		
//		문제 : 실수 4개를 저장하는 배열 선언 후 레퍼런스 출력하기
		double[] d = new double[4];
		
		System.out.println("d : " + d);
		
//		참고 : String은 일반자료형 배열과 동일한 방법으로 사용 가능
		String[] ss = new String[2];
		
		ss[0] = "첫번째 문장";
		ss[1] = "두번째 문장";
		
		System.out.println("ss[0] : " + ss[0]);
		System.out.println("ss[1] : " + ss[1]);
		
//		문제 : i가 대상으로 하는 마지막 배열 공간에 50 저장 후 출력
		i[2] = 50;
		System.out.println("i : " + i[0] + ", " + i[1] + ", " + i[2]);
//		배열은 힙영역에 만들어지기 때문에 기본값 0, null.....이 출력 되게 되어 있다.************
//		그러나 일반 변수는 기본값 없이 출력을 할 수 없다.
		
//		2. 기본 타입(자료형) 배열 초기화의 특별 형식
		
		int[] i2 = { 10, 20, 30 };
		System.out.println("i2 : " + i2);
		
		String[] s2 = { "가나다", "ABC", "1234" };
		System.out.println("s2 : " + s2);
		
//		2-2.
		double[] d2 = new double[] {1.1, 2.2};
		
		String[] s3 = new String[] {"가나다", "둘리"};
		
//		문제
//		1. String 배열 선언 - 정보 3개 저장 가능한 배열
//		2. JOptionPane을 이용하여 저장 후 syso 출력
		
		String[] s4 = new String[3];
	
		for(int j=0; j<s4.length; j++){
			s4[j] = JOptionPane.showInputDialog((j+1) + "번 문장입력");
		}
		for(int j=0; j<s4.length; j++){
			System.out.println((j+1) + "번 문장 : " + s4[j]);
		}
		
	}

}
