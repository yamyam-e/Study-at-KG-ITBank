
public class J09_Modifier {
	public static void main(String[] args) {
		
		J09_MyMath mm = new J09_MyMath();
		
		System.out.println(mm.PI);
		
//		에러 : mm.pi = 12.34;
//		=> 변경될 필요가 없는 수이므로, final을 통해 상수화 처리함
		
		
		System.out.println(Math.PI);
		
//		에러 : System.out.println(J09_MyMath.PI);
		
		System.out.println(J09_MyMath.PI);
		
	}

}
