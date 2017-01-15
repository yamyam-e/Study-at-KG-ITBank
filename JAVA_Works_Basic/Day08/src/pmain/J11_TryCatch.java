package pmain;

import javax.swing.JOptionPane;

public class J11_TryCatch {
	
//	예외(Exception) : 프로그램의 논리적인 문제로 인해
//		특정상황에서 프로그램이 실행되지 못하는 오류
	
	public static void main(String[] args) {
		
		System.out.println("나누셈 프로그램");
		
		int a , b;
		
		try {
			String rcv = JOptionPane.showInputDialog("첫번째 정수 입력");
			a = Integer.parseInt(rcv);
			rcv = JOptionPane.showInputDialog("두번째 정수 입력");
			b = Integer.parseInt(rcv);
			
			System.out.println(a / b);
	//		=> b가 0인 경우 예외상황에 대한 객체를 발생시킴
	//			throws new ArithmeticException(); 와 같은 명령
	//		=> 예외상황에 대한 정보를 가진 객체를 제공하는 의미임
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(NumberFormatException e) {
			System.out.println("잘못된 입력입니다.");
		} catch(Exception e) {
			System.out.println("그 외 돌발상황 발생");
		} finally {// 예외상황이 발생하더라도 반드시 실행
			System.out.println("반드시 실행해야 하는 명령");
		}
		
		System.out.println("이후의 프로그램 명령 실행하기");
		
	}

}
