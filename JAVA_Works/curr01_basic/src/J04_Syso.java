
//새로운 클래스 만들기 단축키 Ctrl + n

public class J04_Syso {
	public static void main(String[] args) {
		
//		데이터의 형식에 따라 어떻게 출력 되는 형식을 정확히 알고 있을 것.
		System.out.println("아버지 나이 : ");
		System.out.println(30);
		System.out.println("살");
		
		System.out.print("어머니 나이 : ");
		System.out.print(20);
		System.out.println("살");
		
		System.out.println("내 나이 : " + 10 + "살");
//		=> 10은 쌍따옴표 이후 이기 때문에 쌍따옴표 형태로 처리
		
		System.out.println(30 + 20);
		System.out.println("30 + 20");
		System.out.println("30" + "20");
		
		System.out.println("아버지 나이와 어머니 나이 합 : " + 30 + 20 + "살");
//		=> 출력 대상 중 쌍따옴표 형태의 데이터 이후에 등장하는 데이터는
//			                                   모두 쌍따옴표 형태로 처리 된다.
		
		System.out.println("아버지 나이와 어머니 나이 합 : " + (30 + 20) + "살");
//		=> 중괄호 처리로 상수로 취급하여 합산
		
		System.out.println(30 + 20 + "살은 아버지와 어머니 나이의 합");
//		=> 쌍따옴표 전 숫자는 상수로 처리하여 합산
		
	}
}
