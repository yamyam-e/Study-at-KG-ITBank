
public class J07_mainCla {
	
	public static void main(String[] args) {
		
//		사람 정보 관리 프로그램 :  이름, 나이
		
		String iname = "둘리";
		int iage = 10;
		System.out.println(
				"이름: " + iname + " , 나이 : " + iage);
		
//		클래스 작성 후
//		1. 완성된 설계도(클래스)로 집(객체, 인스턴스) 짓기
		new J07_People();
//		=>16번줄 부터는 위의 집(객체)가 사라짐
//		=>집의 고유번호(hashCode)를 저장하는
//			집문서(레퍼런스 변수) 필요

//		2. 집문서(레퍼런스변수) 만들기
		J07_People abc;
//		=> abc라는 집문서가 대상으로 하는 집의 형태는
//			J07_People 설계도로 만들어지 집이라는 의미
		
//		3. 객체를 만든 후, 레퍼런스에 고유번호 저장하기
		J07_People bb = new J07_People();
		System.out.println("bb = " + bb);
		
//		객체를 생성한 경우, 각 방에는 자동으로 기본값이 저장됨
		System.out.println(bb.name);
		System.out.println(bb.age);
		
		bb.name = "마이콜";
		bb.age = 30;
		System.out.println("이름: " + bb.name);
		System.out.println("나이: " + bb.age);
		
	}

}
