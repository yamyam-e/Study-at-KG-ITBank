package pmain;

import java.util.ArrayList;
import entity.*;

public class J02_Generic {
	
	public static void main(String[] args) {
		
		ArrayList li = new ArrayList<>();
		
		li.add(10);
		li.add(123.456);
		li.add("가나다");
//		=> Object 형태로 관리하므로, 모든 형태 수용
		
		ArrayList<String> listc1 = new ArrayList<String>();
		listc1.add("가나다");
		listc1.add("둘리");
//		=> String으로 제네릭 설정함
		
//		에러 : listc1.add(10);
		
//		에러 : ArrayList<int> listc2 = new ArrayList<>();
//		=> 제네릭 설정은 클래스 형태만 가능
//		=> 기본자료형에 대한 클래스 형태를 제공하는
//			Wrapper클래스를 사용해야 함
//		=> Wrapper클래스
//			int(Integer) / double(Double) / float(Float)
//			long(Long) / char(Character) / boolean(Boolean)
		
		ArrayList<Integer> listc = new ArrayList<>();
		listc.add(10);
		listc.add(20);
		
		ArrayList<J02_People> listc2 = new ArrayList<>();
		J02_People peo = new J02_People("둘리", 10);
		listc2.add(peo);
		
		listc2.add(new J02_People("도우너", 20));
		listc2.add(new J02_People("마이콜", 30));
		
		for (J02_People each : listc2){
			System.out.println(each.getName() + " , " + each.getAge());
		}
		
	}

}
