import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J13_for {
	public static void main(String[] args) {
		
//		for(�ʱ��; ���ǽ�; ������) {
//			�ݺ��� ���;
//		}
		
//		1. 1 ~ 10 ������ ��� ���� ��� : ���۰�1, ����10
		for(int i=1; i<=10; i++){
			System.out.println(i + ". " + i);
		}
		
		
//		2. "�ȳ�" 5�� ��� : ���۰�11, ����15;
		for(int i=11; i<=15; i++){
			System.out.println(i + ". " + "�ȳ�");
		}
		
		
//		���� : 1 ~ 20 ������ �����ϴ� ��� �������� ��
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			sum += i;
		}
		JOptionPane.showMessageDialog(null, new JTextArea("1 ~ 20 ������ �����ϴ� ��� �������� �� : " + sum));
	}

}









