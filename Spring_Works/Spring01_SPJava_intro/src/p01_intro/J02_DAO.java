package p01_intro;

public class J02_DAO {

	public Object getConnection() {
		System.out.println("오라클DB 접속 시작");
		System.out.println("1. Driver Load Comp");
		System.out.println("2. DB Connection Com");
		
		return "오라클DB Connection";
	}
	
	public Object insertOne(){
		Object conn = getConnection();
		System.out.println("3. " + conn + "SQL(insert) && executeUpdate && result(int)");
		Object obj = "insert 결과 : 성공한 갯수";
		System.out.println("4. " + conn + " close");
		return obj;
	}
	
	public Object selectList(){
		Object conn = getConnection();
		System.out.println("3. " + conn + "SQL(select) && excuteUpdate && result(ResultSet)");
		Object obj = "select( 결과 : 레코드 정보";
		System.out.println("4. " + conn + " close");
		return obj;
	}
}
