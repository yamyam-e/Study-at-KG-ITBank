package p02_intro;

public class J02_DAO {

	private J03_Injection rcvDBConn;
	
	public J02_DAO(J03_Injection rcvConn) {
		this.rcvDBConn = rcvConn;
	}
	
	public Object insertOne(){
		Object conn = rcvDBConn.getConnection();
		System.out.println("3. " + conn + "SQL(insert) && executeUpdate && result(int)");
		Object obj = "insert 결과 : 성공한 갯수";
		System.out.println("4. " + conn + " close");
		return obj;
	}
	
	public Object selectList(){
		Object conn = rcvDBConn.getConnection();
		System.out.println("3. " + conn + "SQL(select) && excuteUpdate && result(ResultSet)");
		Object obj = "select( 결과 : 레코드 정보";
		System.out.println("4. " + conn + " close");
		return obj;
	}
}
