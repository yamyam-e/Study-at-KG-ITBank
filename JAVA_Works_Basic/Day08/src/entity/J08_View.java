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
//		=> ��(East)��(West)��(South)��(North)�߾�(Center) ������ ���̾ƿ�
//		=> �� Ű������ ù���ڴ� �ݵ�� �빮�ڷ� �Է�
		
		lb = new Label();
		lb.setText(msg);
		lb.setAlignment(Label.CENTER);
		lb.setBackground(Color.green);
		fr.add("North" , lb);
		
		ta = new TextArea();
		ta.setFont(new Font("����ü", Font.PLAIN, 16));
		fr.add("Center" , ta);
		
		tf = new TextField();
		tf.setFont(new Font("����ü", Font.PLAIN, 16));
		fr.add("South", tf);
		
		fr.setVisible(true);
		
	}

}
