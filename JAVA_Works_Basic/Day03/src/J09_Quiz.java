import javax.swing.JOptionPane;

public class J09_Quiz {
	
	public static void main(String[] args) {

//		�л� ���� ���� ���α׷�
//		=> �̸�, ����, ���� , ���� , ����, ���
		
//		�޴�
//			1. �л� ���� �Է�
//			2. �л� ���� ����
//			3. �հ� ��� ����
//				- ��� 85.5 �̻��̸� �հ�/�ƴϸ� ���հ�
//			4. ���α׷� ����
		
		String showMenu = "1. �л� ���� �Է�\n2. �л� ���� ����\n3. �հ� ��� ����\n4. ���α׷�����";
		
		J09_Students s1 = new J09_Students();
		
		while(true) {
			String num = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			if(num.equals("1")) { //�Է�
				s1.name = JOptionPane.showInputDialog("�̸��Է�");
				
				String rcv = JOptionPane.showInputDialog("��������");
				s1.kor = Integer.parseInt(rcv);
				
				rcv = JOptionPane.showInputDialog("��������");
				s1.eng = Integer.parseInt(rcv);
				
				rcv = JOptionPane.showInputDialog("��������");
				s1.math = Integer.parseInt(rcv);
				
				s1.total = s1.kor + s1.eng + s1.math;
				
				s1.avg = s1.total / 3.0;	
			} else if(num.equals("2")) { //����
				if (s1.name == null) {
					msg = "�ش������� ����";
				}
				else {
					msg = "�̸�: " + s1.name +"\n"
							+"����: " + s1.kor +"\n"
							+"����: " + s1.eng +"\n"
							+"����: " + s1.math +"\n"
							+"����: " + s1.total +"\n"
							+"���: " + s1.avg;
				}
				
			} else if(num.equals("3")) { //�հݿ���
				if (s1.name == null) {
					msg ="�ش������� ����";
				} else {
					if (s1.avg >= 85.5) {
						msg = s1.name + "���� �հ��Դϴ�.";
					} else {
						msg =  s1.name + "���� ���հ��Դϴ�.";
					}		
				}
				
			} else if(num.equals("4")) { //����
				break;
			} else {
				msg = "�߸��� ���� �Է�";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
	}

}
