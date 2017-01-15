
public class J12_HW {
	public static void main(String[] args) {
		
//		다음의 문제를 연산자를 이용하여 출력하세요
		
//		1. 1~1000 범위의 정수 랜덤값을 입력받아 다음의 결과를 출력하세요
		int ran1 = (int)(Math.random()*1000 + 1);
		System.out.println("1. 1~1000 범위의 정수 랜덤값을 입력받아 다음의 결과를 출력하세요: " + ran1);
//			1. 짝수, 홀수 판별
		String res = ran1 % 2 == 0 ? "짝수입니다." : "홀수 입니다.";
		System.out.println("	- " + res);
//			2. 3의 배수인지 아닌지를 출력
		res = ran1 % 3 == 0 ? "3의 배수 입니다." : "3의 배수가 아닙니다.";
		System.out.println("	- " + res);

//		2. 1~1000 범위의 정수 랜덤값 두 개를 입력받아 다음 결과 출력
		ran1 = (int)(Math.random()*1000 + 1);
		int ran2 = (int)(Math.random()*1000 + 1);
		System.out.println("2. 1~1000 범위의 정수 랜덤값 두 개를 입력받아 다음 결과 출력: " 
										+ "1번 랜덤수: " + ran1 
											+ " 2번 랜덤수: " + ran2 );
//			1. 두 수 중 큰 수를 출력
		int big = ran1 > ran2 ? ran1 : ran2;
		System.out.println("	- 두 수 중 큰 수를 출력: " + big);
//			2. 작은 수가 짝수인지, 아닌지를 출력
		int small = ran1 > ran2 ? ran2 : ran1;
		res = small % 2 == 0 ? "짝수 입니다." : "홀수 입니다.";
		System.out.println("	- 작은 수가 짝수인지, 아닌지를 출력: 작은 수 " + small + "은 " + res);
		
//			3. 두 수의 합이 짝수이면서, 6의 배수인지 아닌지 출력
		int sum = ran1 + ran2;
		boolean b1 = (sum % 2 == 0) && (sum % 6 == 0) ? true : false;
		System.out.println("	- 두 수의 합이 짝수이면서, 6의 배수인지 아닌지 출력: " + b1);
//			4. 두 수의 합이 300~600의 범위인지 아닌지를 출력
		boolean b2 = (sum >= 300) && (sum <= 600) ? true : false;
		System.out.println("	- 두 수의 합이 300~600의 범위인지 아닌지를 출력: " + b2);
	}

}
