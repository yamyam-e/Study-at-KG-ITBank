
public class J11_CastEx {
	
	public static void main(String[] args) {
		
//		1. 평균 구하기
		int kor = 79;
		int eng = 78;
		int math = 76;
		
		int sum = kor + eng + math;
		System.out.println("sum : " + sum);
		
		double avg = sum / 3;
		System.out.println("1. avg : " + avg);
		
		avg = sum / (double)3;
		System.out.println("2. avg : " + avg);
		
		avg = sum / 3.0;
		System.out.println("3. avg : " + avg);
		
		
//		2. 난수(랜덤값-임의의 수) 사용
//		- 형식 : Math.random()
//		- 제공되는 값의 범위 : 0.0 이상 ~ 1.0 미만
//		- 제공 형태 : double
		
		double mr = Math.random();
		System.out.println("mr : " + mr);
		
//		정수 랜덤값이 필요한 경우
		int mr2 = (int)Math.random();
		System.out.println("mr2 : " + mr2);
//		=> 무조건 0이 제공되므로 사용 불가능
		
//		10보다 작은 정수 값이 필요한 경우 : 0 ~ 9
		int mr3 = (int)(Math.random()*10);
//		0 이상 ~ 10 미만
		System.out.println("mr3 : " + mr3);
		
		
//		1 ~ 10의 정수가 필요한 경우
		int mr4 = (int)(Math.random() * 10 + 1);
//		1 ~ 11 미만
		System.out.println("mr4 : " + mr4);
		
		
	}

}















