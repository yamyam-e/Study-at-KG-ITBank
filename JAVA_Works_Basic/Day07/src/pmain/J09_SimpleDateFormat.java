package pmain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class J09_SimpleDateFormat {
	
	public static void main(String[] args) {
		
//		SimpleDateFormat
//		- ������ �������� ��¥ ������ ��ȯ�ؼ� ����
//		- ��ġ : java.text ��Ű�� (format �� ���� Ŭ������ text ��Ű���� �ִ�)
		
//		1
		long t1 = System.currentTimeMillis();
		System.out.println("t1 : " +  t1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� (EE)");
		//���Ͽ� ��ҹ��� ���� ���� �� ��
		String t2 = sdf.format(t1);
		System.out.println("t2 : " + t2);

//		2.
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss (EEEE)");
		Date date = new Date();
		String date2 = sdf2.format(date);
		System.out.println("date2 : " + date2);
	}

}
