
public class J02_Return {
	
//	�޼ҵ��� ���� �����ϴ� return
	
	public static void main(String[] args) {
//		1. ��ü�� ������ȣ(���۷�����)�� �̿��ϴ� �޼ҵ�	
		
		J02_Car car = new J02_Car();
		setCar(car, "����ī", 200);
//		System.out.println("car: " + car.name + " , ����: " + car.price);
		
//		2. �Ϲ� �ڷ��� ������ ���� �޼ҵ�
		int a = 0;
		setA(a);
		System.out.println("a = " + a); 
//		=>�Ϲ� �ڷ����� ���� �޼ҵ忡���� return �ʿ�
		
//		3. return �̿��ϱ�
		int b = 0;
		b = setB();
		System.out.println(("b = " +  b));
		
	}
	
	public static int setB(){
		return 100;
		
//		���ǻ��� :
//		1. �޼ҵ�� �ϳ��� ���� ������ �� �ִ�.
//		2. return Ű����� ���� �����ϴ� ��� �ܿ�,
//			�޼ҵ带 �����Ű�� ��ɵ� ������ �ִ�.
//			return Ű���� �ڿ��� �ٸ� ����� �� �� ����.
	}
	
	public static void setA(int gate) {
		gate = 100;
	}
	
	public static void setCar(J02_Car gate, String gate2, int gate3) {
		gate.name = gate2;
		gate.price = gate3;
	}
}
