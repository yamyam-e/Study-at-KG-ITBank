package pmain;

import java.util.Date;

public class J08_Date {
	
	public static void main(String[] args) {
		
//		Date 
//		- ��¥ ������ �����ϴ� Ŭ����
//		- ��ġ : java.util ��Ű��
		
//		��¥ ���� ���� ��� 1
		long t1 = System.currentTimeMillis();
//		=>1970�� 1�� 1�� ���ؽ����� ��������
//			������� �帥 �ð��� 1/1000�� ������ ����
		System.out.println("t1 : " + t1);
		
//		��¥ ���� ���� ��� 2
		Date date = new Date();
		System.out.println("date : " + date);
		
		System.out.println(date.getYear() + "��");
		//�ŷڼ��� ���� ���� ������Ʈ�� ���� ���̻� ������� �ʴ� �޼ҵ忡�� ���� ��
		
	}

}
