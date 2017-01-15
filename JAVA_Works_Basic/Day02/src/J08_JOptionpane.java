import javax.swing.JOptionPane;

public class J08_JOptionpane {
	
	public static void main(String[] args) {
		
		String msg = "보여주고 싶은 메시지";
		System.out.println(msg); //콘솔창
		
		JOptionPane.showMessageDialog(null, msg);
		JOptionPane.showMessageDialog(null, "보여주기");
		JOptionPane.showMessageDialog(null, 100);
		JOptionPane.showMessageDialog(null, 123.4567);
		JOptionPane.showMessageDialog(null, '가');
		
		String rcv = JOptionPane.showInputDialog("입력하세요");
//		=> 무조건 String으로 제공함
		
		JOptionPane.showMessageDialog(null, "rcv = " + rcv);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요."));
		JOptionPane.showMessageDialog(null, "10년 후 당신의 나이는 " + (age + 10) + "살 입니다.");
	}

}
