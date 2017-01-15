
public class J06_ArrayFor {
	public static void main(String[] args) {
	
		int[] i = new int[3];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		int a;
		a = 0;		
			System.out.println(i[a]);
		a = 1;
			System.out.println(i[a]);
		a = 2;
			System.out.println(i[a]);
			
		System.out.println("2. ==================================" );
		
		for(int p=0; p<=2; p++) {
			System.out.println(i[p]);
		}
		
		System.out.println("3. ==================================" );
		
//		.length : 배열의 저장 공간 갯수를 자동으로 제공
		int num = i.length;
		System.out.println("i 배열의 공간 갯수 num : " + num);
		
		for(int p=0; p<i.length; p++) {
			System.out.println(i[p]);
		}
		
		System.out.println("4. ==================================" );
		
		
//		확장 for문 (for-each)
//			- 갯수 지정 필요 없음
//			- 같은 자료형에 대한 처리 가능 (배열, 컬렉션.....)
		
		for(int aa : i) { // for (하나씩 꺼낸 것의 이름을 붙임 : 갯수가 많은것을 오늘쪽)
			System.out.println(aa);
		}
	}
	
}
















