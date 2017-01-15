
public class J12_MyMath {
	
	String max(int a, int b) {
		String msg = a + " 와 " + b + " 중 큰수 는 : ";
		if (a>b) return msg + toString(a);
		else if (a<b) return msg + toString(b);
		else return a + " 와 " + b + "는 같은 수";
	}
	
	String max(int a, double b) {
		String msg = a + " 와 " + b + " 중 큰수 는 : ";
		if (a>b) return msg + toString(a);
		else if (a<b) return msg + toString(b);
		else return a + " 와 " + b + "는 같은 수";
	}
	
	String max(double a, int b) {
		String msg = a + " 와 " + b + " 중 큰수 는 : ";
		if (a>b) return msg + toString(a);
		else if (a<b) return msg + toString(b);
		else return a + " 와 " + b + "는 같은 수";
	}
	
	String max(double a, double b) {
		String msg = a + " 와 " + b + " 중 큰수 는 : ";
		if (a>b) return msg + toString(a);
		else if (a<b) return msg + toString(b);
		else return a + " 와 " + b + "는 같은 수";
	}
	
	String toString(int a){
		return Integer.toString(a);
	}
	
	String toString(double a){
		return Double.toString(a);
	}

}
