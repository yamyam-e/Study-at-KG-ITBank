import javax.swing.JOptionPane;

public class J03_Quiz {
	public static void main(String[] args) {
		
//		���� : �л� ���� ���� ���α׷�
//		=>�̸�, ����, ����, ���� ����, ����, ���
		
//		1. �Ѹ�, 79, 78, 76
//		2. �����, 84, 85, 77
		
//		Ŭ���� �ۼ� && ��ü ���� &&
//		�޼ҵ� �ۼ�
//			1. ���� ���� �����ϴ� �޼ҵ�
//			2. �Էµ� ��� �� �� ����, ����� ����ϴ� �޼ҵ�
		
		J03_Student stu1 = new J03_Student();
		setData(stu1, "�Ѹ�", 79, 78, 76);
//		stu1.total = total(stu1);
//		stu1.avg = avg(stu1);
		showData(stu1);
		
		J03_Student stu2 = new J03_Student();
		setData(stu2, "�����", 84, 85, 77);
//		stu2.total = total(stu2);
//		stu2.avg = avg(stu2);
		showData(stu2);	
		
	}
	
	public static void setData(J03_Student theStu, String theName, int theKor, int theEng, int theMath) {
		theStu.name = theName;
		theStu.kor = theKor;
		theStu.eng = theEng;
		theStu.math = theMath;
		theStu.total = total(theStu);
		theStu.avg = avg(theStu);
	}
	
	public static void showData(J03_Student theStu){
		JOptionPane.showMessageDialog(null, "�̸�: " + theStu.name + "\n"
											+ "����: " + theStu.kor + "\n"
											+ "����: " + theStu.eng + "\n"
											+ "����: " + theStu.math + "\n"
											+ "����: " + theStu.total + "\n"
											+ "���: " + theStu.avg);
	}
	
	public static int total(J03_Student theStu) {
		return theStu.kor+theStu.eng+theStu.math;
	}
	
	public static double avg(J03_Student theStu) {
		return total(theStu)/3.0;
	}
	
}
