import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J03_if {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("�̸� �Է�");
		String rcv = JOptionPane.showInputDialog("���� �Է�");
		int age = Integer.parseInt(rcv);
		
		String res;
		
		if(age>=8 && age<=13) {
			res = name + "�� �ʵ��б��� ���ϴ�.\n";
			if (age>=8 && age <=10) {
				res += "�׸��� ���г� �Դϴ�.";
			} else {
				res += "�׸��� ���г� �Դϴ�.";
			}
		} else if(age>=14 && age<=16) {
			res = name + "�� ���б��� ���ϴ�.";
		} else if(age>=17 && age<=19) {
			res = name + "�� ����б��� ���ϴ�.";
		} else if(age>=20 && age<=24) {
			res = name + "�� ���б��� ���ϴ�.";
		} else if(age>=25) {
			res = name + "�� ���忡 ���ϴ�.";
		} else {
			res = name + "�� ��ġ���� ���ϴ�.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
	}

}
