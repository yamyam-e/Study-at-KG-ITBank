package springEX03.mvc.spring03.dto;

import org.apache.ibatis.type.Alias;

@Alias("car")
public class CarDTO {
	private int num;
	private String name;
	private int price;
	private String opName;
	private int opPrice;
	private int total;
	private String orgName;
	private String sysName;
	public CarDTO() {
	}
	public CarDTO(String name, int price, String opName, int opPrice, String orgName, String sysName) {
		this.name = name;
		this.price = price;
		this.opName = opName;
		this.opPrice = opPrice;
		this.total = price + opPrice;
		this.orgName = orgName;
		this.sysName = sysName;
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
	public String getOpName() {
		return opName;
	}
	public void setOpName(String opName) {
		this.opName = opName;
	}
	public int getOpPrice() {
		return opPrice;
	}
	public void setOpPrice(int opPrice) {
		this.opPrice = opPrice;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getSysName() {
		return sysName;
	}
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}
}
