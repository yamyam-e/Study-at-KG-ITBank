package pmain;

import entity02.*;

//import entity02.J09_People01;
//import entity02.J09_People02;

public class J09_mainCla {
	
	public static void main(String[] args) {
	
//		1. public People		
		J09_People01 pub = new J09_People01();
		pub.name = "둘리";
		pub.age = 10;
		System.out.println("pub : " + pub.name + " , " + pub.age);
		
//		2. private People
		J09_People02 priv = new J09_People02();
		priv.setName("도우너");
		priv.setAge(-20);
		System.out.println("priv : " + priv.getName() + " , " + priv.getAge());
		
		
		
		
	}

}
