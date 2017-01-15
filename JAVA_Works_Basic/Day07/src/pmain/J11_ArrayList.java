package pmain;

import java.util.ArrayList;
import entity.*;

public class J11_ArrayList {
	public static void main(String[] args) {

		ArrayList listc = new ArrayList<>();
		
//		1. add() : ���۷����� Object ���·� ����
		listc.add(10);
		listc.add(12.34);
		listc.add('A');
		listc.add("������");
//		�� �װ����� toString�� �������̵� ���־�� ����
		
		People pp1 = new People("�Ѹ�", 10);
		listc.add(pp1);
		
		System.out.println(listc);
		
//		2. isEmpty() : ���۷��� ���� Ȯ��
//			(������ true / ������ false)
		boolean b2 = listc.isEmpty();
		System.out.println("b2 :" + b2);
		
//		3. size() : ���۷��� ���� ����
		int b3 = listc.size();
		System.out.println("b3 "+ b3);
		
//		4. get(�ε�����ȣ) : ���۷��� ����
//			- ����� ���۷����� �ε�����ȣ�� 0���� ����
//			- ���� �� Object ���·� ����
		System.out.println("listc : " + listc);
		Object b4 = listc.get(0);
		int b42 = (int)b4;
		System.out.println("b42 : " + b42);
		
//		����: People b43 = listc.get(4);
		Object b43 = listc.get(4);
		People pp44 = (People)b43;
		System.out.println("pp4 : " + pp44.toString());
		
//		5. Ȯ�� for�� �̿�
		for(Object each : listc){
			System.out.println("each : " + each.toString());
		}
		
//		6. remove() : ������ �ε����� ���� ����
		System.out.println("listc : " + listc);
		listc.remove(0);
//		���� �� ��� ���۷������� ������ �̵�
		System.out.println("listc : " + listc);
		
//		7. clear() : �÷����� ��� ���� ����
		listc.clear();
		System.out.println("listc : " + listc);
		
		
	}
}
