
public class J05_Overloading {
	
//	�޼ҵ� �����ε�
//	- ���� ����� �����ϴ� �޼ҵ忡 ���Ͽ�
//		�������� ��Ȳ������ �ϳ��� �̸����� �޼ҵ带
//		����� �� �ֵ��Ǥ� �ϴ� ���Ǽ� ����
	
	public static void main(String[] args) {
		
		abc();
		abc(100);
		abc(100, 200);
	}
//	1. �Ű����� ����
	public static void abc(){
		System.out.println("1. abc()");
	}
	
//	2. �Ű����� ����, �Ű����� 1��
	public static void abc(int a){
		System.out.println("2. abc(int)");
	}
	
//	3. �Ű����� 2��, �Ű����� ����(int - int)
	public static void abc(int a , int b){
		System.out.println("3. abc(int , int)");
	}
	
//	4. �Ű����� ����(int - double)
	public static void abc(int a , double b){
		System.out.println("4. abc(int , double)");
	}
	
//	5. �Ű����� ����(double - int)
	public static void abc(double a , int b){
		System.out.println("4. abc(int , double)");
	}

}
