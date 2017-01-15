import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J03_if {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("이름 입력");
		String rcv = JOptionPane.showInputDialog("나이 입력");
		int age = Integer.parseInt(rcv);
		
		String res;
		
		if(age>=8 && age<=13) {
			res = name + "은 초등학교에 갑니다.\n";
			if (age>=8 && age <=10) {
				res += "그리고 저학년 입니다.";
			} else {
				res += "그리고 고학년 입니다.";
			}
		} else if(age>=14 && age<=16) {
			res = name + "은 중학교에 갑니다.";
		} else if(age>=17 && age<=19) {
			res = name + "은 고등학교에 갑니다.";
		} else if(age>=20 && age<=24) {
			res = name + "은 대학교에 갑니다.";
		} else if(age>=25) {
			res = name + "은 직장에 갑니다.";
		} else {
			res = name + "은 유치원에 갑니다.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(res));
	}

}
