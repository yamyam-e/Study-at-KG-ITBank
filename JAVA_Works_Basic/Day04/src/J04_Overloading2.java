
public class J04_Overloading2 {
	
	public static void main(String[] args) {
		
//		�� ���� ���� ���� ���� ����ϴ� �޼ҵ� �ۼ�
		
//		���ϴ� ��Ȳ��
//		�޼ҵ� (10, 20);
		sum(10, 20);
//		�޼ҵ� (10, 1.2);
		sum(10,1.2);
//		�޼ҵ� (1.2, 3.4);
		sum(1.2, 3.4);
//		�޼ҵ� (1.2, 10);
		sum(1.2, 10);
	}
	
	public static void sum(int a, int b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	public static void sum(int a, double b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	public static void sum( double a, double b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	public static void sum(double a, int b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}

}
