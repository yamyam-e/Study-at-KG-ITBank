import javax.swing.JOptionPane;

public class J11_GuessGame {
	
	public static void main(String[] args) {
		
		int ran = (int)(Math.random()*10+1);
		
		String rcv; //= JOptionPane.showInputDialog("1~10까지 숫자 입력");
		
		int userNum; //= Integer.parseInt(rcv);
		
		int count = 0;
		
		while(true) {
			 rcv = JOptionPane.showInputDialog("1~10까지 숫자 입력");
			 userNum = Integer.parseInt(rcv);
			 if (userNum == ran) {
				 ++count;
				 JOptionPane.showMessageDialog(null, count + "회 만에 정답 숫자 " + ran + "을 맞추셨습니다.");
				 break;
			 }
			 ++count;
		}
	}

}
