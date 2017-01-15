package SpringEX05.mvc.spring05.dto;

import org.apache.ibatis.type.Alias;

@Alias("peo")
public class PeopleDTO {
	private String id;
	private String pw;
}
