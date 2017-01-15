
public class J01_mainCla {
	public static void main(String[] args) {
		
//		1. 설계도(클래스) 작성
		
//		2. 집(인스턴스, 객체) 짓기
		new J01_People();
		
//		3. 집문서(레퍼런스 변수) 생성 : 방의 형태를 언급하다.
		J01_People pp1 = null; //J01_People 이 방의 형태를 말한다.
		
		pp1 = new J01_People();
		System.out.println("pp1 : " + pp1);
		
//		4. 인스턴스 생성 및 레퍼런스 선언을 동시에 하는 경우
		
		J01_People pp2 = new J01_People();
		System.out.println("pp2 : " + pp2);
		
//		5. 객체 호출(저장 및 이용)
		
		pp1.name = "둘리";
		pp1.age = 10;
		
		pp2.name = "도우너";
		pp2.age = 20;
		
		System.out.println("pp1 : " + pp1.name + ", " + pp1.age);
		System.out.println("pp1 : " + pp2.name + ", " + pp2.age);
		
//		문제
		
//		1. 햄버거 정보 관리 프로그램
//			- 이름, 판매브랜드, 주재료, 가격, 칼로리
//			- 햄버거 정보 3개를 저장 후 출력
		J01_Hamberger hh1 = new J01_Hamberger();
		hh1.name = "새우버거";
		hh1.brand = "롯데리아";
		hh1.ingre = "새우";
		hh1.price = 3500;
		hh1.calori = 200;
		
		J01_Hamberger hh2 = new J01_Hamberger();
		hh2.name = "불고기버거";
		hh2.brand = "맥도날드";
		hh2.ingre = "쇠고기";
		hh2.price = 5500;
		hh2.calori = 400;
		
		J01_Hamberger hh3 = new J01_Hamberger();
		hh3.name = "치킨버거";
		hh3.brand = "KFC";
		hh3.ingre = "치킨";
		hh3.price = 4500;
		hh3.calori = 250;
		
		System.out.println("햄버거이름\t브랜드\t\t주재료\t가격\t칼로리");
		System.out.println("1. " + hh1.name + "\t" + hh1.brand + "\t" + hh1.ingre  + "\t" + hh1.price + "\t" + hh1.calori);
		System.out.println("2. " + hh2.name + "\t" + hh2.brand + "\t" + hh2.ingre  + "\t" + hh2.price + "\t" + hh2.calori);
		System.out.println("3. " + hh3.name + "\t" + hh3.brand + "\t\t" + hh3.ingre  + "\t" + hh3.price + "\t" + hh3.calori);
		System.out.println();
		
//		2. 게임 캐릭터 정보 관리 프로그램
//			- 이름, 게임이름, 공격력, 방어력
//			- 캐릭터 정보 2개를 저장 후 출력
		J01_GameCharactor gg1 = new J01_GameCharactor();
		gg1.name = "검사";
		gg1.gameName ="라그나로크";
		gg1.attack = 100;
		gg1.defence = 150;
		
		J01_GameCharactor gg2 = new J01_GameCharactor();
		gg2.name = "마법사";
		gg2.gameName = "디아블로";
		gg2.attack = 200;
		gg2.defence = 90;
		
		System.out.println("이름\t게임이름\t공격력\t방어력");
		System.out.println(gg1.name + "\t" + gg1.gameName + "\t" + gg1.attack + "\t" + gg1.defence);
		System.out.println(gg2.name + "\t" + gg2.gameName + "\t" + gg2.attack + "\t" + gg2.defence);
		
	}

}
