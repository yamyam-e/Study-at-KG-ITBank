package pmain;

import entity.*;

public class J09_Poly {
	
	public static void main(String[] args) {
		
//		1. ��� ������ sub ��ü ����
		
		J09_SubCla sub1 = new J09_SubCla();
		System.out.println("1.");
		sub1.supMth();
		System.out.println(sub1.supMsg);
		sub1.subMth();
		System.out.println(sub1.subMsg);
		
//		2. ���۷��� ����ȯ ��
		
		System.out.println("2.");
		J09_SuperCla sup1;
	    sup1 = (J09_SuperCla)sub1;
	    
	    sup1.supMth();
	    System.out.println(sup1.supMsg);
	    
//	    ����:
//	    sup1.subMth();
//	    System.out.println(sup1.subMsg);
//	    => ����ȯ �� ����Ŭ������ ��� ��� �Ұ���
	    
//	    3. ���۷��� ������ȭ
	    J09_SubCla sub2;
	    sub2 = (J09_SubCla)sup1;//cast������ �ݵ�� �ʿ�
	    
	    sub2.supMth();
	    System.out.println(sub2.supMsg);
	    
	    sub2.subMth();
	    System.out.println(sub2.subMsg);
	    
		
		
		
	
		
	}

}
