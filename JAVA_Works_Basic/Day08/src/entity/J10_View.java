package entity;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class J10_View {
	
	Frame fr;
	TextArea ta;
	TextField tf;
		
	public J10_View() {
		
		fr = new Frame();
		fr.setBounds(600, 400, 400, 300);
		fr.setLayout(new BorderLayout());
		
		ta = new TextArea();
		tf = new TextField();
		
		fr.add("Center", ta);
		fr.add("South", tf);
				
		fr.setVisible(true);
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				tf.setText("");	// Áö¿ì±â
				ta.append(text + "\n");	
			}
		});
	}
}
