package pmain;

import java.awt.*;

public class J07_AWT {
	
//	��ġ : java.awt ��Ű��
	
	public static void main(String[] args) {
		
		Frame fr = new Frame();
//		fr.setSize(400, 300);
//		fr.setLocation(600, 100);
		fr.setBounds(600, 100, 400, 300);
		Button bt1 = new Button("��ư 111111");
		fr.add(bt1);
		
		Button bt2 = new Button("��ư 222222");
		fr.add(bt2);
		
//		=> �ٴڿ� ���ϴ� ��ġ ������ ���� ������ �ؾ� ��
//		=> �̷��� ��ġ ������ ���̾ƿ��̶� �Ѵ�.
		
		fr.setLayout(new GridLayout(1, 3));
//		=> GridLayout : ��� ���� �̷���� ���� ����(�ٴ��� 1�� 3���� ������ �����.)
		
//		���� : ��ư 1���� �����, �ٴڿ� ���̱�
		Button bt3 = new Button("��ư 333333");
		fr.add(bt3);
		
		
		fr.setVisible(true);
		
	}

}
