
public class J09_Operator02 {
	
	public static void main(String[] args) {
	
//		���������� : ++ --
//			a++ && ++a => a = a + 1
//			a-- && --a => a = a - 1
		
//		1. ������ ���
		int a1 = 10;
		a1++;	// a1 = a1 + 1
		System.out.println("a1 : " + a1);
		
		int a2 = 10;
		++a2;	// a1 = a1 + 1
		System.out.println("a2 : " + a2);
		
//		2. �ٸ� ��ɰ� ����Ǽ� ���Ǵ� ���
		
		int b1 = 10;
		System.out.println(++b1); // ��ģ, ���� ����
//		��ġ ������ ��� => �������� �� �ٸ� ��� ����
//			1. ++b1;
//			2. System.out.println(b1);
		
		int b2 = 10;
		System.out.println(b2++); // ��ġ, ���� ����
//		��ġ ������ ��� => �ٸ� ��� ���� �� �������� ����
//			1. System.out.println(b2);
//			2. b2++;
		
		System.out.println("b2 : " + b2);
		
	}
}
