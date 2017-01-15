
public class J07_Wrapper {
	
	public static void main(String[] args) {
		
		String p1 = "1234";
		int p2;
		
//		에러 : p2 = (int)p1;
//		=> Wrapper클래스 계열 명령어가 필요
		
//		1. String을 정수로 변환하려는 경우
		p2 = Integer.parseInt(p1);
		System.out.println("p2 = " +  p2);
		System.out.println(p2 + 200);	
		
		
//		2. String을 실수로 변환하려는 경우
		String p3 = "123.456";
		double dd;
		dd = Double.parseDouble(p3);
		System.out.println(dd + 10);
		
		
	}

}
