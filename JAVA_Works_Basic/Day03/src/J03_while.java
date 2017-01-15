import javax.swing.JOptionPane;

public class J03_while {
//	while(질문  => 참/거짓) {
//		반복하 명령
//	}
	public static void main(String[] args) {
		
		int n1 = 3;

//		while(n1 < 5) {
//			System.out.println( n1 + "은 5보다 작다");
//		}
//		=> 무한루프	
		
//		반복문 작성 방법
//		1. 반복할 내용을 파악 (범위 또는 횟수)
//		2. 반복문이 사용할 변수 선언(int 변수)
//		3. 반복 내용이 범위인 경우, 
//			시작값과 끝값을 파악 한다.
//			횟우인 경우, 범위로 변환한 후 시작값, 끝값 결정
//		4. 선언한 변수에 시작값을 저장
//			끝값은 반복문의 조건식으로 표현 
//		5. 중괄호 안에 반복하려는 명령 입력
		
//		1. 3~9 범위에 존재하는 모든 정수 출력(3~9)
		int a = 3;
		while (a <= 9) {
			System.out.println("a = " + a);
			a++;
		}
		
//		2. "안녕" 4번 출력(0~3 / 1~4 / 5~8)
		int b = 1;
		while (b <= 4) {
			System.out.println("안녕");
			b++;
		}
		
//		while문의 조건식으로 돌아가는 명령 : continue (반복문 안에서만 존재해야 한다.)
		int t;
		
		while(true) {
			String rcv = JOptionPane.showInputDialog("정수 입력(1~10)");
			t = Integer.parseInt(rcv);
			if (t < 1 || t > 10) {
				JOptionPane.showMessageDialog(null, "잘못된 입력 => 다시 입력하세요");
				continue;// while문 처음으로 돌아가게 한다.
			}
			JOptionPane.showMessageDialog(null, "입력한 수는 " + t + "입니다.");
		}
	}
}
