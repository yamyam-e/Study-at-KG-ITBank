package spring.mvc.springpaging.dto;

import org.apache.ibatis.type.Alias;

@Alias("mylist")
public class ListDTO {
	private int num;
	private String title;
	private String content;
	public ListDTO() {
	}
	public ListDTO(String title, String content) {
		this.title = title;
		this.content = content;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "ListDTO [num=" + num + ", title=" + title + ", content=" + content + "]";
	}
}
