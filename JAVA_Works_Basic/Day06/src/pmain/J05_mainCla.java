package pmain;

import entity.J05_Hotel;
import entity.J05_House;

public class J05_mainCla {
	
	public static void main(String[] args) {
		
//		�ε��� ���� ���� ���α׷�
		
//		�������� : �̸�, ����, ������������
//		ȣ������ : �̸�, ����, vip�� ����
		
		J05_House hh = new J05_House();
		hh.setData();
		System.out.println(hh.showData());
		
		J05_Hotel tt = new J05_Hotel();
		tt.setData();
		System.out.println(tt.getData());
		
		
	}

}
