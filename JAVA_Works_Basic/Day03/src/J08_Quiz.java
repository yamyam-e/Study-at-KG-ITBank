
public class J08_Quiz {
	public static void main(String[] args) {
//		�л� ���� ���� ���α׷�
//		�Ѹ�, �������� 79, ��������78, �������� 76��
//		����?, ���?
		
//		=> Ŭ����, ��ü, ���۷����� �̿��Ͽ� �ۼ�
		
		J08_Students s1 = new J08_Students();
		s1.name = "�Ѹ�";
		s1.kor = 79;
		s1.eng = 78;
		s1.math = 76;
		s1.total = s1.kor + s1.eng + s1.math;
		s1.avg = s1.total / 3.0;
		
		System.out.println("�̸� : " + s1.name);
		System.out.println("���� : " + s1.kor);
		System.out.println("���� : " + s1.eng);
		System.out.println("���� : " + s1.math);
		System.out.println("���� : " + s1.total);
		System.out.println("��� : " + s1.avg);
		
	}
}
