
public class J07_Wrapper {
	
	public static void main(String[] args) {
		
		String p1 = "1234";
		int p2;
		
//		���� : p2 = (int)p1;
//		=> WrapperŬ���� �迭 ��ɾ �ʿ�
		
//		1. String�� ������ ��ȯ�Ϸ��� ���
		p2 = Integer.parseInt(p1);
		System.out.println("p2 = " +  p2);
		System.out.println(p2 + 200);	
		
		
//		2. String�� �Ǽ��� ��ȯ�Ϸ��� ���
		String p3 = "123.456";
		double dd;
		dd = Double.parseDouble(p3);
		System.out.println(dd + 10);
		
		
	}

}
