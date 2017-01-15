
public class J04_Operator {

//	������
	
	public static void main(String[] args) {
	
//		1. ���Կ����� =
		
//		�Ϲ��� ���� 10�� �����Ϸ��� ���
		int a;
		a = 10;
		
//		���� a = 10L;
//		=> ���Կ����� �̿��, 
//			�⺻������ �����Ϸ��� ���� ���¿�
//			��������� ���� Ư���� ���ƾ� �Ѵ�.

		int p1 = 10;
		int p2 = 20;
		int p3;
		
		p3 = p1 + p2;
//		=> �������� ���� �ڸ�, ������ ������ �ڸ�
		System.out.println("p3 = " + p3);
		
		p3 = p3 + 40;
		System.out.println("p3 = " + p3);
		
//		�� �ڷ��� ������ ���� �⺻�� ����
//		=> ���α׷� �ۼ� �� ���� ������ �⺻�� �Ǵ� ����
//			������ �� ����ؾ� �� ���� ����
		int ab = 0;
		
		String name = null;
//		=> String �������� null �̶�� Ű����
//			�⺻���� ������ �� �ִ�.
//		=> null�� "���� ����"�� �ǹ��ϴ� Ű����
		
		
//		2. ��������� + - * / %
//		/: ������ �� �� �� ����
//		%(��忬����): ������ �� �� ������ ���� ����
		
		System.out.println("+ : " + (5+2));
		System.out.println("- : " + (5-2));
		System.out.println("* : " + (5*2));
		System.out.println("/ : " + (5/2));
		System.out.println("% : " + (5%2));
		
		System.out.println("% ���� : " + (6.3%2.1));
//		=> ���������� ���꿡 ���ؼ��� ����ؾ� ��
		
//		Ư���� + �����ڴ� String ������ ��� ����
		String s1 = "ab";
		String s2 = "cd";
		System.out.println(s1 + s2);
		
		String s3 = s1 + s2;
		System.out.println("s3 = " +  s3);
		
//		String�� �ٸ� ������ �����͸� + �����ϴ� ���
//		��� ���´� String�� �ȴ�.
		String s4 = "������";
		int pp = 10;
		String s5 = s4 + pp;
		
//		���ڿ� �����ϱ�
		String s6 = "";	//�ƹ� ������ ���� ���� ����
		
		s6 = s6 + "����";
		System.out.println("1. s6 = " + s6);
		
		s6 = s6 + "�ٶ�";
		System.out.println("2. s6 = " + s6);
		
		
//		3. ���յ����� ������  += -= /= %=
//			��: a+= b; => a = a + b;
		
		int m1 = 10;
		int m2 = 20;
		
		m1 += m2; // m1 = m1 + m2;
		System.out.println("+= : " + m1);
		
		m1 -= m2; // m1 = m1 - m2;
		System.out.println("-= : " + m1);
		
		m1 *= m2; // m1 = m1 * m2;
		System.out.println("*= : " + m1);
		
		m1 /= m2; // m1 = m1 / m2;
		System.out.println("/= : " + m1);
		
		m1 %= m2; // m1 = m1 % m2;
		System.out.println("%= : " + m1);
		
		
//		4. ���������� ++ --
//			1. a++ �Ǵ�  ++a 
//				- a�� ���� 1�� ���� �� �ٽ� ����
//				- a = a + 1;
//			2. a-- �Ǵ�  --a
//				-a�� ���� 1�� �� �� �ٽ� ����
//				- a = a - 1;
		int t1 = 10;
		t1++; //t1 = t1 + 1;
		System.out.println("t1 = " + t1);
		
		int t2 = 10;
		t2--; //t2 = t2 + 1;
		System.out.println("t2 = " + t2);
		
//		�ٸ� ��ɰ� ���������� ���Ǵ� ���, 
//		��ġ���������ڿ� ��ġ���������ڰ� ������
		int k1 = 10;
		System.out.println("1. ++k1 : " + (++k1));
//		=> ��ġ������(��ġ���� �� �ٸ� ��� ����)
//		1. ++k1;
//		2. System.out.println(k1);
		int k2 = 10;
		System.out.println("2. k2++ : " + (k2++));
//		=> ��ġ������(�ٸ� ���� ���� �� ��ġ����)
//		1. System.out.println(k2);
//		2. k2++;
		System.out.println("2. k2 : " + k2);
		
		
//		5. ���迬���� > >= < <= == !=
//		== ����
//		!= �ٸ���
//		=> ����� boolean ���·� ���� ��
		
		int n = 3;
		
		boolean b1 = n >= 2;
		System.out.println("b1 = " +  b1);
		
		boolean b2 = n == 3;
		System.out.println("b2 = " +  b2);
		
		boolean b3 = n != 3;
		System.out.println("b3 = " +  b3);
		
//		����: String�� ���ϼ��� Ȯ���� ������
//			== �� ������� ����, equal()�� ����ؾ� ��
		String ss1 = "����";
		String ss2 = "����";
		boolean b4 = ss1.equals(ss2);
		System.out.println("b4 = " +  b4);
		
		
//		6. �������� && || !
//		- �� ��Ȳ�� ��/���� ������ �������� ��ӵ� ��Ģ�� ���� ����� ����
//		- && : ���������� - ��� ��Ȳ�� ���� ��� ��� ��
//		- || : ���տ����� - ��� ��Ȳ�� �����̸� ��� ����
//		- !  : ���������� - ���� ����Ȳ�� ����
		
		boolean bb1 = true && true;
		System.out.println("bb1 = " +  bb1);
		
		boolean bb2 = false || false;
		System.out.println("bb2 = " +  bb2);
		
		boolean bb3 = !true;
		System.out.println("bb3 = " +  bb3);
		
		
//		7. ���ǿ�����(���׿�����)
//		- ����:  ���ǽ� ? ���ΰ���� �� : �����ΰ���� ��
		
		int h1 = 10;
		int h2 = 23;
		int max = h1 > h2 ? h1 : h2;
		
		int age = 14;
		String child = age <= 19 ?  "û�ҳ�" : "����";
		System.out.println("child = " + child);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
