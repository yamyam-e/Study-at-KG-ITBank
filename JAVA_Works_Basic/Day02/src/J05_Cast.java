
public class J05_Cast {
	
//	cast ������ : ���¸� �����ؼ� �����ϴ� ������

	public static void main(String[] args) {
		
		double d = 123.456789;
		float f;
//		����: f = d;
//		=> �����Ϸ��� ���, �⺻������ ���� ������ ���� Ư���� ���ƾ� ��
		f = (float)d;
		System.out.println("f = " +  f);
//		=> cast ������ ���
		
		long l = 123456L;
		int i;
		
		i = (int)l;
		System.out.println("i = " + i);
		
//		����: String�� Cast ������ ��� �Ұ���
		String ss = "1234";
		int ii;
//		���� ii = (int)ss;
		
		
//		���� ��Ȳ:
//		- ���� ���迡���� Cast �����ڰ� �ڵ����� �����
//		- int < long < float < double
//		- �ڹٿ����� ������ �ս��� �߻����� ���� ��� �ڵ�����ȯ�� �ȴ�.
		
		long l2 = 200; //Cast �ڵ� ����
		
		double dd = 123.456f;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
