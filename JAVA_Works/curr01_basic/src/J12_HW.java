
public class J12_HW {
	public static void main(String[] args) {
		
//		������ ������ �����ڸ� �̿��Ͽ� ����ϼ���
		
//		1. 1~1000 ������ ���� �������� �Է¹޾� ������ ����� ����ϼ���
		int ran1 = (int)(Math.random()*1000 + 1);
		System.out.println("1. 1~1000 ������ ���� �������� �Է¹޾� ������ ����� ����ϼ���: " + ran1);
//			1. ¦��, Ȧ�� �Ǻ�
		String res = ran1 % 2 == 0 ? "¦���Դϴ�." : "Ȧ�� �Դϴ�.";
		System.out.println("	- " + res);
//			2. 3�� ������� �ƴ����� ���
		res = ran1 % 3 == 0 ? "3�� ��� �Դϴ�." : "3�� ����� �ƴմϴ�.";
		System.out.println("	- " + res);

//		2. 1~1000 ������ ���� ������ �� ���� �Է¹޾� ���� ��� ���
		ran1 = (int)(Math.random()*1000 + 1);
		int ran2 = (int)(Math.random()*1000 + 1);
		System.out.println("2. 1~1000 ������ ���� ������ �� ���� �Է¹޾� ���� ��� ���: " 
										+ "1�� ������: " + ran1 
											+ " 2�� ������: " + ran2 );
//			1. �� �� �� ū ���� ���
		int big = ran1 > ran2 ? ran1 : ran2;
		System.out.println("	- �� �� �� ū ���� ���: " + big);
//			2. ���� ���� ¦������, �ƴ����� ���
		int small = ran1 > ran2 ? ran2 : ran1;
		res = small % 2 == 0 ? "¦�� �Դϴ�." : "Ȧ�� �Դϴ�.";
		System.out.println("	- ���� ���� ¦������, �ƴ����� ���: ���� �� " + small + "�� " + res);
		
//			3. �� ���� ���� ¦���̸鼭, 6�� ������� �ƴ��� ���
		int sum = ran1 + ran2;
		boolean b1 = (sum % 2 == 0) && (sum % 6 == 0) ? true : false;
		System.out.println("	- �� ���� ���� ¦���̸鼭, 6�� ������� �ƴ��� ���: " + b1);
//			4. �� ���� ���� 300~600�� �������� �ƴ����� ���
		boolean b2 = (sum >= 300) && (sum <= 600) ? true : false;
		System.out.println("	- �� ���� ���� 300~600�� �������� �ƴ����� ���: " + b2);
	}

}
