import javax.swing.JOptionPane;

public class J08_JOptionpane {
	
	public static void main(String[] args) {
		
		String msg = "�����ְ� ���� �޽���";
		System.out.println(msg); //�ܼ�â
		
		JOptionPane.showMessageDialog(null, msg);
		JOptionPane.showMessageDialog(null, "�����ֱ�");
		JOptionPane.showMessageDialog(null, 100);
		JOptionPane.showMessageDialog(null, 123.4567);
		JOptionPane.showMessageDialog(null, '��');
		
		String rcv = JOptionPane.showInputDialog("�Է��ϼ���");
//		=> ������ String���� ������
		
		JOptionPane.showMessageDialog(null, "rcv = " + rcv);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���."));
		JOptionPane.showMessageDialog(null, "10�� �� ����� ���̴� " + (age + 10) + "�� �Դϴ�.");
	}

}
