package p02_intro;

public class J03_OracleDB implements J03_Injection {

	@Override
	public Object getConnection() {
		System.out.println("오라클DB 접속 시작");
		System.out.println("1. Driver Load Comp");
		System.out.println("2. DB Connection Com");
		
		return "오라클DB Connection";
	}
}
