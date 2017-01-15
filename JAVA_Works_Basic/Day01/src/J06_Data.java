
public class J06_Data {
	// 자바의 데이터 형태 종류
	public static void main(String[] args) {
		
		//1. 정수형 : 소수점이 없는 수
		//1-1. 일반형 정수(기본형태)
		System.out.println(100);
		
		//1-2. 확장형 정수(L 또는 ㅣ 표기)
		System.out.println(100L);
		
		//에러 System.out.println(2200000000);
		//=> 일반형 정수 범위 : -21억 ~ +22억
		
		System.out.println(2200000000L);
		
		//2. 실수형 : 소수점이 있는 수
		//2.1 일반형 실수(기본형태)
		System.out.println(12.34);
		
		//2.2 약식형 실수(F 또는 f 표기)
		System.out.println(12.34f);
		
		System.out.println(123123.123123);
		System.out.println(123123.123123f);//123123.125 출력 반올림이 아닌 오차임
		
		//3. 단일문자형 :  
		//	 	-유니코드 표의 정보(알파벳, 숫자, 기호, 각구 언어들)
		//		-표기 시 외따옴표를 이용해야 함
		System.out.println('A');
		System.out.println('$');
		System.out.println('밥');
		
		//주의사항
		System.out.println(10 + '살');//49342출력 
		//=> 출력 대상과의 결함 시 사용 불가능

		//4. 문자열 형
		//		-일반적인 문장
		//		-쌍따옴표로 표기
		System.out.println("둘리와 도우너");
		System.out.println("123");//숫자가 아닌 문자 123
		
		//5. 논리형
		//		-맞다(true) / 틀리다(false)의 의미 키워드
		System.out.println(true);
		System.out.println(false);
		
	}
}
