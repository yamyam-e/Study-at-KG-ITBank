
public class J03_This {
	
//	this: 메소드 또는 생성자가 사용되는 객체의 고유 번호
//	각 객체 마다 this 의 해시코드 값이 다르다.
	
	public static void main(String[] args) {
		
		J03_People pp1 = new J03_People();
		System.out.println("pp1 : " + pp1);
		
		pp1.setData("둘리", 10);
		pp1.showData();
		
		J03_People pp2 = new J03_People();
		System.out.println("pp2 : " + pp2);
		
		pp2.setData("도우너", 20);
		pp2.showData();
		
		
	}

}
