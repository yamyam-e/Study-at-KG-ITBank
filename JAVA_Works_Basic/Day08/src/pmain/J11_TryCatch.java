package pmain;

import javax.swing.JOptionPane;

public class J11_TryCatch {
	
//	����(Exception) : ���α׷��� ������ ������ ����
//		Ư����Ȳ���� ���α׷��� ������� ���ϴ� ����
	
	public static void main(String[] args) {
		
		System.out.println("������ ���α׷�");
		
		int a , b;
		
		try {
			String rcv = JOptionPane.showInputDialog("ù��° ���� �Է�");
			a = Integer.parseInt(rcv);
			rcv = JOptionPane.showInputDialog("�ι�° ���� �Է�");
			b = Integer.parseInt(rcv);
			
			System.out.println(a / b);
	//		=> b�� 0�� ��� ���ܻ�Ȳ�� ���� ��ü�� �߻���Ŵ
	//			throws new ArithmeticException(); �� ���� ���
	//		=> ���ܻ�Ȳ�� ���� ������ ���� ��ü�� �����ϴ� �ǹ���
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch(NumberFormatException e) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} catch(Exception e) {
			System.out.println("�� �� ���߻�Ȳ �߻�");
		} finally {// ���ܻ�Ȳ�� �߻��ϴ��� �ݵ�� ����
			System.out.println("�ݵ�� �����ؾ� �ϴ� ���");
		}
		
		System.out.println("������ ���α׷� ��� �����ϱ�");
		
	}

}
