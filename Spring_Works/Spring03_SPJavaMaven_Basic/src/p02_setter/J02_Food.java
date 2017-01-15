package p02_setter;

public class J02_Food {
	private String name;
	private int price;
	public J02_Food() {
		// TODO Auto-generated constructor stub
	}
	public J02_Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
