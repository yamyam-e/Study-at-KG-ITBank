import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J04_Quiz {
	public static void main(String[] args) {
		
//		1. �˸��޽��� ���� ���α׷�
//		- "�˸� �޽����� ���ðڽ��ϱ�?(y/n)" ���� ��
//			y �Ǵ� Y ������ ��� => "2�ð� �Ŀ� ������ �ֽ��ϴ�" �޽��� �˸�
//			n �Ǵ� N ������ ��� => �ƹ��͵� ���� ����
		String sel = JOptionPane.showInputDialog("�˸� �޽����� ���ðڽ��ϱ�?(y/n)");
		
		String res = "";
		
		if(sel.equalsIgnoreCase("y")){
			res = "2�ð� �Ŀ� ������ �ֽ��ϴ�";
			JOptionPane.showMessageDialog(null, new JTextArea(res));
		}
		
//		2. û�ҳ� ���� ���α׷�
//		- ���̸� �Է¹��� ��
//			19�� ������ ��� => "û�ҳ� ���� ����Դϴ�." �˸� �޽���
//			20�� �̻��� ��� => "û�ҳ� ���� ����� �ƴմϴ�." �˸� �޽���
		String rcv = JOptionPane.showInputDialog("���� �Է�");
		int age = Integer.parseInt(rcv);
		
		if(age<=19) {
			res = "û�ҳ� ���� ����Դϴ�.";
		} else {
			res = "û�ҳ� ���� ����� �ƴմϴ�.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
		
//		3. ���� ��� ���� ���α׷�
//		- �л��� �̸��� ����, ����, ���� ������ �Է¹��� (���� int)
//		- �л��� ������ ��� ����
		String stuName = JOptionPane.showInputDialog("�л� �̸� �Է�");
		rcv = JOptionPane.showInputDialog("���� ���� �Է�");
		int kor = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("���� ���� �Է�");
		int eng = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("���� ���� �Է�");
		int math = Integer.parseInt(rcv);
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
//		- ��� ������ ���� ������ ���� ����� ������
//			����� 90�� �̻��� ��� 
//				- ��� ������ ������ 85�� �̻��̸�, �ֿ���л�, A���
//				- �ϳ��� ������ 85�� �̸��̸�, ����л�, A���
//			����� 80�� �̻��� ���, B��� 
//			����� 70�� �̻��� ���, C��� 
//			����� 60�� �̻��� ���, D���
//			����� 60�� �̸��� ���
//				- �ϳ��� �����̶� 30�� �̸��̸�, ����� �Ұ���, F���
//				- ��� ������ ������ 30�� �̻��̸�, ����� ����, F���
		String msg = "";
		
		if(avg>=90) {
			if (kor>=85&&eng>=85&&math>=85) {
				msg = stuName + "�л��� �ֿ���л�, A���";
			} else {
				msg = stuName + "�л��� ����л�, A���";
			}
		} else if (avg>=80 && avg<=89) {
			msg = stuName + "�л��� B���";
		} else if (avg>=70 && avg<=79) {
			msg = stuName + "�л��� C���";
		} else if (avg>=60 && avg<=69) {
			msg = stuName + "�л��� D���";
		} else {
			if(kor>30&&eng>30&&math>30) {
				msg = stuName + "�л��� ����� ����, F���";
			} else {
				msg = stuName + "�л��� ����� �Ұ���, F���";
			}
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
//		4. ���̱ⱸ �̿� ���� ���α׷�
//		- ����� �̸�, ����(int), Ű(double)�� �Է�
		String childName = JOptionPane.showInputDialog("��� �̸� �Է�");
		rcv = JOptionPane.showInputDialog("��� ���� �Է�");
		int childAge = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("��� Ű �Է�");
		double childHeight = Double.parseDouble(rcv);
		
//		- �� ���ǿ� ���� �̿� ������ ���̱ⱸ ���
//			���̰� 10�� �̻��� ���
//				- Ű�� 150.5 �̻��̸� : ���̷ε��, ���ֿ��� ����
//				- Ű�� 150.5 �̸��̸� : ���ֿ��� ����
//			���̰� 10�� �̸��� ���
//				- Ű�� 120.5 �̻��̸� : ����Ž��, ȸ���� ����
//				- Ű�� 120.5 �̸��̸� : ȸ���� ����
		if(childAge>10) {
			if(childHeight>150.5) {
				msg = childName + " ��̴� ���̷ε��, ���ֿ��� ����";
			} else {
				msg = childName + " ��̴� ���ֿ��� ����";
			}
		} else {
			if(childHeight>120.5) {
				msg = childName + " ��̴� ����Ž��, ȸ���� ����";
			} else {
				msg = childName + " ��̴� ȸ���� ����";
			}
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
	}
}











