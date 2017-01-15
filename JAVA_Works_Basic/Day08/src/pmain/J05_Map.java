package pmain;

import java.util.*;

public class J05_Map {
	
//	Map
//	- ���� Ŭ���� : HashMap, TreeMap.....
//	- Ű&�� �� ������ ���� �����͸� ����
//	- Ű�� �ߺ��� ������� ����
	
	public static void main(String[] args) {
		
		HashMap mapc = new HashMap<>();
		
//		1. put(Ű, ��)	: ����
		mapc.put(1, "������");
		mapc.put("A", 132);
		mapc.put(12.34, 1010);
		
		System.out.println("1. mapc : " + mapc.toString());
		
//		2. get(Ű) : ������ ����
		Object rcv = mapc.get(1); 
//		=>���׸��� �����Ƿ� �⺻������ ��� Object
		String data = (String)rcv;
		System.out.println("2. data : " +  data);
		
//		3. containsKey(Ű) : Ű ���� ���� Ȯ��
		boolean b = mapc.containsKey("A");
		System.out.println("3. b = " + b);
		
//		4. remove(Ű) : ����
		System.out.println("4. mapc : " + mapc.toString());
		mapc.remove("A");
		System.out.println("4. mapc : " + mapc.toString());
		
//		5. Ȯ�� for�� - keySet()���� Ű ������ ����ؾ� ��
		
		Set keyCopy = mapc.keySet();
		
		for(Object key : keyCopy) {
			Object obj = mapc.get(key);
			System.out.println("obj : " + obj.toString());
		}
//		=> �⺻�ڷ����� ��� toString() �������̵尡
//				�Ǿ� �����Ƿ� ��� ����
		
//		6. ���׸� ��� - Ű�� �� ��ο� ����
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "��");
		hm.put(2, "abcd");
		hm.put(2, "����ab");
		
		Set<Integer> keyGroup = hm.keySet();
		
		for(int key : keyGroup){
			String value = hm.get(key);
			System.out.println("Ű : " + key + ", �� : " +  value);
		}
	}

}
