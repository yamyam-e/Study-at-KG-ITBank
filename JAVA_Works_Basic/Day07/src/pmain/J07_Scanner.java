package pmain;

import java.util.Scanner;

public class J07_Scanner {
	
	public static void main(String[] args) {
		
//		Scanner
//		- ��� ������κ��� ���� ������ �����͸� �о�� �� ���
//		- ��ġ : java.util ��Ű��
		
		Scanner scan = new Scanner(System.in);
//		=> �ý����� �ܼ�â�� ������� ��
//		=> �ܼ�â���κ��� �Է¹��� ���� �����͸� �о���� ���
		
//		1. nextLine() : �ܼ�â�� �Էµ� ������ ���� �������� �о��
		System.out.println("���ڿ� �Է�");
		String s1 = scan.nextLine();
		System.out.println("s1 : " + s1);
		
//		2. nextInt() : ���� �о��(����� ��������) ��� �����ϸ� �ڿ��� ©��
		System.out.println("���� �Է�");
		int s2 = scan.nextInt();
		System.out.println("s2 : " + s2);
		
//		3. nextDoble() : �Ǽ� �о��(����� ��������)
		System.out.println("�Ǽ� �Է�");
		double s3 = scan.nextDouble();
		System.out.println("s3 : " + s3);
		
	}

}
