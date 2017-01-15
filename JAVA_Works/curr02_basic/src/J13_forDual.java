
public class J13_forDual {
	public static void main(String[] args) {

		for(int i = 0; i < 4 ; i++ ) {
			System.out.println("i = " + i);
			for(int j = 0; j < 3; j++ ) {
				System.out.println("\t j = " + j);
			}
			System.out.println("-------------------");
		}
		System.out.println("===========================================\n\n\n");
		
		
		for(int i=0; i<4; i++) {
			System.out.println("i = " + i);
			for(int j=0; j<3; j++) {
				System.out.print("\t j = " + j);
			}
			System.out.println();
			System.out.println("-------------------------------------");
		}
		System.out.println("==========================================\n\n\n");
		
//		화요일이 첫날 1일인 경우
//		각 용일에 대한 숫자 설정 (일~토 => 0~6)
		
		int dayNum = 2; //화요일이 첫날이므로.....
		
		for(int i=1; i<13; i++){
			System.out.println(i);
			System.out.println(("일\t월\t화\t수\t목\t금\t토"));
			
			for(int k=0; k<dayNum; k++) {// 2번 / 현재 k<2의 2는 화용일을 의미
				System.out.print("\t");
			}
			
			for(int j=1; j<31; j++) {
				System.out.print(j + "\t");
				if ((dayNum + j) % 7 == 0) {// dayNum + j : 요일숫자 + 토요일날짜
					System.out.println();
				}
			}
			System.out.println();
			System.out.println("-------------------------------------------------");
		}
		
		
		
		
	}

}









