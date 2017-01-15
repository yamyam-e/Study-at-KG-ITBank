package pmain;

import entity.*;

public class J01_mainCla {
	
	public static void main(String[] args) {
		
		J01_NewPeople pp = new J01_NewPeople();
		
//		pp.getOldData();
//		pp.getOldData();
//		=> 상속받은 클래스의 메버 및 기능을 물려 받음
		
		pp.setNewData("둘리", 10, "놀기");
		System.out.println(pp.getNewData());
	
	}

}
