package pmain;

import entity.*;

public class J08_Cast {
	
	public static void main(String[] args) {
		
//		1. ��ġ ������ ����ȭ : Cast������
		double d = 123.456789;
		float f;
		
		f = (float)d;
		
//		2. Ŭ������ ���۷��� �� ����ȯ?
		
		J08_AAA aa = new J08_AAA();
		J08_BBB bb;
//		���� : bb = (J08_BBB)aa;
//		=> Ŭ���� ���۷��� �� ����ȯ �Ұ���
		
//		3. ��� ���� Ŭ������ ���۷��� �� ����ȯ
		
//		3-1. ����Ŭ����(new) -> ����Ŭ����
		J08_SuperCla sup1 = new J08_SuperCla();
		J08_SubCla sub1;
		
		sub1 = (J08_SubCla)sup1;
		
//		3-2. ����Ŭ����(new) -> ����Ŭ����
		
		J08_SubCla sub2 = new J08_SubCla();
		J08_SuperCla sup2;
		
		sup2 = (J08_SuperCla)sub2;
		sup2 = sub2; // cast ������ ����
		
	}

}
