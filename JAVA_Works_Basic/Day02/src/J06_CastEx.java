
public class J06_CastEx {
	
	public static void main(String[] args) {
		
//		형변환 사용 예
		
//		1. 평균구하기
		int kor = 79;
		int eng = 76;
		int math = 78;
		
		int total = kor + eng + math;
		double avg = total / 3;
		System.out.println("avg = " + avg);
		
		avg = total / (double)3;
		System.out.println("avg = " + avg);
		
		avg = total / 3.0;
		System.out.println("avg = " + avg);
		
//		2. 랜덤값 추출
//		- Math.random()
//		- 제공 랜덤값 : 0.0 이상 ~ 1.0 미만 실수
//		- 제공형태 : double
		
		double ran = Math.random();
		System.out.println("ran = " + ran);
		
		int temp = (int)Math.random();
		System.out.println("temp = " + ran);
		
//		0~10 보다 작은 정수 랜덤 값
		int ran2 = (int)(Math.random() * 10);
//		0 이상 ~ 10 미만
		System.out.println("ran2 = " + ran2);
		
//		1~10까지의 정수 랜덤 값
		int ran3 = (int)(Math.random() * 10 + 1);
//		1이상 ~ 11미만
		System.out.println("ran3 = " + ran3);
		
		int ran4;
		int count = 0;
		while(true){
			ran4 = (int)(Math.random() * 100 + 1);
			if (ran4 == 100) break;
			else ++count;
		}
		System.out.println("count = " + count);
		System.out.println("ran4 = " + ran4);
	}

}














