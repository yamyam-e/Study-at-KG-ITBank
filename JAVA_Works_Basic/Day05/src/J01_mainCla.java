
public class J01_mainCla {
	
	public static void main(String[] args) {

//		1. 작성된 클래스의 객체 생성 후 이용
		J01_MyMath mm = new J01_MyMath();
		mm.getMax(2.12, 1);
		
//		2. 자바가 제공하는 Math 클래스의 큰수 찾기 이용
		int max = Math.max(1, 2);
		System.out.println("max = " + max);
		
//		3. MyMath를 객체 없이 이용? => 이용 불가능
//		에러: J01_MyMath.getMax(12, -10);
		
//		4. static 키워드를 적용한 후 => 객체 없이 이용 가능
		J01_MyMath.getMax(12, -10);
		
	}

}
