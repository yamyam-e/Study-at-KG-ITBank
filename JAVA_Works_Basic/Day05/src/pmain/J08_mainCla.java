package pmain;

import entity02.J08_People;

public class J08_mainCla {
	
	public static void main(String[] args) {
		
		J08_People pp = new J08_People();
		
//		����:pp.name = "�Ѹ�";
//		����:pp.age = 10;
//		=> private ����
		
		pp.setName("�Ѹ�");
		System.out.println(pp.getName());
		
	}

}
