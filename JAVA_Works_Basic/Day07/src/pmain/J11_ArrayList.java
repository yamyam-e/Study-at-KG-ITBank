package pmain;

import java.util.ArrayList;
import entity.*;

public class J11_ArrayList {
	public static void main(String[] args) {

		ArrayList listc = new ArrayList<>();
		
//		1. add() : 레퍼런스를 Object 형태로 저장
		listc.add(10);
		listc.add(12.34);
		listc.add('A');
		listc.add("가나다");
//		위 네가지는 toString이 오버라이드 돼있어어 나옴
		
		People pp1 = new People("둘리", 10);
		listc.add(pp1);
		
		System.out.println(listc);
		
//		2. isEmpty() : 레퍼런스 유무 확인
//			(없으면 true / 있으면 false)
		boolean b2 = listc.isEmpty();
		System.out.println("b2 :" + b2);
		
//		3. size() : 레퍼런스 갯수 제공
		int b3 = listc.size();
		System.out.println("b3 "+ b3);
		
//		4. get(인덱스번호) : 레퍼런스 제공
//			- 저장된 레퍼런스의 인덱스번호는 0부터 시작
//			- 제공 시 Object 형태로 제공
		System.out.println("listc : " + listc);
		Object b4 = listc.get(0);
		int b42 = (int)b4;
		System.out.println("b42 : " + b42);
		
//		에러: People b43 = listc.get(4);
		Object b43 = listc.get(4);
		People pp44 = (People)b43;
		System.out.println("pp4 : " + pp44.toString());
		
//		5. 확장 for문 이용
		for(Object each : listc){
			System.out.println("each : " + each.toString());
		}
		
//		6. remove() : 지정된 인덱스의 정보 삭제
		System.out.println("listc : " + listc);
		listc.remove(0);
//		삭제 후 모든 레퍼런스들을 앞으로 이동
		System.out.println("listc : " + listc);
		
//		7. clear() : 컬렉션의 모든 정보 삭제
		listc.clear();
		System.out.println("listc : " + listc);
		
		
	}
}
