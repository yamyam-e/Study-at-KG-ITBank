package pmain;

import java.io.*;

public class J13_FileIO {

//	��ġ : java.io ��Ű��
	
	public static void main(String[] args) {
		
//		1. try - catch �ʿ�
		try {
			
//			2. ���� ����
			OutputStream os = null;
			
//			3. ��� ����
//			=> ������ ����� �����ϴ� ��� 
//				���� ����� �������ִ� FileOutputStream ���
			os = new FileOutputStream("D:\\�̼���\\MyWork\\Day08\\src\\files\\abc.txt");
			
//			4. ���� ���� : PrintWriter
			PrintWriter out = new PrintWriter(os);
			out.println("�ȳ��ϼ���");
			out.println("abcde");
			out.println(100);
			
//			5. close() : ��Ʈ�� ��� ����
			out.close();
			
		} catch(Exception e) {
			System.out.println("���ܹ߻�");
		}
		
	}

}
