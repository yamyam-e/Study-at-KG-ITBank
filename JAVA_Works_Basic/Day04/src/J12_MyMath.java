
public class J12_MyMath {
	
	String max(int a, int b) {
		String msg = a + " �� " + b + " �� ū�� �� : ";
		if (a>b) return msg + toString(a);
		else if (a<b) return msg + toString(b);
		else return a + " �� " + b + "�� ���� ��";
	}
	
	String max(int a, double b) {
		String msg = a + " �� " + b + " �� ū�� �� : ";
		if (a>b) return msg + toString(a);
		else if (a<b) return msg + toString(b);
		else return a + " �� " + b + "�� ���� ��";
	}
	
	String max(double a, int b) {
		String msg = a + " �� " + b + " �� ū�� �� : ";
		if (a>b) return msg + toString(a);
		else if (a<b) return msg + toString(b);
		else return a + " �� " + b + "�� ���� ��";
	}
	
	String max(double a, double b) {
		String msg = a + " �� " + b + " �� ū�� �� : ";
		if (a>b) return msg + toString(a);
		else if (a<b) return msg + toString(b);
		else return a + " �� " + b + "�� ���� ��";
	}
	
	String toString(int a){
		return Integer.toString(a);
	}
	
	String toString(double a){
		return Double.toString(a);
	}

}
