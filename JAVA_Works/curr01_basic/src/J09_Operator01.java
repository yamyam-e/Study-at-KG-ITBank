
public class J09_Operator01 {
	
	public static void main(String[] args) {
		
//	1. ���Կ����� : = 
//		- �������� �����Ϸ��� ��, ������ �����Ϸ��� ����
//		- �����Ϸ��� ���� ���� ������ ���� Ư���� ���ƾ� ��
	int a;
	a = 10;
	
	a = a + 20;
	System.out.println("a : " + a);
	
	int b = a = 40;
	System.out.println("a : " + a);
	System.out.println("b : " + b);
	
	String s1 = "����";
	String s2 = s1;
	System.out.println("s1 : " + s1);
	System.out.println("s2 : " + s2);
	
//	���� : int c = "������";
//	=> �⺻������, ���� Ư���� ���ƾ߸� ���� ����

//	���� :
//	- String ���� ���� ���Ŀ� ���� ���� �����Ǵ� ���,
//		�⺻������ null�� ����
	String name = null;
	name = "�Ѹ�";
	
//	2. ��������� : + - * / %
//		- �⺻������, ���� �� �������
//		/ : ���� �� �� ����� ����
//		% : mod������, ���� �� ������ ����� ����(���� ���길 ����)
	
	int n = 5, m = 2;
	System.out.println(" + : �� => " + (n + m) );
	System.out.println(" - : �� => " + (n - m) );
	System.out.println(" * : �� => " + (n * m) );
	System.out.println(" / : ���� �� �� => " + (n / m) );
	System.out.println(" % : ���� �� ������ => " + (n % m) );
	
	double d1 = 6.3, d2 = 2.1;
	System.out.println(d1 % d2);
//	=> % �����ڴ� ���� ������ �� ���꿡���� �ǹ� ����
	
//	���ܻ�Ȳ : ������ �Ǽ� �� / ���� = > �Ҽ���(��������) ������
	System.out.println(5 / 2);
	System.out.println(5 / 2.0);
	System.out.println(5.0 / 2);
	System.out.println(5.0 / 2.0);
	
//	String�� ���� ������� : + �����ڸ� ����(���� ���)
	String s0 = "";
	String ss1 = "��";
	String ss2 = "��";
	
	String ss3 = s0 + ss1;
	System.out.println("ss3 : " + ss3);
	
	String ss4 = s0 + ss1 + ss2;
	System.out.println("ss4 : " + ss4);
	
//	String�� �ٸ� type�� + ���� => ���ϵ� String Ÿ������ �����
//	=> ��� ���´� String
	
	String t1 = "���� : ";
	int age = 10;
	String t2 = t1 + age;
	System.out.println("t2 : " + t2);
		
	
//	3. ���մ��Կ����� : += -= *= /= %=
//		n += m => n = n + m
//		n -= m => n = n - m
//		n *= m => n = n * m
//		n /= m => n = n / m
//		n %= m => n = n % m
	
	int p = 5, k = 2;
	System.out.println("p :" + p + ", k : " + k);
	
	p += k;	// p = p + k;
	System.out.println("p :" + p + ", k : " + k);
	
	p -= k;	// p = p - k;
	System.out.println("p :" + p + ", k : " + k);
	
	p *= k;	// p = p * k;
	System.out.println("p :" + p + ", k : " + k);
	
	p /= k;	// p = p / k;
	System.out.println("p :" + p + ", k : " + k);
	
	p %= k;	// p = p % k;
	System.out.println("p :" + p + ", k : " + k);
	
	
		
		
		
		
		
	}
}
