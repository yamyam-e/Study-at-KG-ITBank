package entity;

public class J30_Rectangle implements J30_Shape {
	
	private int x;
	private int y;
	
	public J30_Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void area() {
		System.out.println("area : " + (x*y));
	}
	
}
