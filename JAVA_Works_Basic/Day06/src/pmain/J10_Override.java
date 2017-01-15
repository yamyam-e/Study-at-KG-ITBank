package pmain;

import entity.*;

public class J10_Override {
	
	public static void main(String[] args) {
		
		J10_SubCla sub = new J10_SubCla();
		
		J10_SuperCla sup;
		
		sup = (J10_SuperCla)sub;
		
		sup.works();
		
	}

}
