
public class J06_CastEx {
	
	public static void main(String[] args) {
		
//		����ȯ ��� ��
		
//		1. ��ձ��ϱ�
		int kor = 79;
		int eng = 76;
		int math = 78;
		
		int total = kor + eng + math;
		double avg = total / 3;
		System.out.println("avg = " + avg);
		
		avg = total / (double)3;
		System.out.println("avg = " + avg);
		
		avg = total / 3.0;
		System.out.println("avg = " + avg);
		
//		2. ������ ����
//		- Math.random()
//		- ���� ������ : 0.0 �̻� ~ 1.0 �̸� �Ǽ�
//		- �������� : double
		
		double ran = Math.random();
		System.out.println("ran = " + ran);
		
		int temp = (int)Math.random();
		System.out.println("temp = " + ran);
		
//		0~10 ���� ���� ���� ���� ��
		int ran2 = (int)(Math.random() * 10);
//		0 �̻� ~ 10 �̸�
		System.out.println("ran2 = " + ran2);
		
//		1~10������ ���� ���� ��
		int ran3 = (int)(Math.random() * 10 + 1);
//		1�̻� ~ 11�̸�
		System.out.println("ran3 = " + ran3);
		
		int ran4;
		int count = 0;
		while(true){
			ran4 = (int)(Math.random() * 100 + 1);
			if (ran4 == 100) break;
			else ++count;
		}
		System.out.println("count = " + count);
		System.out.println("ran4 = " + ran4);
	}

}














