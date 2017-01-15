package springEX02.mvc.spring02.dto;

import org.apache.ibatis.type.Alias;

@Alias("ham")
public class HambergerDTO {
	private int num;
	private String name;
	private int price, cal;
	public HambergerDTO() {
	}
	public HambergerDTO(String name, int price, int cal) {
		this.name = name;
		this.price = price;
		this.cal = cal;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	
}
