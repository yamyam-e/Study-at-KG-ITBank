
public class J07_Quiz {
	
	public static void main(String[] args) {
		
//		문제 : 컴퓨터 정보 관리 프로그램
		
//		클래스 작성
//			1. 멤버 변수
//				- 이름, 키보드가격, 모니터가격, 본체가격
//				총 구매가격(세개의 부품의 총합)
//			2. 메소드
//			- 데이터 저장 메소드: 이름 및 3개 부품 가격
//			- 데이터 출력 메소드: 모든 데이터 출력
		
		J07_Computer com1 = new J07_Computer();
		com1.setData("HP", 15000, 150000, 600000);
		com1.showData();
		
		J07_Computer com2 = new J07_Computer();
		com1.setData("Samsung", 18000, 210000, 800000);
		com1.showData();
	}

}
