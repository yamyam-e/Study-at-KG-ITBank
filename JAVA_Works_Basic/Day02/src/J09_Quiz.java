import javax.swing.JOptionPane;

public class J09_Quiz {
	
	public static void main(String[] args) {
		
//		����: �л� ���� ���� ���α׷�
//		JOption�� �̿��ؼ� �ۼ�
		
//		1. �̸�, ����, ����, ���� ���� �Է� ����
//			- �� ������ ����
//		2. �Էµ� ��� ���� �� ����, ���(double)�� ���
		String name;
		int kor, eng, math;
		name = JOptionPane.showInputDialog("�̸��Է�");
		kor = Integer.parseInt(JOptionPane.showInputDialog("������Է�"));
		eng = Integer.parseInt(JOptionPane.showInputDialog("������Է�"));
		math = Integer.parseInt(JOptionPane.showInputDialog("���м����Է�"));
		
		int total = kor + eng + math;
		double avg = total /3.0;
		
		JOptionPane.showConfirmDialog(null, "�̸�: " + name + "\n"
											+ "����: " + kor + "\n"
											+ "����: " + eng + "\n"
											+ "����: " + math + "\n"
											+ "����: " + total + "\n" 
											+ "���: " + avg);
		
	}

}
