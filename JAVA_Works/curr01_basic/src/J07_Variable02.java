
public class J07_Variable02 {	// 1번 영역 시작
	
	public static void main(String[] args) {	// 2번 영역 시작
		
		int a = 10;
		System.out.println("2번 영역 a : " + a);
		
		{	// 3번 영역 시작
			
			System.out.println("3번 영역 a : " + a);
			
			int b = 300;
			
		}	// 3번 영역 끝
		
//		에러 : System.out.println("2번 영역 b : " + b);
		
	}	// 2번 영역 끝

}	// 1번 영역 끝
