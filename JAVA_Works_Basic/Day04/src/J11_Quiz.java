import javax.swing.JOptionPane;

public class J11_Quiz {
	public static void main(String[] args) {
		
//		클래스의 이름 : J12_MyMath
//		=> 두 개의 큰수 중 하나를 출력하는 클래스
		
//		작성해야 할 메소드(총 4개, 다음의 형식과 같다.)
//		- 메소드(정수, 정수) : 두 수 중 큰수를 출력
//		- 메소드(정수, 실수) : 두 수 중 큰수를 출력
//		- 메소드(실수, 정수) : 두 수 중 큰수를 출력
//		- 메소드(실수, 실수) : 두 수 중 큰수를 출력
		
//		조건 : 멤버변수 없이 메소드만 작성
		
		J12_MyMath m1 = new J12_MyMath();
		String msg = m1.max(1, 2);
		JOptionPane.showMessageDialog(null, msg);
	}
}
