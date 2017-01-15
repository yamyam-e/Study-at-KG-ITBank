
public class J11_Arrays {

//	1. 기본자료형 데이터에 대한 배열의 이용
		
	public static void main(String[] args) {

//		정수 3개에 대한 배열 이용
		int[] aa = new int[3];
		
//		에러System.out.println(aa[3]);
//		=> 배열의 방번호(인덱스)는 0부터 시작
		
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
		System.out.println(aa[0]);
		System.out.println(aa[1]);
		System.out.println(aa[2]);
		System.out.println("==============");
		
//		length : 배열의 공간 갯수를 제공
		int n = aa.length;
		System.out.println("배열 갯수 : n = " + n);		
		
		for(int i = 0; i<aa.length; i++){
			System.out.println(aa[i]);
		}
		System.out.println("==============");
		
//		확장 for문
//		for(오늘쪽 대상의 원소 1개 : 데이터가 많은 대상(배열, 컬렉션))
		for(int each : aa) {
			System.out.println("each = " + each);
		}
		
		
	}
}
