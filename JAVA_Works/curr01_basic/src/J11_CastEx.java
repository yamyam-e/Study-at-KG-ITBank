
public class J11_CastEx {
	
	public static void main(String[] args) {
		
//		1. ��� ���ϱ�
		int kor = 79;
		int eng = 78;
		int math = 76;
		
		int sum = kor + eng + math;
		System.out.println("sum : " + sum);
		
		double avg = sum / 3;
		System.out.println("1. avg : " + avg);
		
		avg = sum / (double)3;
		System.out.println("2. avg : " + avg);
		
		avg = sum / 3.0;
		System.out.println("3. avg : " + avg);
		
		
//		2. ����(������-������ ��) ���
//		- ���� : Math.random()
//		- �����Ǵ� ���� ���� : 0.0 �̻� ~ 1.0 �̸�
//		- ���� ���� : double
		
		double mr = Math.random();
		System.out.println("mr : " + mr);
		
//		���� �������� �ʿ��� ���
		int mr2 = (int)Math.random();
		System.out.println("mr2 : " + mr2);
//		=> ������ 0�� �����ǹǷ� ��� �Ұ���
		
//		10���� ���� ���� ���� �ʿ��� ��� : 0 ~ 9
		int mr3 = (int)(Math.random()*10);
//		0 �̻� ~ 10 �̸�
		System.out.println("mr3 : " + mr3);
		
		
//		1 ~ 10�� ������ �ʿ��� ���
		int mr4 = (int)(Math.random() * 10 + 1);
//		1 ~ 11 �̸�
		System.out.println("mr4 : " + mr4);
		
		
	}

}















