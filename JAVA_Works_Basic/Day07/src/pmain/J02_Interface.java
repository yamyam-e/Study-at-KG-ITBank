package pmain;

import entity.*;

public class J02_Interface {
	public static void main(String[] args) {
		
//		1. �������̽��� ������ Ŭ������ ��ü �̿��ϱ�
		J02_Inter inter01 = null;
		inter01 = new J02_SubCla();
		inter01.over01();
		inter01.over02();
		
//		2. �������̽��� ���� ��ü�� �̸� ���� ���·� 
//			�Ｎ���� ���� ����ϴ� ���
		J02_Inter inter02 = new J02_Inter() {
			
			public void over02() {
				System.out.println("�Ｎ��ü 02");
			}
			
			public void over01() {
				System.out.println("�Ｎ��ü 01");
			}
		};
		inter02.over01();
		inter02.over02();
	}
}
