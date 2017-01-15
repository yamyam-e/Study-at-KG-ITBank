
public class J05_Quiz {
	
	public static void main(String[] args) {
		
//		1. 햄버거 정보 클래스 만들기
//		=> 이름, 가격, 칼로리
		
//		=> 위의 3개 정보를 저장하는 역할을 생성자에서 진행
//			(JOptionPane 이용 저장)
		
//		=> 저장 후 출력
		
		J05_Buger bb1 = new J05_Buger();
		bb1.showData();
		
		J05_Buger bb2 = new J05_Buger("새우버거", 4000, 200.5);
		bb2.showData();
		
		
	}

}
