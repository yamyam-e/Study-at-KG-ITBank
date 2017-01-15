package pmain;

import java.util.TreeSet;

public class J04_TreeSetEx {
	
	public static void main(String[] args) {
	
		TreeSet<Integer> lotto = new TreeSet<>();
		
		while(true){
			
			int n = (int)(Math.random()*45+1);
			lotto.add(n);
			
			if(lotto.size() == 6) break;
			
		}
		
		System.out.println("예상 번호 : " + lotto.toString());
	}
}
