
public class J04_Overloading {
	
	public static void main(String[] args) {
		
//		�� ���� ���� ���� ���� ����ϴ� �޼ҵ� �ۼ�
		
//		���ϴ� ��Ȳ��
//		�޼ҵ� (10, 20);
		sum01(10, 20);
//		�޼ҵ� (10, 1.2);
		sum02(10, 1.2);
//		�޼ҵ� (1.2, 3.4);
		sum03(1.2, 3.4);
//		�޼ҵ� (1.2, 10);
		sum04(1.2, 10);
	}
	
	public static void sum01(int a, int b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	public static void sum02(int a, double b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	public static void sum03( double a, double b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	public static void sum04(double a, int b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}

}
