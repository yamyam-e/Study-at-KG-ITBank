
public class J07_Quiz {
	public static void main(String[] args) {
		
//		1. 1~200������ ���� ���� �� �ϳ��� ������ ������ �� ���
		int ran1 = (int)(Math.random()*200 + 1);
		System.out.println("ran1 = " + ran1);
		
//		2. 1���� �������� 10���� ���� ���� ���
		int m = ran1 / 10;
		System.out.println("�� = " + m);
		
//		3. 1���� �������� 10���� ���� �������� ���
		int n = ran1 % 10;
		System.out.println("������ = " + n);
		
//		4. 1���� �������� 10���� ���� ������ ���� 0����, �ƴ����� ���
		boolean b1 = n == 0; // ? true : false;
		System.out.println("������ ���� 0�̸� �� �ƴϸ� ���� = " + b1);
		
//		5. 1���� �������� 40�� ���� �� �ٽ� �����ؼ� ���
		ran1 += 40;
		System.out.println("ran1 + 40 = " + ran1);
		
//		6. 1���� �������� ������ 80�̻� 150 �̸����� ���
		boolean b2 = ran1>80 && ran1<150; // ? true : false;
		System.out.println("80�̻� ~ 150�̸� �̸� �� �ƴϸ� ���� = " + b2);
		
		
	}
}
