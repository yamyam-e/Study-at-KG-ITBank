
public class J09_Modifier {
	public static void main(String[] args) {
		
		J09_MyMath mm = new J09_MyMath();
		
		System.out.println(mm.PI);
		
//		���� : mm.pi = 12.34;
//		=> ����� �ʿ䰡 ���� ���̹Ƿ�, final�� ���� ���ȭ ó����
		
		
		System.out.println(Math.PI);
		
//		���� : System.out.println(J09_MyMath.PI);
		
		System.out.println(J09_MyMath.PI);
		
	}

}
