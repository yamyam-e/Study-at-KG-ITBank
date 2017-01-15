
public class J04_while {
	
	public static void main(String[] args) {
		
//		1. do - while(무조건 한번은 실행 후 질문을 받는다.)
		int n = 1;
		
		do {
			System.out.println("1 while 실행");
			n++;
		} while(n <= 3);
		System.out.println("1번 while 종료");
		
//		2. while문의 대한 레이블과 break
//		- break의 대상은 3가지 : switch, while, for
//		- 대상이 여러개인 경우, 가장 가까운 대상에 영향을 줌
		ab : while(true) {//ab break를 위한 레이블 설정
			int c = 1;
			
			while(true) {
				System.out.println("c = " + c);
				
				if( c== 5) {
					break ab; //브레이크에 레이블을 이용하여 대상을 지정할 수 있다.
				}
				c++;
			}
			
		}
	}

}
