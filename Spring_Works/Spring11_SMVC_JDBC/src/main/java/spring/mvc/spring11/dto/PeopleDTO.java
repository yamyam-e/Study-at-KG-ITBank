package spring.mvc.spring11.dto;

public class PeopleDTO {
	
	private Integer num;
	private String name;
	private Integer age;
	private String orgName;
	private String sysName;
	public PeopleDTO() {
		// TODO Auto-generated constructor stub
	}
	public PeopleDTO(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
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
