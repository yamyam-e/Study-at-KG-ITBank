import javax.swing.JOptionPane;

public class J10_if {

//	���ǹ� if
//	if(����A?) {
//		A�� ���̸� ����
//  } else if(����B?){
//		B�� ���̸� ����
//	} else {
//		��ó��
//	}
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("�̸��Է�");
		String rcv = JOptionPane.showInputDialog("�����Է�");
		int age = Integer.parseInt(rcv);
		
		if (age>=8&&age<=13) {
			JOptionPane.showMessageDialog(null, 
					name + "�� �ʵ��б��� ���ϴ�.");
		} else if(age>=14&&age<=16) {
			JOptionPane.showMessageDialog(null, 
					name + "�� ���б��� ���ϴ�.");
		} else if(age>=17&&age<=19) {
			JOptionPane.showMessageDialog(null, 
					name + "�� ����б��� ���ϴ�.");
		} else if(age>=20) {
			JOptionPane.showMessageDialog(null, 
					name + "�� ���忡 ���ϴ�.");
		} else {
			JOptionPane.showMessageDialog(null, 
					name + "�� ��ġ���� ���ϴ�.");
		}
		
	}
}
