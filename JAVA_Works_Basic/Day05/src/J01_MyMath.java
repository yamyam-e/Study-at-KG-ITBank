
public class J01_MyMath {
	
	static void getMax (int a, int b) {
		int max = a>b ? a:b;
		System.out.println("ū ��: " +  max);
	}
	
	static void getMax (int a, double b) {
		if (a>b) System.out.println("ū �� : " + a);
		else System.out.println("ū �� : " + b);
	}
	
	static void getMax (double a, int b) {
		if (a>b) System.out.println("ū �� : " + a);
		else System.out.println("ū �� : " + b);
	}
	
	static void getMax (double a, double b) {
		double max = a>b ? a:b;
		System.out.println("ū ��: " +  max);
	}

}
