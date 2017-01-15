
public class J07_Quiz {
	public static void main(String[] args) {
		
//		1. 1~200까지의 랜덤 정수 값 하나를 변수에 저장한 후 출력
		int ran1 = (int)(Math.random()*200 + 1);
		System.out.println("ran1 = " + ran1);
		
//		2. 1번의 변수값을 10으로 나눈 몫을 출력
		int m = ran1 / 10;
		System.out.println("몫 = " + m);
		
//		3. 1번의 변수값을 10으로 나눈 나머지를 출력
		int n = ran1 % 10;
		System.out.println("나머지 = " + n);
		
//		4. 1번의 변수값을 10으로 나눈 나머지 값이 0인지, 아닌지를 출력
		boolean b1 = n == 0; // ? true : false;
		System.out.println("나머지 값이 0이면 참 아니면 거짓 = " + b1);
		
//		5. 1번의 변수값에 40을 더한 후 다시 저장해서 출력
		ran1 += 40;
		System.out.println("ran1 + 40 = " + ran1);
		
//		6. 1번의 변수값의 범위가 80이상 150 미만인지 출력
		boolean b2 = ran1>80 && ran1<150; // ? true : false;
		System.out.println("80이상 ~ 150미만 이면 참 아니면 거짓 = " + b2);
		
		
	}
}
