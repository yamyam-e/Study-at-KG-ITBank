
public class J01_Wrapper {
	public static void main(String[] args) {
	
		String s1 = "123";
		System.out.println(s1 + 100); // 결합 값 출력
		
//		에러 : int i1 = (int)s1;
//		=> String은 Cast연산자로 변환 불가능
		
		
//		1. String을 int로 변환하는 경우
		int i1 = Integer.parseInt(s1);
		System.out.println("1 : " + (i1 + 100) );
		
		
//		2. String을 double로 변환하는 경우
		String s2 = "123.456";
		double d1 = Double.parseDouble(s2);
		System.out.println("2 : " + (d1 + 100) );
		
		
//		3. String을 boolean으로 변환하는 경우
		String s3 = "true";
		boolean b1 = Boolean.parseBoolean(s3);
		System.out.println("3 : " + b1);
		
		
		
		
		
	}

}














