package pmain;

import java.util.*;

public class J10_Collection {
	
//	�÷���
//	- ��ġ : java.util ��Ű��
	
//	�÷��� �迭 3����
//	1. List �迭 : ���� ���� ��� O && �ߺ� ��� O
//		- ����Ŭ���� : ArrayList, LinkedList, Vector.....
//	2. Set �迭 : ���� ���� ��� X && �ߺ� ��� X
//		- ����Ŭ���� : HashSet, TreeSet.....
//	3. Map �迭 
//		- "Ű-��"�� ������ ���� 
//			&& ���� ���� ��� X
//			&& Ű�� �ߺ��� ������� ����(���� ���� Ű���� ���� ��� ���� �����.)
//		- ����Ŭ���� : HashMap, TreeMap.....
	
//	�÷����� ��� �����͸� Object ���۷���(������ȣ) ���·� ������
//	=> ���� ����� ���۷����� �̿��� ������ ������ �´�
//		����ȯ�� �ʿ���
	
	
//	�迭�� �Ѱ��� ������� ������ ���� ����� ���̰�
//	collection�� ���°� ������ ���� ���� �ָӴϿ� object �������� ������ȣ�� �����Ѵ�.
//	������� O �ߺ� O : List
//	������� X �ߺ� X : Set
//	������  : Map
//	�������̽� ������ �����Ǿ� �ִ�.  
//	�������̽��� ��� �޼ҵ�� �ݵ�� �����Ǿ�� �Ѵ�.
//	���� ��� collection�� ������ Ŭ������ ��� ��ɾ�� �����ϴ�.
	
	
	public static void main(String[] args) {
		
//		1. List �迭
		List li;
		
		li = new ArrayList<>();
		li.add(10);
		
		ArrayList listc = new ArrayList<>();
		
		listc.add(10);
		listc.add(1.23);
		listc.add('A');
		listc.add("������");
//		�ߺ���� �׽�Ʈ
		listc.add(1.23);
		listc.add('A');
		
		System.out.println(listc);
		
//		2. Set �迭
		Set st;
		st = new HashSet<>();
		st.add(10);
		
		HashSet setc = new HashSet<>();
		setc.add(30);
		setc.add("������");
		setc.add('B');
		setc.add(12.34);
//		�ߺ��Ұ� �׽�Ʈ
		setc.add("������");
		setc.add('B');
		
		System.out.println(setc);
		
//		3. Map �迭
		Map mm;
		mm = new HashMap<>();
		mm.put(1, "����");
		
		HashMap mapc = new HashMap<>();
		mapc.put(1, "�Ѹ�");
		mapc.put(12.34, 'A');
		mapc.put("������", 111);
//		Ű�� �ߺ��Ұ� �׽�Ʈ
		mapc.put("������", 222);
//		�� �ߺ���� �׽�Ʈ
		mapc.put(7777, 'A');
		
		System.out.println(mapc);
		
	}

}
