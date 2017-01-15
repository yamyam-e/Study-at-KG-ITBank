package pmain;

import java.util.*;

public class J10_Collection {
	
//	컬렉션
//	- 위치 : java.util 패키지
	
//	컬렉션 계열 3가지
//	1. List 계열 : 저장 순서 기억 O && 중복 허용 O
//		- 구현클래스 : ArrayList, LinkedList, Vector.....
//	2. Set 계열 : 저장 순서 기억 X && 중복 허용 X
//		- 구현클래스 : HashSet, TreeSet.....
//	3. Map 계열 
//		- "키-값"의 구조로 저장 
//			&& 저장 순서 기억 X
//			&& 키의 중복은 허용하지 않음(따라서 같은 키값이 있을 경우 덮어 씌운다.)
//		- 구현클래스 : HashMap, TreeMap.....
	
//	컬렉션은 모든 데이터를 Object 레퍼런스(고유번호) 형태로 저장함
//	=> 따라서 저장된 레퍼런스를 이용할 때에는 목적에 맞는
//		형변환이 필요함
	
	
//	배열은 한가지 모양으로 한정된 방을 만드는 것이고
//	collection은 형태과 갯수에 관계 없이 주머니에 object 형식으로 고유번호를 저장한다.
//	저장순서 O 중복 O : List
//	저장순서 X 중복 X : Set
//	쌍으로  : Map
//	인터페이스 구조로 구성되어 있다.  
//	인터페이스의 모든 메소드는 반드시 구현되어야 한다.
//	따라서 모든 collection을 구현한 클래스의 모든 명령어는 동일하다.
	
	
	public static void main(String[] args) {
		
//		1. List 계열
		List li;
		
		li = new ArrayList<>();
		li.add(10);
		
		ArrayList listc = new ArrayList<>();
		
		listc.add(10);
		listc.add(1.23);
		listc.add('A');
		listc.add("가나다");
//		중복허용 테스트
		listc.add(1.23);
		listc.add('A');
		
		System.out.println(listc);
		
//		2. Set 계열
		Set st;
		st = new HashSet<>();
		st.add(10);
		
		HashSet setc = new HashSet<>();
		setc.add(30);
		setc.add("가나다");
		setc.add('B');
		setc.add(12.34);
//		중복불가 테스트
		setc.add("가나다");
		setc.add('B');
		
		System.out.println(setc);
		
//		3. Map 계열
		Map mm;
		mm = new HashMap<>();
		mm.put(1, "가나");
		
		HashMap mapc = new HashMap<>();
		mapc.put(1, "둘리");
		mapc.put(12.34, 'A');
		mapc.put("가나다", 111);
//		키값 중복불가 테스트
		mapc.put("가나다", 222);
//		값 중복허용 테스트
		mapc.put(7777, 'A');
		
		System.out.println(mapc);
		
	}

}
