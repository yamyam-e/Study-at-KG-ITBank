
public class J12_Quiz {
	public static void main(String[] args) {
		
//		1. 1.*** ~ 200.*** ������ ���� ���� �Ǽ��� ������ ���� �� ���
		double ran = Math.random()*200 + 1;
		System.out.println("1. *** ~ 200.*** ������ ���� ���� �Ǽ��� ������ ���� �� ��� : " + ran);

//		2. 1������ ����� ������ ���� ������ ����ȯ�� �� 10���� ���� �� ����� ���
		int intRan = (int)ran;
		System.out.println("2. 1������ ����� ������ ���� ������ ����ȯ�� �� 10���� ���� �� ����� ��� : " + (intRan / 10) );

//		3. 1������ ����� ������ ���� ������ ����ȯ�� �� 10���� ���� ������ ����� ���
		System.out.println("3. 1������ ����� ������ ���� ������ ����ȯ�� �� 10���� ���� ������ ����� ��� : " + (intRan % 10) );

//		4. 1������ ����� ������ ���� ������ ����ȯ�� �� 10���� ���� ������ �� ����� 0���� �ƴ����� ���
		String res1 = (intRan % 10) == 0 ? "������ ���� 0 �Դϴ�." : "������ ���� 0�� �ƴմϴ�";
		System.out.println("4. 1������ ����� ������ ���� ������ ����ȯ�� �� 10���� ���� ������ �� ����� 0���� �ƴ����� ��� : " + res1);

//		5. 1������ ����� ������ ���� ������ ����ȯ�� �� 40�� ���ؼ� ���ο� ������ ������ �� ���
		int temp1 = intRan + 40;
		System.out.println("5. 1������ ����� ������ ���� ������ ����ȯ�� �� 40�� ���ؼ� ���ο� ������ ������ �� ��� : " + temp1);

//		6. 5������ ����� ������ ���� ¦������, Ȧ�������� ���
		String res2 = temp1 % 2 == 0 ? "¦�� �Դϴ�." : "Ȧ�� �Դϴ�.";
		System.out.println("6. 5������ ����� ������ ���� ¦������, Ȧ�������� ��� : " + res2);

//		7. 1������ ����� ������ ���� ������ ����ȯ�� ���� 5������ ����� ������ ���� ���� 7�� ������� �ƴ����� ���
		int temp2 = intRan + temp1;
		String res3 = temp2 % 7 == 0 ? "7�� ��� �Դϴ�." : "7�� ����� �ƴմϴ�.";
		System.out.println("7. 1������ ����� ������ ���� ������ ����ȯ�� ���� 5������ ����� ������ ���� ���� 7�� ������� �ƴ����� ��� : " + res3);

//		8. 5������ ����� ������ ���� 80�̻� ~150 �̸��� �������� �ƴ����� ���
		String res4 = temp1>80 && temp1<150 ? "80 ~ 150 ������ ���Դϴ�." : "80 ~ 150 ������ ���� �ƴմϴ�.";
		System.out.println("9. 5������ ����� ������ ���� 80�̻� ~150 �̸��� �������� �ƴ����� ��� : " + res4);
		
	}

}










