import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class J08_while {
	public static void main(String[] args) {
		
//		while
//		- ���ǽ��� ���� ���, �ش� ��� ���� �� �ٽ� ���ǽ��� �Ǻ�
//		
		
//		while(true){
//			System.out.println("1. ���� ���� ���");
//		}
//		
//		int a;
//		=> ���� ���� ���Ŀ����� ��� �Ұ���
		
		
//		�ݺ��� �ۼ� ���
//		1. �ݺ��ϰ��� �ϴ� ���뿡 ���Ͽ� ���� �Ǵ� Ƚ���� �ľ�
//		2. �ݺ��ϰ��� �ϴ� ���뿡 ����
//			- ������ ���, ���۰��� ������ �ľ�
//			- Ƚ���� ���, Ƚ���� ���� �������� ��ȯ�� ��
//							���۰��� ������ ����
//		3. �ݺ����� ����� ���� �����Ѵ�.
//			- �Ϲ������� int
//		4. ����� ������ ���۰��� ����
//		5. �ݺ����� ���ǽ��� ���ؼ� ������ ���� ������ ǥ��
//		6. �ݺ� ���� �ӿ���, ����� ������ ���� �Ǵ� ���ҵǵ��� ������ ���
//		7. �ݺ��ϰ��� �ϴ� ����� �Է�
		
		
//		1. 1~10 ������ �����ϴ� ��� ���� ��� : ���۰�1, ����10
		int a = 1;
		while(a <= 10){
			System.out.println("1. a : " + a);
			a++;
		}
		
//		2. "�ȳ�"�� 5�� ��� : ���۰�1~����5 / 0~4 / 15~19
		int b = 1;
		while(b <= 5){
			System.out.println("2. �ȳ�");
			b++;
		}
		
		
//		while - if - break;
		
		while(true){
			String rcv3 = JOptionPane.showInputDialog("3. ������ �Է�(����:0)");
			
			if(rcv3.equals("0")){
				break;
			}
			
			JOptionPane.showMessageDialog(null, 
					new JTextArea("2. ���� �Ϸ�\n ������ ����մϴ�."));
		}
		
		
//		while - if - continue
//		- Ư�� ��Ȳ���� �ݺ����� ���ǽ����� �̵��ϰ��� �� �� ���
		
		while(true){ // �Է��� ���������� �ϸ� �ѹ��� ������.
			String rcv4 = JOptionPane.showInputDialog("4. ���� �Է�(1~5)");
			int num4 = Integer.parseInt(rcv4);
			
			if(num4 < 1 || num4 > 5) {
				JOptionPane.showMessageDialog(null, 
						new JTextArea("4. �ٽ��Է��ϼ���. ó������ ���ư��ϴ�."));
				continue; // while ���ǽ����� �̵��ؼ� �ٽ� ����.
						  // continue Ű����� while�������� for������ ����ϸ� ���������� �̵�	
			}
			
			JOptionPane.showMessageDialog(null, new JTextArea("4. �Էµ� �� : " + num4));
			break;
		}
		
		
//		while - switch - break label
//		- break�� ������ �ִ� ��� 3���� : switch, while, for
//		- ����� ��ø������ ���� ���,
//			���� �����̿� �ִ� ��� ������ ��
		
		abc : while(true){
			String rcv5 = JOptionPane.showInputDialog("5. �˸��� ���ðڽ��ϱ�?(y/n)");
			
			switch(rcv5) {
			
			case "y" : case "Y" :
				JOptionPane.showMessageDialog(null, 
						new JTextArea("5. 5�ÿ� ������ �ֽ��ϴ�."));
				break;
			
			case "n" : case "N" :
				JOptionPane.showMessageDialog(null, 
						new JTextArea("5. ���α׷� ����"));
				break abc;
				
			}
			
		}
		
		
//		do - while
//		- ����� ������ 1ȸ ���� ��, 
//			while���� ���ǽ��� ���� �ݺ� ���θ� �Ǵ�
		String rcv6  = null;
		do {
			
			rcv6 = JOptionPane.showInputDialog(
					"6. ������ 7�� �Դϴ�.\n" + "�˸��� ��� ���ðڽ��ϱ�? (y/n)");
			
		} while(rcv6.equals("y"));
		
		
	}

}














