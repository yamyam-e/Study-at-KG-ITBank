import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J12_HW {
	public static void main(String[] args) {
		
//		�л� ���� ���� ���α׷�
//		1. �����׸�
//			- �̸�, ���� , ����, ����, ����, ���, ���(ABCDEF)
//			- �� ���� ����(int) / ��� / dobule
//			- ����� ���� ���Ĵ��..(90���̻� - A, 80���̻� - B....)
//		2. �޴�
//			1. �л� ���� �Է�
//				- �̸�, �� ���� ����
//			2. �л� ���� ����
//				- ��� ���� �׸�
//			3. ���� ��� ����
//				- ��� 80�� �̻� && �� ���� ��� 70�� �̻��̸� �հ�
//			4. ���α׷� ����
//		3. ����
//			1. ������ �Էµ��� ���� ��Ȳ���� �޴�2,3��" ���� ��
//				��� �˸� ������ ��Ȳ ó��
//			2. ������ �Էµ� ��Ȳ���� "�޴�1��" ���� ��
//				���� ���� ���� �˸� �� ���� Ȯ�� ö�� �ʿ�(y/n)
		
		String showMenu = "[�л��������� ���α׷�}\n"
							+ "1. �л� ���� �Է�\n"
							+ "2. �л� ���� ����\n"
							+ "3. ���� ��� ����\n"
							+ "4. ���α׷� ����";
		
		String stuName = null, grade = null;
		int kor = -1 , eng = -1 , math = -1;
		int total = 0;
		double avg = 0;
		
		while(true){
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")) { // �л� ���� �Է�	
				if(stuName == null) {
					stuName = JOptionPane.showInputDialog("�л� �̸� �Է�");
					String rcv = JOptionPane.showInputDialog("���� ���� �Է�");
					kor = Integer.parseInt(rcv);
					
					rcv = JOptionPane.showInputDialog("���� ���� �Է�");
					eng = Integer.parseInt(rcv);
					
					rcv = JOptionPane.showInputDialog("���� ���� �Է�");
					math = Integer.parseInt(rcv);
					
					total = kor + eng + math;
					avg = total / 3.0;
					
					msg = "���� �Է��� �Ϸ�Ǿ����ϴ�.";
					
					if(avg>=90) {
						grade = "A ���";
					} else if(avg>=80&&avg<=89){
						grade = "B ���";
					} else if(avg>=70&&avg<=79){
						grade = "C ���";
					} else if(avg>=60&&avg<=69){
						grade = "D ���";
					} else if(avg>=50&&avg<=59){
						grade = "E ���";
					} else {
						grade = "F ���";
					}
				} else {
					String ans = JOptionPane.showInputDialog("���� ������ �����ϰ� ����Ͻðڽ��ϱ�? (y/n)");
					if(ans.equalsIgnoreCase("y")) {
						stuName = null;
						msg = "���� ������ ���� �Ͽ����ϴ�.";
					} else if(ans.equalsIgnoreCase("n")) {
						msg = "���� ������ ���� �Ͽ����ϴ�.";
					} else {
						msg = "�߸��� �Է��Դϴ�.";
					}
				}
										
			} else if(sel.equals("2")) { // �л� ���� ����
				if(stuName == null) {
					msg = "������ �����ϴ�.";
				} else {
					msg = "[�л�����]\n"
							+ "�̸�\t ����\t ����\t ����\t ����\t ���\t ���\n"
							+ "==================================================================================\n"
							+ stuName + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t"
							+ avg + "\t" + grade;
				}
				
			} else if(sel.equals("3")) { // ���� ��� ����
				if(stuName == null) {
					msg = "������ �����ϴ�.";
				} else {
					if (avg>=80&&kor>=70&&eng>=70&&math>=70) {
						msg = stuName + " �л��� �հ��Դϴ�.";
					} else {
						msg = stuName + " �л��� ���հ��Դϴ�.";
					}
				}
				
			} else if(sel.equals("4")) { // ���α׷� ����
				break;
			} else { // ����
				msg = "�߸�� �Է��Դϴ�.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
		
	}

}










