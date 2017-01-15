
public class J01_mainCla {
	
//	메소드 : 사용도가 높은 기능을 독립적으로 작성한 작은 프로그램 단위
	
	public static void main(String[] args) {
		
//		인사정보 : 이름, 나이
//		reference      =    instance
		J01_People pp1 = new J01_People();
		setData(pp1, "둘리", 10);
		showData(pp1);
		
		J01_People pp2 = new J01_People();
		setData(pp2, "도우너", 20);
		showData(pp2);
		
	}
	
	public static void setData(J01_People gate, String gate2, int gate3) {
		gate.name = gate2;
		gate.age = gate3;
	}
	
	public static void showData(J01_People gate) {
		System.out.println("이름: " + gate.name + " , 나이: " + gate.age);
	}
	
//	메소드 작성 방법
//	1. 작성하려는 기능을 결정한다.
//	2. 이름을 정한다.
//	3. 메소드의 기본 틀을 작성
//		void 메소드이름() {
//	
//		}
//		=> 단, main과 동일한 클래스 안에서메소드를 
//		작성한 후 이용할 때에는
//		public static void 메소드이름() {
//	
//		}
//	4. 메소드가 복사 받아야 할 값이 있다면,
//		입구(매개변수 영역)에 통로(매개변수)를 생성한다.
//	5. 메소드 중괄호 안에 기능을 작성한다.
//	6. 메소드가 복사해 주어야 할 값이 있다면,
//		중괄호의 모든 명령 마지막에서
//		return 값; 을 명시하고, 
//		출구(리턴자료형)에 복사할 값의 형태를 명시한다.
	
	
	
	
	
	
	
}
