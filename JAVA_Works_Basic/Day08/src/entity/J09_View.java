package entity;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class J09_View {
	
	Frame fr;
	Button bt1, bt2;
	TextArea ta;
	
	public J09_View() {
		
		fr = new Frame();
		fr.setBounds(600, 400, 700, 200);
		fr.setLayout(new GridLayout(1, 3));
		
		bt1 = new Button("AAA����ϱ�");
		fr.add(bt1);
		
		ta = new TextArea();
		fr.add(ta);
		
		bt2 = new Button("BBB����ϱ�");
		fr.add(bt2);
				
		fr.setVisible(true);
		
		
//		��ǰ �۵��ϴ� ��� 2����
		
//		1. Ŭ���� �ۼ� �� �̿� => J09_Handler
		bt1.addActionListener(new J09_Handler(ta));
		
		
//		2. �͸�Ŭ���� �ۼ� �� �̿�
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append("BBBBBB\n");
				
			}
		});
		
	}

}
