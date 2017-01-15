package p03_intro;

public class J03_MyDB implements J03_Injection{

	@Override
	public Object getConnection() {
		System.out.println("MyDB 접속 시작");
		System.out.println("1. Driver Load Comp");
		System.out.println("2. DB Connection Com");
		
		return "MyDB Connection";
	}
	
}
