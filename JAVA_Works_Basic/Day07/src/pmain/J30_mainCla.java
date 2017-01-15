package pmain;

import entity.J30_Circle;
import entity.J30_Point;
import entity.J30_Rectangle;

public class J30_mainCla {
	
	public static void main(String[] args) {
		
		J30_Circle c1 = new J30_Circle(1);
		c1.area();
		
		J30_Rectangle r1 = new J30_Rectangle(10, 10);
		r1.area();
	}

}
