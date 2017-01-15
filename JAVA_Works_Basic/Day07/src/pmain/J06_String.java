package pmain;

public class J06_String {
	
	public static void main(String[] args) {
		
//		String
//		- 문자열 처리 클래스
//		- 위치 : java.lang 패키지
		
		String s1 = "가나";// 힙 영역에 존재
		String s2 = new String("가나");
		String s3 = "가나";// 힙 영역에 존재 확인 후 s1과 주소값 공유
		String s4 = new String("가나");
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
//		1. 동일성 확인 : .equal()
		System.out.println("s1 == s2 ? " + (s1==s2) );//false
		System.out.println("s1 == s3 ? " + (s1==s3) );//true
		System.out.println("s2 == s4 ? " + (s2==s4) );//false
		
		boolean b11 = s1.equals(s3);
		System.out.println("b11 : " + b11);
		
//		2. length() : 길이
		String s22 = "123456";
		int b22 = s22.length();
		System.out.println("b22 : " + b22);
		
//		3. subString() :  문자열 잘라내기
//			(문자열의 인덱스 번호는 0부터 시작함)
		String s33 = "0123456789";
		String b31 = s33.substring(4); // 인덱스 4부터 선택
		System.out.println("b31 : " + b31);
		
		String b32 = s33.substring(2, 6);
//		=> 인덱스 2부터 선택 ~ 6번 이전까지
		System.out.println("b32 : " + b32);
		
//		4. replace() : 문자열 교체
		String s44 = "가나ab12abc다라ab";
		String b41 = s44.replace("ab", "****");
		System.out.println("b41 : " + b41);
		
//		5. contains() : 문자열 존재 여부 확인
		String s51 = "가나다 abc 12";
		boolean b51 = s51.contains("나다");
		System.out.println("b51 : " + b51);
		
//		6. split() : 문자열 분리
		String s61 = "가나다/abcd/1234";
		String[] b61 = s61.split("/");
		
		for(String each : b61) {
			System.out.println("(1)each : " +  each);
		}
		
//		예외상황
		String s62 = "가나다.abc.123";
		String[] b62 = s62.split("[.]");
		//특정기호가 먹히지 않을 경우 대괄호를 사용하면 된다.
		
		for(String each : b62) {
			System.out.println("(2)each : " +  each);
		}
		
		
	}

}
