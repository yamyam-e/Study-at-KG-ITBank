
public class J01_Wrapper {
	public static void main(String[] args) {
	
		String s1 = "123";
		System.out.println(s1 + 100); // ���� �� ���
		
//		���� : int i1 = (int)s1;
//		=> String�� Cast�����ڷ� ��ȯ �Ұ���
		
		
//		1. String�� int�� ��ȯ�ϴ� ���
		int i1 = Integer.parseInt(s1);
		System.out.println("1 : " + (i1 + 100) );
		
		
//		2. String�� double�� ��ȯ�ϴ� ���
		String s2 = "123.456";
		double d1 = Double.parseDouble(s2);
		System.out.println("2 : " + (d1 + 100) );
		
		
//		3. String�� boolean���� ��ȯ�ϴ� ���
		String s3 = "true";
		boolean b1 = Boolean.parseBoolean(s3);
		System.out.println("3 : " + b1);
		
		
		
		
		
	}

}














