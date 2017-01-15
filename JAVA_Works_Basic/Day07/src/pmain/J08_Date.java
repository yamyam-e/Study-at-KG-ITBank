package pmain;

import java.util.Date;

public class J08_Date {
	
	public static void main(String[] args) {
		
//		Date 
//		- 날짜 정보를 제공하는 클래스
//		- 위치 : java.util 패키지
		
//		날짜 정보 제공 방법 1
		long t1 = System.currentTimeMillis();
//		=>1970년 1월 1일 기준시점을 시작으로
//			현재까지 흐른 시간을 1/1000초 단위로 제공
		System.out.println("t1 : " + t1);
		
//		날짜 정보 제공 방법 2
		Date date = new Date();
		System.out.println("date : " + date);
		
		System.out.println(date.getYear() + "년");
		//신뢰성이 없는 폐기된 업데이트가 없는 더이상 사용하지 않는 메소드에는 줄이 감
		
	}

}
