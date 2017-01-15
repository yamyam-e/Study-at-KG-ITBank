package entity;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.zip.DataFormatException;

public class J08_View {
	
	Frame fr;
	Label lb;
	TextArea ta;
	TextField tf;
	
	public J08_View(String msg) {
		
		fr = new Frame();
		fr.setBounds(600, 400, 400, 300);
		fr.setLayout(new BorderLayout());
//		=> 동(East)서(West)남(South)북(North)중앙(Center) 구조의 레이아웃
//		=> 각 키워드의 첫글자는 반드시 대문자로 입력
		
		lb = new Label();
		lb.setText(msg);
		lb.setAlignment(Label.CENTER);
		lb.setBackground(Color.green);
		fr.add("North" , lb);
		
		ta = new TextArea();
		ta.setFont(new Font("굴림체", Font.PLAIN, 16));
		fr.add("Center" , ta);
		
		tf = new TextField();
		tf.setFont(new Font("굴림체", Font.PLAIN, 16));
		fr.add("South", tf);
		
		fr.setVisible(true);
		
	}

}
