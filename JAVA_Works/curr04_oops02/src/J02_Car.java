
public class J02_Car {
	String name;
	int price;
	
	void setData(String name, int price){
		
		System.out.println("this : " + this);
		this.name = name;
		this.price = price;
	}
	
	void showCar(){
		System.out.println("이름 : " + this.name + ", 가격 : " + this.price);
	}
}
