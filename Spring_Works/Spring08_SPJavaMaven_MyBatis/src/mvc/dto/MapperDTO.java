package mvc.dto;

import org.apache.ibatis.type.Alias;

@Alias("mm")
public class MapperDTO {
	
	private int beginAge;
	private int endAge;
	
	private String tableName;
	private String colName;
	private String value;
	
	public MapperDTO() {
	}
	public MapperDTO(int beginAge, int endAge) {
		this.beginAge = beginAge;
		this.endAge = endAge;
	}
	public MapperDTO(String tableName, String colName, String value) {
		this.tableName = tableName;
		this.colName = colName;
		this.value = value;
	}
	public int getBeginAge() {
		return beginAge;
	}
	public void setBeginAge(int beginAge) {
		this.beginAge = beginAge;
	}
	public int getEndAge() {
		return endAge;
	}
	public void setEndAge(int endAge) {
		this.endAge = endAge;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getColName() {
		return colName;
	}
	public void setColName(String colName) {
		this.colName = colName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
