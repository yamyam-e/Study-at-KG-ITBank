package entity;

public class J30_Circle implements J30_Shape {
	
	private int x;
	
	public J30_Circle(int x) {
		this.x = x;
	}
	
	public void area() {
		System.out.println("area : " + (3.14*x));
	}
	
}
