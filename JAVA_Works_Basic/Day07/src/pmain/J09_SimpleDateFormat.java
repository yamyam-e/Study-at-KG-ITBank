package pmain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class J09_SimpleDateFormat {
	
	public static void main(String[] args) {
		
//		SimpleDateFormat
//		- 지정한 형식으로 날짜 정보를 변환해서 제공
//		- 위치 : java.text 패키지 (format 이 들어가는 클래스는 text 패키지에 있다)
		
//		1
		long t1 = System.currentTimeMillis();
		System.out.println("t1 : " +  t1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (EE)");
		//패턴에 대소문자 구분 주의 할 것
		String t2 = sdf.format(t1);
		System.out.println("t2 : " + t2);

//		2.
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss (EEEE)");
		Date date = new Date();
		String date2 = sdf2.format(date);
		System.out.println("date2 : " + date2);
	}

}
