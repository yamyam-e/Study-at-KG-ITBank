package pmain;

import javax.swing.JOptionPane;

import entity.*;

//	Thread : 프로그램의 실행 흐름을 제어하는 자원
//	1. 동시에 실행하고자 하는 기능 갯수만큼 클래스 작성
//	2. 각 클래스에 extends Thread
//	3. run 메소드를 오버라이드 한 후, 원하는 기능 구현
//	4. 각 객체 생성 후, start() 메소드로 시작 함


public class J12_Thread_intro {
	
	public static void main(String[] args) {
		
		J12_MyJop mj = new J12_MyJop();
		J12_MySyso ms = new J12_MySyso();

		mj.start();
		ms.start();
	}

}
