
public class J12_Quiz {
	public static void main(String[] args) {
		
//		1. 1.*** ~ 200.*** 범위에 대한 랜덤 실수를 변수에 저장 및 출력
		double ran = Math.random()*200 + 1;
		System.out.println("1. *** ~ 200.*** 범위에 대한 랜덤 실수를 변수에 저장 및 출력 : " + ran);

//		2. 1번에서 선언된 변수의 값을 정수로 형변환한 후 10으로 나눈 몫 결과를 출력
		int intRan = (int)ran;
		System.out.println("2. 1번에서 선언된 변수의 값을 정수로 형변환한 후 10으로 나눈 몫 결과를 출력 : " + (intRan / 10) );

//		3. 1번에서 선언된 변수의 값을 정수로 형변환한 후 10으로 나눈 나머지 결과를 출력
		System.out.println("3. 1번에서 선언된 변수의 값을 정수로 형변환한 후 10으로 나눈 나머지 결과를 출력 : " + (intRan % 10) );

//		4. 1번에서 선언된 변수의 값을 정수로 형변환한 후 10으로 나눈 나머지 값 결과가 0인지 아닌지를 출력
		String res1 = (intRan % 10) == 0 ? "나머지 값은 0 입니다." : "나머지 값은 0이 아닙니다";
		System.out.println("4. 1번에서 선언된 변수의 값을 정수로 형변환한 후 10으로 나눈 나머지 값 결과가 0인지 아닌지를 출력 : " + res1);

//		5. 1번에서 선언된 변수의 값을 정수로 형변환한 후 40을 더해서 새로운 변수에 저장한 후 출력
		int temp1 = intRan + 40;
		System.out.println("5. 1번에서 선언된 변수의 값을 정수로 형변환한 후 40을 더해서 새로운 변수에 저장한 후 출력 : " + temp1);

//		6. 5번에서 선언된 변수의 값이 짝수인지, 홀수인지를 출력
		String res2 = temp1 % 2 == 0 ? "짝수 입니다." : "홀수 입니다.";
		System.out.println("6. 5번에서 선언된 변수의 값이 짝수인지, 홀수인지를 출력 : " + res2);

//		7. 1번에서 선언된 변수의 값을 정수로 형변환한 값과 5번에서 선언된 변수의 값의 합이 7의 배수인지 아닌지를 출력
		int temp2 = intRan + temp1;
		String res3 = temp2 % 7 == 0 ? "7의 배수 입니다." : "7의 배수가 아닙니다.";
		System.out.println("7. 1번에서 선언된 변수의 값을 정수로 형변환한 값과 5번에서 선언된 변수의 값의 합이 7의 배수인지 아닌지를 출력 : " + res3);

//		8. 5번에서 선언된 변수의 값이 80이상 ~150 미만의 범위인지 아닌지를 출력
		String res4 = temp1>80 && temp1<150 ? "80 ~ 150 사이의 수입니다." : "80 ~ 150 사이의 수가 아닙니다.";
		System.out.println("9. 5번에서 선언된 변수의 값이 80이상 ~150 미만의 범위인지 아닌지를 출력 : " + res4);
		
	}

}











