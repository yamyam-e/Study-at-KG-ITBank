package pmain;

import entity.*;

public class J05_Object {
	public static void main(String[] args) {
		
//		API : www.oracle.com -> API ���� ����
	
//		Object
//		- �ڹ��� ��� Ŭ�����鿡 ���� �ֻ��� ����Ŭ����
//		- ��ġ : java.lang ��Ű��
//			(lang ��Ű���� import ���� ��� ����)
			
		J05_MyCla mm = new J05_MyCla();
//		mm.
		
//		1. toString() :
//			- �������̵带 ����
//				�ۼ��� Ŭ������ �������� ����ϵ���
//				�����ϱ� ���� �غ�� �޼ҵ�
		System.out.println(mm);
		System.out.println(mm.toString());
//		=> ���� ����� ������ ����̴�.
//		=> �⺻������ toString()�� ��ü�� ������ȣ(hashCode)��
//			�����ϵ��� ������� �ִ�.
		
//		2. Object ������
		Object obj1 = 10;
		Object obj2 = 12.34;
		Object obj3 = 'A';
		Object obj4 = "�����ٶ�";
		
		J05_MyCla mc = new J05_MyCla();
		Object obj5 = mc;
		Object obj6 = new J05_MyCla();
		
		
	}

}
