import javax.swing.JOptionPane;

public class J12_ArraysCla {
	public static void main(String[] args) {
		
//		���۷����迭�� ���� �����繫�� ��ü
		J12_People[] pp = new J12_People[3];//���۷����迭
		
		System.out.println(pp[1]);
//		=> ����, ��ü ������ȣ�� ������� ���� ����
		
//		���� : pp[1] = "�Ѹ�";
//		=> ��ü ���� �ʿ�
		pp[0] = new J12_People();
		pp[1] = new J12_People();
		pp[2] = new J12_People();
		
		pp[0].name = "�Ѹ�";
		pp[0].age = 10;
		
		pp[1].name = "������";
		pp[1].age = 30;
		
		pp[2].name = "�߻�";
		pp[2].age = 18;
		
		for(int i=0; i<pp.length; i++) {
			System.out.println("�̸� : " + pp[i].name + "���� : " + pp[i].age);
		}
		System.out.println("==========================");
		
		for(J12_People each : pp) {
			System.out.println("�̸� : " + each.name + ", ���� : " + each.age);
		}
		
		for(int i=0; i<pp.length; i++) {
			pp[i] = new J12_People();
			pp[i].name = JOptionPane.showInputDialog("�̸��Է�");
			String rcv =
					JOptionPane.showInputDialog("�����Է�");
			pp[i].age = Integer.parseInt(rcv);
		}
	}
}
