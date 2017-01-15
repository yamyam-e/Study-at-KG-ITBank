package pmain;

import java.util.HashSet;
import java.util.TreeSet;

public class J03_HashSet {
	
//	Set
//	- 저장 순서 기억 X / 데이터 중복 허용 X
	
	public static void main(String[] args) {
		
		HashSet<String> setc = new HashSet<>();
//		1.add() :  저장
		setc.add("사람1");
		setc.add("사람2");
		setc.add("사람3");
		setc.add("사람4");
		setc.add("사람5");
		setc.add("사람2");
		setc.add("사람3");
		setc.add("사람4");
		
		System.out.println("1. setc : " + setc.toString());
		
//		2.size() : 갯수 제공
		int n = setc.size();
		System.out.println("2. 갯수 : " +  n);
		
//		3. contain() : 포함 여부 확인 true / false
		boolean b = setc.contains("사람2");
		System.out.println("3. b = " + b);
		
//		TreeSet
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("차람4");
		ts.add("사람2");
		ts.add("가람1");
		ts.add("사람5");
		ts.add("아람3");
		ts.add("사람1");
		
		System.out.println("ts : " + ts.toString());
	}

}
