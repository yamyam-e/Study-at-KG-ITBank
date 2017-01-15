package pmain;

public class J06_String {
	
	public static void main(String[] args) {
		
//		String
//		- ���ڿ� ó�� Ŭ����
//		- ��ġ : java.lang ��Ű��
		
		String s1 = "����";// �� ������ ����
		String s2 = new String("����");
		String s3 = "����";// �� ������ ���� Ȯ�� �� s1�� �ּҰ� ����
		String s4 = new String("����");
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
//		1. ���ϼ� Ȯ�� : .equal()
		System.out.println("s1 == s2 ? " + (s1==s2) );//false
		System.out.println("s1 == s3 ? " + (s1==s3) );//true
		System.out.println("s2 == s4 ? " + (s2==s4) );//false
		
		boolean b11 = s1.equals(s3);
		System.out.println("b11 : " + b11);
		
//		2. length() : ����
		String s22 = "123456";
		int b22 = s22.length();
		System.out.println("b22 : " + b22);
		
//		3. subString() :  ���ڿ� �߶󳻱�
//			(���ڿ��� �ε��� ��ȣ�� 0���� ������)
		String s33 = "0123456789";
		String b31 = s33.substring(4); // �ε��� 4���� ����
		System.out.println("b31 : " + b31);
		
		String b32 = s33.substring(2, 6);
//		=> �ε��� 2���� ���� ~ 6�� ��������
		System.out.println("b32 : " + b32);
		
//		4. replace() : ���ڿ� ��ü
		String s44 = "����ab12abc�ٶ�ab";
		String b41 = s44.replace("ab", "****");
		System.out.println("b41 : " + b41);
		
//		5. contains() : ���ڿ� ���� ���� Ȯ��
		String s51 = "������ abc 12";
		boolean b51 = s51.contains("����");
		System.out.println("b51 : " + b51);
		
//		6. split() : ���ڿ� �и�
		String s61 = "������/abcd/1234";
		String[] b61 = s61.split("/");
		
		for(String each : b61) {
			System.out.println("(1)each : " +  each);
		}
		
//		���ܻ�Ȳ
		String s62 = "������.abc.123";
		String[] b62 = s62.split("[.]");
		//Ư����ȣ�� ������ ���� ��� ���ȣ�� ����ϸ� �ȴ�.
		
		for(String each : b62) {
			System.out.println("(2)each : " +  each);
		}
		
		
	}

}
