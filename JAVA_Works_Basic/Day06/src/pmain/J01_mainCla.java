package pmain;

import entity.*;

public class J01_mainCla {
	
	public static void main(String[] args) {
		
		J01_NewPeople pp = new J01_NewPeople();
		
//		pp.getOldData();
//		pp.getOldData();
//		=> ��ӹ��� Ŭ������ �޹� �� ����� ���� ����
		
		pp.setNewData("�Ѹ�", 10, "���");
		System.out.println(pp.getNewData());
	
	}

}
