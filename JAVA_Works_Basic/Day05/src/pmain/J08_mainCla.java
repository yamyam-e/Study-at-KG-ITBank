package pmain;

import entity02.J08_People;

public class J08_mainCla {
	
	public static void main(String[] args) {
		
		J08_People pp = new J08_People();
		
//		에러:pp.name = "둘리";
//		에러:pp.age = 10;
//		=> private 상태
		
		pp.setName("둘리");
		System.out.println(pp.getName());
		
	}

}
