package entity;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//	�۵� ����� ���� Ŭ����
//	1. �ش� �����ʿ� ���� �������̽��� implements
//	2. �۵� ����� actionPerformed �޼ҵ带 �̿��Ͽ� �������̵� �Ѵ�.

public class J09_Handler implements ActionListener {
	
	TextArea ta;
	
	public J09_Handler(TextArea ta) {
		this.ta = ta;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�ڵ鷯 �޼ҵ� �۵���");
		
//		ta.setText("AAAAAA");
//		=> ������ ������ ����� �ٽ� ����
		
		ta.append("AAAAAA\n");
	}
	

}
