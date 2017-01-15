import javax.swing.JOptionPane;

public class J12_ArraysCla {
	public static void main(String[] args) {
		
//		레퍼런스배열을 가진 관리사무소 객체
		J12_People[] pp = new J12_People[3];//레퍼런스배열
		
		System.out.println(pp[1]);
//		=> 현재, 객체 고유번호가 저장되지 않은 상태
		
//		에러 : pp[1] = "둘리";
//		=> 객체 생성 필요
		pp[0] = new J12_People();
		pp[1] = new J12_People();
		pp[2] = new J12_People();
		
		pp[0].name = "둘리";
		pp[0].age = 10;
		
		pp[1].name = "마이콜";
		pp[1].age = 30;
		
		pp[2].name = "삐삐";
		pp[2].age = 18;
		
		for(int i=0; i<pp.length; i++) {
			System.out.println("이름 : " + pp[i].name + "나이 : " + pp[i].age);
		}
		System.out.println("==========================");
		
		for(J12_People each : pp) {
			System.out.println("이름 : " + each.name + ", 나이 : " + each.age);
		}
		
		for(int i=0; i<pp.length; i++) {
			pp[i] = new J12_People();
			pp[i].name = JOptionPane.showInputDialog("이름입력");
			String rcv =
					JOptionPane.showInputDialog("나이입력");
			pp[i].age = Integer.parseInt(rcv);
		}
	}
}
