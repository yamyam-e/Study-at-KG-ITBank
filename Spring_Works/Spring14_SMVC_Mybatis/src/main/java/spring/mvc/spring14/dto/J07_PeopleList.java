package spring.mvc.spring14.dto;

import java.util.List;

public class J07_PeopleList {
	
	List<J07_People> listc;
	
	public J07_PeopleList() {
	}
	public J07_PeopleList(List<J07_People> listc) {
		this.listc = listc;
	}
	public List<J07_People> getListc() {
		return listc;
	}
	public void setListc(List<J07_People> listc) {
		this.listc = listc;
	}
}
