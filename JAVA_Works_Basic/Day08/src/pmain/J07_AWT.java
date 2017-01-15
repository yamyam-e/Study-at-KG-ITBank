package pmain;

import java.awt.*;

public class J07_AWT {
	
//	위치 : java.awt 패키지
	
	public static void main(String[] args) {
		
		Frame fr = new Frame();
//		fr.setSize(400, 300);
//		fr.setLocation(600, 100);
		fr.setBounds(600, 100, 400, 300);
		Button bt1 = new Button("버튼 111111");
		fr.add(bt1);
		
		Button bt2 = new Button("버튼 222222");
		fr.add(bt2);
		
//		=> 바닥에 원하는 배치 구조를 가진 설정을 해야 함
//		=> 이러한 배치 구조를 레이아웃이라 한다.
		
		fr.setLayout(new GridLayout(1, 3));
//		=> GridLayout : 행과 열로 이루어진 격자 구조(바닥을 1열 3행의 구조로 만든다.)
		
//		문제 : 버튼 1개를 만들고, 바닥에 붙이기
		Button bt3 = new Button("버튼 333333");
		fr.add(bt3);
		
		
		fr.setVisible(true);
		
	}

}
