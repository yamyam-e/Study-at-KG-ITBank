import javax.swing.JOptionPane;

public class J10_if {

//	조건문 if
//	if(질문A?) {
//		A가 참이면 실행
//  } else if(질문B?){
//		B가 참이면 실행
//	} else {
//		뒷처리
//	}
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("이름입력");
		String rcv = JOptionPane.showInputDialog("나이입력");
		int age = Integer.parseInt(rcv);
		
		if (age>=8&&age<=13) {
			JOptionPane.showMessageDialog(null, 
					name + "은 초등학교에 갑니다.");
		} else if(age>=14&&age<=16) {
			JOptionPane.showMessageDialog(null, 
					name + "은 중학교에 갑니다.");
		} else if(age>=17&&age<=19) {
			JOptionPane.showMessageDialog(null, 
					name + "은 고등학교에 갑니다.");
		} else if(age>=20) {
			JOptionPane.showMessageDialog(null, 
					name + "은 직장에 갑니다.");
		} else {
			JOptionPane.showMessageDialog(null, 
					name + "은 유치원에 갑니다.");
		}
		
	}
}
