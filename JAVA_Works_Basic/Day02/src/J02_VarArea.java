
public class J02_VarArea {
	
//	변수의 존재가 유지되는 범위 이해하기
	public static void main(String[] args) {
	
		int a = 100; //지역변수
		System.out.println("1. a = " + a);
		
		{
			int b = 20; //지역변수
			System.out.println("2. b = " + b);
			System.out.println("2. a = " + a);
		}
		
//		에러 System.out.println("2. b = " + b);
				
	}
}
