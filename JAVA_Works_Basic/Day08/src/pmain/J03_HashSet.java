package pmain;

import java.util.HashSet;
import java.util.TreeSet;

public class J03_HashSet {
	
//	Set
//	- ���� ���� ��� X / ������ �ߺ� ��� X
	
	public static void main(String[] args) {
		
		HashSet<String> setc = new HashSet<>();
//		1.add() :  ����
		setc.add("���1");
		setc.add("���2");
		setc.add("���3");
		setc.add("���4");
		setc.add("���5");
		setc.add("���2");
		setc.add("���3");
		setc.add("���4");
		
		System.out.println("1. setc : " + setc.toString());
		
//		2.size() : ���� ����
		int n = setc.size();
		System.out.println("2. ���� : " +  n);
		
//		3. contain() : ���� ���� Ȯ�� true / false
		boolean b = setc.contains("���2");
		System.out.println("3. b = " + b);
		
//		TreeSet
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("����4");
		ts.add("���2");
		ts.add("����1");
		ts.add("���5");
		ts.add("�ƶ�3");
		ts.add("���1");
		
		System.out.println("ts : " + ts.toString());
	}

}
