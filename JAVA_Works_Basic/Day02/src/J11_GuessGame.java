import javax.swing.JOptionPane;

public class J11_GuessGame {
	
	public static void main(String[] args) {
		
		int ran = (int)(Math.random()*10+1);
		
		String rcv; //= JOptionPane.showInputDialog("1~10���� ���� �Է�");
		
		int userNum; //= Integer.parseInt(rcv);
		
		int count = 0;
		
		while(true) {
			 rcv = JOptionPane.showInputDialog("1~10���� ���� �Է�");
			 userNum = Integer.parseInt(rcv);
			 if (userNum == ran) {
				 ++count;
				 JOptionPane.showMessageDialog(null, count + "ȸ ���� ���� ���� " + ran + "�� ���߼̽��ϴ�.");
				 break;
			 }
			 ++count;
		}
	}

}
