import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J02_JOptionPane {
	public static void main(String[] args) {
		
		String msg = "����ϰ� ���� �޽���";
		
		System.out.println(msg);	// �ܼ�â�� ���
		
		JOptionPane.showMessageDialog(null, msg);
		
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
//		���� : JOptionPane.showMessageDialog(null, new JTextArea(1000));
//		=> ����Ϸ��� ����� ���´� String�� ����
		
		
		String aa = JOptionPane.showInputDialog("�Է��ϼ���");
//		=> ������ String���� ����
	
		
		String name = JOptionPane.showInputDialog("�̸� �Է�");
		String age = JOptionPane.showInputDialog("���� �Է�");
		
		JOptionPane.showMessageDialog(null, 
				new JTextArea(name + "�� ���̴� " + age + "��"));
		
//		���� : �� ����� 10�� �� ���̸� jop�� ����ϼ���.
		int age2 = Integer.parseInt(age);
		JOptionPane.showMessageDialog(null, 
				new JTextArea(name + "�� 10 ���� ���̴� " + (age2 + 10) + "��"));
		
//		����
//		���� ������ JOptionPane�� �̿��Ͽ� �ۼ�
//			1. �̸�, ����, ����, ���� ���� �Է¹���(�� ������ int)
//			2. ���� �� ��� ��� (����� double)
//			3. ��� ������ ���
		
		
//		*******�ϳ��� �Է� ������ �����ϴ� ���� : String rcv ���******
//		*******��� String �޼��� ����ϴ� ���� :  String res ***********
//		*******��� �� Ÿ��Ʋ�� �Է����ִ� ���� : [�л� ���� ���]*******
//		*******�����̸� �����ϰ� ����ϴ� ���� : String stuName *********
		
		String stuName = JOptionPane.showInputDialog("�л� �̸� �Է�");
		String rcv = JOptionPane.showInputDialog("���� ���� �Է�");
		int kor = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("���� ���� �Է�");
		int eng = Integer.parseInt(rcv);
		rcv = JOptionPane.showInputDialog("���� ���� �Է�");
		int math = Integer.parseInt(rcv);
		
//		int kor = Integer.parseInt(JOptionPane.showInputDialog("���� ���� �Է�"));
//		int eng = Integer.parseInt(JOptionPane.showInputDialog("���� ���� �Է�"));
//		int math = Integer.parseInt(JOptionPane.showInputDialog("���� ���� �Է�"));
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		String res = "[�л� ���� ���]\n" 
						+ "�̸� : " + stuName + "\n"
						+ "���� : " + kor + "\n"
						+ "���� : " + eng + "\n"
						+ "���� : " + math + "\n"
						+ "���� : " + total + "\n"
						+ "��� : " + avg;
		
		JOptionPane.showMessageDialog(null,	new JTextArea(res));
		
		
		
		
		
	}
}










