
public class J02_This {
	public static void main(String[] args) {
		
		J02_Car car1 = new J02_Car();
		System.out.println("car1 : " + car1);
		
		car1.setData("고물차", 200);
		car1.showCar();
		
		J02_Car car2 = new J02_Car();
		System.out.println("car2 : " + car2);
		
		car2.setData("수퍼카", 10);
		
		
	}

}
