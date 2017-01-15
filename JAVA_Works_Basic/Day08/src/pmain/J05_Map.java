package pmain;

import java.util.*;

public class J05_Map {
	
//	Map
//	- 구현 클래스 : HashMap, TreeMap.....
//	- 키&값 의 구조를 가진 데이터를 저장
//	- 키의 중복은 허용하지 않음
	
	public static void main(String[] args) {
		
		HashMap mapc = new HashMap<>();
		
//		1. put(키, 값)	: 저장
		mapc.put(1, "가나다");
		mapc.put("A", 132);
		mapc.put(12.34, 1010);
		
		System.out.println("1. mapc : " + mapc.toString());
		
//		2. get(키) : 데이터 제공
		Object rcv = mapc.get(1); 
//		=>제네리이 없으므로 기본적으로 모두 Object
		String data = (String)rcv;
		System.out.println("2. data : " +  data);
		
//		3. containsKey(키) : 키 존재 여부 확인
		boolean b = mapc.containsKey("A");
		System.out.println("3. b = " + b);
		
//		4. remove(키) : 삭제
		System.out.println("4. mapc : " + mapc.toString());
		mapc.remove("A");
		System.out.println("4. mapc : " + mapc.toString());
		
//		5. 확장 for문 - keySet()으로 키 묶음을 사용해야 함
		
		Set keyCopy = mapc.keySet();
		
		for(Object key : keyCopy) {
			Object obj = mapc.get(key);
			System.out.println("obj : " + obj.toString());
		}
//		=> 기본자료형은 모두 toString() 오버라이드가
//				되어 있으므로 출력 가능
		
//		6. 제네릭 사용 - 키와 값 모두에 적용
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "가");
		hm.put(2, "abcd");
		hm.put(2, "가나ab");
		
		Set<Integer> keyGroup = hm.keySet();
		
		for(int key : keyGroup){
			String value = hm.get(key);
			System.out.println("키 : " + key + ", 값 : " +  value);
		}
	}

}
