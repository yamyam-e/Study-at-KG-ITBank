package pmain;

import entity.*;

public class J01_Abstract {

	public static void main(String[] args) {
		
//		1. �߻�޼ҵ带 ������ ����Ŭ���� ��ü�� �̿��ϴ� ���
		 
		J01_SuperCla sup1 = null;//���� ��� ��� �޸�
		sup1 = new J01_SubCla();
		sup1.overMth();
		
//		2. �߻�޼ҵ带 ���� ��ü�� �Ｎ���� �����ؼ� ���
		
		J01_SuperCla sup2 = new J01_SuperCla() {
			@Override
			public void overMth() {
				System.out.println("�Ｎ ���� ��ü�� �������̵� �޼ҵ�");
			}
		};//<=============************************
		sup2.overMth();
		
		
	}
}
