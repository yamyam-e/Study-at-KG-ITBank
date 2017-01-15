package entity;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//	작동 명령을 가진 클래스
//	1. 해당 리스너에 대한 인터페이스를 implements
//	2. 작동 명령을 actionPerformed 메소드를 이용하여 오버라이드 한다.

public class J09_Handler implements ActionListener {
	
	TextArea ta;
	
	public J09_Handler(TextArea ta) {
		this.ta = ta;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("핸들러 메소드 작동됨");
		
//		ta.setText("AAAAAA");
//		=> 기존의 내용을 지우고 다시 쓰기
		
		ta.append("AAAAAA\n");
	}
	

}
