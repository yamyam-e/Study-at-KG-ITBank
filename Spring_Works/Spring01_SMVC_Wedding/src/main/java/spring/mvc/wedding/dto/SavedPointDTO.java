package spring.mvc.wedding.dto;

import org.apache.ibatis.type.Alias;

@Alias("savedPoint")
public class SavedPointDTO {
	private Integer num;
	private String email;
	private Integer point;
	private String pointFromSomeone;
	public SavedPointDTO() {
	}
	public SavedPointDTO(String email, Integer point, String pointFromSomeone) {
		this.email = email;
		this.point = point;
		this.pointFromSomeone = pointFromSomeone;
	}
	public SavedPointDTO(Integer num, String email, Integer point, String pointFromSomeone) {
		this.num = num;
		this.email = email;
		this.point = point;
		this.pointFromSomeone = pointFromSomeone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	public String getPointFromSomeone() {
		return pointFromSomeone;
	}
	public void setPointFromSomeone(String pointFromSomeone) {
		this.pointFromSomeone = pointFromSomeone;
	}
	@Override
	public String toString() {
		return "savedPointDTO [num=" + num + ", email=" + email + ", point=" + point + ", pointFromSomeone="
				+ pointFromSomeone + "]";
	}
}
