package mvc.dto;

import org.apache.ibatis.type.Alias;

@Alias("mapper")
public class MapperDTO {
	private int start;
	private int end;
	
	private String tableName;
	private String colName;
	private String value;
	public MapperDTO() {
	}
	public MapperDTO(int start, int end) {
		this.start = start;
		this.end = end;
	}
	public MapperDTO(String tableName, String colName, String value) {
		this.tableName = tableName;
		this.colName = colName;
		this.value = value;
	}
	public int getStart() {
		return start;
	}
	public int getEnd() {
		return end;
	}
	public String getTableName() {
		return tableName;
	}
	public String getColName() {
		return colName;
	}
	public String getValue() {
		return value;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public void setColName(String colName) {
		this.colName = colName;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
