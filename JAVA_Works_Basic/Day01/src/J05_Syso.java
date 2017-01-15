
public class J05_Syso {

	// main 입력 후 Ctrl + Space
	public static void main(String[] args) {
		
		System.out.print(
				"자바 기본 출력기능 print - 줄바꿈 없음");
		System.out.print("줄바꿈기호 \n");
		System.out.println("println: 자동줄바꿈 출력");
		//단축키 : syso + Ctrl + Space
		System.out.println("출력 연습 시작하기");
		System.out.println("내 나이 : 10");
		System.out.println("동생 나이 : 5");
		System.out.println("나와 동생 나이 합 : 10 + 5");
		System.out.println("10 + 5");
		System.out.println(10);//숫자는 쌍따옴표 없이 이용 가능
		System.out.println(10 + 5);
		System.out.print("나와 동생 나이의 합 : ");
		System.out.println(10 + 5);
		System.out.println("나의 나이 : " + 10);
		System.out.println("나와 동생 나이의 합 : " + 10 + 5);//105 출력
		//=> 출력 대상 중 쌍따옴표 형식 ****이후의 출력 대상들은**** 
		//	 *****자동으로 쌍따옴표가 있는 것으로 간주된다.*****
		//	  숫자계산을 원할 경우 숫자들을 괄호로 묶으면 된다.
		System.out.println("나와 동생 나이의 합 : " + (10 + 5));//15출력
		//   숫자 계산식을 앞쪽에 두면 숫자 계산이 먼저 된다.
		System.out.println(10 + 5 + "살은 나와 동생 나이의 합");//15출력
	}
	
}
